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

import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;
import com.hays.service.salaryguide.model.HaysSalGuideUserDataUkModel;
import com.hays.service.salaryguide.model.HaysSalGuideUserDataUkSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the HaysSalGuideUserDataUk service. Represents a row in the &quot;webcmscustom.HAYSSALGUSERDATAUK&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link HaysSalGuideUserDataUkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HaysSalGuideUserDataUkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUkImpl
 * @see HaysSalGuideUserDataUk
 * @see HaysSalGuideUserDataUkModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class HaysSalGuideUserDataUkModelImpl extends BaseModelImpl<HaysSalGuideUserDataUk>
	implements HaysSalGuideUserDataUkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a hays sal guide user data uk model instance should use the {@link HaysSalGuideUserDataUk} interface instead.
	 */
	public static final String TABLE_NAME = "webcmscustom.HAYSSALGUSERDATAUK";
	public static final Object[][] TABLE_COLUMNS = {
			{ "SGUSERID", Types.BIGINT },
			{ "SGFORMINDUSTRY", Types.VARCHAR },
			{ "SGFORMSECTOR", Types.VARCHAR },
			{ "SGFORMAREA", Types.VARCHAR },
			{ "SGFORMPOSITIONTYPE", Types.VARCHAR },
			{ "SGFORMPOSITIONNAME", Types.VARCHAR },
			{ "LOCATIONNAME", Types.VARCHAR },
			{ "SGCOMPANY", Types.VARCHAR },
			{ "SGCURRENTSALARY", Types.BIGINT },
			{ "SGEMAIL", Types.VARCHAR },
			{ "CREATETIMESTAMP", Types.TIMESTAMP },
			{ "SGFROMLOCALE", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("SGUSERID", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("SGFORMINDUSTRY", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("SGFORMSECTOR", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("SGFORMAREA", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("SGFORMPOSITIONTYPE", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("SGFORMPOSITIONNAME", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("LOCATIONNAME", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("SGCOMPANY", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("SGCURRENTSALARY", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("SGEMAIL", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("CREATETIMESTAMP", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("SGFROMLOCALE", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table webcmscustom.HAYSSALGUSERDATAUK (SGUSERID LONG not null primary key,SGFORMINDUSTRY VARCHAR(75) null,SGFORMSECTOR VARCHAR(75) null,SGFORMAREA VARCHAR(75) null,SGFORMPOSITIONTYPE VARCHAR(75) null,SGFORMPOSITIONNAME VARCHAR(75) null,LOCATIONNAME VARCHAR(75) null,SGCOMPANY VARCHAR(75) null,SGCURRENTSALARY LONG,SGEMAIL VARCHAR(75) null,CREATETIMESTAMP DATE null,SGFROMLOCALE VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table webcmscustom.HAYSSALGUSERDATAUK";
	public static final String ORDER_BY_JPQL = " ORDER BY haysSalGuideUserDataUk.SGUSERID DESC";
	public static final String ORDER_BY_SQL = " ORDER BY webcmscustom.HAYSSALGUSERDATAUK.SGUSERID DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.hays.service.salaryguide.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hays.service.salaryguide.model.HaysSalGuideUserDataUk"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.hays.service.salaryguide.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hays.service.salaryguide.model.HaysSalGuideUserDataUk"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.hays.service.salaryguide.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hays.service.salaryguide.model.HaysSalGuideUserDataUk"),
			true);
	public static final long SGFROMLOCALE_COLUMN_BITMASK = 1L;
	public static final long SGUSERID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static HaysSalGuideUserDataUk toModel(
		HaysSalGuideUserDataUkSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		HaysSalGuideUserDataUk model = new HaysSalGuideUserDataUkImpl();

		model.setSGUSERID(soapModel.getSGUSERID());
		model.setSGFORMINDUSTRY(soapModel.getSGFORMINDUSTRY());
		model.setSGFORMSECTOR(soapModel.getSGFORMSECTOR());
		model.setSGFORMAREA(soapModel.getSGFORMAREA());
		model.setSGFORMPOSITIONTYPE(soapModel.getSGFORMPOSITIONTYPE());
		model.setSGFORMPOSITIONNAME(soapModel.getSGFORMPOSITIONNAME());
		model.setLOCATIONNAME(soapModel.getLOCATIONNAME());
		model.setSGCOMPANY(soapModel.getSGCOMPANY());
		model.setSGCURRENTSALARY(soapModel.getSGCURRENTSALARY());
		model.setSGEMAIL(soapModel.getSGEMAIL());
		model.setCREATETIMESTAMP(soapModel.getCREATETIMESTAMP());
		model.setSGFROMLOCALE(soapModel.getSGFROMLOCALE());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<HaysSalGuideUserDataUk> toModels(
		HaysSalGuideUserDataUkSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<HaysSalGuideUserDataUk> models = new ArrayList<HaysSalGuideUserDataUk>(soapModels.length);

		for (HaysSalGuideUserDataUkSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.hays.service.salaryguide.service.util.ServiceProps.get(
				"lock.expiration.time.com.hays.service.salaryguide.model.HaysSalGuideUserDataUk"));

	public HaysSalGuideUserDataUkModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _SGUSERID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSGUSERID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _SGUSERID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public long getSGUSERID() {
		return _SGUSERID;
	}

	@Override
	public void setSGUSERID(long SGUSERID) {
		_columnBitmask = -1L;

		_SGUSERID = SGUSERID;
	}

	@JSON
	@Override
	public String getSGFORMINDUSTRY() {
		if (_SGFORMINDUSTRY == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGFORMINDUSTRY;
		}
	}

	@Override
	public void setSGFORMINDUSTRY(String SGFORMINDUSTRY) {
		_SGFORMINDUSTRY = SGFORMINDUSTRY;
	}

	@JSON
	@Override
	public String getSGFORMSECTOR() {
		if (_SGFORMSECTOR == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGFORMSECTOR;
		}
	}

	@Override
	public void setSGFORMSECTOR(String SGFORMSECTOR) {
		_SGFORMSECTOR = SGFORMSECTOR;
	}

	@JSON
	@Override
	public String getSGFORMAREA() {
		if (_SGFORMAREA == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGFORMAREA;
		}
	}

	@Override
	public void setSGFORMAREA(String SGFORMAREA) {
		_SGFORMAREA = SGFORMAREA;
	}

	@JSON
	@Override
	public String getSGFORMPOSITIONTYPE() {
		if (_SGFORMPOSITIONTYPE == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGFORMPOSITIONTYPE;
		}
	}

	@Override
	public void setSGFORMPOSITIONTYPE(String SGFORMPOSITIONTYPE) {
		_SGFORMPOSITIONTYPE = SGFORMPOSITIONTYPE;
	}

	@JSON
	@Override
	public String getSGFORMPOSITIONNAME() {
		if (_SGFORMPOSITIONNAME == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGFORMPOSITIONNAME;
		}
	}

	@Override
	public void setSGFORMPOSITIONNAME(String SGFORMPOSITIONNAME) {
		_SGFORMPOSITIONNAME = SGFORMPOSITIONNAME;
	}

	@JSON
	@Override
	public String getLOCATIONNAME() {
		if (_LOCATIONNAME == null) {
			return StringPool.BLANK;
		}
		else {
			return _LOCATIONNAME;
		}
	}

	@Override
	public void setLOCATIONNAME(String LOCATIONNAME) {
		_LOCATIONNAME = LOCATIONNAME;
	}

	@JSON
	@Override
	public String getSGCOMPANY() {
		if (_SGCOMPANY == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGCOMPANY;
		}
	}

	@Override
	public void setSGCOMPANY(String SGCOMPANY) {
		_SGCOMPANY = SGCOMPANY;
	}

	@JSON
	@Override
	public long getSGCURRENTSALARY() {
		return _SGCURRENTSALARY;
	}

	@Override
	public void setSGCURRENTSALARY(long SGCURRENTSALARY) {
		_SGCURRENTSALARY = SGCURRENTSALARY;
	}

	@JSON
	@Override
	public String getSGEMAIL() {
		if (_SGEMAIL == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGEMAIL;
		}
	}

	@Override
	public void setSGEMAIL(String SGEMAIL) {
		_SGEMAIL = SGEMAIL;
	}

	@JSON
	@Override
	public Date getCREATETIMESTAMP() {
		return _CREATETIMESTAMP;
	}

	@Override
	public void setCREATETIMESTAMP(Date CREATETIMESTAMP) {
		_CREATETIMESTAMP = CREATETIMESTAMP;
	}

	@JSON
	@Override
	public String getSGFROMLOCALE() {
		if (_SGFROMLOCALE == null) {
			return StringPool.BLANK;
		}
		else {
			return _SGFROMLOCALE;
		}
	}

	@Override
	public void setSGFROMLOCALE(String SGFROMLOCALE) {
		_columnBitmask |= SGFROMLOCALE_COLUMN_BITMASK;

		if (_originalSGFROMLOCALE == null) {
			_originalSGFROMLOCALE = _SGFROMLOCALE;
		}

		_SGFROMLOCALE = SGFROMLOCALE;
	}

	public String getOriginalSGFROMLOCALE() {
		return GetterUtil.getString(_originalSGFROMLOCALE);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			HaysSalGuideUserDataUk.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public HaysSalGuideUserDataUk toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (HaysSalGuideUserDataUk)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		HaysSalGuideUserDataUkImpl haysSalGuideUserDataUkImpl = new HaysSalGuideUserDataUkImpl();

		haysSalGuideUserDataUkImpl.setSGUSERID(getSGUSERID());
		haysSalGuideUserDataUkImpl.setSGFORMINDUSTRY(getSGFORMINDUSTRY());
		haysSalGuideUserDataUkImpl.setSGFORMSECTOR(getSGFORMSECTOR());
		haysSalGuideUserDataUkImpl.setSGFORMAREA(getSGFORMAREA());
		haysSalGuideUserDataUkImpl.setSGFORMPOSITIONTYPE(getSGFORMPOSITIONTYPE());
		haysSalGuideUserDataUkImpl.setSGFORMPOSITIONNAME(getSGFORMPOSITIONNAME());
		haysSalGuideUserDataUkImpl.setLOCATIONNAME(getLOCATIONNAME());
		haysSalGuideUserDataUkImpl.setSGCOMPANY(getSGCOMPANY());
		haysSalGuideUserDataUkImpl.setSGCURRENTSALARY(getSGCURRENTSALARY());
		haysSalGuideUserDataUkImpl.setSGEMAIL(getSGEMAIL());
		haysSalGuideUserDataUkImpl.setCREATETIMESTAMP(getCREATETIMESTAMP());
		haysSalGuideUserDataUkImpl.setSGFROMLOCALE(getSGFROMLOCALE());

		haysSalGuideUserDataUkImpl.resetOriginalValues();

		return haysSalGuideUserDataUkImpl;
	}

	@Override
	public int compareTo(HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		int value = 0;

		if (getSGUSERID() < haysSalGuideUserDataUk.getSGUSERID()) {
			value = -1;
		}
		else if (getSGUSERID() > haysSalGuideUserDataUk.getSGUSERID()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HaysSalGuideUserDataUk)) {
			return false;
		}

		HaysSalGuideUserDataUk haysSalGuideUserDataUk = (HaysSalGuideUserDataUk)obj;

		long primaryKey = haysSalGuideUserDataUk.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		HaysSalGuideUserDataUkModelImpl haysSalGuideUserDataUkModelImpl = this;

		haysSalGuideUserDataUkModelImpl._originalSGFROMLOCALE = haysSalGuideUserDataUkModelImpl._SGFROMLOCALE;

		haysSalGuideUserDataUkModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<HaysSalGuideUserDataUk> toCacheModel() {
		HaysSalGuideUserDataUkCacheModel haysSalGuideUserDataUkCacheModel = new HaysSalGuideUserDataUkCacheModel();

		haysSalGuideUserDataUkCacheModel.SGUSERID = getSGUSERID();

		haysSalGuideUserDataUkCacheModel.SGFORMINDUSTRY = getSGFORMINDUSTRY();

		String SGFORMINDUSTRY = haysSalGuideUserDataUkCacheModel.SGFORMINDUSTRY;

		if ((SGFORMINDUSTRY != null) && (SGFORMINDUSTRY.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGFORMINDUSTRY = null;
		}

		haysSalGuideUserDataUkCacheModel.SGFORMSECTOR = getSGFORMSECTOR();

		String SGFORMSECTOR = haysSalGuideUserDataUkCacheModel.SGFORMSECTOR;

		if ((SGFORMSECTOR != null) && (SGFORMSECTOR.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGFORMSECTOR = null;
		}

		haysSalGuideUserDataUkCacheModel.SGFORMAREA = getSGFORMAREA();

		String SGFORMAREA = haysSalGuideUserDataUkCacheModel.SGFORMAREA;

		if ((SGFORMAREA != null) && (SGFORMAREA.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGFORMAREA = null;
		}

		haysSalGuideUserDataUkCacheModel.SGFORMPOSITIONTYPE = getSGFORMPOSITIONTYPE();

		String SGFORMPOSITIONTYPE = haysSalGuideUserDataUkCacheModel.SGFORMPOSITIONTYPE;

		if ((SGFORMPOSITIONTYPE != null) && (SGFORMPOSITIONTYPE.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGFORMPOSITIONTYPE = null;
		}

		haysSalGuideUserDataUkCacheModel.SGFORMPOSITIONNAME = getSGFORMPOSITIONNAME();

		String SGFORMPOSITIONNAME = haysSalGuideUserDataUkCacheModel.SGFORMPOSITIONNAME;

		if ((SGFORMPOSITIONNAME != null) && (SGFORMPOSITIONNAME.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGFORMPOSITIONNAME = null;
		}

		haysSalGuideUserDataUkCacheModel.LOCATIONNAME = getLOCATIONNAME();

		String LOCATIONNAME = haysSalGuideUserDataUkCacheModel.LOCATIONNAME;

		if ((LOCATIONNAME != null) && (LOCATIONNAME.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.LOCATIONNAME = null;
		}

		haysSalGuideUserDataUkCacheModel.SGCOMPANY = getSGCOMPANY();

		String SGCOMPANY = haysSalGuideUserDataUkCacheModel.SGCOMPANY;

		if ((SGCOMPANY != null) && (SGCOMPANY.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGCOMPANY = null;
		}

		haysSalGuideUserDataUkCacheModel.SGCURRENTSALARY = getSGCURRENTSALARY();

		haysSalGuideUserDataUkCacheModel.SGEMAIL = getSGEMAIL();

		String SGEMAIL = haysSalGuideUserDataUkCacheModel.SGEMAIL;

		if ((SGEMAIL != null) && (SGEMAIL.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGEMAIL = null;
		}

		Date CREATETIMESTAMP = getCREATETIMESTAMP();

		if (CREATETIMESTAMP != null) {
			haysSalGuideUserDataUkCacheModel.CREATETIMESTAMP = CREATETIMESTAMP.getTime();
		}
		else {
			haysSalGuideUserDataUkCacheModel.CREATETIMESTAMP = Long.MIN_VALUE;
		}

		haysSalGuideUserDataUkCacheModel.SGFROMLOCALE = getSGFROMLOCALE();

		String SGFROMLOCALE = haysSalGuideUserDataUkCacheModel.SGFROMLOCALE;

		if ((SGFROMLOCALE != null) && (SGFROMLOCALE.length() == 0)) {
			haysSalGuideUserDataUkCacheModel.SGFROMLOCALE = null;
		}

		return haysSalGuideUserDataUkCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{SGUSERID=");
		sb.append(getSGUSERID());
		sb.append(", SGFORMINDUSTRY=");
		sb.append(getSGFORMINDUSTRY());
		sb.append(", SGFORMSECTOR=");
		sb.append(getSGFORMSECTOR());
		sb.append(", SGFORMAREA=");
		sb.append(getSGFORMAREA());
		sb.append(", SGFORMPOSITIONTYPE=");
		sb.append(getSGFORMPOSITIONTYPE());
		sb.append(", SGFORMPOSITIONNAME=");
		sb.append(getSGFORMPOSITIONNAME());
		sb.append(", LOCATIONNAME=");
		sb.append(getLOCATIONNAME());
		sb.append(", SGCOMPANY=");
		sb.append(getSGCOMPANY());
		sb.append(", SGCURRENTSALARY=");
		sb.append(getSGCURRENTSALARY());
		sb.append(", SGEMAIL=");
		sb.append(getSGEMAIL());
		sb.append(", CREATETIMESTAMP=");
		sb.append(getCREATETIMESTAMP());
		sb.append(", SGFROMLOCALE=");
		sb.append(getSGFROMLOCALE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.hays.service.salaryguide.model.HaysSalGuideUserDataUk");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>SGUSERID</column-name><column-value><![CDATA[");
		sb.append(getSGUSERID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGFORMINDUSTRY</column-name><column-value><![CDATA[");
		sb.append(getSGFORMINDUSTRY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGFORMSECTOR</column-name><column-value><![CDATA[");
		sb.append(getSGFORMSECTOR());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGFORMAREA</column-name><column-value><![CDATA[");
		sb.append(getSGFORMAREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGFORMPOSITIONTYPE</column-name><column-value><![CDATA[");
		sb.append(getSGFORMPOSITIONTYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGFORMPOSITIONNAME</column-name><column-value><![CDATA[");
		sb.append(getSGFORMPOSITIONNAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOCATIONNAME</column-name><column-value><![CDATA[");
		sb.append(getLOCATIONNAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGCOMPANY</column-name><column-value><![CDATA[");
		sb.append(getSGCOMPANY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGCURRENTSALARY</column-name><column-value><![CDATA[");
		sb.append(getSGCURRENTSALARY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGEMAIL</column-name><column-value><![CDATA[");
		sb.append(getSGEMAIL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CREATETIMESTAMP</column-name><column-value><![CDATA[");
		sb.append(getCREATETIMESTAMP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SGFROMLOCALE</column-name><column-value><![CDATA[");
		sb.append(getSGFROMLOCALE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = HaysSalGuideUserDataUk.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			HaysSalGuideUserDataUk.class
		};
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
	private String _originalSGFROMLOCALE;
	private long _columnBitmask;
	private HaysSalGuideUserDataUk _escapedModel;
}