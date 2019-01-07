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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link SreeSoluctions}.
 * </p>
 *
 * @author Sreenivasulu
 * @see SreeSoluctions
 * @generated
 */
@ProviderType
public class SreeSoluctionsWrapper implements SreeSoluctions,
	ModelWrapper<SreeSoluctions> {
	public SreeSoluctionsWrapper(SreeSoluctions sreeSoluctions) {
		_sreeSoluctions = sreeSoluctions;
	}

	@Override
	public Class<?> getModelClass() {
		return SreeSoluctions.class;
	}

	@Override
	public String getModelClassName() {
		return SreeSoluctions.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("soluctionId", getSoluctionId());
		attributes.put("branchId", getBranchId());
		attributes.put("branchAddress", getBranchAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("officeEmailAddress", getOfficeEmailAddress());
		attributes.put("employeeId", getEmployeeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long soluctionId = (Long)attributes.get("soluctionId");

		if (soluctionId != null) {
			setSoluctionId(soluctionId);
		}

		String branchId = (String)attributes.get("branchId");

		if (branchId != null) {
			setBranchId(branchId);
		}

		String branchAddress = (String)attributes.get("branchAddress");

		if (branchAddress != null) {
			setBranchAddress(branchAddress);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String officeEmailAddress = (String)attributes.get("officeEmailAddress");

		if (officeEmailAddress != null) {
			setOfficeEmailAddress(officeEmailAddress);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}
	}

	@Override
	public SreeSoluctions toEscapedModel() {
		return new SreeSoluctionsWrapper(_sreeSoluctions.toEscapedModel());
	}

	@Override
	public SreeSoluctions toUnescapedModel() {
		return new SreeSoluctionsWrapper(_sreeSoluctions.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _sreeSoluctions.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _sreeSoluctions.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _sreeSoluctions.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _sreeSoluctions.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SreeSoluctions> toCacheModel() {
		return _sreeSoluctions.toCacheModel();
	}

	@Override
	public int compareTo(SreeSoluctions sreeSoluctions) {
		return _sreeSoluctions.compareTo(sreeSoluctions);
	}

	@Override
	public int hashCode() {
		return _sreeSoluctions.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sreeSoluctions.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SreeSoluctionsWrapper((SreeSoluctions)_sreeSoluctions.clone());
	}

	/**
	* Returns the branch address of this sree soluctions.
	*
	* @return the branch address of this sree soluctions
	*/
	@Override
	public java.lang.String getBranchAddress() {
		return _sreeSoluctions.getBranchAddress();
	}

	/**
	* Returns the branch ID of this sree soluctions.
	*
	* @return the branch ID of this sree soluctions
	*/
	@Override
	public java.lang.String getBranchId() {
		return _sreeSoluctions.getBranchId();
	}

	/**
	* Returns the office email address of this sree soluctions.
	*
	* @return the office email address of this sree soluctions
	*/
	@Override
	public java.lang.String getOfficeEmailAddress() {
		return _sreeSoluctions.getOfficeEmailAddress();
	}

	/**
	* Returns the telephone number of this sree soluctions.
	*
	* @return the telephone number of this sree soluctions
	*/
	@Override
	public java.lang.String getTelephoneNumber() {
		return _sreeSoluctions.getTelephoneNumber();
	}

	@Override
	public java.lang.String toString() {
		return _sreeSoluctions.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sreeSoluctions.toXmlString();
	}

	/**
	* Returns the employee ID of this sree soluctions.
	*
	* @return the employee ID of this sree soluctions
	*/
	@Override
	public long getEmployeeId() {
		return _sreeSoluctions.getEmployeeId();
	}

	/**
	* Returns the primary key of this sree soluctions.
	*
	* @return the primary key of this sree soluctions
	*/
	@Override
	public long getPrimaryKey() {
		return _sreeSoluctions.getPrimaryKey();
	}

	/**
	* Returns the soluction ID of this sree soluctions.
	*
	* @return the soluction ID of this sree soluctions
	*/
	@Override
	public long getSoluctionId() {
		return _sreeSoluctions.getSoluctionId();
	}

	@Override
	public void persist() {
		_sreeSoluctions.persist();
	}

	/**
	* Sets the branch address of this sree soluctions.
	*
	* @param branchAddress the branch address of this sree soluctions
	*/
	@Override
	public void setBranchAddress(java.lang.String branchAddress) {
		_sreeSoluctions.setBranchAddress(branchAddress);
	}

	/**
	* Sets the branch ID of this sree soluctions.
	*
	* @param branchId the branch ID of this sree soluctions
	*/
	@Override
	public void setBranchId(java.lang.String branchId) {
		_sreeSoluctions.setBranchId(branchId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sreeSoluctions.setCachedModel(cachedModel);
	}

	/**
	* Sets the employee ID of this sree soluctions.
	*
	* @param employeeId the employee ID of this sree soluctions
	*/
	@Override
	public void setEmployeeId(long employeeId) {
		_sreeSoluctions.setEmployeeId(employeeId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_sreeSoluctions.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_sreeSoluctions.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_sreeSoluctions.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_sreeSoluctions.setNew(n);
	}

	/**
	* Sets the office email address of this sree soluctions.
	*
	* @param officeEmailAddress the office email address of this sree soluctions
	*/
	@Override
	public void setOfficeEmailAddress(java.lang.String officeEmailAddress) {
		_sreeSoluctions.setOfficeEmailAddress(officeEmailAddress);
	}

	/**
	* Sets the primary key of this sree soluctions.
	*
	* @param primaryKey the primary key of this sree soluctions
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sreeSoluctions.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_sreeSoluctions.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the soluction ID of this sree soluctions.
	*
	* @param soluctionId the soluction ID of this sree soluctions
	*/
	@Override
	public void setSoluctionId(long soluctionId) {
		_sreeSoluctions.setSoluctionId(soluctionId);
	}

	/**
	* Sets the telephone number of this sree soluctions.
	*
	* @param telephoneNumber the telephone number of this sree soluctions
	*/
	@Override
	public void setTelephoneNumber(java.lang.String telephoneNumber) {
		_sreeSoluctions.setTelephoneNumber(telephoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SreeSoluctionsWrapper)) {
			return false;
		}

		SreeSoluctionsWrapper sreeSoluctionsWrapper = (SreeSoluctionsWrapper)obj;

		if (Objects.equals(_sreeSoluctions,
					sreeSoluctionsWrapper._sreeSoluctions)) {
			return true;
		}

		return false;
	}

	@Override
	public SreeSoluctions getWrappedModel() {
		return _sreeSoluctions;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _sreeSoluctions.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _sreeSoluctions.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_sreeSoluctions.resetOriginalValues();
	}

	private final SreeSoluctions _sreeSoluctions;
}