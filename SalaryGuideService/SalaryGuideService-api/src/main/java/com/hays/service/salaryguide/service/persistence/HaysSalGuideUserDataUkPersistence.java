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

import com.hays.service.salaryguide.exception.NoSuchSalGuideUserDataUkException;
import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the hays sal guide user data uk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.persistence.impl.HaysSalGuideUserDataUkPersistenceImpl
 * @see HaysSalGuideUserDataUkUtil
 * @generated
 */
@ProviderType
public interface HaysSalGuideUserDataUkPersistence extends BasePersistence<HaysSalGuideUserDataUk> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HaysSalGuideUserDataUkUtil} to access the hays sal guide user data uk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the hays sal guide user data uks where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @return the matching hays sal guide user data uks
	*/
	public java.util.List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE);

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
	public java.util.List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE, int start, int end);

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
	public java.util.List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator);

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
	public java.util.List<HaysSalGuideUserDataUk> findBySiteLocale(
		java.lang.String SGFROMLOCALE, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a matching hays sal guide user data uk could not be found
	*/
	public HaysSalGuideUserDataUk findBySiteLocale_First(
		java.lang.String SGFROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws NoSuchSalGuideUserDataUkException;

	/**
	* Returns the first hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sal guide user data uk, or <code>null</code> if a matching hays sal guide user data uk could not be found
	*/
	public HaysSalGuideUserDataUk fetchBySiteLocale_First(
		java.lang.String SGFROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator);

	/**
	* Returns the last hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a matching hays sal guide user data uk could not be found
	*/
	public HaysSalGuideUserDataUk findBySiteLocale_Last(
		java.lang.String SGFROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws NoSuchSalGuideUserDataUkException;

	/**
	* Returns the last hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sal guide user data uk, or <code>null</code> if a matching hays sal guide user data uk could not be found
	*/
	public HaysSalGuideUserDataUk fetchBySiteLocale_Last(
		java.lang.String SGFROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator);

	/**
	* Returns the hays sal guide user data uks before and after the current hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	*
	* @param SGUSERID the primary key of the current hays sal guide user data uk
	* @param SGFROMLOCALE the sgfromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	*/
	public HaysSalGuideUserDataUk[] findBySiteLocale_PrevAndNext(
		long SGUSERID, java.lang.String SGFROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws NoSuchSalGuideUserDataUkException;

	/**
	* Removes all the hays sal guide user data uks where SGFROMLOCALE = &#63; from the database.
	*
	* @param SGFROMLOCALE the sgfromlocale
	*/
	public void removeBySiteLocale(java.lang.String SGFROMLOCALE);

	/**
	* Returns the number of hays sal guide user data uks where SGFROMLOCALE = &#63;.
	*
	* @param SGFROMLOCALE the sgfromlocale
	* @return the number of matching hays sal guide user data uks
	*/
	public int countBySiteLocale(java.lang.String SGFROMLOCALE);

	/**
	* Caches the hays sal guide user data uk in the entity cache if it is enabled.
	*
	* @param haysSalGuideUserDataUk the hays sal guide user data uk
	*/
	public void cacheResult(HaysSalGuideUserDataUk haysSalGuideUserDataUk);

	/**
	* Caches the hays sal guide user data uks in the entity cache if it is enabled.
	*
	* @param haysSalGuideUserDataUks the hays sal guide user data uks
	*/
	public void cacheResult(
		java.util.List<HaysSalGuideUserDataUk> haysSalGuideUserDataUks);

	/**
	* Creates a new hays sal guide user data uk with the primary key. Does not add the hays sal guide user data uk to the database.
	*
	* @param SGUSERID the primary key for the new hays sal guide user data uk
	* @return the new hays sal guide user data uk
	*/
	public HaysSalGuideUserDataUk create(long SGUSERID);

	/**
	* Removes the hays sal guide user data uk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk that was removed
	* @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	*/
	public HaysSalGuideUserDataUk remove(long SGUSERID)
		throws NoSuchSalGuideUserDataUkException;

	public HaysSalGuideUserDataUk updateImpl(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk);

	/**
	* Returns the hays sal guide user data uk with the primary key or throws a {@link NoSuchSalGuideUserDataUkException} if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk
	* @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	*/
	public HaysSalGuideUserDataUk findByPrimaryKey(long SGUSERID)
		throws NoSuchSalGuideUserDataUkException;

	/**
	* Returns the hays sal guide user data uk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sal guide user data uk
	* @return the hays sal guide user data uk, or <code>null</code> if a hays sal guide user data uk with the primary key could not be found
	*/
	public HaysSalGuideUserDataUk fetchByPrimaryKey(long SGUSERID);

	@Override
	public java.util.Map<java.io.Serializable, HaysSalGuideUserDataUk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the hays sal guide user data uks.
	*
	* @return the hays sal guide user data uks
	*/
	public java.util.List<HaysSalGuideUserDataUk> findAll();

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
	public java.util.List<HaysSalGuideUserDataUk> findAll(int start, int end);

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
	public java.util.List<HaysSalGuideUserDataUk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator);

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
	public java.util.List<HaysSalGuideUserDataUk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSalGuideUserDataUk> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the hays sal guide user data uks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of hays sal guide user data uks.
	*
	* @return the number of hays sal guide user data uks
	*/
	public int countAll();
}