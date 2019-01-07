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

import com.hays.search.form.model.SreeSoluctions;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SreeSoluctions in entity cache.
 *
 * @author Sreenivasulu
 * @see SreeSoluctions
 * @generated
 */
@ProviderType
public class SreeSoluctionsCacheModel implements CacheModel<SreeSoluctions>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SreeSoluctionsCacheModel)) {
			return false;
		}

		SreeSoluctionsCacheModel sreeSoluctionsCacheModel = (SreeSoluctionsCacheModel)obj;

		if (soluctionId == sreeSoluctionsCacheModel.soluctionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, soluctionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{soluctionId=");
		sb.append(soluctionId);
		sb.append(", branchId=");
		sb.append(branchId);
		sb.append(", branchAddress=");
		sb.append(branchAddress);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", officeEmailAddress=");
		sb.append(officeEmailAddress);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SreeSoluctions toEntityModel() {
		SreeSoluctionsImpl sreeSoluctionsImpl = new SreeSoluctionsImpl();

		sreeSoluctionsImpl.setSoluctionId(soluctionId);

		if (branchId == null) {
			sreeSoluctionsImpl.setBranchId(StringPool.BLANK);
		}
		else {
			sreeSoluctionsImpl.setBranchId(branchId);
		}

		if (branchAddress == null) {
			sreeSoluctionsImpl.setBranchAddress(StringPool.BLANK);
		}
		else {
			sreeSoluctionsImpl.setBranchAddress(branchAddress);
		}

		if (telephoneNumber == null) {
			sreeSoluctionsImpl.setTelephoneNumber(StringPool.BLANK);
		}
		else {
			sreeSoluctionsImpl.setTelephoneNumber(telephoneNumber);
		}

		if (officeEmailAddress == null) {
			sreeSoluctionsImpl.setOfficeEmailAddress(StringPool.BLANK);
		}
		else {
			sreeSoluctionsImpl.setOfficeEmailAddress(officeEmailAddress);
		}

		sreeSoluctionsImpl.setEmployeeId(employeeId);

		sreeSoluctionsImpl.resetOriginalValues();

		return sreeSoluctionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		soluctionId = objectInput.readLong();
		branchId = objectInput.readUTF();
		branchAddress = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		officeEmailAddress = objectInput.readUTF();

		employeeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(soluctionId);

		if (branchId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(branchId);
		}

		if (branchAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(branchAddress);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (officeEmailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(officeEmailAddress);
		}

		objectOutput.writeLong(employeeId);
	}

	public long soluctionId;
	public String branchId;
	public String branchAddress;
	public String telephoneNumber;
	public String officeEmailAddress;
	public long employeeId;
}