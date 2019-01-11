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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hays.service.salaryguide.service.http.HaysSalGuideUserDataUkServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.http.HaysSalGuideUserDataUkServiceSoap
 * @generated
 */
@ProviderType
public class HaysSalGuideUserDataUkSoap implements Serializable {
	public static HaysSalGuideUserDataUkSoap toSoapModel(
		HaysSalGuideUserDataUk model) {
		HaysSalGuideUserDataUkSoap soapModel = new HaysSalGuideUserDataUkSoap();

		soapModel.setSGUSERID(model.getSGUSERID());
		soapModel.setSGFORMINDUSTRY(model.getSGFORMINDUSTRY());
		soapModel.setSGFORMSECTOR(model.getSGFORMSECTOR());
		soapModel.setSGFORMAREA(model.getSGFORMAREA());
		soapModel.setSGFORMPOSITIONTYPE(model.getSGFORMPOSITIONTYPE());
		soapModel.setSGFORMPOSITIONNAME(model.getSGFORMPOSITIONNAME());
		soapModel.setLOCATIONNAME(model.getLOCATIONNAME());
		soapModel.setSGCOMPANY(model.getSGCOMPANY());
		soapModel.setSGCURRENTSALARY(model.getSGCURRENTSALARY());
		soapModel.setSGEMAIL(model.getSGEMAIL());
		soapModel.setCREATETIMESTAMP(model.getCREATETIMESTAMP());
		soapModel.setSGFROMLOCALE(model.getSGFROMLOCALE());

		return soapModel;
	}

	public static HaysSalGuideUserDataUkSoap[] toSoapModels(
		HaysSalGuideUserDataUk[] models) {
		HaysSalGuideUserDataUkSoap[] soapModels = new HaysSalGuideUserDataUkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HaysSalGuideUserDataUkSoap[][] toSoapModels(
		HaysSalGuideUserDataUk[][] models) {
		HaysSalGuideUserDataUkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HaysSalGuideUserDataUkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HaysSalGuideUserDataUkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HaysSalGuideUserDataUkSoap[] toSoapModels(
		List<HaysSalGuideUserDataUk> models) {
		List<HaysSalGuideUserDataUkSoap> soapModels = new ArrayList<HaysSalGuideUserDataUkSoap>(models.size());

		for (HaysSalGuideUserDataUk model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HaysSalGuideUserDataUkSoap[soapModels.size()]);
	}

	public HaysSalGuideUserDataUkSoap() {
	}

	public long getPrimaryKey() {
		return _SGUSERID;
	}

	public void setPrimaryKey(long pk) {
		setSGUSERID(pk);
	}

	public long getSGUSERID() {
		return _SGUSERID;
	}

	public void setSGUSERID(long SGUSERID) {
		_SGUSERID = SGUSERID;
	}

	public String getSGFORMINDUSTRY() {
		return _SGFORMINDUSTRY;
	}

	public void setSGFORMINDUSTRY(String SGFORMINDUSTRY) {
		_SGFORMINDUSTRY = SGFORMINDUSTRY;
	}

	public String getSGFORMSECTOR() {
		return _SGFORMSECTOR;
	}

	public void setSGFORMSECTOR(String SGFORMSECTOR) {
		_SGFORMSECTOR = SGFORMSECTOR;
	}

	public String getSGFORMAREA() {
		return _SGFORMAREA;
	}

	public void setSGFORMAREA(String SGFORMAREA) {
		_SGFORMAREA = SGFORMAREA;
	}

	public String getSGFORMPOSITIONTYPE() {
		return _SGFORMPOSITIONTYPE;
	}

	public void setSGFORMPOSITIONTYPE(String SGFORMPOSITIONTYPE) {
		_SGFORMPOSITIONTYPE = SGFORMPOSITIONTYPE;
	}

	public String getSGFORMPOSITIONNAME() {
		return _SGFORMPOSITIONNAME;
	}

	public void setSGFORMPOSITIONNAME(String SGFORMPOSITIONNAME) {
		_SGFORMPOSITIONNAME = SGFORMPOSITIONNAME;
	}

	public String getLOCATIONNAME() {
		return _LOCATIONNAME;
	}

	public void setLOCATIONNAME(String LOCATIONNAME) {
		_LOCATIONNAME = LOCATIONNAME;
	}

	public String getSGCOMPANY() {
		return _SGCOMPANY;
	}

	public void setSGCOMPANY(String SGCOMPANY) {
		_SGCOMPANY = SGCOMPANY;
	}

	public long getSGCURRENTSALARY() {
		return _SGCURRENTSALARY;
	}

	public void setSGCURRENTSALARY(long SGCURRENTSALARY) {
		_SGCURRENTSALARY = SGCURRENTSALARY;
	}

	public String getSGEMAIL() {
		return _SGEMAIL;
	}

	public void setSGEMAIL(String SGEMAIL) {
		_SGEMAIL = SGEMAIL;
	}

	public Date getCREATETIMESTAMP() {
		return _CREATETIMESTAMP;
	}

	public void setCREATETIMESTAMP(Date CREATETIMESTAMP) {
		_CREATETIMESTAMP = CREATETIMESTAMP;
	}

	public String getSGFROMLOCALE() {
		return _SGFROMLOCALE;
	}

	public void setSGFROMLOCALE(String SGFROMLOCALE) {
		_SGFROMLOCALE = SGFROMLOCALE;
	}

	private long _SGUSERID;
	private String _SGFORMINDUSTRY;
	private String _SGFORMSECTOR;
	private String _SGFORMAREA;
	private String _SGFORMPOSITIONTYPE;
	private String _SGFORMPOSITIONNAME;
	private String _LOCATIONNAME;
	private String _SGCOMPANY;
	private long _SGCURRENTSALARY;
	private String _SGEMAIL;
	private Date _CREATETIMESTAMP;
	private String _SGFROMLOCALE;
}