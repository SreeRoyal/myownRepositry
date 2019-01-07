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

import com.hays.search.form.exception.NoSuchSreeSoluctionsException;
import com.hays.search.form.model.SreeSoluctions;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the sree soluctions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sreenivasulu
 * @see com.hays.search.form.service.persistence.impl.SreeSoluctionsPersistenceImpl
 * @see SreeSoluctionsUtil
 * @generated
 */
@ProviderType
public interface SreeSoluctionsPersistence extends BasePersistence<SreeSoluctions> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SreeSoluctionsUtil} to access the sree soluctions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sree soluctions in the entity cache if it is enabled.
	*
	* @param sreeSoluctions the sree soluctions
	*/
	public void cacheResult(SreeSoluctions sreeSoluctions);

	/**
	* Caches the sree soluctionses in the entity cache if it is enabled.
	*
	* @param sreeSoluctionses the sree soluctionses
	*/
	public void cacheResult(java.util.List<SreeSoluctions> sreeSoluctionses);

	/**
	* Creates a new sree soluctions with the primary key. Does not add the sree soluctions to the database.
	*
	* @param soluctionId the primary key for the new sree soluctions
	* @return the new sree soluctions
	*/
	public SreeSoluctions create(long soluctionId);

	/**
	* Removes the sree soluctions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions that was removed
	* @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	*/
	public SreeSoluctions remove(long soluctionId)
		throws NoSuchSreeSoluctionsException;

	public SreeSoluctions updateImpl(SreeSoluctions sreeSoluctions);

	/**
	* Returns the sree soluctions with the primary key or throws a {@link NoSuchSreeSoluctionsException} if it could not be found.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions
	* @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	*/
	public SreeSoluctions findByPrimaryKey(long soluctionId)
		throws NoSuchSreeSoluctionsException;

	/**
	* Returns the sree soluctions with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param soluctionId the primary key of the sree soluctions
	* @return the sree soluctions, or <code>null</code> if a sree soluctions with the primary key could not be found
	*/
	public SreeSoluctions fetchByPrimaryKey(long soluctionId);

	@Override
	public java.util.Map<java.io.Serializable, SreeSoluctions> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the sree soluctionses.
	*
	* @return the sree soluctionses
	*/
	public java.util.List<SreeSoluctions> findAll();

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
	public java.util.List<SreeSoluctions> findAll(int start, int end);

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
	public java.util.List<SreeSoluctions> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SreeSoluctions> orderByComparator);

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
	public java.util.List<SreeSoluctions> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SreeSoluctions> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the sree soluctionses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of sree soluctionses.
	*
	* @return the number of sree soluctionses
	*/
	public int countAll();
}