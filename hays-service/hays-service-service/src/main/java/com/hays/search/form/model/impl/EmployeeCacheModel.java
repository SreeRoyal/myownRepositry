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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Sreenivasulu
 * @see Employee
 * @generated
 */
@ProviderType
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)obj;

		if (employeeId == employeeCacheModel.employeeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{employeeId=");
		sb.append(employeeId);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", address=");
		sb.append(address);
		sb.append(", mobileNumber=");
		sb.append(mobileNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployeeId(employeeId);

		if (employeeName == null) {
			employeeImpl.setEmployeeName(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmployeeName(employeeName);
		}

		if (designation == null) {
			employeeImpl.setDesignation(StringPool.BLANK);
		}
		else {
			employeeImpl.setDesignation(designation);
		}

		if (address == null) {
			employeeImpl.setAddress(StringPool.BLANK);
		}
		else {
			employeeImpl.setAddress(address);
		}

		if (mobileNumber == null) {
			employeeImpl.setMobileNumber(StringPool.BLANK);
		}
		else {
			employeeImpl.setMobileNumber(mobileNumber);
		}

		if (emailAddress == null) {
			employeeImpl.setEmailAddress(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmailAddress(emailAddress);
		}

		employeeImpl.setUserId(userId);

		if (userName == null) {
			employeeImpl.setUserName(StringPool.BLANK);
		}
		else {
			employeeImpl.setUserName(userName);
		}

		employeeImpl.setCompanyId(companyId);
		employeeImpl.setGroupId(groupId);

		if (createdDate == Long.MIN_VALUE) {
			employeeImpl.setCreatedDate(null);
		}
		else {
			employeeImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeImpl.setModifiedDate(null);
		}
		else {
			employeeImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeId = objectInput.readLong();
		employeeName = objectInput.readUTF();
		designation = objectInput.readUTF();
		address = objectInput.readUTF();
		mobileNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeId);

		if (employeeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designation);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (mobileNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobileNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long employeeId;
	public String employeeName;
	public String designation;
	public String address;
	public String mobileNumber;
	public String emailAddress;
	public long userId;
	public String userName;
	public long companyId;
	public long groupId;
	public long createdDate;
	public long modifiedDate;
}