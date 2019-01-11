package com.hays.portlet.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.osgi.service.component.annotations.Reference;

import com.hays.portlet.constants.SalaryGuideConstants;
import com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalServiceUtil;
import com.hays.service.salaryguide.service.util.SalaryGuideServiceUtill;
import com.hays.services.common.model.hayswebsites;
import com.hays.services.common.service.hayswebsitesLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
/*
 * @author Sreenivas
 * 
 * This helper class give all the API related to salary checker Functionality
 */
public class SalaryGuideHelper {
	
	public static void getLocalAreaOfExperties(RenderRequest renderRequest) {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Locale local = themeDisplay.getSiteDefaultLocale();

		String languageLrId = themeDisplay.getLanguageId();

		_log.info("Liferay languageId >>" + languageLrId);

		String siteLocalId = StringUtil.replace(languageLrId, "_", "-");

		_log.info("Liferay languageId replace with hypen >>" + siteLocalId);

//		HaysService servie = new HaysService();
		
		siteLocalId = getSiteLocale(siteLocalId);

		_log.info("Getting Site id from master data >>>" + siteLocalId);

		List<String> areaOfExperties = null; 
		
		if(siteLocalId == null || Validator.isNull(siteLocalId)){
			
			_log.info("if dite id is null >>>" + siteLocalId + "= en-GB");
			
			siteLocalId = "en-GB";
		}
		
		if (siteLocalId != null) {
			_log.info("siteLocalId inside FindByLocalMethod ");
			
			areaOfExperties = SalaryGuideServiceUtill.fetchAreaOfExpertiseBySiteLocal(siteLocalId);
		}
		_log.info("areaOfExperties >>" + areaOfExperties);

		renderRequest.setAttribute("salGuideList", areaOfExperties);
	}
	
	public static void getPopulatedList(ResourceRequest request, ResourceResponse response) {

		_log.info("inside Class Name Salary guide Helper Method name is getPopulatedList ");
		
		String typeOfConstant = ParamUtil.getString(request, "typeOfConstant");
		String areaOfExpertise = ParamUtil.getString(request, "areaOfExpertise");
		String categoryType = ParamUtil.getString(request, "categoryType");
		String area = ParamUtil.getString(request,"area");
		String orgType = ParamUtil.getString(request,"orgType");
		String jobTitle = ParamUtil.getString(request,"jobTitle");		
		

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		String siteLangugaeLrId = themeDisplay.getLanguageId();

		String siteId = getSiteByLangugaeLrId(siteLangugaeLrId);

		List<String> displayData = null;
		
		if(siteId == null || Validator.isNull(siteId)){
			
			_log.info("if siteId is null i.e >>" + siteId + "= en-GB");
			
			siteId = "en-GB";
		}
		
		if (siteId != null && siteId.length() > 0 && areaOfExpertise.length() > 0) {

			if (typeOfConstant.equals(SalaryGuideConstants.CATEGORY)) {
				
				_log.info("!!!!!! Inside Method Of Category !!!!!!");
				
				displayData = SalaryGuideServiceUtill.getListOfCategoriesByExpertise(siteId, areaOfExpertise);
				
			 }if (typeOfConstant.equals(SalaryGuideConstants.AREA)) {
				 
				 _log.info("!!!!!! Inside Method Of area !!!!!!");
				
				 displayData = SalaryGuideServiceUtill.getListOfAreasByCategory(siteId,areaOfExpertise,categoryType);
				 
			 }if (typeOfConstant.equals(SalaryGuideConstants.ORGANIZATION_TYPE)) {
				 
				 _log.info("!!!!!! Inside Method Of Type orgType !!!!!!");
				
				 displayData = SalaryGuideServiceUtill.getListOfOrgTypesByArea(siteId,areaOfExpertise,categoryType,area);
				 
			 }if (typeOfConstant.equals(SalaryGuideConstants.JOB_TITLE)) {
				 
				 _log.info("!!!!!! Inside Method Of Type jobtitle !!!!!!");
				 
				 displayData = SalaryGuideServiceUtill.getListOfJobTitleByOrgType(siteId,areaOfExpertise,categoryType,area,orgType);
				 
			}if (typeOfConstant.equals(SalaryGuideConstants.REGION)) {
				
				_log.info("!!!!!! Inside Method Of Type Region !!!!!!");
				 
				 displayData = SalaryGuideServiceUtill.getListOfRegionsByTitle(siteId,areaOfExpertise,categoryType,area,orgType,jobTitle);
				 
			}
		}
		
		_log.info("displayData >>>" + displayData);
		
		JSONArray catListJson = JSONFactoryUtil.createJSONArray();
		
		if(displayData != null){
			
			for (String result : displayData) {
				/*_log.info("Result = " + result);*/
				catListJson.put(result);
			}
			_log.info("catListJson >>>" + catListJson);
		}

		try {
			response.getWriter().print(catListJson.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	_log.info("Final Json Object >>" + catListJson);
	}

	private static String getSiteByLangugaeLrId(String languageLrId) {

		_log.info("Class Name is Salary guide helper >>>  Method Name is getSiteByLangugaeLrId");
		
		if (languageLrId != null && languageLrId.length() > 0) {

			String siteLocalId = StringUtil.replace(languageLrId, "_", "-");
			
			/*HaysService service = new HaysService();*/
			
			siteLocalId = getSiteLocale(siteLocalId);

			_log.info("returing siteLocalId >>" + siteLocalId);
			
			return siteLocalId;
		}
		return null;
	}

	public static void checkSalary(ResourceRequest request, ResourceResponse resourceResponse) {
		
		_log.info("Class Name is SalaryGuideHelper :: Method Name is ---> checkSalary");
		
		 String areaOfExpertise = ParamUtil.getString(request, "areaOfExpertise");
	     String categories = ParamUtil.getString(request, "categories");
	     String area = ParamUtil.getString(request, "area");
	     String orgType = ParamUtil.getString(request, "orgType");
	     String jobTitle = ParamUtil.getString(request, "jobTitle");
	     String region = ParamUtil.getString(request, "region");
	     String emailAddress = ParamUtil.getString(request, "emailAddress");
	     long currentsalary = ParamUtil.getLong(request, "curSalary");
	     
	     
	     if(Validator.isNull(categories) || Validator.isBlank(categories) || categories.length() == 0){
	    	    	 
	    	 categories = SalaryGuideConstants.NOT_AVAILABLE;
	     }
	     if(Validator.isNull(area) || Validator.isBlank(area) || area.length() == 0){
	    	 
	    	 area = SalaryGuideConstants.NOT_AVAILABLE;
	     }
	     if(Validator.isNull(orgType) || Validator.isBlank(orgType) || orgType.length() == 0){
	    	 
	    	 orgType = SalaryGuideConstants.NOT_AVAILABLE;
	     }
	     if(Validator.isNull(jobTitle) || Validator.isBlank(jobTitle) || jobTitle.length() == 0){
	    	 
	    	 jobTitle = SalaryGuideConstants.NOT_AVAILABLE;
	     }
	     if(Validator.isNull(region) || Validator.isBlank(region) || region.length() == 0){
	    	 
	    	 region = SalaryGuideConstants.NOT_AVAILABLE;
	     }
	     
	     
	     HttpServletRequest reHttpServletRequest =  PortalUtil.getHttpServletRequest(request);
	     
	     
	     ThemeDisplay  themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	     
	     
	     String getCurrencySymbol = LanguageUtil.get(reHttpServletRequest, "lr_SGCurrencySymbol");
	     
	     _log.info("Before Fetching Response from Google Captha");
	     
	     boolean getcaptchaResponse = true;
	    		 
	    		 //getcaptchResponse(request);
	     
	     if(getcaptchaResponse){
	    	
	    	 HaysSalGuideUserDataUkLocalServiceUtil.update(0, areaOfExpertise, categories, area, orgType, jobTitle, region, themeDisplay.getLanguageId(), emailAddress, currentsalary, "NA");
	    	 
	    	 _log.info("Data Stored Successfully !! Thank You !! ");
	     }
	     
	     
	     //_log.info("After Fetching Response from Google Captha Response is >>" + getcaptchaResponse);
	     
	     
	     _log.info("areaOfExpertise >>" + areaOfExpertise);
	     _log.info("categories >>" + categories);
	     _log.info("area >>" + area);
	     _log.info("orgType >>" + orgType);
	     _log.info("jobTitle >>" + jobTitle);
	     _log.info("region >>" + region);
	     _log.info("emailAddress >>" + emailAddress);
	     _log.info("currentsalary >>" + currentsalary);
	     
	     JSONObject finalResponseObj = JSONFactoryUtil.createJSONObject();

	     String siteId = themeDisplay.getLanguageId();
         

			if(siteId != null && siteId.length() >0){
				
				siteId = getSiteByLangugaeLrId(siteId);
			}
	     
			List<Object[]> resultList = null;
			
			if(siteId == null || Validator.isNull(siteId)){
				
				siteId = "en-GB";
			}
			
			if(siteId.length() > 0){
				
		    	 resultList = SalaryGuideServiceUtill.chechMySalary(siteId,areaOfExpertise,categories,area,orgType,jobTitle,region);
		     }
			
			_log.info("resultList >>" + resultList);
			
			finalResponseObj = getSalaryCheckerObject(resultList,areaOfExpertise,categories,area,orgType,jobTitle,region,emailAddress,currentsalary,getcaptchaResponse,getCurrencySymbol);
			
			_log.info("finalResponseObj >>>>" + finalResponseObj);
 			
	 		try {
				resourceResponse.getWriter().write(finalResponseObj.toString());;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	private static JSONObject getSalaryCheckerObject(List<Object[]> resultList, String areaOfExpertise,String categories, String area, String orgType, String jobTitle, String region, String emailAddress,long currentsalary,boolean getcaptchaResponse,String getCurrencySymbol) {
		
		_log.info("Class Name is SalaryGuideHelper :: Method Name is ---> getSalaryCheckerObject");
		
		JSONObject finalResponseObj = JSONFactoryUtil.createJSONObject();
		
		if(!resultList.isEmpty() && resultList.size() > 0){
	 		
	 			String SalaryTypical = (String)resultList.get(0)[0];
	 			String salaryinBetweenRange = (String)resultList.get(0)[1];
	 			
	 			_log.info("SalaryTypical >>" + SalaryTypical);
	 			_log.info("salaryrange >>" + salaryinBetweenRange);
	 			
	 			String[] salaryRange =  salaryinBetweenRange.split("-");
	 			
	 			_log.info("salaryRange >>" + salaryRange);
	 			
	 			String lowest = salaryRange[0];
	 			String highest = salaryRange[1];
	 			
	 			
	 			finalResponseObj.put("lowest",Integer.valueOf(lowest));
	 			finalResponseObj.put("highest",Integer.valueOf(highest));
	 			
	 			_log.info("lowest >>" + lowest);
	 			_log.info("highest >>" + highest);
	 			
	 			int avgSal = 0;
	 			
	 			if(SalaryTypical.equals(SalaryGuideConstants.NOT_AVAILABLE)){
	 				
	 				if(salaryRange.length > 0 && salaryRange != null){
	 					
	 					 avgSal = (Integer.valueOf(highest) + Integer.valueOf(lowest))/2;
	 				 }
	 			}else{
	 				avgSal = Integer.valueOf(SalaryTypical);
	 			}
	 			
	 			//current salary calculation 
	 			
	 			long diffSalary = 0;
	 			
	 			if(currentsalary > avgSal){
	 				
	 				diffSalary = currentsalary - avgSal;
	 				
	 			}else if(currentsalary < avgSal){
	 				
	 				diffSalary = avgSal - currentsalary;
	 			}
	 			
	 			finalResponseObj.put("avgSal",avgSal);
	 			finalResponseObj.put("currentsalary",currentsalary);
	 			finalResponseObj.put("jobTitle",jobTitle);
	 			finalResponseObj.put("diffSalary",diffSalary);
	 			finalResponseObj.put("currencySymbol",getCurrencySymbol);
	 			finalResponseObj.put("captchaResponse",getcaptchaResponse);
	 	}
		
		return finalResponseObj;
	}

	
	public static boolean getcaptchResponse(PortletRequest request) {

		HttpClient client = new HttpClient();
	      
		
	      String gRecaptchaResponse = ParamUtil.getString(request, "g-recaptcha-response");
		
		_log.info("gRecaptchaResponse >>" + gRecaptchaResponse);

		PostMethod captchaRequst = new PostMethod(SalaryGuideConstants.CAPTCHA_URL);
		captchaRequst.setParameter("response", gRecaptchaResponse);
		captchaRequst.setParameter("secret", SalaryGuideConstants.DATA_SECRET_KEY);
		
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
	
	public static String getSiteLocale(String lrLocale) {
	    	
	    	List<hayswebsites> hayswebsites = hayswebsitesLocalServiceUtil.findByLRLocale(lrLocale);
	    			
	    	if (hayswebsites.size() > 0) {
	    		return hayswebsites.get(0).getSITELOCALE();
			}else {
				return "";  
			}	
	    }
	
	
	public static void getLangugaesKeys(PortletRequest request){
		
		_log.info("Class Name SalaryGuideHelper >>>>> Method Name is >>>> getLangugaesKeys");
		
		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(request);
		
		
		JSONObject langugaeKeysObj = JSONFactoryUtil.createJSONObject();
		
		langugaeKeysObj.put("lr_SGHeadingText", LanguageUtil.get(httpRequest, "lr_SGHeadingText"));
		langugaeKeysObj.put("lr_SGSummaryText", LanguageUtil.get(httpRequest, "lr_SGSummaryText"));
		langugaeKeysObj.put("lr_SGSuperAnnotationText", LanguageUtil.get(httpRequest, "lr_SGSuperAnnotationText"));
		langugaeKeysObj.put("lr_SGAreaOfExpertiseLabel", LanguageUtil.get(httpRequest, "lr_SGAreaOfExpertiseLabel"));
		langugaeKeysObj.put("lr_SGDropDownSelect", LanguageUtil.get(httpRequest, "lr_SGDropDownSelect"));
		
		langugaeKeysObj.put("lr_SGGDPRDisclaimer", LanguageUtil.get(httpRequest, "lr_SGGDPRDisclaimer"));
		langugaeKeysObj.put("lr_SGCategoryLabel", LanguageUtil.get(httpRequest, "lr_SGCategoryLabel"));
		langugaeKeysObj.put("lr_SGJobTitleLabel", LanguageUtil.get(httpRequest, "lr_SGJobTitleLabel"));
		langugaeKeysObj.put("lr_SGCurrencySymbol", LanguageUtil.get(httpRequest, "lr_SGCurrencySymbol"));
		langugaeKeysObj.put("lr_SGRegionLabel", LanguageUtil.get(httpRequest, "lr_SGRegionLabel"));
		
		
		langugaeKeysObj.put("lr_SGCurrentSalaryLabel", LanguageUtil.get(httpRequest, "lr_SGCurrentSalaryLabel"));
		langugaeKeysObj.put("lr_SGCurrentSalaryWatermark", LanguageUtil.get(httpRequest, "lr_SGCurrentSalaryWatermark"));
		langugaeKeysObj.put("lr_SGSubmitButtonLabel", LanguageUtil.get(httpRequest, "lr_SGSubmitButtonLabel"));
		langugaeKeysObj.put("lr_SGYouLabel", LanguageUtil.get(httpRequest, "lr_SGYouLabel"));
		langugaeKeysObj.put("lr_SGHighestLabel", LanguageUtil.get(httpRequest, "lr_SGHighestLabel"));
		
		langugaeKeysObj.put("lr_SGAverageLabel", LanguageUtil.get(httpRequest, "lr_SGAverageLabel"));
		langugaeKeysObj.put("lr_SGLowestLabel", LanguageUtil.get(httpRequest, "lr_SGLowestLabel"));
		langugaeKeysObj.put("lr_SGSubmitText", LanguageUtil.get(httpRequest, "lr_SGSubmitText"));
		langugaeKeysObj.put("lr_SGBaromoterHeadingText", LanguageUtil.get(httpRequest, "lr_SGBaromoterHeadingText"));
		langugaeKeysObj.put("lr_SalaryGuideDownloadEmailSubject", LanguageUtil.get(httpRequest, "lr_SalaryGuideDownloadEmailSubject"));
		
		langugaeKeysObj.put("lr_SGName", LanguageUtil.get(httpRequest, "lr_SGName"));
		langugaeKeysObj.put("lr_SGSendCVButtonText", LanguageUtil.get(httpRequest, "lr_SGSendCVButtonText"));
		langugaeKeysObj.put("lr_SGContactUsButtonText", LanguageUtil.get(httpRequest, "lr_SGContactUsButtonText"));
		langugaeKeysObj.put("lr_SGTitle", LanguageUtil.get(httpRequest, "lr_SGTitle"));
		langugaeKeysObj.put("lr_SGOrganisation", LanguageUtil.get(httpRequest, "lr_SGOrganisation"));
		
		langugaeKeysObj.put("lr_SGState", LanguageUtil.get(httpRequest, "lr_SGState"));
		langugaeKeysObj.put("lr_SGEmailAddressLabel", LanguageUtil.get(httpRequest, "lr_SGEmailAddressLabel"));
		langugaeKeysObj.put("lr_SGReportHeadingText", LanguageUtil.get(httpRequest, "lr_SGReportHeadingText"));
		langugaeKeysObj.put("lr_SGNameWatermark", LanguageUtil.get(httpRequest, "lr_SGNameWatermark"));
		langugaeKeysObj.put("lr_SGJobTitleWatermark", LanguageUtil.get(httpRequest, "lr_SGJobTitleWatermark"));
		langugaeKeysObj.put("lr_SGCurrentSalary", LanguageUtil.get(httpRequest, "lr_SGCurrentSalary"));
		
		langugaeKeysObj.put("lr_SGOrganisationWatermark", LanguageUtil.get(httpRequest, "lr_SGOrganisationWatermark"));
		langugaeKeysObj.put("lr_SGLocationWatermark", LanguageUtil.get(httpRequest, "lr_SGLocationWatermark"));
		langugaeKeysObj.put("lr_SGEmailAddressWatermark", LanguageUtil.get(httpRequest, "lr_SGEmailAddressWatermark"));
		langugaeKeysObj.put("lr_SGPDFButtonText", LanguageUtil.get(httpRequest, "lr_SGPDFButtonText"));
		langugaeKeysObj.put("lr_SGContactEmail", LanguageUtil.get(httpRequest, "lr_SGContactEmail"));
		
		langugaeKeysObj.put("lr_SGEmailHeadingText", LanguageUtil.get(httpRequest, "lr_SGEmailHeadingText"));
		langugaeKeysObj.put("lr_SGFileLocation", LanguageUtil.get(httpRequest, "lr_SGFileLocation"));
		langugaeKeysObj.put("lr_SGButtonUpdateLabel", LanguageUtil.get(httpRequest, "lr_SGButtonUpdateLabel"));
		langugaeKeysObj.put("lr_SGToEmailAddress", LanguageUtil.get(httpRequest, "lr_SGToEmailAddress"));
		langugaeKeysObj.put("lr_SGValidNumberMessage", LanguageUtil.get(httpRequest, "lr_SGValidNumberMessage"));
		
		langugaeKeysObj.put("lr_LoadingSG", LanguageUtil.get(httpRequest, "lr_LoadingSG"));
		langugaeKeysObj.put("lr_AnnumSG", LanguageUtil.get(httpRequest, "lr_AnnumSG"));
		langugaeKeysObj.put("lr_SGPositionType", LanguageUtil.get(httpRequest, "lr_SGPositionType"));
		langugaeKeysObj.put("lr_SGArea", LanguageUtil.get(httpRequest, "lr_SGArea"));
		langugaeKeysObj.put("lr_SGOrganisationType", LanguageUtil.get(httpRequest, "lr_SGOrganisationType"));
		
		langugaeKeysObj.put("lr_EmailSubjectCustomer", LanguageUtil.get(httpRequest, "lr_EmailSubjectCustomer"));
		langugaeKeysObj.put("lr_SGSImilarJobs", LanguageUtil.get(httpRequest, "lr_SGSImilarJobs"));
		langugaeKeysObj.put("lr_SGThankYouHeadingText", LanguageUtil.get(httpRequest, "lr_SGThankYouHeadingText"));
		langugaeKeysObj.put("lr_SGSetupAccountText1", LanguageUtil.get(httpRequest, "lr_SGSetupAccountText1"));
		langugaeKeysObj.put("lr_SGSetupAccountText2", LanguageUtil.get(httpRequest, "lr_SGSetupAccountText2"));
		
		
		langugaeKeysObj.put("lr_SGSetupAccountText3", LanguageUtil.get(httpRequest, "lr_SGSetupAccountText3"));
		langugaeKeysObj.put("lr_SGSetupAccountText4", LanguageUtil.get(httpRequest, "lr_SGSetupAccountText4"));
		langugaeKeysObj.put("lr_SGSetupAccountThankYouText", LanguageUtil.get(httpRequest, "lr_SGSetupAccountThankYouText"));
		langugaeKeysObj.put("lr_SGHaysMailSystemGeneratedText", LanguageUtil.get(httpRequest, "lr_SGHaysMailSystemGeneratedText"));
		langugaeKeysObj.put("lr_SGEmailAddressLabel", LanguageUtil.get(httpRequest, "lr_SGEmailAddressLabel"));
		
		langugaeKeysObj.put("lr_SGUserEmailWatermark", LanguageUtil.get(httpRequest, "lr_SGUserEmailWatermark"));
		langugaeKeysObj.put("lr_SalaryInfoDataPart1", LanguageUtil.get(httpRequest, "lr_SalaryInfoDataPart1"));
		langugaeKeysObj.put("lr_SalaryInfoDataPart2", LanguageUtil.get(httpRequest, "lr_SalaryInfoDataPart2"));
		langugaeKeysObj.put("lr_NodifferInSalaryComparison", LanguageUtil.get(httpRequest, "lr_NodifferInSalaryComparison"));
		langugaeKeysObj.put("lr_SGHigherSalary", LanguageUtil.get(httpRequest, "lr_SGHigherSalary"));
		
		langugaeKeysObj.put("lr_SGLowerSalary", LanguageUtil.get(httpRequest, "lr_SGLowerSalary"));
		langugaeKeysObj.put("lr_SalaryGuideFormTermAndCond", LanguageUtil.get(httpRequest, "lr_SalaryGuideFormTermAndCond"));
		langugaeKeysObj.put("lr_SalaryGuideFormDisclaimer", LanguageUtil.get(httpRequest, "lr_SalaryGuideFormDisclaimer"));
		
		langugaeKeysObj.put("lr_SGCurrencySeparator", LanguageUtil.get(httpRequest, "lr_SGCurrencySeparator"));
		
		
		
		//Validation Messages :
		
		
		langugaeKeysObj.put("lr_SGRequiredField",LanguageUtil.get(httpRequest, "lr_SGRequiredField"));
		langugaeKeysObj.put("lr_SGOnlyDigits",LanguageUtil.get(httpRequest, "lr_SGOnlyDigits"));
		langugaeKeysObj.put("lr_SGValidEmail",LanguageUtil.get(httpRequest, "lr_SGValidEmail"));
		langugaeKeysObj.put("lr_SGTermsAndCon",LanguageUtil.get(httpRequest, "lr_SGTermsAndCon"));
		
		
		request.setAttribute("languageKeysObj", langugaeKeysObj);
		
	}
	
	public static void getDropdownListByLocale(RenderRequest renderRequest) {
		
		_log.info("Class Name is SalaryGuideHelper >> MethodName is getDropdownListByLocale");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		themeDisplay.getLanguageId();
		themeDisplay.getLocale();
		
		_log.info("langId >>" + themeDisplay.getLanguageId());
		_log.info("locale >>" + themeDisplay.getLocale());
		
		
	String lrLanguageId = getSiteLocale(themeDisplay.getLanguageId());
	
	if(lrLanguageId.length() == 0 || lrLanguageId == null){
		
		lrLanguageId = "en-GB";
	}
	
	String[] siteId = lrLanguageId.split("-");
	
	//String preVal = siteId[0];
	String postVal = siteId[1];
	
	//_log.info("preVal >>" + preVal);
	_log.info("postVal >>" + postVal);
		
	String dropDownSiteKey = "Show_DropDownList_"+postVal;
	
	String getDropdownList  = PropsUtil.get(dropDownSiteKey);
	String separator = ",";
	
	getDropdownList = "Industry,Sector,Area,PositionName,Location";
	
	String[] dropDownArray = null;
	
	JSONObject dropDownObj = JSONFactoryUtil.createJSONObject();
	
	if(getDropdownList.length() > 0 && getDropdownList != null){
		
		dropDownArray = getDropdownList.split(separator);
		
		for(String str : dropDownArray){
			
			if(str.equals("Industry")){
				
				dropDownObj.put("industry", true);
				
			}
			if(str.equals("Sector")){
				
				dropDownObj.put("Sector", true);
				
			}
			if(str.equals("Area")){
				
				dropDownObj.put("Area", true);
				
			}
			if(str.equals("PositionName")){
				
				dropDownObj.put("positionName", true);
				
			}
			if(str.equals("Location")){
				
				dropDownObj.put("location", true);
				
			}
			if(str.equals("Company")){
				
				dropDownObj.put("company", true);
				
			}
			
		}
		
	}
	 
	_log.info("dropDownObj>>" + dropDownObj);
		
	
	renderRequest.setAttribute("dropDownList", dropDownObj);
	
	}
	

	private static final Log _log = LogFactoryUtil.getLog(SalaryGuideHelper.class.getName());
	
}