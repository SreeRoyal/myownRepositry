package com.hays.service.salaryguide.service.util;

import java.util.List;

import com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionList;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class SalaryGuideServiceUtill {
	
	public static List<String> fetchAreaOfExpertiseBySiteLocal(String siteLocal) {

		_log.info("Class Name is --->HaysSalaryGuideLocalServiceImpl ::::  Method Name is --> fetchAreaOfExpertiseBySiteLocal");

		_log.info("siteLocal >>" + siteLocal);
		
		List<String> salGuideList = null;

		DynamicQuery dynamicQuery = HaysSalaryGuideLocalServiceUtil.dynamicQuery();

		dynamicQuery.add(RestrictionsFactoryUtil.eq("SITELOCALE", siteLocal));

		dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("INDUSTRY")));

		_log.info("dynamicQuery >>" + dynamicQuery);
		
		salGuideList = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);

		return salGuideList;
	}

	public static List<String> getListOfCategoriesByExpertise(String siteLocal, String areaOfExpertiese) {
		
		_log.info("Class Name is SalaryGuideServiceUtill ---> Method Name is getListOfCategoriesByExpertise ");

		_log.info("siteLocal >>" + siteLocal);
		_log.info("areaOfExpertiese >>" + areaOfExpertiese);
		
		
		DynamicQuery dynamicQuery = HaysSalaryGuideLocalServiceUtil.dynamicQuery();
		
		List<String> categorieyList = null;

		dynamicQuery.add(RestrictionsFactoryUtil.eq("SITELOCALE", siteLocal));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("INDUSTRY", areaOfExpertiese));
		dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("SECTOR")));

		categorieyList = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);
		
		_log.info("siteLocal >>>" + siteLocal);
		_log.info("areaOfExpertiese >>>" + areaOfExpertiese);
		_log.info("categorieyList >>>" + categorieyList);
		
		return categorieyList;
		
	}

	public static List<String> getListOfAreasByCategory(String siteId, String areaOfExpertise, String categoryType) {
		
		_log.info("Class Name is SalaryGuideServiceUtill ---> Method Name is getListOfAreasByCategory ");
		
		
		
		_log.info("siteLocal >>" + siteId);
		_log.info("areaOfExpertiese >>" + areaOfExpertise);
		_log.info("areaOfExpertiese >>" + categoryType);
		
		
		DynamicQuery dynamicQuery = HaysSalaryGuideLocalServiceUtil.dynamicQuery();

		List<String> areaList = null;
		
		dynamicQuery.add(RestrictionsFactoryUtil.eq("SITELOCALE", siteId));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("INDUSTRY", areaOfExpertise));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("SECTOR", categoryType));
	 	
		dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("AREA")));
		
		areaList = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);
		
		return areaList;
	}

	public static List<String> getListOfOrgTypesByArea(String siteId, String areaOfExpertise, String categoryType,String area) {
		
		_log.info("Class Name is SalaryGuideServiceUtill ---> Method Name is getListOfOrgTypesByArea ");
		
		DynamicQuery dynamicQuery = HaysSalaryGuideLocalServiceUtil.dynamicQuery();

		List<String> organizations = null;
		
		dynamicQuery.add(RestrictionsFactoryUtil.eq("SITELOCALE", siteId));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("INDUSTRY", areaOfExpertise));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("SECTOR", categoryType));
	 	
	 	if(!area.equals("NA"))
	 		dynamicQuery.add(RestrictionsFactoryUtil.eq("AREA", area));
	 	
		dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("POSITIONTYPE")));
		
		organizations = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);
		
		return organizations;
	}

	public static List<String> getListOfJobTitleByOrgType(String siteId, String areaOfExpertise, String categoryType,String area, String orgType) {
		
		
		_log.info("Class Name is SalaryGuideServiceUtill ---> Method Name is getListOfJobTitleByOrgType ");
		
		DynamicQuery dynamicQuery = HaysSalaryGuideLocalServiceUtil.dynamicQuery();

		List<String> jobTitles = null;
		
		dynamicQuery.add(RestrictionsFactoryUtil.eq("SITELOCALE", siteId));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("INDUSTRY", areaOfExpertise));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("SECTOR", categoryType));
	 	
	 	if(!area.equals("NA"))
	 		dynamicQuery.add(RestrictionsFactoryUtil.eq("AREA", area));
	 	
	 	if(!orgType.equals("NA"))
	 		dynamicQuery.add(RestrictionsFactoryUtil.eq("POSITIONTYPE", orgType));
	 	
		dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("POSITIONNAME")));	

		jobTitles = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);
		
		return jobTitles;
	}

	public static List<String> getListOfRegionsByTitle(String siteId, String areaOfExpertise, String categoryType,String area, String orgType, String jobTitle) {
		
		_log.info("Class Name is SalaryGuideServiceUtill ---> Method Name is getListOfRegionsByTitle  ");
		
		DynamicQuery dynamicQuery = HaysSalaryGuideLocalServiceUtil.dynamicQuery();

		List<String> regions = null;
		
		dynamicQuery.add(RestrictionsFactoryUtil.eq("SITELOCALE", siteId));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("INDUSTRY", areaOfExpertise));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("SECTOR", categoryType));
	 	
	 	if(!area.equals("NA"))
	 		dynamicQuery.add(RestrictionsFactoryUtil.eq("AREA", area));
	 	
	 	if(!orgType.equals("NA"))
	 		dynamicQuery.add(RestrictionsFactoryUtil.eq("POSITIONTYPE", orgType));
	 	
	 	if(!jobTitle.equals("NA"))
	 		dynamicQuery.add(RestrictionsFactoryUtil.eq("POSITIONNAME", jobTitle));		 	
	 	
		dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property("LOCATIONNAME")));		  
		

		regions = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);
		
		return regions;
	}

	public static List<Object[]> chechMySalary(String siteId, String areaOfExpertise, String categories, String area,String orgType, String jobTitle, String region) {
	
		_log.info("Class Name is SalaryGuideServiceUtill ---> Method Name is chechMySalary");

		
		DynamicQuery dynamicQuery = HaysSalaryGuideLocalServiceUtil.dynamicQuery();
		
		dynamicQuery.add(RestrictionsFactoryUtil.eq("SITELOCALE", siteId));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("INDUSTRY", areaOfExpertise));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("SECTOR", categories));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("AREA", area));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("POSITIONTYPE", orgType));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("POSITIONNAME", jobTitle));
	 	dynamicQuery.add(RestrictionsFactoryUtil.eq("LOCATIONNAME", region));
	 	
	 	ProjectionList projectionList = ProjectionFactoryUtil.projectionList();
	 	projectionList.add(PropertyFactoryUtil.forName("SALARYTYPICAL"));
	 	projectionList.add(PropertyFactoryUtil.forName("SALARYRANGE"));
	 	
	 	dynamicQuery.setProjection(projectionList);
	 	
	 	List<Object[]> resultList = HaysSalaryGuideLocalServiceUtil.dynamicQuery(dynamicQuery);
	 	
	 	return resultList;
	}
	private static final Log _log = LogFactoryUtil.getLog(SalaryGuideServiceUtill.class.getName());
}
