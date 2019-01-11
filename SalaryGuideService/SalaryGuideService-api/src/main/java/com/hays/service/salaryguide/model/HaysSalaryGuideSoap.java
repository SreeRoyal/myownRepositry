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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hays.service.salaryguide.service.http.HaysSalaryGuideServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.http.HaysSalaryGuideServiceSoap
 * @generated
 */
@ProviderType
public class HaysSalaryGuideSoap implements Serializable {
	public static HaysSalaryGuideSoap toSoapModel(HaysSalaryGuide model) {
		HaysSalaryGuideSoap soapModel = new HaysSalaryGuideSoap();

		soapModel.setINDUSTRY(model.getINDUSTRY());
		soapModel.setLOCATIONNAME(model.getLOCATIONNAME());
		soapModel.setSECTOR(model.getSECTOR());
		soapModel.setPOSITIONTYPE(model.getPOSITIONTYPE());
		soapModel.setAREA(model.getAREA());
		soapModel.setCOMPANY(model.getCOMPANY());
		soapModel.setPOSITIONNAME(model.getPOSITIONNAME());
		soapModel.setSALARYRANGE(model.getSALARYRANGE());
		soapModel.setSALARYTYPICAL(model.getSALARYTYPICAL());
		soapModel.setNOTE(model.getNOTE());
		soapModel.setSITELOCALE(model.getSITELOCALE());
		soapModel.setSGDDOCNAME(model.getSGDDOCNAME());
		soapModel.setSGID(model.getSGID());
		soapModel.setSALARYTYPE(model.getSALARYTYPE());

		return soapModel;
	}

	public static HaysSalaryGuideSoap[] toSoapModels(HaysSalaryGuide[] models) {
		HaysSalaryGuideSoap[] soapModels = new HaysSalaryGuideSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HaysSalaryGuideSoap[][] toSoapModels(
		HaysSalaryGuide[][] models) {
		HaysSalaryGuideSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HaysSalaryGuideSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HaysSalaryGuideSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HaysSalaryGuideSoap[] toSoapModels(
		List<HaysSalaryGuide> models) {
		List<HaysSalaryGuideSoap> soapModels = new ArrayList<HaysSalaryGuideSoap>(models.size());

		for (HaysSalaryGuide model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HaysSalaryGuideSoap[soapModels.size()]);
	}

	public HaysSalaryGuideSoap() {
	}

	public String getPrimaryKey() {
		return _SGID;
	}

	public void setPrimaryKey(String pk) {
		setSGID(pk);
	}

	public String getINDUSTRY() {
		return _INDUSTRY;
	}

	public void setINDUSTRY(String INDUSTRY) {
		_INDUSTRY = INDUSTRY;
	}

	public String getLOCATIONNAME() {
		return _LOCATIONNAME;
	}

	public void setLOCATIONNAME(String LOCATIONNAME) {
		_LOCATIONNAME = LOCATIONNAME;
	}

	public String getSECTOR() {
		return _SECTOR;
	}

	public void setSECTOR(String SECTOR) {
		_SECTOR = SECTOR;
	}

	public String getPOSITIONTYPE() {
		return _POSITIONTYPE;
	}

	public void setPOSITIONTYPE(String POSITIONTYPE) {
		_POSITIONTYPE = POSITIONTYPE;
	}

	public String getAREA() {
		return _AREA;
	}

	public void setAREA(String AREA) {
		_AREA = AREA;
	}

	public String getCOMPANY() {
		return _COMPANY;
	}

	public void setCOMPANY(String COMPANY) {
		_COMPANY = COMPANY;
	}

	public String getPOSITIONNAME() {
		return _POSITIONNAME;
	}

	public void setPOSITIONNAME(String POSITIONNAME) {
		_POSITIONNAME = POSITIONNAME;
	}

	public String getSALARYRANGE() {
		return _SALARYRANGE;
	}

	public void setSALARYRANGE(String SALARYRANGE) {
		_SALARYRANGE = SALARYRANGE;
	}

	public String getSALARYTYPICAL() {
		return _SALARYTYPICAL;
	}

	public void setSALARYTYPICAL(String SALARYTYPICAL) {
		_SALARYTYPICAL = SALARYTYPICAL;
	}

	public String getNOTE() {
		return _NOTE;
	}

	public void setNOTE(String NOTE) {
		_NOTE = NOTE;
	}

	public String getSITELOCALE() {
		return _SITELOCALE;
	}

	public void setSITELOCALE(String SITELOCALE) {
		_SITELOCALE = SITELOCALE;
	}

	public String getSGDDOCNAME() {
		return _SGDDOCNAME;
	}

	public void setSGDDOCNAME(String SGDDOCNAME) {
		_SGDDOCNAME = SGDDOCNAME;
	}

	public String getSGID() {
		return _SGID;
	}

	public void setSGID(String SGID) {
		_SGID = SGID;
	}

	public String getSALARYTYPE() {
		return _SALARYTYPE;
	}

	public void setSALARYTYPE(String SALARYTYPE) {
		_SALARYTYPE = SALARYTYPE;
	}

	private String _INDUSTRY;
	private String _LOCATIONNAME;
	private String _SECTOR;
	private String _POSITIONTYPE;
	private String _AREA;
	private String _COMPANY;
	private String _POSITIONNAME;
	private String _SALARYRANGE;
	private String _SALARYTYPICAL;
	private String _NOTE;
	private String _SITELOCALE;
	private String _SGDDOCNAME;
	private String _SGID;
	private String _SALARYTYPE;
}