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

import aQute.bnd.annotation.ProviderType;

import com.hays.search.form.exception.NoSuchSreeSoluctionsException;
import com.hays.search.form.model.SreeSoluctions;
import com.hays.search.form.model.impl.SreeSoluctionsImpl;
import com.hays.search.form.model.impl.SreeSoluctionsModelImpl;
import com.hays.search.form.service.persistence.SreeSoluctionsPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the sree soluctions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sreenivasulu
 * @see SreeSoluctionsPersistence
 * @see com.hays.search.form.service.persistence.SreeSoluctionsUtil
 * @generated
 */
@ProviderType
public class SreeSoluctionsPersistenceImpl extends BasePersistenceImpl<SreeSoluctions>
	implements SreeSoluctionsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SreeSoluctionsUtil} to access the sree soluctions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SreeSoluctionsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
			SreeSoluctionsModelImpl.FINDER_CACHE_ENABLED,
			SreeSoluctionsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
			SreeSoluctionsModelImpl.FINDER_CACHE_ENABLED,
			SreeSoluctionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
			SreeSoluctionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SreeSoluctionsPersistenceImpl() {
		setModelClass(SreeSoluctions.class);
	}

	/**
	 * Caches the sree soluctions in the entity cache if it is enabled.
	 *
	 * @param sreeSoluctions the sree soluctions
	 */
	@Override
	public void cacheResult(SreeSoluctions sreeSoluctions) {
		entityCache.putResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
			SreeSoluctionsImpl.class, sreeSoluctions.getPrimaryKey(),
			sreeSoluctions);

		sreeSoluctions.resetOriginalValues();
	}

	/**
	 * Caches the sree soluctionses in the entity cache if it is enabled.
	 *
	 * @param sreeSoluctionses the sree soluctionses
	 */
	@Override
	public void cacheResult(List<SreeSoluctions> sreeSoluctionses) {
		for (SreeSoluctions sreeSoluctions : sreeSoluctionses) {
			if (entityCache.getResult(
						SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
						SreeSoluctionsImpl.class, sreeSoluctions.getPrimaryKey()) == null) {
				cacheResult(sreeSoluctions);
			}
			else {
				sreeSoluctions.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sree soluctionses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SreeSoluctionsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sree soluctions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SreeSoluctions sreeSoluctions) {
		entityCache.removeResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
			SreeSoluctionsImpl.class, sreeSoluctions.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SreeSoluctions> sreeSoluctionses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SreeSoluctions sreeSoluctions : sreeSoluctionses) {
			entityCache.removeResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
				SreeSoluctionsImpl.class, sreeSoluctions.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sree soluctions with the primary key. Does not add the sree soluctions to the database.
	 *
	 * @param soluctionId the primary key for the new sree soluctions
	 * @return the new sree soluctions
	 */
	@Override
	public SreeSoluctions create(long soluctionId) {
		SreeSoluctions sreeSoluctions = new SreeSoluctionsImpl();

		sreeSoluctions.setNew(true);
		sreeSoluctions.setPrimaryKey(soluctionId);

		return sreeSoluctions;
	}

	/**
	 * Removes the sree soluctions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param soluctionId the primary key of the sree soluctions
	 * @return the sree soluctions that was removed
	 * @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	 */
	@Override
	public SreeSoluctions remove(long soluctionId)
		throws NoSuchSreeSoluctionsException {
		return remove((Serializable)soluctionId);
	}

	/**
	 * Removes the sree soluctions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sree soluctions
	 * @return the sree soluctions that was removed
	 * @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	 */
	@Override
	public SreeSoluctions remove(Serializable primaryKey)
		throws NoSuchSreeSoluctionsException {
		Session session = null;

		try {
			session = openSession();

			SreeSoluctions sreeSoluctions = (SreeSoluctions)session.get(SreeSoluctionsImpl.class,
					primaryKey);

			if (sreeSoluctions == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSreeSoluctionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sreeSoluctions);
		}
		catch (NoSuchSreeSoluctionsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected SreeSoluctions removeImpl(SreeSoluctions sreeSoluctions) {
		sreeSoluctions = toUnwrappedModel(sreeSoluctions);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sreeSoluctions)) {
				sreeSoluctions = (SreeSoluctions)session.get(SreeSoluctionsImpl.class,
						sreeSoluctions.getPrimaryKeyObj());
			}

			if (sreeSoluctions != null) {
				session.delete(sreeSoluctions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sreeSoluctions != null) {
			clearCache(sreeSoluctions);
		}

		return sreeSoluctions;
	}

	@Override
	public SreeSoluctions updateImpl(SreeSoluctions sreeSoluctions) {
		sreeSoluctions = toUnwrappedModel(sreeSoluctions);

		boolean isNew = sreeSoluctions.isNew();

		Session session = null;

		try {
			session = openSession();

			if (sreeSoluctions.isNew()) {
				session.save(sreeSoluctions);

				sreeSoluctions.setNew(false);
			}
			else {
				sreeSoluctions = (SreeSoluctions)session.merge(sreeSoluctions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
			SreeSoluctionsImpl.class, sreeSoluctions.getPrimaryKey(),
			sreeSoluctions, false);

		sreeSoluctions.resetOriginalValues();

		return sreeSoluctions;
	}

	protected SreeSoluctions toUnwrappedModel(SreeSoluctions sreeSoluctions) {
		if (sreeSoluctions instanceof SreeSoluctionsImpl) {
			return sreeSoluctions;
		}

		SreeSoluctionsImpl sreeSoluctionsImpl = new SreeSoluctionsImpl();

		sreeSoluctionsImpl.setNew(sreeSoluctions.isNew());
		sreeSoluctionsImpl.setPrimaryKey(sreeSoluctions.getPrimaryKey());

		sreeSoluctionsImpl.setSoluctionId(sreeSoluctions.getSoluctionId());
		sreeSoluctionsImpl.setBranchId(sreeSoluctions.getBranchId());
		sreeSoluctionsImpl.setBranchAddress(sreeSoluctions.getBranchAddress());
		sreeSoluctionsImpl.setTelephoneNumber(sreeSoluctions.getTelephoneNumber());
		sreeSoluctionsImpl.setOfficeEmailAddress(sreeSoluctions.getOfficeEmailAddress());
		sreeSoluctionsImpl.setEmployeeId(sreeSoluctions.getEmployeeId());

		return sreeSoluctionsImpl;
	}

	/**
	 * Returns the sree soluctions with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sree soluctions
	 * @return the sree soluctions
	 * @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	 */
	@Override
	public SreeSoluctions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSreeSoluctionsException {
		SreeSoluctions sreeSoluctions = fetchByPrimaryKey(primaryKey);

		if (sreeSoluctions == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSreeSoluctionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sreeSoluctions;
	}

	/**
	 * Returns the sree soluctions with the primary key or throws a {@link NoSuchSreeSoluctionsException} if it could not be found.
	 *
	 * @param soluctionId the primary key of the sree soluctions
	 * @return the sree soluctions
	 * @throws NoSuchSreeSoluctionsException if a sree soluctions with the primary key could not be found
	 */
	@Override
	public SreeSoluctions findByPrimaryKey(long soluctionId)
		throws NoSuchSreeSoluctionsException {
		return findByPrimaryKey((Serializable)soluctionId);
	}

	/**
	 * Returns the sree soluctions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sree soluctions
	 * @return the sree soluctions, or <code>null</code> if a sree soluctions with the primary key could not be found
	 */
	@Override
	public SreeSoluctions fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
				SreeSoluctionsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SreeSoluctions sreeSoluctions = (SreeSoluctions)serializable;

		if (sreeSoluctions == null) {
			Session session = null;

			try {
				session = openSession();

				sreeSoluctions = (SreeSoluctions)session.get(SreeSoluctionsImpl.class,
						primaryKey);

				if (sreeSoluctions != null) {
					cacheResult(sreeSoluctions);
				}
				else {
					entityCache.putResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
						SreeSoluctionsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
					SreeSoluctionsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sreeSoluctions;
	}

	/**
	 * Returns the sree soluctions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param soluctionId the primary key of the sree soluctions
	 * @return the sree soluctions, or <code>null</code> if a sree soluctions with the primary key could not be found
	 */
	@Override
	public SreeSoluctions fetchByPrimaryKey(long soluctionId) {
		return fetchByPrimaryKey((Serializable)soluctionId);
	}

	@Override
	public Map<Serializable, SreeSoluctions> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SreeSoluctions> map = new HashMap<Serializable, SreeSoluctions>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SreeSoluctions sreeSoluctions = fetchByPrimaryKey(primaryKey);

			if (sreeSoluctions != null) {
				map.put(primaryKey, sreeSoluctions);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
					SreeSoluctionsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SreeSoluctions)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SREESOLUCTIONS_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (SreeSoluctions sreeSoluctions : (List<SreeSoluctions>)q.list()) {
				map.put(sreeSoluctions.getPrimaryKeyObj(), sreeSoluctions);

				cacheResult(sreeSoluctions);

				uncachedPrimaryKeys.remove(sreeSoluctions.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SreeSoluctionsModelImpl.ENTITY_CACHE_ENABLED,
					SreeSoluctionsImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the sree soluctionses.
	 *
	 * @return the sree soluctionses
	 */
	@Override
	public List<SreeSoluctions> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<SreeSoluctions> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<SreeSoluctions> findAll(int start, int end,
		OrderByComparator<SreeSoluctions> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<SreeSoluctions> findAll(int start, int end,
		OrderByComparator<SreeSoluctions> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<SreeSoluctions> list = null;

		if (retrieveFromCache) {
			list = (List<SreeSoluctions>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SREESOLUCTIONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SREESOLUCTIONS;

				if (pagination) {
					sql = sql.concat(SreeSoluctionsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SreeSoluctions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SreeSoluctions>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the sree soluctionses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SreeSoluctions sreeSoluctions : findAll()) {
			remove(sreeSoluctions);
		}
	}

	/**
	 * Returns the number of sree soluctionses.
	 *
	 * @return the number of sree soluctionses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SREESOLUCTIONS);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SreeSoluctionsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sree soluctions persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SreeSoluctionsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SREESOLUCTIONS = "SELECT sreeSoluctions FROM SreeSoluctions sreeSoluctions";
	private static final String _SQL_SELECT_SREESOLUCTIONS_WHERE_PKS_IN = "SELECT sreeSoluctions FROM SreeSoluctions sreeSoluctions WHERE soluctionId IN (";
	private static final String _SQL_COUNT_SREESOLUCTIONS = "SELECT COUNT(sreeSoluctions) FROM SreeSoluctions sreeSoluctions";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sreeSoluctions.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SreeSoluctions exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(SreeSoluctionsPersistenceImpl.class);
}