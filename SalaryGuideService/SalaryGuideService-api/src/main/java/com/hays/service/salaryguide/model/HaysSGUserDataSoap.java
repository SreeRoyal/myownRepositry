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
 * This class is used by SOAP remote services, specifically {@link com.hays.service.salaryguide.service.http.HaysSGUserDataServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.http.HaysSGUserDataServiceSoap
 * @generated
 */
@ProviderType
public class HaysSGUserDataSoap implements Serializable {
	public static HaysSGUserDataSoap toSoapModel(HaysSGUserData model) {
		HaysSGUserDataSoap soapModel = new HaysSGUserDataSoap();

		soapModel.setSGUSERID(model.getSGUSERID());
		soapModel.setSGUSERNAME(model.getSGUSERNAME());
		soapModel.setSGJOBTITLE(model.getSGJOBTITLE());
		soapModel.setSGORGANIZATION(model.getSGORGANIZATION());
		soapModel.setSGLOCATION(model.getSGLOCATION());
		soapModel.setSGEMAILADDRESS(model.getSGEMAILADDRESS());
		soapModel.setFROMLOCALE(model.getFROMLOCALE());
		soapModel.setCREATETIMESTAMP(model.getCREATETIMESTAMP());

		return soapModel;
	}

	public static HaysSGUserDataSoap[] toSoapModels(HaysSGUserData[] models) {
		HaysSGUserDataSoap[] soapModels = new HaysSGUserDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HaysSGUserDataSoap[][] toSoapModels(HaysSGUserData[][] models) {
		HaysSGUserDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HaysSGUserDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HaysSGUserDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HaysSGUserDataSoap[] toSoapModels(List<HaysSGUserData> models) {
		List<HaysSGUserDataSoap> soapModels = new ArrayList<HaysSGUserDataSoap>(models.size());

		for (HaysSGUserData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HaysSGUserDataSoap[soapModels.size()]);
	}

	public HaysSGUserDataSoap() {
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

	public String getSGUSERNAME() {
		return _SGUSERNAME;
	}

	public void setSGUSERNAME(String SGUSERNAME) {
		_SGUSERNAME = SGUSERNAME;
	}

	public String getSGJOBTITLE() {
		return _SGJOBTITLE;
	}

	public void setSGJOBTITLE(String SGJOBTITLE) {
		_SGJOBTITLE = SGJOBTITLE;
	}

	public String getSGORGANIZATION() {
		return _SGORGANIZATION;
	}

	public void setSGORGANIZATION(String SGORGANIZATION) {
		_SGORGANIZATION = SGORGANIZATION;
	}

	public String getSGLOCATION() {
		return _SGLOCATION;
	}

	public void setSGLOCATION(String SGLOCATION) {
		_SGLOCATION = SGLOCATION;
	}

	public String getSGEMAILADDRESS() {
		return _SGEMAILADDRESS;
	}

	public void setSGEMAILADDRESS(String SGEMAILADDRESS) {
		_SGEMAILADDRESS = SGEMAILADDRESS;
	}

	public String getFROMLOCALE() {
		return _FROMLOCALE;
	}

	public void setFROMLOCALE(String FROMLOCALE) {
		_FROMLOCALE = FROMLOCALE;
	}

	public Date getCREATETIMESTAMP() {
		return _CREATETIMESTAMP;
	}

	public void setCREATETIMESTAMP(Date CREATETIMESTAMP) {
		_CREATETIMESTAMP = CREATETIMESTAMP;
	}

	private long _SGUSERID;
	private String _SGUSERNAME;
	private String _SGJOBTITLE;
	private String _SGORGANIZATION;
	private String _SGLOCATION;
	private String _SGEMAILADDRESS;
	private String _FROMLOCALE;
	private Date _CREATETIMESTAMP;
}