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

import com.hays.service.salaryguide.model.HaysSalaryGuide;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the hays salary guide service. This utility wraps {@link com.hays.service.salaryguide.service.persistence.impl.HaysSalaryGuidePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalaryGuidePersistence
 * @see com.hays.service.salaryguide.service.persistence.impl.HaysSalaryGuidePersistenceImpl
 * @generated
 */
@ProviderType
public class HaysSalaryGuideUtil {
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
	public static void clearCache(HaysSalaryGuide haysSalaryGuide) {
		getPersistence().clearCache(haysSalaryGuide);
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
	public static List<HaysSalaryGuide> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HaysSalaryGuide> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HaysSalaryGuide> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HaysSalaryGuide update(HaysSalaryGuide haysSalaryGuide) {
		return getPersistence().update(haysSalaryGuide);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HaysSalaryGuide update(HaysSalaryGuide haysSalaryGuide,
		ServiceContext serviceContext) {
		return getPersistence().update(haysSalaryGuide, serviceContext);
	}

	/**
	* Returns all the hays salary guides where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @return the matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY) {
		return getPersistence().findByIndustry(INDUSTRY);
	}

	/**
	* Returns a range of all the hays salary guides where INDUSTRY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param INDUSTRY the industry
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @return the range of matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY, int start, int end) {
		return getPersistence().findByIndustry(INDUSTRY, start, end);
	}

	/**
	* Returns an ordered range of all the hays salary guides where INDUSTRY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param INDUSTRY the industry
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY, int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence()
				   .findByIndustry(INDUSTRY, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hays salary guides where INDUSTRY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param INDUSTRY the industry
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY, int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIndustry(INDUSTRY, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide findByIndustry_First(
		java.lang.String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence().findByIndustry_First(INDUSTRY, orderByComparator);
	}

	/**
	* Returns the first hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide fetchByIndustry_First(
		java.lang.String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence()
				   .fetchByIndustry_First(INDUSTRY, orderByComparator);
	}

	/**
	* Returns the last hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide findByIndustry_Last(
		java.lang.String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence().findByIndustry_Last(INDUSTRY, orderByComparator);
	}

	/**
	* Returns the last hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide fetchByIndustry_Last(
		java.lang.String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence().fetchByIndustry_Last(INDUSTRY, orderByComparator);
	}

	/**
	* Returns the hays salary guides before and after the current hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param SGID the primary key of the current hays salary guide
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays salary guide
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public static HaysSalaryGuide[] findByIndustry_PrevAndNext(
		java.lang.String SGID, java.lang.String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence()
				   .findByIndustry_PrevAndNext(SGID, INDUSTRY, orderByComparator);
	}

	/**
	* Removes all the hays salary guides where INDUSTRY = &#63; from the database.
	*
	* @param INDUSTRY the industry
	*/
	public static void removeByIndustry(java.lang.String INDUSTRY) {
		getPersistence().removeByIndustry(INDUSTRY);
	}

	/**
	* Returns the number of hays salary guides where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @return the number of matching hays salary guides
	*/
	public static int countByIndustry(java.lang.String INDUSTRY) {
		return getPersistence().countByIndustry(INDUSTRY);
	}

	/**
	* Returns all the hays salary guides where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @return the matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE) {
		return getPersistence().findByLocale(SITELOCALE);
	}

	/**
	* Returns a range of all the hays salary guides where SITELOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SITELOCALE the sitelocale
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @return the range of matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE, int start, int end) {
		return getPersistence().findByLocale(SITELOCALE, start, end);
	}

	/**
	* Returns an ordered range of all the hays salary guides where SITELOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SITELOCALE the sitelocale
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE, int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence()
				   .findByLocale(SITELOCALE, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hays salary guides where SITELOCALE = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SITELOCALE the sitelocale
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hays salary guides
	*/
	public static List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE, int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLocale(SITELOCALE, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide findByLocale_First(
		java.lang.String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence().findByLocale_First(SITELOCALE, orderByComparator);
	}

	/**
	* Returns the first hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide fetchByLocale_First(
		java.lang.String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence()
				   .fetchByLocale_First(SITELOCALE, orderByComparator);
	}

	/**
	* Returns the last hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide findByLocale_Last(
		java.lang.String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence().findByLocale_Last(SITELOCALE, orderByComparator);
	}

	/**
	* Returns the last hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public static HaysSalaryGuide fetchByLocale_Last(
		java.lang.String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence().fetchByLocale_Last(SITELOCALE, orderByComparator);
	}

	/**
	* Returns the hays salary guides before and after the current hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SGID the primary key of the current hays salary guide
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays salary guide
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public static HaysSalaryGuide[] findByLocale_PrevAndNext(
		java.lang.String SGID, java.lang.String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence()
				   .findByLocale_PrevAndNext(SGID, SITELOCALE, orderByComparator);
	}

	/**
	* Removes all the hays salary guides where SITELOCALE = &#63; from the database.
	*
	* @param SITELOCALE the sitelocale
	*/
	public static void removeByLocale(java.lang.String SITELOCALE) {
		getPersistence().removeByLocale(SITELOCALE);
	}

	/**
	* Returns the number of hays salary guides where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @return the number of matching hays salary guides
	*/
	public static int countByLocale(java.lang.String SITELOCALE) {
		return getPersistence().countByLocale(SITELOCALE);
	}

	/**
	* Caches the hays salary guide in the entity cache if it is enabled.
	*
	* @param haysSalaryGuide the hays salary guide
	*/
	public static void cacheResult(HaysSalaryGuide haysSalaryGuide) {
		getPersistence().cacheResult(haysSalaryGuide);
	}

	/**
	* Caches the hays salary guides in the entity cache if it is enabled.
	*
	* @param haysSalaryGuides the hays salary guides
	*/
	public static void cacheResult(List<HaysSalaryGuide> haysSalaryGuides) {
		getPersistence().cacheResult(haysSalaryGuides);
	}

	/**
	* Creates a new hays salary guide with the primary key. Does not add the hays salary guide to the database.
	*
	* @param SGID the primary key for the new hays salary guide
	* @return the new hays salary guide
	*/
	public static HaysSalaryGuide create(java.lang.String SGID) {
		return getPersistence().create(SGID);
	}

	/**
	* Removes the hays salary guide with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGID the primary key of the hays salary guide
	* @return the hays salary guide that was removed
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public static HaysSalaryGuide remove(java.lang.String SGID)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence().remove(SGID);
	}

	public static HaysSalaryGuide updateImpl(HaysSalaryGuide haysSalaryGuide) {
		return getPersistence().updateImpl(haysSalaryGuide);
	}

	/**
	* Returns the hays salary guide with the primary key or throws a {@link NoSuchSalaryGuideException} if it could not be found.
	*
	* @param SGID the primary key of the hays salary guide
	* @return the hays salary guide
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public static HaysSalaryGuide findByPrimaryKey(java.lang.String SGID)
		throws com.hays.service.salaryguide.exception.NoSuchSalaryGuideException {
		return getPersistence().findByPrimaryKey(SGID);
	}

	/**
	* Returns the hays salary guide with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SGID the primary key of the hays salary guide
	* @return the hays salary guide, or <code>null</code> if a hays salary guide with the primary key could not be found
	*/
	public static HaysSalaryGuide fetchByPrimaryKey(java.lang.String SGID) {
		return getPersistence().fetchByPrimaryKey(SGID);
	}

	public static java.util.Map<java.io.Serializable, HaysSalaryGuide> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the hays salary guides.
	*
	* @return the hays salary guides
	*/
	public static List<HaysSalaryGuide> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the hays salary guides.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @return the range of hays salary guides
	*/
	public static List<HaysSalaryGuide> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the hays salary guides.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hays salary guides
	*/
	public static List<HaysSalaryGuide> findAll(int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hays salary guides.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hays salary guides
	* @param end the upper bound of the range of hays salary guides (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of hays salary guides
	*/
	public static List<HaysSalaryGuide> findAll(int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the hays salary guides from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of hays salary guides.
	*
	* @return the number of hays salary guides
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HaysSalaryGuidePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HaysSalaryGuidePersistence, HaysSalaryGuidePersistence> _serviceTracker =
		ServiceTrackerFactory.open(HaysSalaryGuidePersistence.class);
}