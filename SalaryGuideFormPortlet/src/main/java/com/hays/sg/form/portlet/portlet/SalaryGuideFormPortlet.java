package com.hays.sg.form.portlet.portlet;

import com.hays.sg.form.portlet.constants.SalaryGuideFormPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author ramayanapus
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Salary Guide Form",
		"com.liferay.portlet.action-url-redirect=false",
		"com.liferay.portlet.requires-namespaced-parameters=false",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SalaryGuideFormPortletKeys.SalaryGuideForm,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SalaryGuideFormPortlet extends MVCPortlet {
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		_log.info("Class Name is ::: SalaryGuideFormPortlet ::: Method Name is render ");
		
		
		SalaryGuideFormHelper.getLanguageKeys(renderRequest, renderResponse);
		
		super.render(renderRequest, renderResponse);
	}
	
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		
		SalaryGuideFormHelper.updateSalaryGuideFormData(resourceRequest,resourceResponse);
		
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	
	private static final Log _log = LogFactoryUtil.getLog(SalaryGuideFormPortlet.class.getName());

}