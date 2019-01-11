/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.hays.service.salaryguide.service.impl;

import java.util.Date;
import java.util.List;

import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;
import com.hays.service.salaryguide.service.base.HaysSalGuideUserDataUkLocalServiceBaseImpl;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the hays sal guide user data uk local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUkLocalServiceBaseImpl
 * @see com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalServiceUtil
 */
public class HaysSalGuideUserDataUkLocalServiceImpl
	extends HaysSalGuideUserDataUkLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalServiceUtil} to access the hays sal guide user data uk local service.
	 */
	
	public HaysSalGuideUserDataUk update(long sgUserId, String SGFORMINDUSTRY, String SGFORMSECTOR, String SGFORMAREA, String SGFORMPOSITIONTYPE,String SGFORMPOSITIONNAME, String LOCATIONNAME, String SGFROMLOCALE, String SGEMAIL, long SGCURRENTSALARY, String SGCOMPANY){
		
		HaysSalGuideUserDataUk haysSalGuideUserDataUk = null;
		
		if(sgUserId > 0){
			
			haysSalGuideUserDataUk= fetchHaysSalGuideUserDataUk(sgUserId);
		}
	
		if(Validator.isNull(haysSalGuideUserDataUk)){
			
			haysSalGuideUserDataUk = createHaysSalGuideUserDataUk(counterLocalService.increment(HaysSalGuideUserDataUk.class.getName()));
		}
		
		haysSalGuideUserDataUk.setSGFORMINDUSTRY(SGFORMINDUSTRY);
		haysSalGuideUserDataUk.setSGFORMSECTOR(SGFORMSECTOR);
		haysSalGuideUserDataUk.setSGFORMAREA(SGFORMAREA);
		haysSalGuideUserDataUk.setSGFORMPOSITIONTYPE(SGFORMPOSITIONTYPE);
		haysSalGuideUserDataUk.setSGFORMPOSITIONNAME(SGFORMPOSITIONNAME);
		haysSalGuideUserDataUk.setLOCATIONNAME(LOCATIONNAME);
		haysSalGuideUserDataUk.setSGFROMLOCALE(SGFROMLOCALE);
		haysSalGuideUserDataUk.setSGEMAIL(SGEMAIL);
		haysSalGuideUserDataUk.setSGCURRENTSALARY(SGCURRENTSALARY);
		haysSalGuideUserDataUk.setSGCOMPANY(SGCOMPANY);
		haysSalGuideUserDataUk.setCREATETIMESTAMP(new Date());
		
		haysSalGuideUserDataUk = addHaysSalGuideUserDataUk(haysSalGuideUserDataUk);
		
		return 	haysSalGuideUserDataUk;
	}
	
	public List<HaysSalGuideUserDataUk> findByLocal(String locale){
		
		if(locale != null && locale.length() > 0){
			return haysSalGuideUserDataUkPersistence.findBySiteLocale(locale);
		}
		return null;
	}
}