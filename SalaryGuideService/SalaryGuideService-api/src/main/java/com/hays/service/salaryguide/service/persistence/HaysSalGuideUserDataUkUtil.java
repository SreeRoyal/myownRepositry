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

package com.hays.service.salaryguide.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the hays sal guide user data uk service. This utility wraps {@link com.hays.service.salaryguide.service.persistence.impl.HaysSalGuideUserDataUkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUkPersistence
 * @see com.hays.service.salaryguide.service.persistence.impl.HaysSalGuideUserDataUkPersistenceImpl
 * @generated
 */
@ProviderType
public class HaysSalGuideUserDataUkUtil {
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
	public static void clearCache(HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		getPersistence().clearCache(haysSalGuideUserDataUk);
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
	public static List<HaysSalGuideUserDataUk> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HaysSalGuideUserDataUk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HaysSalGuideUserDataUk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HaysSalGuideUserDataUk update(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		return getPersistence().update(haysSalGuideUserDataUk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HaysSalGuideUserDataUk update(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk,
		ServiceContext serviceContext) {
		return getPersistence().update(haysSalGuideUserDataUk, serviceContext);
	}

	/**
	* Returns all the hays sal guide user data uks where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @return the matching hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE) {
		return getPersistence().findBySiteLocale(SGFROMLOCALE);
	}

	/**
	* Returns a range of all the hays sal guide user data uks where SGFROMLOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param start the lower bound of the range of hays sal guide user data uks
	* @param end the upper bound of the range of hays sal guide user data uks (not inclusive)
	* @return the range of matching hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE, int start, int end) {
		return getPersistence().findBySiteLocale(SGFROMLOCALE, start, end);
	}

	/**
	* Returns an ordered range of all the hays sal guide user data uks where SGFROMLOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param start the lower bound of the range of hays sal guide user data uks
	* @param end the upper bound of the range of hays sal guide user data uks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE, int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		return getPersistence()
				   .findBySiteLocale(SGFROMLOCALE, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hays sal guide user data uks where SGFROMLOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param start the lower bound of the range of hays sal guide user data uks
	* @param end the upper bound of the range of hays sal guide user data uks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE, int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySiteLocale(SGFROMLOCALE, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a matching hays sal guide user data uk could not be found
	*/
	public static HaysSalGuideUserDataUk findBySiteLocale_First(
		java.lang.String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalGuideUserDataUkException {
		return getPersistence()
				   .findBySiteLocale_First(SGFROMLOCALE, orderByComparator);
	}

	/**
	* Returns the first hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sal guide user data uk, or <code>null</code> if a matching hays sal guide user data uk could not be found
	*/
	public static HaysSalGuideUserDataUk fetchBySiteLocale_First(
		java.lang.String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		return getPersistence()
				   .fetchBySiteLocale_First(SGFROMLOCALE, orderByComparator);
	}

	/**
	* Returns the last hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a matching hays sal guide user data uk could not be found
	*/
	public static HaysSalGuideUserDataUk findBySiteLocale_Last(
		java.lang.String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalGuideUserDataUkException {
		return getPersistence()
				   .findBySiteLocale_Last(SGFROMLOCALE, orderByComparator);
	}

	/**
	* Returns the last hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sal guide user data uk, or <code>null</code> if a matching hays sal guide user data uk could not be found
	*/
	public static HaysSalGuideUserDataUk fetchBySiteLocale_Last(
		java.lang.String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		return getPersistence()
				   .fetchBySiteLocale_Last(SGFROMLOCALE, orderByComparator);
	}

	/**
	* Returns the hays sal guide user data uks before and after the current hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGUSERID the primary key of the current hays sal guide user data uk
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	*/
	public static HaysSalGuideUserDataUk[] findBySiteLocale_PrevAndNext(
		long SGUSERID, java.lang.String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalGuideUserDataUkException {
		return getPersistence()
				   .findBySiteLocale_PrevAndNext(SGUSERID, SGFROMLOCALE,
			orderByComparator);
	}

	/**
	* Removes all the hays sal guide user data uks where SGFROMLOCALE = &#63; from the database.
	*
	* @param SGFROMLOCALE the sgfromlocale
	*/
	public static void removeBySiteLocale(java.lang.String SGFROMLOCALE) {
		getPersistence().removeBySiteLocale(SGFROMLOCALE);
	}

	/**
	* Returns the number of hays sal guide user data uks where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @return the number of matching hays sal guide user data uks
	*/
	public static int countBySiteLocale(java.lang.String SGFROMLOCALE) {
		return getPersistence().countBySiteLocale(SGFROMLOCALE);
	}

	/**
	* Caches the hays sal guide user data uk in the entity cache if it is enabled.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	*/
	public static void cacheResult(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		getPersistence().cacheResult(haysSalGuideUserDataUk);
	}

	/**
	* Caches the hays sal guide user data uks in the entity cache if it is enabled.
	*
	* @param haysSalGuideUserDataUks the hays sal guide user data uks
	*/
	public static void cacheResult(
		List<HaysSalGuideUserDataUk> haysSalGuideUserDataUks) {
		getPersistence().cacheResult(haysSalGuideUserDataUks);
	}

	/**
	* Creates a new hays sal guide user data uk with the primary key. Does not add the hays sal guide user data uk to the database.
	*
	* @param SGUSERID the primary key for the new hays sal guide user data uk
	* @return the new hays sal guide user data uk
	*/
	public static HaysSalGuideUserDataUk create(long SGUSERID) {
		return getPersistence().create(SGUSERID);
	}

	/**
	* Removes the hays sal guide user data uk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk that was removed
	* @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	*/
	public static HaysSalGuideUserDataUk remove(long SGUSERID)
		throws com.hays.service.salaryguide.exception.NoSuchSalGuideUserDataUkException {
		return getPersistence().remove(SGUSERID);
	}

	public static HaysSalGuideUserDataUk updateImpl(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		return getPersistence().updateImpl(haysSalGuideUserDataUk);
	}

	/**
	* Returns the hays sal guide user data uk with the primary key or throws a {@link NoSuchSalGuideUserDataUkException} if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	*/
	public static HaysSalGuideUserDataUk findByPrimaryKey(long SGUSERID)
		throws com.hays.service.salaryguide.exception.NoSuchSalGuideUserDataUkException {
		return getPersistence().findByPrimaryKey(SGUSERID);
	}

	/**
	* Returns the hays sal guide user data uk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk, or <code>null</code> if a hays sal guide user data uk with the primary key could not be found
	*/
	public static HaysSalGuideUserDataUk fetchByPrimaryKey(long SGUSERID) {
		return getPersistence().fetchByPrimaryKey(SGUSERID);
	}

	public static java.util.Map<java.io.Serializable, HaysSalGuideUserDataUk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the hays sal guide user data uks.
	*
	* @return the hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the hays sal guide user data uks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays sal guide user data uks
	* @param end the upper bound of the range of hays sal guide user data uks (not inclusive)
	* @return the range of hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the hays sal guide user data uks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays sal guide user data uks
	* @param end the upper bound of the range of hays sal guide user data uks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findAll(int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hays sal guide user data uks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalGuideUserDataUkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays sal guide user data uks
	* @param end the upper bound of the range of hays sal guide user data uks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of hays sal guide user data uks
	*/
	public static List<HaysSalGuideUserDataUk> findAll(int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the hays sal guide user data uks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of hays sal guide user data uks.
	*
	* @return the number of hays sal guide user data uks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HaysSalGuideUserDataUkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HaysSalGuideUserDataUkPersistence, HaysSalGuideUserDataUkPersistence> _serviceTracker =
		ServiceTrackerFactory.open(HaysSalGuideUserDataUkPersistence.class);
}