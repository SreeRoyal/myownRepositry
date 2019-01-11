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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for HaysSalGuideUserDataUk. This utility wraps
 * {@link com.hays.service.salaryguide.service.impl.HaysSalGuideUserDataUkLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUkLocalService
 * @see com.hays.service.salaryguide.service.base.HaysSalGuideUserDataUkLocalServiceBaseImpl
 * @see com.hays.service.salaryguide.service.impl.HaysSalGuideUserDataUkLocalServiceImpl
 * @generated
 */
@ProviderType
public class HaysSalGuideUserDataUkLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hays.service.salaryguide.service.impl.HaysSalGuideUserDataUkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the hays sal guide user data uk to the database. Also notifies the appropriate model listeners.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	* @return the hays sal guide user data uk that was added
	*/
	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk addHaysSalGuideUserDataUk(
		com.hays.service.salaryguide.model.HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		return getService().addHaysSalGuideUserDataUk(haysSalGuideUserDataUk);
	}

	/**
	* Creates a new hays sal guide user data uk with the primary key. Does not add the hays sal guide user data uk to the database.
	*
	* @param SGUSERID the primary key for the new hays sal guide user data uk
	* @return the new hays sal guide user data uk
	*/
	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk createHaysSalGuideUserDataUk(
		long SGUSERID) {
		return getService().createHaysSalGuideUserDataUk(SGUSERID);
	}

	/**
	* Deletes the hays sal guide user data uk from the database. Also notifies the appropriate model listeners.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	* @return the hays sal guide user data uk that was removed
	*/
	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk deleteHaysSalGuideUserDataUk(
		com.hays.service.salaryguide.model.HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		return getService().deleteHaysSalGuideUserDataUk(haysSalGuideUserDataUk);
	}

	/**
	* Deletes the hays sal guide user data uk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk that was removed
	* @throws PortalException if a hays sal guide user data uk with the primary key could not be found
	*/
	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk deleteHaysSalGuideUserDataUk(
		long SGUSERID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteHaysSalGuideUserDataUk(SGUSERID);
	}

	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk fetchHaysSalGuideUserDataUk(
		long SGUSERID) {
		return getService().fetchHaysSalGuideUserDataUk(SGUSERID);
	}

	/**
	* Returns the hays sal guide user data uk with the primary key.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk
	* @throws PortalException if a hays sal guide user data uk with the primary key could not be found
	*/
	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk getHaysSalGuideUserDataUk(
		long SGUSERID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHaysSalGuideUserDataUk(SGUSERID);
	}

	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk update(
		long sgUserId, java.lang.String SGFORMINDUSTRY,
		java.lang.String SGFORMSECTOR, java.lang.String SGFORMAREA,
		java.lang.String SGFORMPOSITIONTYPE,
		java.lang.String SGFORMPOSITIONNAME, java.lang.String LOCATIONNAME,
		java.lang.String SGFROMLOCALE, java.lang.String SGEMAIL,
		long SGCURRENTSALARY, java.lang.String SGCOMPANY) {
		return getService()
				   .update(sgUserId, SGFORMINDUSTRY, SGFORMSECTOR, SGFORMAREA,
			SGFORMPOSITIONTYPE, SGFORMPOSITIONNAME, LOCATIONNAME, SGFROMLOCALE,
			SGEMAIL, SGCURRENTSALARY, SGCOMPANY);
	}

	/**
	* Updates the hays sal guide user data uk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	* @return the hays sal guide user data uk that was updated
	*/
	public static com.hays.service.salaryguide.model.HaysSalGuideUserDataUk updateHaysSalGuideUserDataUk(
		com.hays.service.salaryguide.model.HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		return getService().updateHaysSalGuideUserDataUk(haysSalGuideUserDataUk);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of hays sal guide user data uks.
	*
	* @return the number of hays sal guide user data uks
	*/
	public static int getHaysSalGuideUserDataUksCount() {
		return getService().getHaysSalGuideUserDataUksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.hays.service.salaryguide.model.HaysSalGuideUserDataUk> findByLocal(
		java.lang.String locale) {
		return getService().findByLocal(locale);
	}

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
	public static java.util.List<com.hays.service.salaryguide.model.HaysSalGuideUserDataUk> getHaysSalGuideUserDataUks(
		int start, int end) {
		return getService().getHaysSalGuideUserDataUks(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static HaysSalGuideUserDataUkLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HaysSalGuideUserDataUkLocalService, HaysSalGuideUserDataUkLocalService> _serviceTracker =
		ServiceTrackerFactory.open(HaysSalGuideUserDataUkLocalService.class);
}