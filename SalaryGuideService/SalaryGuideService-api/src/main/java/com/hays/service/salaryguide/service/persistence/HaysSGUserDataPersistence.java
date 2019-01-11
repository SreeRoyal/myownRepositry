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

import com.hays.service.salaryguide.exception.NoSuchSGUserDataException;
import com.hays.service.salaryguide.model.HaysSGUserData;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the hays sg user data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.persistence.impl.HaysSGUserDataPersistenceImpl
 * @see HaysSGUserDataUtil
 * @generated
 */
@ProviderType
public interface HaysSGUserDataPersistence extends BasePersistence<HaysSGUserData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HaysSGUserDataUtil} to access the hays sg user data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the hays sg user datas where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @return the matching hays sg user datas
	*/
	public java.util.List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE);

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
	public java.util.List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE, int start, int end);

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
	public java.util.List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator);

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
	public java.util.List<HaysSGUserData> findByFromLocale(
		java.lang.String FROMLOCALE, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sg user data
	* @throws NoSuchSGUserDataException if a matching hays sg user data could not be found
	*/
	public HaysSGUserData findByFromLocale_First(java.lang.String FROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator)
		throws NoSuchSGUserDataException;

	/**
	* Returns the first hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hays sg user data, or <code>null</code> if a matching hays sg user data could not be found
	*/
	public HaysSGUserData fetchByFromLocale_First(java.lang.String FROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator);

	/**
	* Returns the last hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sg user data
	* @throws NoSuchSGUserDataException if a matching hays sg user data could not be found
	*/
	public HaysSGUserData findByFromLocale_Last(java.lang.String FROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator)
		throws NoSuchSGUserDataException;

	/**
	* Returns the last hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hays sg user data, or <code>null</code> if a matching hays sg user data could not be found
	*/
	public HaysSGUserData fetchByFromLocale_Last(java.lang.String FROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator);

	/**
	* Returns the hays sg user datas before and after the current hays sg user data in the ordered set where FROMLOCALE = &#63;.
	*
	* @param SGUSERID the primary key of the current hays sg user data
	* @param FROMLOCALE the fromlocale
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hays sg user data
	* @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	*/
	public HaysSGUserData[] findByFromLocale_PrevAndNext(long SGUSERID,
		java.lang.String FROMLOCALE,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator)
		throws NoSuchSGUserDataException;

	/**
	* Removes all the hays sg user datas where FROMLOCALE = &#63; from the database.
	*
	* @param FROMLOCALE the fromlocale
	*/
	public void removeByFromLocale(java.lang.String FROMLOCALE);

	/**
	* Returns the number of hays sg user datas where FROMLOCALE = &#63;.
	*
	* @param FROMLOCALE the fromlocale
	* @return the number of matching hays sg user datas
	*/
	public int countByFromLocale(java.lang.String FROMLOCALE);

	/**
	* Caches the hays sg user data in the entity cache if it is enabled.
	*
	* @param haysSGUserData the hays sg user data
	*/
	public void cacheResult(HaysSGUserData haysSGUserData);

	/**
	* Caches the hays sg user datas in the entity cache if it is enabled.
	*
	* @param haysSGUserDatas the hays sg user datas
	*/
	public void cacheResult(java.util.List<HaysSGUserData> haysSGUserDatas);

	/**
	* Creates a new hays sg user data with the primary key. Does not add the hays sg user data to the database.
	*
	* @param SGUSERID the primary key for the new hays sg user data
	* @return the new hays sg user data
	*/
	public HaysSGUserData create(long SGUSERID);

	/**
	* Removes the hays sg user data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SGUSERID the primary key of the hays sg user data
	* @return the hays sg user data that was removed
	* @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	*/
	public HaysSGUserData remove(long SGUSERID)
		throws NoSuchSGUserDataException;

	public HaysSGUserData updateImpl(HaysSGUserData haysSGUserData);

	/**
	* Returns the hays sg user data with the primary key or throws a {@link NoSuchSGUserDataException} if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sg user data
	* @return the hays sg user data
	* @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	*/
	public HaysSGUserData findByPrimaryKey(long SGUSERID)
		throws NoSuchSGUserDataException;

	/**
	* Returns the hays sg user data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SGUSERID the primary key of the hays sg user data
	* @return the hays sg user data, or <code>null</code> if a hays sg user data with the primary key could not be found
	*/
	public HaysSGUserData fetchByPrimaryKey(long SGUSERID);

	@Override
	public java.util.Map<java.io.Serializable, HaysSGUserData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the hays sg user datas.
	*
	* @return the hays sg user datas
	*/
	public java.util.List<HaysSGUserData> findAll();

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
	public java.util.List<HaysSGUserData> findAll(int start, int end);

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
	public java.util.List<HaysSGUserData> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator);

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
	public java.util.List<HaysSGUserData> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HaysSGUserData> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the hays sg user datas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of hays sg user datas.
	*
	* @return the number of hays sg user datas
	*/
	public int countAll();
}