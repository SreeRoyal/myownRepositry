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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link HaysSGUserData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSGUserData
 * @generated
 */
@ProviderType
public class HaysSGUserDataWrapper implements HaysSGUserData,
	ModelWrapper<HaysSGUserData> {
	public HaysSGUserDataWrapper(HaysSGUserData haysSGUserData) {
		_haysSGUserData = haysSGUserData;
	}

	@Override
	public Class<?> getModelClass() {
		return HaysSGUserData.class;
	}

	@Override
	public String getModelClassName() {
		return HaysSGUserData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SGUSERID", getSGUSERID());
		attributes.put("SGUSERNAME", getSGUSERNAME());
		attributes.put("SGJOBTITLE", getSGJOBTITLE());
		attributes.put("SGORGANIZATION", getSGORGANIZATION());
		attributes.put("SGLOCATION", getSGLOCATION());
		attributes.put("SGEMAILADDRESS", getSGEMAILADDRESS());
		attributes.put("FROMLOCALE", getFROMLOCALE());
		attributes.put("CREATETIMESTAMP", getCREATETIMESTAMP());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SGUSERID = (Long)attributes.get("SGUSERID");

		if (SGUSERID != null) {
			setSGUSERID(SGUSERID);
		}

		String SGUSERNAME = (String)attributes.get("SGUSERNAME");

		if (SGUSERNAME != null) {
			setSGUSERNAME(SGUSERNAME);
		}

		String SGJOBTITLE = (String)attributes.get("SGJOBTITLE");

		if (SGJOBTITLE != null) {
			setSGJOBTITLE(SGJOBTITLE);
		}

		String SGORGANIZATION = (String)attributes.get("SGORGANIZATION");

		if (SGORGANIZATION != null) {
			setSGORGANIZATION(SGORGANIZATION);
		}

		String SGLOCATION = (String)attributes.get("SGLOCATION");

		if (SGLOCATION != null) {
			setSGLOCATION(SGLOCATION);
		}

		String SGEMAILADDRESS = (String)attributes.get("SGEMAILADDRESS");

		if (SGEMAILADDRESS != null) {
			setSGEMAILADDRESS(SGEMAILADDRESS);
		}

		String FROMLOCALE = (String)attributes.get("FROMLOCALE");

		if (FROMLOCALE != null) {
			setFROMLOCALE(FROMLOCALE);
		}

		Date CREATETIMESTAMP = (Date)attributes.get("CREATETIMESTAMP");

		if (CREATETIMESTAMP != null) {
			setCREATETIMESTAMP(CREATETIMESTAMP);
		}
	}

	@Override
	public HaysSGUserData toEscapedModel() {
		return new HaysSGUserDataWrapper(_haysSGUserData.toEscapedModel());
	}

	@Override
	public HaysSGUserData toUnescapedModel() {
		return new HaysSGUserDataWrapper(_haysSGUserData.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _haysSGUserData.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _haysSGUserData.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _haysSGUserData.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _haysSGUserData.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<HaysSGUserData> toCacheModel() {
		return _haysSGUserData.toCacheModel();
	}

	@Override
	public int compareTo(HaysSGUserData haysSGUserData) {
		return _haysSGUserData.compareTo(haysSGUserData);
	}

	@Override
	public int hashCode() {
		return _haysSGUserData.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _haysSGUserData.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new HaysSGUserDataWrapper((HaysSGUserData)_haysSGUserData.clone());
	}

	/**
	* Returns the fromlocale of this hays sg user data.
	*
	* @return the fromlocale of this hays sg user data
	*/
	@Override
	public java.lang.String getFROMLOCALE() {
		return _haysSGUserData.getFROMLOCALE();
	}

	/**
	* Returns the sgemailaddress of this hays sg user data.
	*
	* @return the sgemailaddress of this hays sg user data
	*/
	@Override
	public java.lang.String getSGEMAILADDRESS() {
		return _haysSGUserData.getSGEMAILADDRESS();
	}

	/**
	* Returns the sgjobtitle of this hays sg user data.
	*
	* @return the sgjobtitle of this hays sg user data
	*/
	@Override
	public java.lang.String getSGJOBTITLE() {
		return _haysSGUserData.getSGJOBTITLE();
	}

	/**
	* Returns the sglocation of this hays sg user data.
	*
	* @return the sglocation of this hays sg user data
	*/
	@Override
	public java.lang.String getSGLOCATION() {
		return _haysSGUserData.getSGLOCATION();
	}

	/**
	* Returns the sgorganization of this hays sg user data.
	*
	* @return the sgorganization of this hays sg user data
	*/
	@Override
	public java.lang.String getSGORGANIZATION() {
		return _haysSGUserData.getSGORGANIZATION();
	}

	/**
	* Returns the sgusername of this hays sg user data.
	*
	* @return the sgusername of this hays sg user data
	*/
	@Override
	public java.lang.String getSGUSERNAME() {
		return _haysSGUserData.getSGUSERNAME();
	}

	@Override
	public java.lang.String toString() {
		return _haysSGUserData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _haysSGUserData.toXmlString();
	}

	/**
	* Returns the createtimestamp of this hays sg user data.
	*
	* @return the createtimestamp of this hays sg user data
	*/
	@Override
	public Date getCREATETIMESTAMP() {
		return _haysSGUserData.getCREATETIMESTAMP();
	}

	/**
	* Returns the primary key of this hays sg user data.
	*
	* @return the primary key of this hays sg user data
	*/
	@Override
	public long getPrimaryKey() {
		return _haysSGUserData.getPrimaryKey();
	}

	/**
	* Returns the sguserid of this hays sg user data.
	*
	* @return the sguserid of this hays sg user data
	*/
	@Override
	public long getSGUSERID() {
		return _haysSGUserData.getSGUSERID();
	}

	@Override
	public void persist() {
		_haysSGUserData.persist();
	}

	/**
	* Sets the createtimestamp of this hays sg user data.
	*
	* @param CREATETIMESTAMP the createtimestamp of this hays sg user data
	*/
	@Override
	public void setCREATETIMESTAMP(Date CREATETIMESTAMP) {
		_haysSGUserData.setCREATETIMESTAMP(CREATETIMESTAMP);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_haysSGUserData.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_haysSGUserData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_haysSGUserData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_haysSGUserData.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fromlocale of this hays sg user data.
	*
	* @param FROMLOCALE the fromlocale of this hays sg user data
	*/
	@Override
	public void setFROMLOCALE(java.lang.String FROMLOCALE) {
		_haysSGUserData.setFROMLOCALE(FROMLOCALE);
	}

	@Override
	public void setNew(boolean n) {
		_haysSGUserData.setNew(n);
	}

	/**
	* Sets the primary key of this hays sg user data.
	*
	* @param primaryKey the primary key of this hays sg user data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_haysSGUserData.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_haysSGUserData.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sgemailaddress of this hays sg user data.
	*
	* @param SGEMAILADDRESS the sgemailaddress of this hays sg user data
	*/
	@Override
	public void setSGEMAILADDRESS(java.lang.String SGEMAILADDRESS) {
		_haysSGUserData.setSGEMAILADDRESS(SGEMAILADDRESS);
	}

	/**
	* Sets the sgjobtitle of this hays sg user data.
	*
	* @param SGJOBTITLE the sgjobtitle of this hays sg user data
	*/
	@Override
	public void setSGJOBTITLE(java.lang.String SGJOBTITLE) {
		_haysSGUserData.setSGJOBTITLE(SGJOBTITLE);
	}

	/**
	* Sets the sglocation of this hays sg user data.
	*
	* @param SGLOCATION the sglocation of this hays sg user data
	*/
	@Override
	public void setSGLOCATION(java.lang.String SGLOCATION) {
		_haysSGUserData.setSGLOCATION(SGLOCATION);
	}

	/**
	* Sets the sgorganization of this hays sg user data.
	*
	* @param SGORGANIZATION the sgorganization of this hays sg user data
	*/
	@Override
	public void setSGORGANIZATION(java.lang.String SGORGANIZATION) {
		_haysSGUserData.setSGORGANIZATION(SGORGANIZATION);
	}

	/**
	* Sets the sguserid of this hays sg user data.
	*
	* @param SGUSERID the sguserid of this hays sg user data
	*/
	@Override
	public void setSGUSERID(long SGUSERID) {
		_haysSGUserData.setSGUSERID(SGUSERID);
	}

	/**
	* Sets the sgusername of this hays sg user data.
	*
	* @param SGUSERNAME the sgusername of this hays sg user data
	*/
	@Override
	public void setSGUSERNAME(java.lang.String SGUSERNAME) {
		_haysSGUserData.setSGUSERNAME(SGUSERNAME);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HaysSGUserDataWrapper)) {
			return false;
		}

		HaysSGUserDataWrapper haysSGUserDataWrapper = (HaysSGUserDataWrapper)obj;

		if (Objects.equals(_haysSGUserData,
					haysSGUserDataWrapper._haysSGUserData)) {
			return true;
		}

		return false;
	}

	@Override
	public HaysSGUserData getWrappedModel() {
		return _haysSGUserData;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _haysSGUserData.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _haysSGUserData.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_haysSGUserData.resetOriginalValues();
	}

	private final HaysSGUserData _haysSGUserData;
}