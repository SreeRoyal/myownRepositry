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

package com.hays.service.salaryguide.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the HaysSalaryGuide service. Represents a row in the &quot;webcmscustom.HAYS_SALARY_GUIDE&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalaryGuideModel
 * @see com.hays.service.salaryguide.model.impl.HaysSalaryGuideImpl
 * @see com.hays.service.salaryguide.model.impl.HaysSalaryGuideModelImpl
 * @generated
 */
@ImplementationClassName("com.hays.service.salaryguide.model.impl.HaysSalaryGuideImpl")
@ProviderType
public interface HaysSalaryGuide extends HaysSalaryGuideModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.hays.service.salaryguide.model.impl.HaysSalaryGuideImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HaysSalaryGuide, String> SGID_ACCESSOR = new Accessor<HaysSalaryGuide, String>() {
			@Override
			public String get(HaysSalaryGuide haysSalaryGuide) {
				return haysSalaryGuide.getSGID();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<HaysSalaryGuide> getTypeClass() {
				return HaysSalaryGuide.class;
			}
		};
}