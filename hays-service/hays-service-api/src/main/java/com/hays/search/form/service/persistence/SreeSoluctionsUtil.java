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

package com.hays.search.form.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.hays.search.form.model.SreeSoluctions;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the sree soluctions service. This utility wraps {@link com.hays.search.form.service.persistence.impl.SreeSoluctionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sreenivasulu
 * @see SreeSoluctionsPersistence
 * @see com.hays.search.form.service.persistence.impl.SreeSoluctionsPersistenceImpl
 * @generated
 */
@ProviderType
public class SreeSoluctionsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SreeSoluctions sreeSoluctions) {
		getPersistence().clearCache(sreeSoluctions);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SreeSoluctions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SreeSoluctions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SreeSoluctions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SreeSoluctions> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SreeSoluctions update(SreeSoluctions sreeSoluctions) {
		return getPersistence().update(sreeSoluctions);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SreeSoluctions update(SreeSoluctions sreeSoluctions,
		ServiceContext serviceContext) {
		return getPersistence().update(sreeSoluctions, serviceContext);
	}

	/**
	* Caches the sree soluctions in the entity cache if it is enabled.
	*
	* @param sreeSoluctions the sree soluctions
	*/
	public static void cacheResult(SreeSoluctions sreeSoluctions) {
		getPersistence().cacheResult(sreeSoluctions);
	}

	/**
	* Caches the sree soluctionses in the entity cache if it is enabled.
	*
	* @param sreeSoluctionses the sree soluctionses
	*/
	public static void cacheResult(List<SreeSoluctions> sreeSoluctionses) {
		getPersistence().cacheResult(sreeSoluctionses);
	}

	/**
	* Creates a new sree soluctions with the primary key. Does not add the sree soluctions to the database.
	*
	* @param soluctionId the primary key for the new sree soluctions
	* @return the new sree soluctions
	*/
	public static SreeSoluctions create(long soluctionId) {
		return getPersistence().create(soluctionId);
	}

	/**
	* Removes the sree soluctions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions that was removed
	* @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	*/
	public static SreeSoluctions remove(long soluctionId)
		throws com.hays.search.form.exception.NoSuchSreeSoluctionsException {
		return getPersistence().remove(soluctionId);
	}

	public static SreeSoluctions updateImpl(SreeSoluctions sreeSoluctions) {
		return getPersistence().updateImpl(sreeSoluctions);
	}

	/**
	* Returns the sree soluctions with the primary key or throws a {@link NoSuchSreeSoluctionsException} if it could not be found.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions
	* @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	*/
	public static SreeSoluctions findByPrimaryKey(long soluctionId)
		throws com.hays.search.form.exception.NoSuchSreeSoluctionsException {
		return getPersistence().findByPrimaryKey(soluctionId);
	}

	/**
	* Returns the sree soluctions with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions, or <code>null</code> if a sree soluctions with the primary key could not be found
	*/
	public static SreeSoluctions fetchByPrimaryKey(long soluctionId) {
		return getPersistence().fetchByPrimaryKey(soluctionId);
	}

	public static java.util.Map<java.io.Serializable, SreeSoluctions> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the sree soluctionses.
	*
	* @return the sree soluctionses
	*/
	public static List<SreeSoluctions> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sree soluctionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SreeSoluctionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sree soluctionses
	* @param end the upper bound of the range of sree soluctionses (not inclusive)
	* @return the range of sree soluctionses
	*/
	public static List<SreeSoluctions> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sree soluctionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SreeSoluctionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sree soluctionses
	* @param end the upper bound of the range of sree soluctionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sree soluctionses
	*/
	public static List<SreeSoluctions> findAll(int start, int end,
		OrderByComparator<SreeSoluctions> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the sree soluctionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SreeSoluctionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sree soluctionses
	* @param end the upper bound of the range of sree soluctionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of sree soluctionses
	*/
	public static List<SreeSoluctions> findAll(int start, int end,
		OrderByComparator<SreeSoluctions> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the sree soluctionses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sree soluctionses.
	*
	* @return the number of sree soluctionses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SreeSoluctionsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SreeSoluctionsPersistence, SreeSoluctionsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SreeSoluctionsPersistence.class);
}