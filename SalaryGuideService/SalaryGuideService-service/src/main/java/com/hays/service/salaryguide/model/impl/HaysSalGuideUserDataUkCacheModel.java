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

import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;

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
 * The cache model class for representing HaysSalGuideUserDataUk in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUk
 * @generated
 */
@ProviderType
public class HaysSalGuideUserDataUkCacheModel implements CacheModel<HaysSalGuideUserDataUk>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HaysSalGuideUserDataUkCacheModel)) {
			return false;
		}

		HaysSalGuideUserDataUkCacheModel haysSalGuideUserDataUkCacheModel = (HaysSalGuideUserDataUkCacheModel)obj;

		if (SGUSERID == haysSalGuideUserDataUkCacheModel.SGUSERID) {
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
		StringBundler sb = new StringBundler(25);

		sb.append("{SGUSERID=");
		sb.append(SGUSERID);
		sb.append(", SGFORMINDUSTRY=");
		sb.append(SGFORMINDUSTRY);
		sb.append(", SGFORMSECTOR=");
		sb.append(SGFORMSECTOR);
		sb.append(", SGFORMAREA=");
		sb.append(SGFORMAREA);
		sb.append(", SGFORMPOSITIONTYPE=");
		sb.append(SGFORMPOSITIONTYPE);
		sb.append(", SGFORMPOSITIONNAME=");
		sb.append(SGFORMPOSITIONNAME);
		sb.append(", LOCATIONNAME=");
		sb.append(LOCATIONNAME);
		sb.append(", SGCOMPANY=");
		sb.append(SGCOMPANY);
		sb.append(", SGCURRENTSALARY=");
		sb.append(SGCURRENTSALARY);
		sb.append(", SGEMAIL=");
		sb.append(SGEMAIL);
		sb.append(", CREATETIMESTAMP=");
		sb.append(CREATETIMESTAMP);
		sb.append(", SGFROMLOCALE=");
		sb.append(SGFROMLOCALE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HaysSalGuideUserDataUk toEntityModel() {
		HaysSalGuideUserDataUkImpl haysSalGuideUserDataUkImpl = new HaysSalGuideUserDataUkImpl();

		haysSalGuideUserDataUkImpl.setSGUSERID(SGUSERID);

		if (SGFORMINDUSTRY == null) {
			haysSalGuideUserDataUkImpl.setSGFORMINDUSTRY(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGFORMINDUSTRY(SGFORMINDUSTRY);
		}

		if (SGFORMSECTOR == null) {
			haysSalGuideUserDataUkImpl.setSGFORMSECTOR(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGFORMSECTOR(SGFORMSECTOR);
		}

		if (SGFORMAREA == null) {
			haysSalGuideUserDataUkImpl.setSGFORMAREA(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGFORMAREA(SGFORMAREA);
		}

		if (SGFORMPOSITIONTYPE == null) {
			haysSalGuideUserDataUkImpl.setSGFORMPOSITIONTYPE(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGFORMPOSITIONTYPE(SGFORMPOSITIONTYPE);
		}

		if (SGFORMPOSITIONNAME == null) {
			haysSalGuideUserDataUkImpl.setSGFORMPOSITIONNAME(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGFORMPOSITIONNAME(SGFORMPOSITIONNAME);
		}

		if (LOCATIONNAME == null) {
			haysSalGuideUserDataUkImpl.setLOCATIONNAME(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setLOCATIONNAME(LOCATIONNAME);
		}

		if (SGCOMPANY == null) {
			haysSalGuideUserDataUkImpl.setSGCOMPANY(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGCOMPANY(SGCOMPANY);
		}

		haysSalGuideUserDataUkImpl.setSGCURRENTSALARY(SGCURRENTSALARY);

		if (SGEMAIL == null) {
			haysSalGuideUserDataUkImpl.setSGEMAIL(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGEMAIL(SGEMAIL);
		}

		if (CREATETIMESTAMP == Long.MIN_VALUE) {
			haysSalGuideUserDataUkImpl.setCREATETIMESTAMP(null);
		}
		else {
			haysSalGuideUserDataUkImpl.setCREATETIMESTAMP(new Date(
					CREATETIMESTAMP));
		}

		if (SGFROMLOCALE == null) {
			haysSalGuideUserDataUkImpl.setSGFROMLOCALE(StringPool.BLANK);
		}
		else {
			haysSalGuideUserDataUkImpl.setSGFROMLOCALE(SGFROMLOCALE);
		}

		haysSalGuideUserDataUkImpl.resetOriginalValues();

		return haysSalGuideUserDataUkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SGUSERID = objectInput.readLong();
		SGFORMINDUSTRY = objectInput.readUTF();
		SGFORMSECTOR = objectInput.readUTF();
		SGFORMAREA = objectInput.readUTF();
		SGFORMPOSITIONTYPE = objectInput.readUTF();
		SGFORMPOSITIONNAME = objectInput.readUTF();
		LOCATIONNAME = objectInput.readUTF();
		SGCOMPANY = objectInput.readUTF();

		SGCURRENTSALARY = objectInput.readLong();
		SGEMAIL = objectInput.readUTF();
		CREATETIMESTAMP = objectInput.readLong();
		SGFROMLOCALE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SGUSERID);

		if (SGFORMINDUSTRY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGFORMINDUSTRY);
		}

		if (SGFORMSECTOR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGFORMSECTOR);
		}

		if (SGFORMAREA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGFORMAREA);
		}

		if (SGFORMPOSITIONTYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGFORMPOSITIONTYPE);
		}

		if (SGFORMPOSITIONNAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGFORMPOSITIONNAME);
		}

		if (LOCATIONNAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LOCATIONNAME);
		}

		if (SGCOMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGCOMPANY);
		}

		objectOutput.writeLong(SGCURRENTSALARY);

		if (SGEMAIL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGEMAIL);
		}

		objectOutput.writeLong(CREATETIMESTAMP);

		if (SGFROMLOCALE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGFROMLOCALE);
		}
	}

	public long SGUSERID;
	public String SGFORMINDUSTRY;
	public String SGFORMSECTOR;
	public String SGFORMAREA;
	public String SGFORMPOSITIONTYPE;
	public String SGFORMPOSITIONNAME;
	public String LOCATIONNAME;
	public String SGCOMPANY;
	public long SGCURRENTSALARY;
	public String SGEMAIL;
	public long CREATETIMESTAMP;
	public String SGFROMLOCALE;
}