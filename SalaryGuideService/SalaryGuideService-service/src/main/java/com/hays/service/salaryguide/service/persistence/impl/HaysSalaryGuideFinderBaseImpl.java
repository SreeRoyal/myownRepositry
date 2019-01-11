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

package com.hays.service.salaryguide.service.persistence.impl;

import com.hays.service.salaryguide.model.HaysSalaryGuide;
import com.hays.service.salaryguide.service.persistence.HaysSalaryGuidePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HaysSalaryGuideFinderBaseImpl extends BasePersistenceImpl<HaysSalaryGuide> {
	public HaysSalaryGuideFinderBaseImpl() {
		setModelClass(HaysSalaryGuide.class);
	}

	/**
	 * Returns the hays salary guide persistence.
	 *
	 * @return the hays salary guide persistence
	 */
	public HaysSalaryGuidePersistence getHaysSalaryGuidePersistence() {
		return haysSalaryGuidePersistence;
	}

	/**
	 * Sets the hays salary guide persistence.
	 *
	 * @param haysSalaryGuidePersistence the hays salary guide persistence
	 */
	public void setHaysSalaryGuidePersistence(
		HaysSalaryGuidePersistence haysSalaryGuidePersistence) {
		this.haysSalaryGuidePersistence = haysSalaryGuidePersistence;
	}

	@BeanReference(type = HaysSalaryGuidePersistence.class)
	protected HaysSalaryGuidePersistence haysSalaryGuidePersistence;
}