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
 * This class is a wrapper for {@link HaysSalGuideUserDataUk}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUk
 * @generated
 */
@ProviderType
public class HaysSalGuideUserDataUkWrapper implements HaysSalGuideUserDataUk,
	ModelWrapper<HaysSalGuideUserDataUk> {
	public HaysSalGuideUserDataUkWrapper(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		_haysSalGuideUserDataUk = haysSalGuideUserDataUk;
	}

	@Override
	public Class<?> getModelClass() {
		return HaysSalGuideUserDataUk.class;
	}

	@Override
	public String getModelClassName() {
		return HaysSalGuideUserDataUk.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SGUSERID", getSGUSERID());
		attributes.put("SGFORMINDUSTRY", getSGFORMINDUSTRY());
		attributes.put("SGFORMSECTOR", getSGFORMSECTOR());
		attributes.put("SGFORMAREA", getSGFORMAREA());
		attributes.put("SGFORMPOSITIONTYPE", getSGFORMPOSITIONTYPE());
		attributes.put("SGFORMPOSITIONNAME", getSGFORMPOSITIONNAME());
		attributes.put("LOCATIONNAME", getLOCATIONNAME());
		attributes.put("SGCOMPANY", getSGCOMPANY());
		attributes.put("SGCURRENTSALARY", getSGCURRENTSALARY());
		attributes.put("SGEMAIL", getSGEMAIL());
		attributes.put("CREATETIMESTAMP", getCREATETIMESTAMP());
		attributes.put("SGFROMLOCALE", getSGFROMLOCALE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SGUSERID = (Long)attributes.get("SGUSERID");

		if (SGUSERID != null) {
			setSGUSERID(SGUSERID);
		}

		String SGFORMINDUSTRY = (String)attributes.get("SGFORMINDUSTRY");

		if (SGFORMINDUSTRY != null) {
			setSGFORMINDUSTRY(SGFORMINDUSTRY);
		}

		String SGFORMSECTOR = (String)attributes.get("SGFORMSECTOR");

		if (SGFORMSECTOR != null) {
			setSGFORMSECTOR(SGFORMSECTOR);
		}

		String SGFORMAREA = (String)attributes.get("SGFORMAREA");

		if (SGFORMAREA != null) {
			setSGFORMAREA(SGFORMAREA);
		}

		String SGFORMPOSITIONTYPE = (String)attributes.get("SGFORMPOSITIONTYPE");

		if (SGFORMPOSITIONTYPE != null) {
			setSGFORMPOSITIONTYPE(SGFORMPOSITIONTYPE);
		}

		String SGFORMPOSITIONNAME = (String)attributes.get("SGFORMPOSITIONNAME");

		if (SGFORMPOSITIONNAME != null) {
			setSGFORMPOSITIONNAME(SGFORMPOSITIONNAME);
		}

		String LOCATIONNAME = (String)attributes.get("LOCATIONNAME");

		if (LOCATIONNAME != null) {
			setLOCATIONNAME(LOCATIONNAME);
		}

		String SGCOMPANY = (String)attributes.get("SGCOMPANY");

		if (SGCOMPANY != null) {
			setSGCOMPANY(SGCOMPANY);
		}

		Long SGCURRENTSALARY = (Long)attributes.get("SGCURRENTSALARY");

		if (SGCURRENTSALARY != null) {
			setSGCURRENTSALARY(SGCURRENTSALARY);
		}

		String SGEMAIL = (String)attributes.get("SGEMAIL");

		if (SGEMAIL != null) {
			setSGEMAIL(SGEMAIL);
		}

		Date CREATETIMESTAMP = (Date)attributes.get("CREATETIMESTAMP");

		if (CREATETIMESTAMP != null) {
			setCREATETIMESTAMP(CREATETIMESTAMP);
		}

		String SGFROMLOCALE = (String)attributes.get("SGFROMLOCALE");

		if (SGFROMLOCALE != null) {
			setSGFROMLOCALE(SGFROMLOCALE);
		}
	}

	@Override
	public HaysSalGuideUserDataUk toEscapedModel() {
		return new HaysSalGuideUserDataUkWrapper(_haysSalGuideUserDataUk.toEscapedModel());
	}

	@Override
	public HaysSalGuideUserDataUk toUnescapedModel() {
		return new HaysSalGuideUserDataUkWrapper(_haysSalGuideUserDataUk.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _haysSalGuideUserDataUk.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _haysSalGuideUserDataUk.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _haysSalGuideUserDataUk.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _haysSalGuideUserDataUk.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<HaysSalGuideUserDataUk> toCacheModel() {
		return _haysSalGuideUserDataUk.toCacheModel();
	}

	@Override
	public int compareTo(HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		return _haysSalGuideUserDataUk.compareTo(haysSalGuideUserDataUk);
	}

	@Override
	public int hashCode() {
		return _haysSalGuideUserDataUk.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _haysSalGuideUserDataUk.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new HaysSalGuideUserDataUkWrapper((HaysSalGuideUserDataUk)_haysSalGuideUserDataUk.clone());
	}

	/**
	* Returns the locationname of this hays sal guide user data uk.
	*
	* @return the locationname of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getLOCATIONNAME() {
		return _haysSalGuideUserDataUk.getLOCATIONNAME();
	}

	/**
	* Returns the sgcompany of this hays sal guide user data uk.
	*
	* @return the sgcompany of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGCOMPANY() {
		return _haysSalGuideUserDataUk.getSGCOMPANY();
	}

	/**
	* Returns the sgemail of this hays sal guide user data uk.
	*
	* @return the sgemail of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGEMAIL() {
		return _haysSalGuideUserDataUk.getSGEMAIL();
	}

	/**
	* Returns the sgformarea of this hays sal guide user data uk.
	*
	* @return the sgformarea of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGFORMAREA() {
		return _haysSalGuideUserDataUk.getSGFORMAREA();
	}

	/**
	* Returns the sgformindustry of this hays sal guide user data uk.
	*
	* @return the sgformindustry of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGFORMINDUSTRY() {
		return _haysSalGuideUserDataUk.getSGFORMINDUSTRY();
	}

	/**
	* Returns the sgformpositionname of this hays sal guide user data uk.
	*
	* @return the sgformpositionname of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGFORMPOSITIONNAME() {
		return _haysSalGuideUserDataUk.getSGFORMPOSITIONNAME();
	}

	/**
	* Returns the sgformpositiontype of this hays sal guide user data uk.
	*
	* @return the sgformpositiontype of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGFORMPOSITIONTYPE() {
		return _haysSalGuideUserDataUk.getSGFORMPOSITIONTYPE();
	}

	/**
	* Returns the sgformsector of this hays sal guide user data uk.
	*
	* @return the sgformsector of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGFORMSECTOR() {
		return _haysSalGuideUserDataUk.getSGFORMSECTOR();
	}

	/**
	* Returns the sgfromlocale of this hays sal guide user data uk.
	*
	* @return the sgfromlocale of this hays sal guide user data uk
	*/
	@Override
	public java.lang.String getSGFROMLOCALE() {
		return _haysSalGuideUserDataUk.getSGFROMLOCALE();
	}

	@Override
	public java.lang.String toString() {
		return _haysSalGuideUserDataUk.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _haysSalGuideUserDataUk.toXmlString();
	}

	/**
	* Returns the createtimestamp of this hays sal guide user data uk.
	*
	* @return the createtimestamp of this hays sal guide user data uk
	*/
	@Override
	public Date getCREATETIMESTAMP() {
		return _haysSalGuideUserDataUk.getCREATETIMESTAMP();
	}

	/**
	* Returns the primary key of this hays sal guide user data uk.
	*
	* @return the primary key of this hays sal guide user data uk
	*/
	@Override
	public long getPrimaryKey() {
		return _haysSalGuideUserDataUk.getPrimaryKey();
	}

	/**
	* Returns the sgcurrentsalary of this hays sal guide user data uk.
	*
	* @return the sgcurrentsalary of this hays sal guide user data uk
	*/
	@Override
	public long getSGCURRENTSALARY() {
		return _haysSalGuideUserDataUk.getSGCURRENTSALARY();
	}

	/**
	* Returns the sguserid of this hays sal guide user data uk.
	*
	* @return the sguserid of this hays sal guide user data uk
	*/
	@Override
	public long getSGUSERID() {
		return _haysSalGuideUserDataUk.getSGUSERID();
	}

	@Override
	public void persist() {
		_haysSalGuideUserDataUk.persist();
	}

	/**
	* Sets the createtimestamp of this hays sal guide user data uk.
	*
	* @param CREATETIMESTAMP the createtimestamp of this hays sal guide user data uk
	*/
	@Override
	public void setCREATETIMESTAMP(Date CREATETIMESTAMP) {
		_haysSalGuideUserDataUk.setCREATETIMESTAMP(CREATETIMESTAMP);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_haysSalGuideUserDataUk.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_haysSalGuideUserDataUk.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_haysSalGuideUserDataUk.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_haysSalGuideUserDataUk.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the locationname of this hays sal guide user data uk.
	*
	* @param LOCATIONNAME the locationname of this hays sal guide user data uk
	*/
	@Override
	public void setLOCATIONNAME(java.lang.String LOCATIONNAME) {
		_haysSalGuideUserDataUk.setLOCATIONNAME(LOCATIONNAME);
	}

	@Override
	public void setNew(boolean n) {
		_haysSalGuideUserDataUk.setNew(n);
	}

	/**
	* Sets the primary key of this hays sal guide user data uk.
	*
	* @param primaryKey the primary key of this hays sal guide user data uk
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_haysSalGuideUserDataUk.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_haysSalGuideUserDataUk.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sgcompany of this hays sal guide user data uk.
	*
	* @param SGCOMPANY the sgcompany of this hays sal guide user data uk
	*/
	@Override
	public void setSGCOMPANY(java.lang.String SGCOMPANY) {
		_haysSalGuideUserDataUk.setSGCOMPANY(SGCOMPANY);
	}

	/**
	* Sets the sgcurrentsalary of this hays sal guide user data uk.
	*
	* @param SGCURRENTSALARY the sgcurrentsalary of this hays sal guide user data uk
	*/
	@Override
	public void setSGCURRENTSALARY(long SGCURRENTSALARY) {
		_haysSalGuideUserDataUk.setSGCURRENTSALARY(SGCURRENTSALARY);
	}

	/**
	* Sets the sgemail of this hays sal guide user data uk.
	*
	* @param SGEMAIL the sgemail of this hays sal guide user data uk
	*/
	@Override
	public void setSGEMAIL(java.lang.String SGEMAIL) {
		_haysSalGuideUserDataUk.setSGEMAIL(SGEMAIL);
	}

	/**
	* Sets the sgformarea of this hays sal guide user data uk.
	*
	* @param SGFORMAREA the sgformarea of this hays sal guide user data uk
	*/
	@Override
	public void setSGFORMAREA(java.lang.String SGFORMAREA) {
		_haysSalGuideUserDataUk.setSGFORMAREA(SGFORMAREA);
	}

	/**
	* Sets the sgformindustry of this hays sal guide user data uk.
	*
	* @param SGFORMINDUSTRY the sgformindustry of this hays sal guide user data uk
	*/
	@Override
	public void setSGFORMINDUSTRY(java.lang.String SGFORMINDUSTRY) {
		_haysSalGuideUserDataUk.setSGFORMINDUSTRY(SGFORMINDUSTRY);
	}

	/**
	* Sets the sgformpositionname of this hays sal guide user data uk.
	*
	* @param SGFORMPOSITIONNAME the sgformpositionname of this hays sal guide user data uk
	*/
	@Override
	public void setSGFORMPOSITIONNAME(java.lang.String SGFORMPOSITIONNAME) {
		_haysSalGuideUserDataUk.setSGFORMPOSITIONNAME(SGFORMPOSITIONNAME);
	}

	/**
	* Sets the sgformpositiontype of this hays sal guide user data uk.
	*
	* @param SGFORMPOSITIONTYPE the sgformpositiontype of this hays sal guide user data uk
	*/
	@Override
	public void setSGFORMPOSITIONTYPE(java.lang.String SGFORMPOSITIONTYPE) {
		_haysSalGuideUserDataUk.setSGFORMPOSITIONTYPE(SGFORMPOSITIONTYPE);
	}

	/**
	* Sets the sgformsector of this hays sal guide user data uk.
	*
	* @param SGFORMSECTOR the sgformsector of this hays sal guide user data uk
	*/
	@Override
	public void setSGFORMSECTOR(java.lang.String SGFORMSECTOR) {
		_haysSalGuideUserDataUk.setSGFORMSECTOR(SGFORMSECTOR);
	}

	/**
	* Sets the sgfromlocale of this hays sal guide user data uk.
	*
	* @param SGFROMLOCALE the sgfromlocale of this hays sal guide user data uk
	*/
	@Override
	public void setSGFROMLOCALE(java.lang.String SGFROMLOCALE) {
		_haysSalGuideUserDataUk.setSGFROMLOCALE(SGFROMLOCALE);
	}

	/**
	* Sets the sguserid of this hays sal guide user data uk.
	*
	* @param SGUSERID the sguserid of this hays sal guide user data uk
	*/
	@Override
	public void setSGUSERID(long SGUSERID) {
		_haysSalGuideUserDataUk.setSGUSERID(SGUSERID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HaysSalGuideUserDataUkWrapper)) {
			return false;
		}

		HaysSalGuideUserDataUkWrapper haysSalGuideUserDataUkWrapper = (HaysSalGuideUserDataUkWrapper)obj;

		if (Objects.equals(_haysSalGuideUserDataUk,
					haysSalGuideUserDataUkWrapper._haysSalGuideUserDataUk)) {
			return true;
		}

		return false;
	}

	@Override
	public HaysSalGuideUserDataUk getWrappedModel() {
		return _haysSalGuideUserDataUk;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _haysSalGuideUserDataUk.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _haysSalGuideUserDataUk.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_haysSalGuideUserDataUk.resetOriginalValues();
	}

	private final HaysSalGuideUserDataUk _haysSalGuideUserDataUk;
}