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
import com.hays.service.salaryguide.service.base.HaysSalaryGuideLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;

/**
 * The implementation of the hays salary guide local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hays.service.salaryguide.service.HaysSalaryGuideLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalaryGuideLocalServiceBaseImpl
 * @see com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil
 */
public class HaysSalaryGuideLocalServiceImpl
	extends HaysSalaryGuideLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil} to access the hays salary guide local service.
	 */
/*
	public List<HaysSalaryGuide> findByindustry(String industry) {		
		return this.haysSalaryGuidePersistence.findByindustry(industry);
	}

	public List<String> findByLocale(String locale) {		
		return this.haysSalaryGuideFinder.findBylocale(locale);
	}
*/
}