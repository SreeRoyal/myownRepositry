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

package com.hays.service.salaryguide.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.hays.service.salaryguide.model.HaysSGUserData;

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
 * The cache model class for representing HaysSGUserData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see HaysSGUserData
 * @generated
 */
@ProviderType
public class HaysSGUserDataCacheModel implements CacheModel<HaysSGUserData>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HaysSGUserDataCacheModel)) {
			return false;
		}

		HaysSGUserDataCacheModel haysSGUserDataCacheModel = (HaysSGUserDataCacheModel)obj;

		if (SGUSERID == haysSGUserDataCacheModel.SGUSERID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, SGUSERID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{SGUSERID=");
		sb.append(SGUSERID);
		sb.append(", SGUSERNAME=");
		sb.append(SGUSERNAME);
		sb.append(", SGJOBTITLE=");
		sb.append(SGJOBTITLE);
		sb.append(", SGORGANIZATION=");
		sb.append(SGORGANIZATION);
		sb.append(", SGLOCATION=");
		sb.append(SGLOCATION);
		sb.append(", SGEMAILADDRESS=");
		sb.append(SGEMAILADDRESS);
		sb.append(", FROMLOCALE=");
		sb.append(FROMLOCALE);
		sb.append(", CREATETIMESTAMP=");
		sb.append(CREATETIMESTAMP);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HaysSGUserData toEntityModel() {
		HaysSGUserDataImpl haysSGUserDataImpl = new HaysSGUserDataImpl();

		haysSGUserDataImpl.setSGUSERID(SGUSERID);

		if (SGUSERNAME == null) {
			haysSGUserDataImpl.setSGUSERNAME(StringPool.BLANK);
		}
		else {
			haysSGUserDataImpl.setSGUSERNAME(SGUSERNAME);
		}

		if (SGJOBTITLE == null) {
			haysSGUserDataImpl.setSGJOBTITLE(StringPool.BLANK);
		}
		else {
			haysSGUserDataImpl.setSGJOBTITLE(SGJOBTITLE);
		}

		if (SGORGANIZATION == null) {
			haysSGUserDataImpl.setSGORGANIZATION(StringPool.BLANK);
		}
		else {
			haysSGUserDataImpl.setSGORGANIZATION(SGORGANIZATION);
		}

		if (SGLOCATION == null) {
			haysSGUserDataImpl.setSGLOCATION(StringPool.BLANK);
		}
		else {
			haysSGUserDataImpl.setSGLOCATION(SGLOCATION);
		}

		if (SGEMAILADDRESS == null) {
			haysSGUserDataImpl.setSGEMAILADDRESS(StringPool.BLANK);
		}
		else {
			haysSGUserDataImpl.setSGEMAILADDRESS(SGEMAILADDRESS);
		}

		if (FROMLOCALE == null) {
			haysSGUserDataImpl.setFROMLOCALE(StringPool.BLANK);
		}
		else {
			haysSGUserDataImpl.setFROMLOCALE(FROMLOCALE);
		}

		if (CREATETIMESTAMP == Long.MIN_VALUE) {
			haysSGUserDataImpl.setCREATETIMESTAMP(null);
		}
		else {
			haysSGUserDataImpl.setCREATETIMESTAMP(new Date(CREATETIMESTAMP));
		}

		haysSGUserDataImpl.resetOriginalValues();

		return haysSGUserDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SGUSERID = objectInput.readLong();
		SGUSERNAME = objectInput.readUTF();
		SGJOBTITLE = objectInput.readUTF();
		SGORGANIZATION = objectInput.readUTF();
		SGLOCATION = objectInput.readUTF();
		SGEMAILADDRESS = objectInput.readUTF();
		FROMLOCALE = objectInput.readUTF();
		CREATETIMESTAMP = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SGUSERID);

		if (SGUSERNAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGUSERNAME);
		}

		if (SGJOBTITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGJOBTITLE);
		}

		if (SGORGANIZATION == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGORGANIZATION);
		}

		if (SGLOCATION == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGLOCATION);
		}

		if (SGEMAILADDRESS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGEMAILADDRESS);
		}

		if (FROMLOCALE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FROMLOCALE);
		}

		objectOutput.writeLong(CREATETIMESTAMP);
	}

	public long SGUSERID;
	public String SGUSERNAME;
	public String SGJOBTITLE;
	public String SGORGANIZATION;
	public String SGLOCATION;
	public String SGEMAILADDRESS;
	public String FROMLOCALE;
	public long CREATETIMESTAMP;
}