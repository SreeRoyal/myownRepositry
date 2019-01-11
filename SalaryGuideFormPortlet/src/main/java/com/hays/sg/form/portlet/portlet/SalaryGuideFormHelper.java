package com.hays.sg.form.portlet.portlet;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;

import com.hays.service.salaryguide.model.HaysSGUserData;
import com.hays.service.salaryguide.service.HaysSGUserDataLocalServiceUtil;
import com.hays.sg.form.portlet.constants.SalaryGuideFormPortletKeys;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

public class SalaryGuideFormHelper {
	
	public static void getLanguageKeys(RenderRequest request,RenderResponse response) {
		
		_log.info("Class Name is SalaryGuideFormHelper Method Name is getLanguageKeys>>");
		
		HttpServletRequest servletRequest = PortalUtil.getHttpServletRequest(request);
		
		JSONObject langugaeKeysObj = JSONFactoryUtil.createJSONObject();
		
		langugaeKeysObj.put("lr_SGReportHeadingText", LanguageUtil.get(servletRequest, "lr_SGReportHeadingText"));
		
		
		langugaeKeysObj.put("lr_SGName", LanguageUtil.get(servletRequest, "lr_SGName"));
		langugaeKeysObj.put("lr_SGTitle", LanguageUtil.get(servletRequest, "lr_SGTitle"));
		langugaeKeysObj.put("lr_SGOrganisation", LanguageUtil.get(servletRequest, "lr_SGOrganisation"));
		langugaeKeysObj.put("lr_SGEmailAddressLabel", LanguageUtil.get(servletRequest, "lr_SGEmailAddressLabel"));
		langugaeKeysObj.put("lr_SGState", LanguageUtil.get(servletRequest, "lr_SGState"));
		langugaeKeysObj.put("lr_SGPDFButtonText", LanguageUtil.get(servletRequest, "lr_SGPDFButtonText"));
	
		langugaeKeysObj.put("lr_SGNameWatermark", LanguageUtil.get(servletRequest, "lr_SGNameWatermark"));
		langugaeKeysObj.put("lr_SGJobTitleWatermark", LanguageUtil.get(servletRequest, "lr_SGJobTitleWatermark"));
		langugaeKeysObj.put("lr_SGOrganisationWatermark", LanguageUtil.get(servletRequest,"lr_SGOrganisationWatermark"));
		langugaeKeysObj.put("lr_SGLocationWatermark", LanguageUtil.get(servletRequest, "lr_SGLocationWatermark"));
		langugaeKeysObj.put("lr_SGEmailAddressWatermark", LanguageUtil.get(servletRequest, "lr_SGEmailAddressWatermark"));
		
		
		request.setAttribute("langugaeKeys", langugaeKeysObj);

	}
	
	public static void updateSalaryGuideFormData(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("Class Name is SalaryGuideFormHelper Method Name is updateSalaryGuideFormData>>");
		
		String name = ParamUtil.getString(resourceRequest, "sg_name");
		String jobTitle = ParamUtil.getString(resourceRequest, "sg_title");
		String organization = ParamUtil.getString(resourceRequest, "sg_organisation");
		String location = ParamUtil.getString(resourceRequest, "sg_state");
		String emial = ParamUtil.getString(resourceRequest, "sg_email_id");
		
		_log.info("name >>" + name);
		_log.info("jobTitle >>" + jobTitle);
		_log.info("organization >>" + organization);
		_log.info("location >>" + location);
		_log.info("emial >>" + emial);
		
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		String lrLocale = themeDisplay.getLanguageId();
		
		HaysSGUserData userData =   HaysSGUserDataLocalServiceUtil.update(0, name, jobTitle, organization, location, emial, lrLocale);
		
		if(Validator.isNotNull(userData)){
			
			userData = HaysSGUserDataLocalServiceUtil.fetchHaysSGUserData(userData.getSGUSERID());
			
			String emailAddress = userData.getSGEMAILADDRESS();
			
			if(emailAddress!= null && emailAddress.length() > 0){
				sendMailToUser(emailAddress);
			}
		}
		
		boolean response = getcaptchResponse(resourceRequest);
		
		try {
			resourceResponse.getWriter().print(response);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void sendMailToUser(String emailAddress) {
		
		_log.info("emailAddress >>" + emailAddress);
	}
	
	
	public static boolean getcaptchResponse(PortletRequest request) {

		HttpClient client = new HttpClient();
		
	      String gRecaptchaResponse = ParamUtil.getString(request, "g-recaptcha-response");
		
		_log.info("gRecaptchaResponse >>" + gRecaptchaResponse);

		PostMethod captchaRequst = new PostMethod(SalaryGuideFormPortletKeys.CAPTCHA_URL);
		captchaRequst.setParameter("response", gRecaptchaResponse);
		captchaRequst.setParameter("secret", SalaryGuideFormPortletKeys.DATA_SECRET_KEY);
		
		try {
			int statusCode = client.executeMethod(captchaRequst);

			if (statusCode == HttpStatus.SC_OK) {
				byte[] responseBody = captchaRequst.getResponseBody();

				JSONObject responseObj = JSONFactoryUtil.createJSONObject(new String(responseBody));
				boolean captchaResponse = (boolean) responseObj.get("success");

				return captchaResponse;
			} else {
				System.err.println("Method failed: " + captchaRequst.getStatusLine());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			captchaRequst.releaseConnection();
		}

		return false;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(SalaryGuideFormHelper.class.getName());
}
