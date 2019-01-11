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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link HaysSalaryGuide}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalaryGuide
 * @generated
 */
@ProviderType
public class HaysSalaryGuideWrapper implements HaysSalaryGuide,
	ModelWrapper<HaysSalaryGuide> {
	public HaysSalaryGuideWrapper(HaysSalaryGuide haysSalaryGuide) {
		_haysSalaryGuide = haysSalaryGuide;
	}

	@Override
	public Class<?> getModelClass() {
		return HaysSalaryGuide.class;
	}

	@Override
	public String getModelClassName() {
		return HaysSalaryGuide.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("INDUSTRY", getINDUSTRY());
		attributes.put("LOCATIONNAME", getLOCATIONNAME());
		attributes.put("SECTOR", getSECTOR());
		attributes.put("POSITIONTYPE", getPOSITIONTYPE());
		attributes.put("AREA", getAREA());
		attributes.put("COMPANY", getCOMPANY());
		attributes.put("POSITIONNAME", getPOSITIONNAME());
		attributes.put("SALARYRANGE", getSALARYRANGE());
		attributes.put("SALARYTYPICAL", getSALARYTYPICAL());
		attributes.put("NOTE", getNOTE());
		attributes.put("SITELOCALE", getSITELOCALE());
		attributes.put("SGDDOCNAME", getSGDDOCNAME());
		attributes.put("SGID", getSGID());
		attributes.put("SALARYTYPE", getSALARYTYPE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String INDUSTRY = (String)attributes.get("INDUSTRY");

		if (INDUSTRY != null) {
			setINDUSTRY(INDUSTRY);
		}

		String LOCATIONNAME = (String)attributes.get("LOCATIONNAME");

		if (LOCATIONNAME != null) {
			setLOCATIONNAME(LOCATIONNAME);
		}

		String SECTOR = (String)attributes.get("SECTOR");

		if (SECTOR != null) {
			setSECTOR(SECTOR);
		}

		String POSITIONTYPE = (String)attributes.get("POSITIONTYPE");

		if (POSITIONTYPE != null) {
			setPOSITIONTYPE(POSITIONTYPE);
		}

		String AREA = (String)attributes.get("AREA");

		if (AREA != null) {
			setAREA(AREA);
		}

		String COMPANY = (String)attributes.get("COMPANY");

		if (COMPANY != null) {
			setCOMPANY(COMPANY);
		}

		String POSITIONNAME = (String)attributes.get("POSITIONNAME");

		if (POSITIONNAME != null) {
			setPOSITIONNAME(POSITIONNAME);
		}

		String SALARYRANGE = (String)attributes.get("SALARYRANGE");

		if (SALARYRANGE != null) {
			setSALARYRANGE(SALARYRANGE);
		}

		String SALARYTYPICAL = (String)attributes.get("SALARYTYPICAL");

		if (SALARYTYPICAL != null) {
			setSALARYTYPICAL(SALARYTYPICAL);
		}

		String NOTE = (String)attributes.get("NOTE");

		if (NOTE != null) {
			setNOTE(NOTE);
		}

		String SITELOCALE = (String)attributes.get("SITELOCALE");

		if (SITELOCALE != null) {
			setSITELOCALE(SITELOCALE);
		}

		String SGDDOCNAME = (String)attributes.get("SGDDOCNAME");

		if (SGDDOCNAME != null) {
			setSGDDOCNAME(SGDDOCNAME);
		}

		String SGID = (String)attributes.get("SGID");

		if (SGID != null) {
			setSGID(SGID);
		}

		String SALARYTYPE = (String)attributes.get("SALARYTYPE");

		if (SALARYTYPE != null) {
			setSALARYTYPE(SALARYTYPE);
		}
	}

	@Override
	public HaysSalaryGuide toEscapedModel() {
		return new HaysSalaryGuideWrapper(_haysSalaryGuide.toEscapedModel());
	}

	@Override
	public HaysSalaryGuide toUnescapedModel() {
		return new HaysSalaryGuideWrapper(_haysSalaryGuide.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _haysSalaryGuide.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _haysSalaryGuide.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _haysSalaryGuide.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _haysSalaryGuide.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<HaysSalaryGuide> toCacheModel() {
		return _haysSalaryGuide.toCacheModel();
	}

	@Override
	public int compareTo(HaysSalaryGuide haysSalaryGuide) {
		return _haysSalaryGuide.compareTo(haysSalaryGuide);
	}

	@Override
	public int hashCode() {
		return _haysSalaryGuide.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _haysSalaryGuide.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new HaysSalaryGuideWrapper((HaysSalaryGuide)_haysSalaryGuide.clone());
	}

	/**
	* Returns the area of this hays salary guide.
	*
	* @return the area of this hays salary guide
	*/
	@Override
	public java.lang.String getAREA() {
		return _haysSalaryGuide.getAREA();
	}

	/**
	* Returns the company of this hays salary guide.
	*
	* @return the company of this hays salary guide
	*/
	@Override
	public java.lang.String getCOMPANY() {
		return _haysSalaryGuide.getCOMPANY();
	}

	/**
	* Returns the industry of this hays salary guide.
	*
	* @return the industry of this hays salary guide
	*/
	@Override
	public java.lang.String getINDUSTRY() {
		return _haysSalaryGuide.getINDUSTRY();
	}

	/**
	* Returns the locationname of this hays salary guide.
	*
	* @return the locationname of this hays salary guide
	*/
	@Override
	public java.lang.String getLOCATIONNAME() {
		return _haysSalaryGuide.getLOCATIONNAME();
	}

	/**
	* Returns the note of this hays salary guide.
	*
	* @return the note of this hays salary guide
	*/
	@Override
	public java.lang.String getNOTE() {
		return _haysSalaryGuide.getNOTE();
	}

	/**
	* Returns the positionname of this hays salary guide.
	*
	* @return the positionname of this hays salary guide
	*/
	@Override
	public java.lang.String getPOSITIONNAME() {
		return _haysSalaryGuide.getPOSITIONNAME();
	}

	/**
	* Returns the positiontype of this hays salary guide.
	*
	* @return the positiontype of this hays salary guide
	*/
	@Override
	public java.lang.String getPOSITIONTYPE() {
		return _haysSalaryGuide.getPOSITIONTYPE();
	}

	/**
	* Returns the primary key of this hays salary guide.
	*
	* @return the primary key of this hays salary guide
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _haysSalaryGuide.getPrimaryKey();
	}

	/**
	* Returns the salaryrange of this hays salary guide.
	*
	* @return the salaryrange of this hays salary guide
	*/
	@Override
	public java.lang.String getSALARYRANGE() {
		return _haysSalaryGuide.getSALARYRANGE();
	}

	/**
	* Returns the salarytype of this hays salary guide.
	*
	* @return the salarytype of this hays salary guide
	*/
	@Override
	public java.lang.String getSALARYTYPE() {
		return _haysSalaryGuide.getSALARYTYPE();
	}

	/**
	* Returns the salarytypical of this hays salary guide.
	*
	* @return the salarytypical of this hays salary guide
	*/
	@Override
	public java.lang.String getSALARYTYPICAL() {
		return _haysSalaryGuide.getSALARYTYPICAL();
	}

	/**
	* Returns the sector of this hays salary guide.
	*
	* @return the sector of this hays salary guide
	*/
	@Override
	public java.lang.String getSECTOR() {
		return _haysSalaryGuide.getSECTOR();
	}

	/**
	* Returns the sgddocname of this hays salary guide.
	*
	* @return the sgddocname of this hays salary guide
	*/
	@Override
	public java.lang.String getSGDDOCNAME() {
		return _haysSalaryGuide.getSGDDOCNAME();
	}

	/**
	* Returns the sgid of this hays salary guide.
	*
	* @return the sgid of this hays salary guide
	*/
	@Override
	public java.lang.String getSGID() {
		return _haysSalaryGuide.getSGID();
	}

	/**
	* Returns the sitelocale of this hays salary guide.
	*
	* @return the sitelocale of this hays salary guide
	*/
	@Override
	public java.lang.String getSITELOCALE() {
		return _haysSalaryGuide.getSITELOCALE();
	}

	@Override
	public java.lang.String toString() {
		return _haysSalaryGuide.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _haysSalaryGuide.toXmlString();
	}

	@Override
	public void persist() {
		_haysSalaryGuide.persist();
	}

	/**
	* Sets the area of this hays salary guide.
	*
	* @param AREA the area of this hays salary guide
	*/
	@Override
	public void setAREA(java.lang.String AREA) {
		_haysSalaryGuide.setAREA(AREA);
	}

	/**
	* Sets the company of this hays salary guide.
	*
	* @param COMPANY the company of this hays salary guide
	*/
	@Override
	public void setCOMPANY(java.lang.String COMPANY) {
		_haysSalaryGuide.setCOMPANY(COMPANY);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_haysSalaryGuide.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_haysSalaryGuide.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_haysSalaryGuide.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_haysSalaryGuide.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the industry of this hays salary guide.
	*
	* @param INDUSTRY the industry of this hays salary guide
	*/
	@Override
	public void setINDUSTRY(java.lang.String INDUSTRY) {
		_haysSalaryGuide.setINDUSTRY(INDUSTRY);
	}

	/**
	* Sets the locationname of this hays salary guide.
	*
	* @param LOCATIONNAME the locationname of this hays salary guide
	*/
	@Override
	public void setLOCATIONNAME(java.lang.String LOCATIONNAME) {
		_haysSalaryGuide.setLOCATIONNAME(LOCATIONNAME);
	}

	/**
	* Sets the note of this hays salary guide.
	*
	* @param NOTE the note of this hays salary guide
	*/
	@Override
	public void setNOTE(java.lang.String NOTE) {
		_haysSalaryGuide.setNOTE(NOTE);
	}

	@Override
	public void setNew(boolean n) {
		_haysSalaryGuide.setNew(n);
	}

	/**
	* Sets the positionname of this hays salary guide.
	*
	* @param POSITIONNAME the positionname of this hays salary guide
	*/
	@Override
	public void setPOSITIONNAME(java.lang.String POSITIONNAME) {
		_haysSalaryGuide.setPOSITIONNAME(POSITIONNAME);
	}

	/**
	* Sets the positiontype of this hays salary guide.
	*
	* @param POSITIONTYPE the positiontype of this hays salary guide
	*/
	@Override
	public void setPOSITIONTYPE(java.lang.String POSITIONTYPE) {
		_haysSalaryGuide.setPOSITIONTYPE(POSITIONTYPE);
	}

	/**
	* Sets the primary key of this hays salary guide.
	*
	* @param primaryKey the primary key of this hays salary guide
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_haysSalaryGuide.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_haysSalaryGuide.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the salaryrange of this hays salary guide.
	*
	* @param SALARYRANGE the salaryrange of this hays salary guide
	*/
	@Override
	public void setSALARYRANGE(java.lang.String SALARYRANGE) {
		_haysSalaryGuide.setSALARYRANGE(SALARYRANGE);
	}

	/**
	* Sets the salarytype of this hays salary guide.
	*
	* @param SALARYTYPE the salarytype of this hays salary guide
	*/
	@Override
	public void setSALARYTYPE(java.lang.String SALARYTYPE) {
		_haysSalaryGuide.setSALARYTYPE(SALARYTYPE);
	}

	/**
	* Sets the salarytypical of this hays salary guide.
	*
	* @param SALARYTYPICAL the salarytypical of this hays salary guide
	*/
	@Override
	public void setSALARYTYPICAL(java.lang.String SALARYTYPICAL) {
		_haysSalaryGuide.setSALARYTYPICAL(SALARYTYPICAL);
	}

	/**
	* Sets the sector of this hays salary guide.
	*
	* @param SECTOR the sector of this hays salary guide
	*/
	@Override
	public void setSECTOR(java.lang.String SECTOR) {
		_haysSalaryGuide.setSECTOR(SECTOR);
	}

	/**
	* Sets the sgddocname of this hays salary guide.
	*
	* @param SGDDOCNAME the sgddocname of this hays salary guide
	*/
	@Override
	public void setSGDDOCNAME(java.lang.String SGDDOCNAME) {
		_haysSalaryGuide.setSGDDOCNAME(SGDDOCNAME);
	}

	/**
	* Sets the sgid of this hays salary guide.
	*
	* @param SGID the sgid of this hays salary guide
	*/
	@Override
	public void setSGID(java.lang.String SGID) {
		_haysSalaryGuide.setSGID(SGID);
	}

	/**
	* Sets the sitelocale of this hays salary guide.
	*
	* @param SITELOCALE the sitelocale of this hays salary guide
	*/
	@Override
	public void setSITELOCALE(java.lang.String SITELOCALE) {
		_haysSalaryGuide.setSITELOCALE(SITELOCALE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HaysSalaryGuideWrapper)) {
			return false;
		}

		HaysSalaryGuideWrapper haysSalaryGuideWrapper = (HaysSalaryGuideWrapper)obj;

		if (Objects.equals(_haysSalaryGuide,
					haysSalaryGuideWrapper._haysSalaryGuide)) {
			return true;
		}

		return false;
	}

	@Override
	public HaysSalaryGuide getWrappedModel() {
		return _haysSalaryGuide;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _haysSalaryGuide.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _haysSalaryGuide.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_haysSalaryGuide.resetOriginalValues();
	}

	private final HaysSalaryGuide _haysSalaryGuide;
}