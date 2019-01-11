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

import java.util.List;

import com.hays.service.salaryguide.model.HaysSalaryGuide;
import com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil;
import com.hays.service.salaryguide.service.base.HaysSalaryGuideServiceBaseImpl;
import com.liferay.portal.kernel.security.access.control.AccessControlled;

/**
 * The implementation of the hays salary guide remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hays.service.salaryguide.service.HaysSalaryGuideService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalaryGuideServiceBaseImpl
 * @see com.hays.service.salaryguide.service.HaysSalaryGuideServiceUtil
 */
public class HaysSalaryGuideServiceImpl extends HaysSalaryGuideServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.hays.service.salaryguide.service.HaysSalaryGuideServiceUtil} to access the hays salary guide remote service.
	 */
	/*@AccessControlled(guestAccessEnabled=true)
	public List<HaysSalaryGuide> getSalaryGuideByIndustry(String areaOfExpertise){
		return HaysSalaryGuideLocalServiceUtil.findByindustry(areaOfExpertise);
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public List<String> findByLocale(String locale) {		
		return this.haysSalaryGuideFinder.findBylocale(locale);
	}*/
}