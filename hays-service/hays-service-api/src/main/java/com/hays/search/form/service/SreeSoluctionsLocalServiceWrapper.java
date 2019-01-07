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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SreeSoluctionsLocalService}.
 *
 * @author Sreenivasulu
 * @see SreeSoluctionsLocalService
 * @generated
 */
@ProviderType
public class SreeSoluctionsLocalServiceWrapper
	implements SreeSoluctionsLocalService,
		ServiceWrapper<SreeSoluctionsLocalService> {
	public SreeSoluctionsLocalServiceWrapper(
		SreeSoluctionsLocalService sreeSoluctionsLocalService) {
		_sreeSoluctionsLocalService = sreeSoluctionsLocalService;
	}

	/**
	* Adds the sree soluctions to the database. Also notifies the appropriate model listeners.
	*
	* @param sreeSoluctions the sree soluctions
	* @return the sree soluctions that was added
	*/
	@Override
	public com.hays.search.form.model.SreeSoluctions addSreeSoluctions(
		com.hays.search.form.model.SreeSoluctions sreeSoluctions) {
		return _sreeSoluctionsLocalService.addSreeSoluctions(sreeSoluctions);
	}

	/**
	* Creates a new sree soluctions with the primary key. Does not add the sree soluctions to the database.
	*
	* @param soluctionId the primary key for the new sree soluctions
	* @return the new sree soluctions
	*/
	@Override
	public com.hays.search.form.model.SreeSoluctions createSreeSoluctions(
		long soluctionId) {
		return _sreeSoluctionsLocalService.createSreeSoluctions(soluctionId);
	}

	/**
	* Deletes the sree soluctions from the database. Also notifies the appropriate model listeners.
	*
	* @param sreeSoluctions the sree soluctions
	* @return the sree soluctions that was removed
	*/
	@Override
	public com.hays.search.form.model.SreeSoluctions deleteSreeSoluctions(
		com.hays.search.form.model.SreeSoluctions sreeSoluctions) {
		return _sreeSoluctionsLocalService.deleteSreeSoluctions(sreeSoluctions);
	}

	/**
	* Deletes the sree soluctions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions that was removed
	* @throws PortalException if a sree soluctions with the primary key could not be found
	*/
	@Override
	public com.hays.search.form.model.SreeSoluctions deleteSreeSoluctions(
		long soluctionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sreeSoluctionsLocalService.deleteSreeSoluctions(soluctionId);
	}

	@Override
	public com.hays.search.form.model.SreeSoluctions fetchSreeSoluctions(
		long soluctionId) {
		return _sreeSoluctionsLocalService.fetchSreeSoluctions(soluctionId);
	}

	/**
	* Returns the sree soluctions with the primary key.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions
	* @throws PortalException if a sree soluctions with the primary key could not be found
	*/
	@Override
	public com.hays.search.form.model.SreeSoluctions getSreeSoluctions(
		long soluctionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sreeSoluctionsLocalService.getSreeSoluctions(soluctionId);
	}

	/**
	* Updates the sree soluctions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sreeSoluctions the sree soluctions
	* @return the sree soluctions that was updated
	*/
	@Override
	public com.hays.search.form.model.SreeSoluctions updateSreeSoluctions(
		com.hays.search.form.model.SreeSoluctions sreeSoluctions) {
		return _sreeSoluctionsLocalService.updateSreeSoluctions(sreeSoluctions);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _sreeSoluctionsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sreeSoluctionsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _sreeSoluctionsLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getUserList() {
		return _sreeSoluctionsLocalService.getUserList();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getUsersByNameAndDesignation(
		java.lang.String jobTitle, java.lang.String name) {
		return _sreeSoluctionsLocalService.getUsersByNameAndDesignation(jobTitle,
			name);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sreeSoluctionsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sreeSoluctionsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of sree soluctionses.
	*
	* @return the number of sree soluctionses
	*/
	@Override
	public int getSreeSoluctionsesCount() {
		return _sreeSoluctionsLocalService.getSreeSoluctionsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _sreeSoluctionsLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _sreeSoluctionsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _sreeSoluctionsLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _sreeSoluctionsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
	@Override
	public java.util.List<com.hays.search.form.model.SreeSoluctions> getSreeSoluctionses(
		int start, int end) {
		return _sreeSoluctionsLocalService.getSreeSoluctionses(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _sreeSoluctionsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _sreeSoluctionsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SreeSoluctionsLocalService getWrappedService() {
		return _sreeSoluctionsLocalService;
	}

	@Override
	public void setWrappedService(
		SreeSoluctionsLocalService sreeSoluctionsLocalService) {
		_sreeSoluctionsLocalService = sreeSoluctionsLocalService;
	}

	private SreeSoluctionsLocalService _sreeSoluctionsLocalService;
}