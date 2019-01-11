package com.hays.portlet.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.hays.portlet.constants.SalaryGuideConstants;
import com.hays.portlet.constants.SalaryGuidePortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author dubeypr
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Hays",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=SalaryGuide Guide",
		"com.liferay.portlet.action-url-redirect=false",
		"com.liferay.portlet.requires-namespaced-parameters=false",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SalaryGuidePortletKeys.SalaryGuide,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SalaryGuidePortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		_log.info("Class Name is SalaryGuidePortlet >>  Method Name is >> render");
		
		SalaryGuideHelper.getLocalAreaOfExperties(renderRequest);
		SalaryGuideHelper.getLangugaesKeys(renderRequest);
		SalaryGuideHelper.getDropdownListByLocale(renderRequest);
		
		super.render(renderRequest, renderResponse);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		_log.info("Class Name is SalaryGuidePortlet >>  Method Name is >> serveResource");
		
		String constant = ParamUtil.getString(resourceRequest, "constant");
		
		if(constant.equals(SalaryGuideConstants.SALARY_CHECKER)){
			
			SalaryGuideHelper.checkSalary(resourceRequest,resourceResponse);
		
		}else{
			
			SalaryGuideHelper.getPopulatedList(resourceRequest, resourceResponse);
		}
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	private static final Log _log = LogFactoryUtil.getLog(SalaryGuidePortlet.class.getName());
}