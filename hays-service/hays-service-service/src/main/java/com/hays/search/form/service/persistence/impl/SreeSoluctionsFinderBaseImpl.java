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

package com.hays.search.form.service.persistence.impl;

import com.hays.search.form.model.SreeSoluctions;
import com.hays.search.form.service.persistence.SreeSoluctionsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author Sreenivasulu
 * @generated
 */
public class SreeSoluctionsFinderBaseImpl extends BasePersistenceImpl<SreeSoluctions> {
	public SreeSoluctionsFinderBaseImpl() {
		setModelClass(SreeSoluctions.class);
	}

	/**
	 * Returns the sree soluctions persistence.
	 *
	 * @return the sree soluctions persistence
	 */
	public SreeSoluctionsPersistence getSreeSoluctionsPersistence() {
		return sreeSoluctionsPersistence;
	}

	/**
	 * Sets the sree soluctions persistence.
	 *
	 * @param sreeSoluctionsPersistence the sree soluctions persistence
	 */
	public void setSreeSoluctionsPersistence(
		SreeSoluctionsPersistence sreeSoluctionsPersistence) {
		this.sreeSoluctionsPersistence = sreeSoluctionsPersistence;
	}

	@BeanReference(type = SreeSoluctionsPersistence.class)
	protected SreeSoluctionsPersistence sreeSoluctionsPersistence;
}