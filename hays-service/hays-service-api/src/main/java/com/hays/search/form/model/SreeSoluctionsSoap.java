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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hays.search.form.service.http.SreeSoluctionsServiceSoap}.
 *
 * @author Sreenivasulu
 * @see com.hays.search.form.service.http.SreeSoluctionsServiceSoap
 * @generated
 */
@ProviderType
public class SreeSoluctionsSoap implements Serializable {
	public static SreeSoluctionsSoap toSoapModel(SreeSoluctions model) {
		SreeSoluctionsSoap soapModel = new SreeSoluctionsSoap();

		soapModel.setSoluctionId(model.getSoluctionId());
		soapModel.setBranchId(model.getBranchId());
		soapModel.setBranchAddress(model.getBranchAddress());
		soapModel.setTelephoneNumber(model.getTelephoneNumber());
		soapModel.setOfficeEmailAddress(model.getOfficeEmailAddress());
		soapModel.setEmployeeId(model.getEmployeeId());

		return soapModel;
	}

	public static SreeSoluctionsSoap[] toSoapModels(SreeSoluctions[] models) {
		SreeSoluctionsSoap[] soapModels = new SreeSoluctionsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SreeSoluctionsSoap[][] toSoapModels(SreeSoluctions[][] models) {
		SreeSoluctionsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SreeSoluctionsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SreeSoluctionsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SreeSoluctionsSoap[] toSoapModels(List<SreeSoluctions> models) {
		List<SreeSoluctionsSoap> soapModels = new ArrayList<SreeSoluctionsSoap>(models.size());

		for (SreeSoluctions model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SreeSoluctionsSoap[soapModels.size()]);
	}

	public SreeSoluctionsSoap() {
	}

	public long getPrimaryKey() {
		return _soluctionId;
	}

	public void setPrimaryKey(long pk) {
		setSoluctionId(pk);
	}

	public long getSoluctionId() {
		return _soluctionId;
	}

	public void setSoluctionId(long soluctionId) {
		_soluctionId = soluctionId;
	}

	public String getBranchId() {
		return _branchId;
	}

	public void setBranchId(String branchId) {
		_branchId = branchId;
	}

	public String getBranchAddress() {
		return _branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		_branchAddress = branchAddress;
	}

	public String getTelephoneNumber() {
		return _telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		_telephoneNumber = telephoneNumber;
	}

	public String getOfficeEmailAddress() {
		return _officeEmailAddress;
	}

	public void setOfficeEmailAddress(String officeEmailAddress) {
		_officeEmailAddress = officeEmailAddress;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	private long _soluctionId;
	private String _branchId;
	private String _branchAddress;
	private String _telephoneNumber;
	private String _officeEmailAddress;
	private long _employeeId;
}