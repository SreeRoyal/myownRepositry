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

package com.hays.search.form.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for SreeSoluctions. This utility wraps
 * {@link com.hays.search.form.service.impl.SreeSoluctionsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Sreenivasulu
 * @see SreeSoluctionsLocalService
 * @see com.hays.search.form.service.base.SreeSoluctionsLocalServiceBaseImpl
 * @see com.hays.search.form.service.impl.SreeSoluctionsLocalServiceImpl
 * @generated
 */
@ProviderType
public class SreeSoluctionsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hays.search.form.service.impl.SreeSoluctionsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the sree soluctions to the database. Also notifies the appropriate model listeners.
	*
	* @param sreeSoluctions the sree soluctions
	* @return the sree soluctions that was added
	*/
	public static com.hays.search.form.model.SreeSoluctions addSreeSoluctions(
		com.hays.search.form.model.SreeSoluctions sreeSoluctions) {
		return getService().addSreeSoluctions(sreeSoluctions);
	}

	/**
	* Creates a new sree soluctions with the primary key. Does not add the sree soluctions to the database.
	*
	* @param soluctionId the primary key for the new sree soluctions
	* @return the new sree soluctions
	*/
	public static com.hays.search.form.model.SreeSoluctions createSreeSoluctions(
		long soluctionId) {
		return getService().createSreeSoluctions(soluctionId);
	}

	/**
	* Deletes the sree soluctions from the database. Also notifies the appropriate model listeners.
	*
	* @param sreeSoluctions the sree soluctions
	* @return the sree soluctions that was removed
	*/
	public static com.hays.search.form.model.SreeSoluctions deleteSreeSoluctions(
		com.hays.search.form.model.SreeSoluctions sreeSoluctions) {
		return getService().deleteSreeSoluctions(sreeSoluctions);
	}

	/**
	* Deletes the sree soluctions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions that was removed
	* @throws PortalException if a sree soluctions with the primary key could not be found
	*/
	public static com.hays.search.form.model.SreeSoluctions deleteSreeSoluctions(
		long soluctionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSreeSoluctions(soluctionId);
	}

	public static com.hays.search.form.model.SreeSoluctions fetchSreeSoluctions(
		long soluctionId) {
		return getService().fetchSreeSoluctions(soluctionId);
	}

	/**
	* Returns the sree soluctions with the primary key.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions
	* @throws PortalException if a sree soluctions with the primary key could not be found
	*/
	public static com.hays.search.form.model.SreeSoluctions getSreeSoluctions(
		long soluctionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSreeSoluctions(soluctionId);
	}

	/**
	* Updates the sree soluctions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sreeSoluctions the sree soluctions
	* @return the sree soluctions that was updated
	*/
	public static com.hays.search.form.model.SreeSoluctions updateSreeSoluctions(
		com.hays.search.form.model.SreeSoluctions sreeSoluctions) {
		return getService().updateSreeSoluctions(sreeSoluctions);
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

	public static com.liferay.portal.kernel.json.JSONObject getUserList() {
		return getService().getUserList();
	}

	public static com.liferay.portal.kernel.json.JSONObject getUsersByNameAndDesignation(
		java.lang.String jobTitle, java.lang.String name) {
		return getService().getUsersByNameAndDesignation(jobTitle, name);
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
	* Returns the number of sree soluctionses.
	*
	* @return the number of sree soluctionses
	*/
	public static int getSreeSoluctionsesCount() {
		return getService().getSreeSoluctionsesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.search.form.model.impl.SreeSoluctionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.search.form.model.impl.SreeSoluctionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the sree soluctionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.search.form.model.impl.SreeSoluctionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sree soluctionses
	* @param end the upper bound of the range of sree soluctionses (not inclusive)
	* @return the range of sree soluctionses
	*/
	public static java.util.List<com.hays.search.form.model.SreeSoluctions> getSreeSoluctionses(
		int start, int end) {
		return getService().getSreeSoluctionses(start, end);
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

	public static SreeSoluctionsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SreeSoluctionsLocalService, SreeSoluctionsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SreeSoluctionsLocalService.class);
}