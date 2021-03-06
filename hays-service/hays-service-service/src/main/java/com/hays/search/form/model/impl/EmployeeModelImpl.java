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

package com.hays.search.form.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.hays.search.form.model.Employee;
import com.hays.search.form.model.EmployeeModel;
import com.hays.search.form.model.EmployeeSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Employee service. Represents a row in the &quot;hays_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link EmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author Sreenivasulu
 * @see EmployeeImpl
 * @see Employee
 * @see EmployeeModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class EmployeeModelImpl extends BaseModelImpl<Employee>
	implements EmployeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */
	public static final String TABLE_NAME = "hays_Employee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "employeeId", Types.BIGINT },
			{ "employeeName", Types.VARCHAR },
			{ "designation", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "mobileNumber", Types.VARCHAR },
			{ "emailAddress", Types.VARCHAR },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("employeeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("employeeName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("designation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mobileNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table hays_Employee (employeeId LONG not null primary key,employeeName VARCHAR(75) null,designation VARCHAR(75) null,address VARCHAR(75) null,mobileNumber VARCHAR(75) null,emailAddress VARCHAR(75) null,userId LONG,userName VARCHAR(75) null,companyId LONG,groupId LONG,createdDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table hays_Employee";
	public static final String ORDER_BY_JPQL = " ORDER BY employee.employeeId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY hays_Employee.employeeId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.hays.search.form.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hays.search.form.model.Employee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.hays.search.form.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hays.search.form.model.Employee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.hays.search.form.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hays.search.form.model.Employee"),
			true);
	public static final long DESIGNATION_COLUMN_BITMASK = 1L;
	public static final long EMPLOYEENAME_COLUMN_BITMASK = 2L;
	public static final long EMPLOYEEID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Employee toModel(EmployeeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Employee model = new EmployeeImpl();

		model.setEmployeeId(soapModel.getEmployeeId());
		model.setEmployeeName(soapModel.getEmployeeName());
		model.setDesignation(soapModel.getDesignation());
		model.setAddress(soapModel.getAddress());
		model.setMobileNumber(soapModel.getMobileNumber());
		model.setEmailAddress(soapModel.getEmailAddress());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Employee> toModels(EmployeeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Employee> models = new ArrayList<Employee>(soapModels.length);

		for (EmployeeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.hays.search.form.service.util.ServiceProps.get(
				"lock.expiration.time.com.hays.search.form.model.Employee"));

	public EmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("designation", getDesignation());
		attributes.put("address", getAddress());
		attributes.put("mobileNumber", getMobileNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String mobileNumber = (String)attributes.get("mobileNumber");

		if (mobileNumber != null) {
			setMobileNumber(mobileNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@JSON
	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_columnBitmask = -1L;

		_employeeId = employeeId;
	}

	@JSON
	@Override
	public String getEmployeeName() {
		if (_employeeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _employeeName;
		}
	}

	@Override
	public void setEmployeeName(String employeeName) {
		_columnBitmask |= EMPLOYEENAME_COLUMN_BITMASK;

		if (_originalEmployeeName == null) {
			_originalEmployeeName = _employeeName;
		}

		_employeeName = employeeName;
	}

	public String getOriginalEmployeeName() {
		return GetterUtil.getString(_originalEmployeeName);
	}

	@JSON
	@Override
	public String getDesignation() {
		if (_designation == null) {
			return StringPool.BLANK;
		}
		else {
			return _designation;
		}
	}

	@Override
	public void setDesignation(String designation) {
		_columnBitmask |= DESIGNATION_COLUMN_BITMASK;

		if (_originalDesignation == null) {
			_originalDesignation = _designation;
		}

		_designation = designation;
	}

	public String getOriginalDesignation() {
		return GetterUtil.getString(_originalDesignation);
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@JSON
	@Override
	public String getMobileNumber() {
		if (_mobileNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _mobileNumber;
		}
	}

	@Override
	public void setMobileNumber(String mobileNumber) {
		_mobileNumber = mobileNumber;
	}

	@JSON
	@Override
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Employee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Employee toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Employee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployeeId(getEmployeeId());
		employeeImpl.setEmployeeName(getEmployeeName());
		employeeImpl.setDesignation(getDesignation());
		employeeImpl.setAddress(getAddress());
		employeeImpl.setMobileNumber(getMobileNumber());
		employeeImpl.setEmailAddress(getEmailAddress());
		employeeImpl.setUserId(getUserId());
		employeeImpl.setUserName(getUserName());
		employeeImpl.setCompanyId(getCompanyId());
		employeeImpl.setGroupId(getGroupId());
		employeeImpl.setCreatedDate(getCreatedDate());
		employeeImpl.setModifiedDate(getModifiedDate());

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public int compareTo(Employee employee) {
		int value = 0;

		if (getEmployeeId() < employee.getEmployeeId()) {
			value = -1;
		}
		else if (getEmployeeId() > employee.getEmployeeId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Employee)) {
			return false;
		}

		Employee employee = (Employee)obj;

		long primaryKey = employee.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		EmployeeModelImpl employeeModelImpl = this;

		employeeModelImpl._originalEmployeeName = employeeModelImpl._employeeName;

		employeeModelImpl._originalDesignation = employeeModelImpl._designation;

		employeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Employee> toCacheModel() {
		EmployeeCacheModel employeeCacheModel = new EmployeeCacheModel();

		employeeCacheModel.employeeId = getEmployeeId();

		employeeCacheModel.employeeName = getEmployeeName();

		String employeeName = employeeCacheModel.employeeName;

		if ((employeeName != null) && (employeeName.length() == 0)) {
			employeeCacheModel.employeeName = null;
		}

		employeeCacheModel.designation = getDesignation();

		String designation = employeeCacheModel.designation;

		if ((designation != null) && (designation.length() == 0)) {
			employeeCacheModel.designation = null;
		}

		employeeCacheModel.address = getAddress();

		String address = employeeCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			employeeCacheModel.address = null;
		}

		employeeCacheModel.mobileNumber = getMobileNumber();

		String mobileNumber = employeeCacheModel.mobileNumber;

		if ((mobileNumber != null) && (mobileNumber.length() == 0)) {
			employeeCacheModel.mobileNumber = null;
		}

		employeeCacheModel.emailAddress = getEmailAddress();

		String emailAddress = employeeCacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			employeeCacheModel.emailAddress = null;
		}

		employeeCacheModel.userId = getUserId();

		employeeCacheModel.userName = getUserName();

		String userName = employeeCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			employeeCacheModel.userName = null;
		}

		employeeCacheModel.companyId = getCompanyId();

		employeeCacheModel.groupId = getGroupId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			employeeCacheModel.createdDate = createdDate.getTime();
		}
		else {
			employeeCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			employeeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			employeeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return employeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{employeeId=");
		sb.append(getEmployeeId());
		sb.append(", employeeName=");
		sb.append(getEmployeeName());
		sb.append(", designation=");
		sb.append(getDesignation());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", mobileNumber=");
		sb.append(getMobileNumber());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.hays.search.form.model.Employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeName</column-name><column-value><![CDATA[");
		sb.append(getEmployeeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designation</column-name><column-value><![CDATA[");
		sb.append(getDesignation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobileNumber</column-name><column-value><![CDATA[");
		sb.append(getMobileNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Employee.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Employee.class
		};
	private long _employeeId;
	private String _employeeName;
	private String _originalEmployeeName;
	private String _designation;
	private String _originalDesignation;
	private String _address;
	private String _mobileNumber;
	private String _emailAddress;
	private long _userId;
	private String _userName;
	private long _companyId;
	private long _groupId;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _columnBitmask;
	private Employee _escapedModel;
}