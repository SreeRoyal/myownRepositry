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

import com.hays.service.salaryguide.model.HaysSGUserData;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the hays sg user data service. This utility wraps {@link com.hays.service.salaryguide.service.persistence.impl.HaysSGUserDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSGUserDataPersistence
 * @see com.hays.service.salaryguide.service.persistence.impl.HaysSGUserDataPersistenceImpl
 * @generated
 */
@ProviderType
public class HaysSGUserDataUtil {
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
	public static void clearCache(HaysSGUserData haysSGUserData) {
		getPersistence().clearCache(haysSGUserData);
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
	public static List<HaysSGUserData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HaysSGUserData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HaysSGUserData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HaysSGUserData update(HaysSGUserData haysSGUserData) {
		return getPersistence().update(haysSGUserData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HaysSGUserData update(HaysSGUserData haysSGUserData,
		ServiceContext serviceContext) {
		return getPersistence().update(haysSGUserData, serviceContext);
	}

	/**
	* Returns all the hays sg user datas where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @return the matching hays sg user datas
	*/
	public static List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE) {
		return getPersistence().findByFromLocale(FROMLOCALE);
	}

	/**
	* Returns a range of all the hays sg user datas where FROMLOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSGUserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FROMLOCALE the fromlocale
	* @param start the lower bound of the range of hays sg user datas
	* @param end the upper bound of the range of hays sg user datas (not inclusive)
	* @return the range of matching hays sg user datas
	*/
	public static List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE, int start, int end) {
		return getPersistence().findByFromLocale(FROMLOCALE, start, end);
	}

	/**
	* Returns an ordered range of all the hays sg user datas where FROMLOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSGUserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FROMLOCALE the fromlocale
	* @param start the lower bound of the range of hays sg user datas
	* @param end the upper bound of the range of hays sg user datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hays sg user datas
	*/
	public static List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE, int start, int end,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		return getPersistence()
				   .findByFromLocale(FROMLOCALE, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hays sg user datas where FROMLOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSGUserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FROMLOCALE the fromlocale
	* @param start the lower bound of the range of hays sg user datas
	* @param end the upper bound of the range of hays sg user datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hays sg user datas
	*/
	public static List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE, int start, int end,
		OrderByComparator<HaysSGUserData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFromLocale(FROMLOCALE, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sg user data
	* @throws NoSuchSGUserDataException if a matching hays sg user data could not be found
	*/
	public static HaysSGUserData findByFromLocale_First(
		java.lang.String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSGUserDataException {
		return getPersistence()
				   .findByFromLocale_First(FROMLOCALE, orderByComparator);
	}

	/**
	* Returns the first hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sg user data, or <code>null</code> if a matching hays sg user data could not be found
	*/
	public static HaysSGUserData fetchByFromLocale_First(
		java.lang.String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		return getPersistence()
				   .fetchByFromLocale_First(FROMLOCALE, orderByComparator);
	}

	/**
	* Returns the last hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sg user data
	* @throws NoSuchSGUserDataException if a matching hays sg user data could not be found
	*/
	public static HaysSGUserData findByFromLocale_Last(
		java.lang.String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSGUserDataException {
		return getPersistence()
				   .findByFromLocale_Last(FROMLOCALE, orderByComparator);
	}

	/**
	* Returns the last hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sg user data, or <code>null</code> if a matching hays sg user data could not be found
	*/
	public static HaysSGUserData fetchByFromLocale_Last(
		java.lang.String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		return getPersistence()
				   .fetchByFromLocale_Last(FROMLOCALE, orderByComparator);
	}

	/**
	* Returns the hays sg user datas before and after the current hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param SGUSERID the primary key of the current hays sg user data
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays sg user data
	* @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	*/
	public static HaysSGUserData[] findByFromLocale_PrevAndNext(long SGUSERID,
		java.lang.String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSGUserDataException {
		return getPersistence()
				   .findByFromLocale_PrevAndNext(SGUSERID, FROMLOCALE,
			orderByComparator);
	}

	/**
	* Removes all the hays sg user datas where FROMLOCALE = &#63; from the database.
	*
	* @param FROMLOCALE the fromlocale
	*/
	public static void removeByFromLocale(java.lang.String FROMLOCALE) {
		getPersistence().removeByFromLocale(FROMLOCALE);
	}

	/**
	* Returns the number of hays sg user datas where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @return the number of matching hays sg user datas
	*/
	public static int countByFromLocale(java.lang.String FROMLOCALE) {
		return getPersistence().countByFromLocale(FROMLOCALE);
	}

	/**
	* Caches the hays sg user data in the entity cache if it is enabled.
	*
	* @param haysSGUserData the hays sg user data
	*/
	public static void cacheResult(HaysSGUserData haysSGUserData) {
		getPersistence().cacheResult(haysSGUserData);
	}

	/**
	* Caches the hays sg user datas in the entity cache if it is enabled.
	*
	* @param haysSGUserDatas the hays sg user datas
	*/
	public static void cacheResult(List<HaysSGUserData> haysSGUserDatas) {
		getPersistence().cacheResult(haysSGUserDatas);
	}

	/**
	* Creates a new hays sg user data with the primary key. Does not add the hays sg user data to the database.
	*
	* @param SGUSERID the primary key for the new hays sg user data
	* @return the new hays sg user data
	*/
	public static HaysSGUserData create(long SGUSERID) {
		return getPersistence().create(SGUSERID);
	}

	/**
	* Removes the hays sg user data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGUSERID the primary key of the hays sg user data
	* @return the hays sg user data that was removed
	* @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	*/
	public static HaysSGUserData remove(long SGUSERID)
		throws com.hays.service.salaryguide.exception.NoSuchSGUserDataException {
		return getPersistence().remove(SGUSERID);
	}

	public static HaysSGUserData updateImpl(HaysSGUserData haysSGUserData) {
		return getPersistence().updateImpl(haysSGUserData);
	}

	/**
	* Returns the hays sg user data with the primary key or throws a {@link NoSuchSGUserDataException} if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sg user data
	* @return the hays sg user data
	* @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	*/
	public static HaysSGUserData findByPrimaryKey(long SGUSERID)
		throws com.hays.service.salaryguide.exception.NoSuchSGUserDataException {
		return getPersistence().findByPrimaryKey(SGUSERID);
	}

	/**
	* Returns the hays sg user data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sg user data
	* @return the hays sg user data, or <code>null</code> if a hays sg user data with the primary key could not be found
	*/
	public static HaysSGUserData fetchByPrimaryKey(long SGUSERID) {
		return getPersistence().fetchByPrimaryKey(SGUSERID);
	}

	public static java.util.Map<java.io.Serializable, HaysSGUserData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the hays sg user datas.
	*
	* @return the hays sg user datas
	*/
	public static List<HaysSGUserData> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the hays sg user datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSGUserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays sg user datas
	* @param end the upper bound of the range of hays sg user datas (not inclusive)
	* @return the range of hays sg user datas
	*/
	public static List<HaysSGUserData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the hays sg user datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSGUserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays sg user datas
	* @param end the upper bound of the range of hays sg user datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hays sg user datas
	*/
	public static List<HaysSGUserData> findAll(int start, int end,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hays sg user datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSGUserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays sg user datas
	* @param end the upper bound of the range of hays sg user datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of hays sg user datas
	*/
	public static List<HaysSGUserData> findAll(int start, int end,
		OrderByComparator<HaysSGUserData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the hays sg user datas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of hays sg user datas.
	*
	* @return the number of hays sg user datas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HaysSGUserDataPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HaysSGUserDataPersistence, HaysSGUserDataPersistence> _serviceTracker =
		ServiceTrackerFactory.open(HaysSGUserDataPersistence.class);
}