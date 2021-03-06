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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HaysSalGuideUserDataUk service. Represents a row in the &quot;webcmscustom.HAYSSALGUSERDATAUK&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUk
 * @see com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkImpl
 * @see com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkModelImpl
 * @generated
 */
@ProviderType
public interface HaysSalGuideUserDataUkModel extends BaseModel<HaysSalGuideUserDataUk> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a hays sal guide user data uk model instance should use the {@link HaysSalGuideUserDataUk} interface instead.
	 */

	/**
	 * Returns the primary key of this hays sal guide user data uk.
	 *
	 * @return the primary key of this hays sal guide user data uk
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this hays sal guide user data uk.
	 *
	 * @param primaryKey the primary key of this hays sal guide user data uk
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sguserid of this hays sal guide user data uk.
	 *
	 * @return the sguserid of this hays sal guide user data uk
	 */
	public long getSGUSERID();

	/**
	 * Sets the sguserid of this hays sal guide user data uk.
	 *
	 * @param SGUSERID the sguserid of this hays sal guide user data uk
	 */
	public void setSGUSERID(long SGUSERID);

	/**
	 * Returns the sgformindustry of this hays sal guide user data uk.
	 *
	 * @return the sgformindustry of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGFORMINDUSTRY();

	/**
	 * Sets the sgformindustry of this hays sal guide user data uk.
	 *
	 * @param SGFORMINDUSTRY the sgformindustry of this hays sal guide user data uk
	 */
	public void setSGFORMINDUSTRY(String SGFORMINDUSTRY);

	/**
	 * Returns the sgformsector of this hays sal guide user data uk.
	 *
	 * @return the sgformsector of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGFORMSECTOR();

	/**
	 * Sets the sgformsector of this hays sal guide user data uk.
	 *
	 * @param SGFORMSECTOR the sgformsector of this hays sal guide user data uk
	 */
	public void setSGFORMSECTOR(String SGFORMSECTOR);

	/**
	 * Returns the sgformarea of this hays sal guide user data uk.
	 *
	 * @return the sgformarea of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGFORMAREA();

	/**
	 * Sets the sgformarea of this hays sal guide user data uk.
	 *
	 * @param SGFORMAREA the sgformarea of this hays sal guide user data uk
	 */
	public void setSGFORMAREA(String SGFORMAREA);

	/**
	 * Returns the sgformpositiontype of this hays sal guide user data uk.
	 *
	 * @return the sgformpositiontype of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGFORMPOSITIONTYPE();

	/**
	 * Sets the sgformpositiontype of this hays sal guide user data uk.
	 *
	 * @param SGFORMPOSITIONTYPE the sgformpositiontype of this hays sal guide user data uk
	 */
	public void setSGFORMPOSITIONTYPE(String SGFORMPOSITIONTYPE);

	/**
	 * Returns the sgformpositionname of this hays sal guide user data uk.
	 *
	 * @return the sgformpositionname of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGFORMPOSITIONNAME();

	/**
	 * Sets the sgformpositionname of this hays sal guide user data uk.
	 *
	 * @param SGFORMPOSITIONNAME the sgformpositionname of this hays sal guide user data uk
	 */
	public void setSGFORMPOSITIONNAME(String SGFORMPOSITIONNAME);

	/**
	 * Returns the locationname of this hays sal guide user data uk.
	 *
	 * @return the locationname of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getLOCATIONNAME();

	/**
	 * Sets the locationname of this hays sal guide user data uk.
	 *
	 * @param LOCATIONNAME the locationname of this hays sal guide user data uk
	 */
	public void setLOCATIONNAME(String LOCATIONNAME);

	/**
	 * Returns the sgcompany of this hays sal guide user data uk.
	 *
	 * @return the sgcompany of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGCOMPANY();

	/**
	 * Sets the sgcompany of this hays sal guide user data uk.
	 *
	 * @param SGCOMPANY the sgcompany of this hays sal guide user data uk
	 */
	public void setSGCOMPANY(String SGCOMPANY);

	/**
	 * Returns the sgcurrentsalary of this hays sal guide user data uk.
	 *
	 * @return the sgcurrentsalary of this hays sal guide user data uk
	 */
	public long getSGCURRENTSALARY();

	/**
	 * Sets the sgcurrentsalary of this hays sal guide user data uk.
	 *
	 * @param SGCURRENTSALARY the sgcurrentsalary of this hays sal guide user data uk
	 */
	public void setSGCURRENTSALARY(long SGCURRENTSALARY);

	/**
	 * Returns the sgemail of this hays sal guide user data uk.
	 *
	 * @return the sgemail of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGEMAIL();

	/**
	 * Sets the sgemail of this hays sal guide user data uk.
	 *
	 * @param SGEMAIL the sgemail of this hays sal guide user data uk
	 */
	public void setSGEMAIL(String SGEMAIL);

	/**
	 * Returns the createtimestamp of this hays sal guide user data uk.
	 *
	 * @return the createtimestamp of this hays sal guide user data uk
	 */
	public Date getCREATETIMESTAMP();

	/**
	 * Sets the createtimestamp of this hays sal guide user data uk.
	 *
	 * @param CREATETIMESTAMP the createtimestamp of this hays sal guide user data uk
	 */
	public void setCREATETIMESTAMP(Date CREATETIMESTAMP);

	/**
	 * Returns the sgfromlocale of this hays sal guide user data uk.
	 *
	 * @return the sgfromlocale of this hays sal guide user data uk
	 */
	@AutoEscape
	public String getSGFROMLOCALE();

	/**
	 * Sets the sgfromlocale of this hays sal guide user data uk.
	 *
	 * @param SGFROMLOCALE the sgfromlocale of this hays sal guide user data uk
	 */
	public void setSGFROMLOCALE(String SGFROMLOCALE);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(HaysSalGuideUserDataUk haysSalGuideUserDataUk);

	@Override
	public int hashCode();

	@Override
	public CacheModel<HaysSalGuideUserDataUk> toCacheModel();

	@Override
	public HaysSalGuideUserDataUk toEscapedModel();

	@Override
	public HaysSalGuideUserDataUk toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}