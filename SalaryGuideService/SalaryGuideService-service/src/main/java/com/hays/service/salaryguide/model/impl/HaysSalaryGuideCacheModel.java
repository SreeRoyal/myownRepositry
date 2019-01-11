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

import com.hays.service.salaryguide.model.HaysSalaryGuide;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing HaysSalaryGuide in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalaryGuide
 * @generated
 */
@ProviderType
public class HaysSalaryGuideCacheModel implements CacheModel<HaysSalaryGuide>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HaysSalaryGuideCacheModel)) {
			return false;
		}

		HaysSalaryGuideCacheModel haysSalaryGuideCacheModel = (HaysSalaryGuideCacheModel)obj;

		if (SGID.equals(haysSalaryGuideCacheModel.SGID)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, SGID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{INDUSTRY=");
		sb.append(INDUSTRY);
		sb.append(", LOCATIONNAME=");
		sb.append(LOCATIONNAME);
		sb.append(", SECTOR=");
		sb.append(SECTOR);
		sb.append(", POSITIONTYPE=");
		sb.append(POSITIONTYPE);
		sb.append(", AREA=");
		sb.append(AREA);
		sb.append(", COMPANY=");
		sb.append(COMPANY);
		sb.append(", POSITIONNAME=");
		sb.append(POSITIONNAME);
		sb.append(", SALARYRANGE=");
		sb.append(SALARYRANGE);
		sb.append(", SALARYTYPICAL=");
		sb.append(SALARYTYPICAL);
		sb.append(", NOTE=");
		sb.append(NOTE);
		sb.append(", SITELOCALE=");
		sb.append(SITELOCALE);
		sb.append(", SGDDOCNAME=");
		sb.append(SGDDOCNAME);
		sb.append(", SGID=");
		sb.append(SGID);
		sb.append(", SALARYTYPE=");
		sb.append(SALARYTYPE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HaysSalaryGuide toEntityModel() {
		HaysSalaryGuideImpl haysSalaryGuideImpl = new HaysSalaryGuideImpl();

		if (INDUSTRY == null) {
			haysSalaryGuideImpl.setINDUSTRY(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setINDUSTRY(INDUSTRY);
		}

		if (LOCATIONNAME == null) {
			haysSalaryGuideImpl.setLOCATIONNAME(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setLOCATIONNAME(LOCATIONNAME);
		}

		if (SECTOR == null) {
			haysSalaryGuideImpl.setSECTOR(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setSECTOR(SECTOR);
		}

		if (POSITIONTYPE == null) {
			haysSalaryGuideImpl.setPOSITIONTYPE(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setPOSITIONTYPE(POSITIONTYPE);
		}

		if (AREA == null) {
			haysSalaryGuideImpl.setAREA(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setAREA(AREA);
		}

		if (COMPANY == null) {
			haysSalaryGuideImpl.setCOMPANY(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setCOMPANY(COMPANY);
		}

		if (POSITIONNAME == null) {
			haysSalaryGuideImpl.setPOSITIONNAME(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setPOSITIONNAME(POSITIONNAME);
		}

		if (SALARYRANGE == null) {
			haysSalaryGuideImpl.setSALARYRANGE(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setSALARYRANGE(SALARYRANGE);
		}

		if (SALARYTYPICAL == null) {
			haysSalaryGuideImpl.setSALARYTYPICAL(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setSALARYTYPICAL(SALARYTYPICAL);
		}

		if (NOTE == null) {
			haysSalaryGuideImpl.setNOTE(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setNOTE(NOTE);
		}

		if (SITELOCALE == null) {
			haysSalaryGuideImpl.setSITELOCALE(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setSITELOCALE(SITELOCALE);
		}

		if (SGDDOCNAME == null) {
			haysSalaryGuideImpl.setSGDDOCNAME(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setSGDDOCNAME(SGDDOCNAME);
		}

		if (SGID == null) {
			haysSalaryGuideImpl.setSGID(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setSGID(SGID);
		}

		if (SALARYTYPE == null) {
			haysSalaryGuideImpl.setSALARYTYPE(StringPool.BLANK);
		}
		else {
			haysSalaryGuideImpl.setSALARYTYPE(SALARYTYPE);
		}

		haysSalaryGuideImpl.resetOriginalValues();

		return haysSalaryGuideImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		INDUSTRY = objectInput.readUTF();
		LOCATIONNAME = objectInput.readUTF();
		SECTOR = objectInput.readUTF();
		POSITIONTYPE = objectInput.readUTF();
		AREA = objectInput.readUTF();
		COMPANY = objectInput.readUTF();
		POSITIONNAME = objectInput.readUTF();
		SALARYRANGE = objectInput.readUTF();
		SALARYTYPICAL = objectInput.readUTF();
		NOTE = objectInput.readUTF();
		SITELOCALE = objectInput.readUTF();
		SGDDOCNAME = objectInput.readUTF();
		SGID = objectInput.readUTF();
		SALARYTYPE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (INDUSTRY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDUSTRY);
		}

		if (LOCATIONNAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LOCATIONNAME);
		}

		if (SECTOR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SECTOR);
		}

		if (POSITIONTYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POSITIONTYPE);
		}

		if (AREA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AREA);
		}

		if (COMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COMPANY);
		}

		if (POSITIONNAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POSITIONNAME);
		}

		if (SALARYRANGE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SALARYRANGE);
		}

		if (SALARYTYPICAL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SALARYTYPICAL);
		}

		if (NOTE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NOTE);
		}

		if (SITELOCALE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SITELOCALE);
		}

		if (SGDDOCNAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGDDOCNAME);
		}

		if (SGID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SGID);
		}

		if (SALARYTYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SALARYTYPE);
		}
	}

	public String INDUSTRY;
	public String LOCATIONNAME;
	public String SECTOR;
	public String POSITIONTYPE;
	public String AREA;
	public String COMPANY;
	public String POSITIONNAME;
	public String SALARYRANGE;
	public String SALARYTYPICAL;
	public String NOTE;
	public String SITELOCALE;
	public String SGDDOCNAME;
	public String SGID;
	public String SALARYTYPE;
}