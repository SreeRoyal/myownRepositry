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

import com.hays.service.salaryguide.model.HaysSGUserData;
import com.hays.service.salaryguide.service.base.HaysSGUserDataLocalServiceBaseImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the hays sg user data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hays.service.salaryguide.service.HaysSGUserDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSGUserDataLocalServiceBaseImpl
 * @see com.hays.service.salaryguide.service.HaysSGUserDataLocalServiceUtil
 */
public class HaysSGUserDataLocalServiceImpl
	extends HaysSGUserDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.hays.service.salaryguide.service.HaysSGUserDataLocalServiceUtil} to access the hays sg user data local service.
	 */
	
	public HaysSGUserData update(long sgUserId, String SGUSERNAME, String SGJOBTITLE, String SGORGANIZATION, String SGLOCATION, String SGEMAILADDRESS, String FROMLOCALE){
		
		_log.info("Class Name Is HaysSGUserDataLocalServiceImpl :: Method Name is :: update");
		
		HaysSGUserData haysSGUserData = null;
		
		if(sgUserId > 0){
			
			haysSGUserData = fetchHaysSGUserData(sgUserId);
		}
		
		if(haysSGUserData == null || Validator.isNull(haysSGUserData)){
					
			haysSGUserData = createHaysSGUserData(counterLocalService.increment(HaysSGUserData.class.getName()));
		}
		
		haysSGUserData.setSGUSERNAME(SGUSERNAME);
		haysSGUserData.setSGJOBTITLE(SGJOBTITLE);
		haysSGUserData.setSGORGANIZATION(SGORGANIZATION);
		haysSGUserData.setSGLOCATION(SGLOCATION);
		haysSGUserData.setSGEMAILADDRESS(SGEMAILADDRESS);
		haysSGUserData.setFROMLOCALE(FROMLOCALE);
		haysSGUserData.setCREATETIMESTAMP(new Date());
		
		haysSGUserData = addHaysSGUserData(haysSGUserData);
		
		return haysSGUserData;
		
	}
	
	public List<HaysSGUserData> findByLocal(String locale){
		
		_log.info("Class Name Is HaysSGUserDataLocalServiceImpl :: Method Name is :: findByLocal");
		
		if(locale != null && locale.length() > 0){
			return haysSGUserDataPersistence.findByFromLocale(locale);
		}
		return null;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(HaysSGUserDataLocalServiceImpl.class.getName());
}