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

import com.hays.service.salaryguide.exception.NoSuchSalaryGuideException;
import com.hays.service.salaryguide.model.HaysSalaryGuide;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the hays salary guide service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.persistence.impl.HaysSalaryGuidePersistenceImpl
 * @see HaysSalaryGuideUtil
 * @generated
 */
@ProviderType
public interface HaysSalaryGuidePersistence extends BasePersistence<HaysSalaryGuide> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HaysSalaryGuideUtil} to access the hays salary guide persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the hays salary guides where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @return the matching hays salary guides
	*/
	public java.util.List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY);

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
	public java.util.List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY, int start, int end);

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
	public java.util.List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator);

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
	public java.util.List<HaysSalaryGuide> findByIndustry(
		java.lang.String INDUSTRY, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide findByIndustry_First(java.lang.String INDUSTRY,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException;

	/**
	* Returns the first hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide fetchByIndustry_First(java.lang.String INDUSTRY,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator);

	/**
	* Returns the last hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide findByIndustry_Last(java.lang.String INDUSTRY,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException;

	/**
	* Returns the last hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide fetchByIndustry_Last(java.lang.String INDUSTRY,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator);

	/**
	* Returns the hays salary guides before and after the current hays salary guide in the ordered set where INDUSTRY = &#63;.
	*
	* @param SGID the primary key of the current hays salary guide
	* @param INDUSTRY the industry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays salary guide
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public HaysSalaryGuide[] findByIndustry_PrevAndNext(java.lang.String SGID,
		java.lang.String INDUSTRY,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException;

	/**
	* Removes all the hays salary guides where INDUSTRY = &#63; from the database.
	*
	* @param INDUSTRY the industry
	*/
	public void removeByIndustry(java.lang.String INDUSTRY);

	/**
	* Returns the number of hays salary guides where INDUSTRY = &#63;.
	*
	* @param INDUSTRY the industry
	* @return the number of matching hays salary guides
	*/
	public int countByIndustry(java.lang.String INDUSTRY);

	/**
	* Returns all the hays salary guides where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @return the matching hays salary guides
	*/
	public java.util.List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE);

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
	public java.util.List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE, int start, int end);

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
	public java.util.List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator);

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
	public java.util.List<HaysSalaryGuide> findByLocale(
		java.lang.String SITELOCALE, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide findByLocale_First(java.lang.String SITELOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException;

	/**
	* Returns the first hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide fetchByLocale_First(java.lang.String SITELOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator);

	/**
	* Returns the last hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide
	* @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide findByLocale_Last(java.lang.String SITELOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException;

	/**
	* Returns the last hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	*/
	public HaysSalaryGuide fetchByLocale_Last(java.lang.String SITELOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator);

	/**
	* Returns the hays salary guides before and after the current hays salary guide in the ordered set where SITELOCALE = &#63;.
	*
	* @param SGID the primary key of the current hays salary guide
	* @param SITELOCALE the sitelocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays salary guide
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public HaysSalaryGuide[] findByLocale_PrevAndNext(java.lang.String SGID,
		java.lang.String SITELOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException;

	/**
	* Removes all the hays salary guides where SITELOCALE = &#63; from the database.
	*
	* @param SITELOCALE the sitelocale
	*/
	public void removeByLocale(java.lang.String SITELOCALE);

	/**
	* Returns the number of hays salary guides where SITELOCALE = &#63;.
	*
	* @param SITELOCALE the sitelocale
	* @return the number of matching hays salary guides
	*/
	public int countByLocale(java.lang.String SITELOCALE);

	/**
	* Caches the hays salary guide in the entity cache if it is enabled.
	*
	* @param haysSalaryGuide the hays salary guide
	*/
	public void cacheResult(HaysSalaryGuide haysSalaryGuide);

	/**
	* Caches the hays salary guides in the entity cache if it is enabled.
	*
	* @param haysSalaryGuides the hays salary guides
	*/
	public void cacheResult(java.util.List<HaysSalaryGuide> haysSalaryGuides);

	/**
	* Creates a new hays salary guide with the primary key. Does not add the hays salary guide to the database.
	*
	* @param SGID the primary key for the new hays salary guide
	* @return the new hays salary guide
	*/
	public HaysSalaryGuide create(java.lang.String SGID);

	/**
	* Removes the hays salary guide with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGID the primary key of the hays salary guide
	* @return the hays salary guide that was removed
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public HaysSalaryGuide remove(java.lang.String SGID)
		throws NoSuchSalaryGuideException;

	public HaysSalaryGuide updateImpl(HaysSalaryGuide haysSalaryGuide);

	/**
	* Returns the hays salary guide with the primary key or throws a {@link NoSuchSalaryGuideException} if it could not be found.
	*
	* @param SGID the primary key of the hays salary guide
	* @return the hays salary guide
	* @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	*/
	public HaysSalaryGuide findByPrimaryKey(java.lang.String SGID)
		throws NoSuchSalaryGuideException;

	/**
	* Returns the hays salary guide with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SGID the primary key of the hays salary guide
	* @return the hays salary guide, or <code>null</code> if a hays salary guide with the primary key could not be found
	*/
	public HaysSalaryGuide fetchByPrimaryKey(java.lang.String SGID);

	@Override
	public java.util.Map<java.io.Serializable, HaysSalaryGuide> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the hays salary guides.
	*
	* @return the hays salary guides
	*/
	public java.util.List<HaysSalaryGuide> findAll();

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
	public java.util.List<HaysSalaryGuide> findAll(int start, int end);

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
	public java.util.List<HaysSalaryGuide> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator);

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
	public java.util.List<HaysSalaryGuide> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the hays salary guides from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of hays salary guides.
	*
	* @return the number of hays salary guides
	*/
	public int countAll();
}