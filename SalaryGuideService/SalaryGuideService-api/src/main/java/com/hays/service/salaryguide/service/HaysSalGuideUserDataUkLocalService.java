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

package com.hays.service.salaryguide.service;

import aQute.bnd.annotation.ProviderType;

import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for HaysSalGuideUserDataUk. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUkLocalServiceUtil
 * @see com.hays.service.salaryguide.service.base.HaysSalGuideUserDataUkLocalServiceBaseImpl
 * @see com.hays.service.salaryguide.service.impl.HaysSalGuideUserDataUkLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface HaysSalGuideUserDataUkLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HaysSalGuideUserDataUkLocalServiceUtil} to access the hays sal guide user data uk local service. Add custom service methods to {@link com.hays.service.salaryguide.service.impl.HaysSalGuideUserDataUkLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the hays sal guide user data uk to the database. Also notifies the appropriate model listeners.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	* @return the hays sal guide user data uk that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public HaysSalGuideUserDataUk addHaysSalGuideUserDataUk(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk);

	/**
	* Creates a new hays sal guide user data uk with the primary key. Does not add the hays sal guide user data uk to the database.
	*
	* @param SGUSERID the primary key for the new hays sal guide user data uk
	* @return the new hays sal guide user data uk
	*/
	public HaysSalGuideUserDataUk createHaysSalGuideUserDataUk(long SGUSERID);

	/**
	* Deletes the hays sal guide user data uk from the database. Also notifies the appropriate model listeners.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	* @return the hays sal guide user data uk that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public HaysSalGuideUserDataUk deleteHaysSalGuideUserDataUk(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk);

	/**
	* Deletes the hays sal guide user data uk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk that was removed
	* @throws PortalException if a hays sal guide user data uk with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public HaysSalGuideUserDataUk deleteHaysSalGuideUserDataUk(long SGUSERID)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HaysSalGuideUserDataUk fetchHaysSalGuideUserDataUk(long SGUSERID);

	/**
	* Returns the hays sal guide user data uk with the primary key.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk
	* @throws PortalException if a hays sal guide user data uk with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HaysSalGuideUserDataUk getHaysSalGuideUserDataUk(long SGUSERID)
		throws PortalException;

	public HaysSalGuideUserDataUk update(long sgUserId,
		java.lang.String SGFORMINDUSTRY, java.lang.String SGFORMSECTOR,
		java.lang.String SGFORMAREA, java.lang.String SGFORMPOSITIONTYPE,
		java.lang.String SGFORMPOSITIONNAME, java.lang.String LOCATIONNAME,
		java.lang.String SGFROMLOCALE, java.lang.String SGEMAIL,
		long SGCURRENTSALARY, java.lang.String SGCOMPANY);

	/**
	* Updates the hays sal guide user data uk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	* @return the hays sal guide user data uk that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public HaysSalGuideUserDataUk updateHaysSalGuideUserDataUk(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of hays sal guide user data uks.
	*
	* @return the number of hays sal guide user data uks
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getHaysSalGuideUserDataUksCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	public List<HaysSalGuideUserDataUk> findByLocal(java.lang.String locale);

	/**
	* Returns a range of all the hays sal guide user data uks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays sal guide user data uks
	* @param end the upper bound of the range of hays sal guide user data uks (not inclusive)
	* @return the range of hays sal guide user data uks
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HaysSalGuideUserDataUk> getHaysSalGuideUserDataUks(int start,
		int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}