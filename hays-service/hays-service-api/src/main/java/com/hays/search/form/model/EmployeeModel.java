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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;hays_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hays.search.form.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hays.search.form.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author Sreenivasulu
 * @see Employee
 * @see com.hays.search.form.model.impl.EmployeeImpl
 * @see com.hays.search.form.model.impl.EmployeeModelImpl
 * @generated
 */
@ProviderType
public interface EmployeeModel extends BaseModel<Employee>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the employee name of this employee.
	 *
	 * @return the employee name of this employee
	 */
	@AutoEscape
	public String getEmployeeName();

	/**
	 * Sets the employee name of this employee.
	 *
	 * @param employeeName the employee name of this employee
	 */
	public void setEmployeeName(String employeeName);

	/**
	 * Returns the designation of this employee.
	 *
	 * @return the designation of this employee
	 */
	@AutoEscape
	public String getDesignation();

	/**
	 * Sets the designation of this employee.
	 *
	 * @param designation the designation of this employee
	 */
	public void setDesignation(String designation);

	/**
	 * Returns the address of this employee.
	 *
	 * @return the address of this employee
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this employee.
	 *
	 * @param address the address of this employee
	 */
	public void setAddress(String address);

	/**
	 * Returns the mobile number of this employee.
	 *
	 * @return the mobile number of this employee
	 */
	@AutoEscape
	public String getMobileNumber();

	/**
	 * Sets the mobile number of this employee.
	 *
	 * @param mobileNumber the mobile number of this employee
	 */
	public void setMobileNumber(String mobileNumber);

	/**
	 * Returns the email address of this employee.
	 *
	 * @return the email address of this employee
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this employee.
	 *
	 * @param emailAddress the email address of this employee
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the user ID of this employee.
	 *
	 * @return the user ID of this employee
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this employee.
	 *
	 * @param userId the user ID of this employee
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this employee.
	 *
	 * @return the user uuid of this employee
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this employee.
	 *
	 * @param userUuid the user uuid of this employee
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this employee.
	 *
	 * @return the user name of this employee
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this employee.
	 *
	 * @param userName the user name of this employee
	 */
	public void setUserName(String userName);

	/**
	 * Returns the company ID of this employee.
	 *
	 * @return the company ID of this employee
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this employee.
	 *
	 * @param companyId the company ID of this employee
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this employee.
	 *
	 * @return the group ID of this employee
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this employee.
	 *
	 * @param groupId the group ID of this employee
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the created date of this employee.
	 *
	 * @return the created date of this employee
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this employee.
	 *
	 * @param createdDate the created date of this employee
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the modified date of this employee.
	 *
	 * @return the modified date of this employee
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this employee.
	 *
	 * @param modifiedDate the modified date of this employee
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Employee employee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Employee> toCacheModel();

	@Override
	public Employee toEscapedModel();

	@Override
	public Employee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}