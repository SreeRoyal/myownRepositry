package com.hays.service.salaryguide.service.persistence.impl;

import java.util.List;

import com.hays.service.salaryguide.model.HaysSalaryGuide;
import com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil;
import com.hays.service.salaryguide.service.persistence.HaysSalaryGuideFinder;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

public class HaysSalaryGuideFinderImpl extends HaysSalaryGuideFinderBaseImpl implements HaysSalaryGuideFinder{

/*	@AccessControlled(guestAccessEnabled=true)
	public List<String> findBylocale(String sitelocale) {		
			
			Session session = null;
			List<String> salGuideList = null;
			
		    try {
		        session = openSession();
	
				DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(HaysSalaryGuide.class,HaysSalaryGuideFinderImpl.class.getClassLoader());
				
				dynamicQuery.add(RestrictionsFactoryUtil.eq("sitelocale",sitelocale));
				
				dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("industry")));
				
				salGuideList = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);
	
	
		    }
		    catch (Exception e) {
		        try {
		            throw new SystemException(e);
		        }
		        catch (SystemException se) {
		            se.printStackTrace();
		        }
		    }
		    finally {
		        closeSession(session);
		    }
		    
	        return salGuideList;
	        
		}*/

}
