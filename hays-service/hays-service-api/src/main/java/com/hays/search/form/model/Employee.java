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

package com.hays.search.form.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Employee service. Represents a row in the &quot;hays_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author Sreenivasulu
 * @see EmployeeModel
 * @see com.hays.search.form.model.impl.EmployeeImpl
 * @see com.hays.search.form.model.impl.EmployeeModelImpl
 * @generated
 */
@ImplementationClassName("com.hays.search.form.model.impl.EmployeeImpl")
@ProviderType
public interface Employee extends EmployeeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.hays.search.form.model.impl.EmployeeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Employee, Long> EMPLOYEE_ID_ACCESSOR = new Accessor<Employee, Long>() {
			@Override
			public Long get(Employee employee) {
				return employee.getEmployeeId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Employee> getTypeClass() {
				return Employee.class;
			}
		};
}