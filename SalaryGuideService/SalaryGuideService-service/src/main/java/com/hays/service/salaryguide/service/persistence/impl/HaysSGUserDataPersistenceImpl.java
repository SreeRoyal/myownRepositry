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

package com.hays.service.salaryguide.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.hays.service.salaryguide.exception.NoSuchSGUserDataException;
import com.hays.service.salaryguide.model.HaysSGUserData;
import com.hays.service.salaryguide.model.impl.HaysSGUserDataImpl;
import com.hays.service.salaryguide.model.impl.HaysSGUserDataModelImpl;
import com.hays.service.salaryguide.service.persistence.HaysSGUserDataPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the hays sg user data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSGUserDataPersistence
 * @see com.hays.service.salaryguide.service.persistence.HaysSGUserDataUtil
 * @generated
 */
@ProviderType
public class HaysSGUserDataPersistenceImpl extends BasePersistenceImpl<HaysSGUserData>
	implements HaysSGUserDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HaysSGUserDataUtil} to access the hays sg user data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HaysSGUserDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataModelImpl.FINDER_CACHE_ENABLED,
			HaysSGUserDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataModelImpl.FINDER_CACHE_ENABLED,
			HaysSGUserDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FROMLOCALE =
		new FinderPath(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataModelImpl.FINDER_CACHE_ENABLED,
			HaysSGUserDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByFromLocale",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FROMLOCALE =
		new FinderPath(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataModelImpl.FINDER_CACHE_ENABLED,
			HaysSGUserDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFromLocale",
			new String[] { String.class.getName() },
			HaysSGUserDataModelImpl.FROMLOCALE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FROMLOCALE = new FinderPath(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFromLocale",
			new String[] { String.class.getName() });

	/**
	 * Returns all the hays sg user datas where FROMLOCALE = &#63;.
	 *
	 * @param FROMLOCALE the fromlocale
	 * @return the matching hays sg user datas
	 */
	@Override
	public List<HaysSGUserData> findByFromLocale(String FROMLOCALE) {
		return findByFromLocale(FROMLOCALE, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<HaysSGUserData> findByFromLocale(String FROMLOCALE, int start,
		int end) {
		return findByFromLocale(FROMLOCALE, start, end, null);
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
	@Override
	public List<HaysSGUserData> findByFromLocale(String FROMLOCALE, int start,
		int end, OrderByComparator<HaysSGUserData> orderByComparator) {
		return findByFromLocale(FROMLOCALE, start, end, orderByComparator, true);
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
	@Override
	public List<HaysSGUserData> findByFromLocale(String FROMLOCALE, int start,
		int end, OrderByComparator<HaysSGUserData> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FROMLOCALE;
			finderArgs = new Object[] { FROMLOCALE };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FROMLOCALE;
			finderArgs = new Object[] { FROMLOCALE, start, end, orderByComparator };
		}

		List<HaysSGUserData> list = null;

		if (retrieveFromCache) {
			list = (List<HaysSGUserData>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HaysSGUserData haysSGUserData : list) {
					if (!Objects.equals(FROMLOCALE,
								haysSGUserData.getFROMLOCALE())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_HAYSSGUSERDATA_WHERE);

			boolean bindFROMLOCALE = false;

			if (FROMLOCALE == null) {
				query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_1);
			}
			else if (FROMLOCALE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_3);
			}
			else {
				bindFROMLOCALE = true;

				query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HaysSGUserDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFROMLOCALE) {
					qPos.add(FROMLOCALE);
				}

				if (!pagination) {
					list = (List<HaysSGUserData>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HaysSGUserData>)QueryUtil.list(q,
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
	 * Returns the first hays sg user data in the ordered set where FROMLOCALE = &#63;.
	 *
	 * @param FROMLOCALE the fromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays sg user data
	 * @throws NoSuchSGUserDataException if a matching hays sg user data could not be found
	 */
	@Override
	public HaysSGUserData findByFromLocale_First(String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator)
		throws NoSuchSGUserDataException {
		HaysSGUserData haysSGUserData = fetchByFromLocale_First(FROMLOCALE,
				orderByComparator);

		if (haysSGUserData != null) {
			return haysSGUserData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FROMLOCALE=");
		msg.append(FROMLOCALE);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSGUserDataException(msg.toString());
	}

	/**
	 * Returns the first hays sg user data in the ordered set where FROMLOCALE = &#63;.
	 *
	 * @param FROMLOCALE the fromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays sg user data, or <code>null</code> if a matching hays sg user data could not be found
	 */
	@Override
	public HaysSGUserData fetchByFromLocale_First(String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		List<HaysSGUserData> list = findByFromLocale(FROMLOCALE, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hays sg user data in the ordered set where FROMLOCALE = &#63;.
	 *
	 * @param FROMLOCALE the fromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays sg user data
	 * @throws NoSuchSGUserDataException if a matching hays sg user data could not be found
	 */
	@Override
	public HaysSGUserData findByFromLocale_Last(String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator)
		throws NoSuchSGUserDataException {
		HaysSGUserData haysSGUserData = fetchByFromLocale_Last(FROMLOCALE,
				orderByComparator);

		if (haysSGUserData != null) {
			return haysSGUserData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FROMLOCALE=");
		msg.append(FROMLOCALE);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSGUserDataException(msg.toString());
	}

	/**
	 * Returns the last hays sg user data in the ordered set where FROMLOCALE = &#63;.
	 *
	 * @param FROMLOCALE the fromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays sg user data, or <code>null</code> if a matching hays sg user data could not be found
	 */
	@Override
	public HaysSGUserData fetchByFromLocale_Last(String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		int count = countByFromLocale(FROMLOCALE);

		if (count == 0) {
			return null;
		}

		List<HaysSGUserData> list = findByFromLocale(FROMLOCALE, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HaysSGUserData[] findByFromLocale_PrevAndNext(long SGUSERID,
		String FROMLOCALE, OrderByComparator<HaysSGUserData> orderByComparator)
		throws NoSuchSGUserDataException {
		HaysSGUserData haysSGUserData = findByPrimaryKey(SGUSERID);

		Session session = null;

		try {
			session = openSession();

			HaysSGUserData[] array = new HaysSGUserDataImpl[3];

			array[0] = getByFromLocale_PrevAndNext(session, haysSGUserData,
					FROMLOCALE, orderByComparator, true);

			array[1] = haysSGUserData;

			array[2] = getByFromLocale_PrevAndNext(session, haysSGUserData,
					FROMLOCALE, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HaysSGUserData getByFromLocale_PrevAndNext(Session session,
		HaysSGUserData haysSGUserData, String FROMLOCALE,
		OrderByComparator<HaysSGUserData> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HAYSSGUSERDATA_WHERE);

		boolean bindFROMLOCALE = false;

		if (FROMLOCALE == null) {
			query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_1);
		}
		else if (FROMLOCALE.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_3);
		}
		else {
			bindFROMLOCALE = true;

			query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(HaysSGUserDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFROMLOCALE) {
			qPos.add(FROMLOCALE);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(haysSGUserData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HaysSGUserData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hays sg user datas where FROMLOCALE = &#63; from the database.
	 *
	 * @param FROMLOCALE the fromlocale
	 */
	@Override
	public void removeByFromLocale(String FROMLOCALE) {
		for (HaysSGUserData haysSGUserData : findByFromLocale(FROMLOCALE,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(haysSGUserData);
		}
	}

	/**
	 * Returns the number of hays sg user datas where FROMLOCALE = &#63;.
	 *
	 * @param FROMLOCALE the fromlocale
	 * @return the number of matching hays sg user datas
	 */
	@Override
	public int countByFromLocale(String FROMLOCALE) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FROMLOCALE;

		Object[] finderArgs = new Object[] { FROMLOCALE };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HAYSSGUSERDATA_WHERE);

			boolean bindFROMLOCALE = false;

			if (FROMLOCALE == null) {
				query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_1);
			}
			else if (FROMLOCALE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_3);
			}
			else {
				bindFROMLOCALE = true;

				query.append(_FINDER_COLUMN_FROMLOCALE_FROMLOCALE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFROMLOCALE) {
					qPos.add(FROMLOCALE);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FROMLOCALE_FROMLOCALE_1 = "haysSGUserData.FROMLOCALE IS NULL";
	private static final String _FINDER_COLUMN_FROMLOCALE_FROMLOCALE_2 = "haysSGUserData.FROMLOCALE = ?";
	private static final String _FINDER_COLUMN_FROMLOCALE_FROMLOCALE_3 = "(haysSGUserData.FROMLOCALE IS NULL OR haysSGUserData.FROMLOCALE = '')";

	public HaysSGUserDataPersistenceImpl() {
		setModelClass(HaysSGUserData.class);
	}

	/**
	 * Caches the hays sg user data in the entity cache if it is enabled.
	 *
	 * @param haysSGUserData the hays sg user data
	 */
	@Override
	public void cacheResult(HaysSGUserData haysSGUserData) {
		entityCache.putResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataImpl.class, haysSGUserData.getPrimaryKey(),
			haysSGUserData);

		haysSGUserData.resetOriginalValues();
	}

	/**
	 * Caches the hays sg user datas in the entity cache if it is enabled.
	 *
	 * @param haysSGUserDatas the hays sg user datas
	 */
	@Override
	public void cacheResult(List<HaysSGUserData> haysSGUserDatas) {
		for (HaysSGUserData haysSGUserData : haysSGUserDatas) {
			if (entityCache.getResult(
						HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
						HaysSGUserDataImpl.class, haysSGUserData.getPrimaryKey()) == null) {
				cacheResult(haysSGUserData);
			}
			else {
				haysSGUserData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all hays sg user datas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HaysSGUserDataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the hays sg user data.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HaysSGUserData haysSGUserData) {
		entityCache.removeResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataImpl.class, haysSGUserData.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HaysSGUserData> haysSGUserDatas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HaysSGUserData haysSGUserData : haysSGUserDatas) {
			entityCache.removeResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
				HaysSGUserDataImpl.class, haysSGUserData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new hays sg user data with the primary key. Does not add the hays sg user data to the database.
	 *
	 * @param SGUSERID the primary key for the new hays sg user data
	 * @return the new hays sg user data
	 */
	@Override
	public HaysSGUserData create(long SGUSERID) {
		HaysSGUserData haysSGUserData = new HaysSGUserDataImpl();

		haysSGUserData.setNew(true);
		haysSGUserData.setPrimaryKey(SGUSERID);

		return haysSGUserData;
	}

	/**
	 * Removes the hays sg user data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SGUSERID the primary key of the hays sg user data
	 * @return the hays sg user data that was removed
	 * @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	 */
	@Override
	public HaysSGUserData remove(long SGUSERID)
		throws NoSuchSGUserDataException {
		return remove((Serializable)SGUSERID);
	}

	/**
	 * Removes the hays sg user data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hays sg user data
	 * @return the hays sg user data that was removed
	 * @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	 */
	@Override
	public HaysSGUserData remove(Serializable primaryKey)
		throws NoSuchSGUserDataException {
		Session session = null;

		try {
			session = openSession();

			HaysSGUserData haysSGUserData = (HaysSGUserData)session.get(HaysSGUserDataImpl.class,
					primaryKey);

			if (haysSGUserData == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSGUserDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(haysSGUserData);
		}
		catch (NoSuchSGUserDataException nsee) {
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
	protected HaysSGUserData removeImpl(HaysSGUserData haysSGUserData) {
		haysSGUserData = toUnwrappedModel(haysSGUserData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(haysSGUserData)) {
				haysSGUserData = (HaysSGUserData)session.get(HaysSGUserDataImpl.class,
						haysSGUserData.getPrimaryKeyObj());
			}

			if (haysSGUserData != null) {
				session.delete(haysSGUserData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (haysSGUserData != null) {
			clearCache(haysSGUserData);
		}

		return haysSGUserData;
	}

	@Override
	public HaysSGUserData updateImpl(HaysSGUserData haysSGUserData) {
		haysSGUserData = toUnwrappedModel(haysSGUserData);

		boolean isNew = haysSGUserData.isNew();

		HaysSGUserDataModelImpl haysSGUserDataModelImpl = (HaysSGUserDataModelImpl)haysSGUserData;

		Session session = null;

		try {
			session = openSession();

			if (haysSGUserData.isNew()) {
				session.save(haysSGUserData);

				haysSGUserData.setNew(false);
			}
			else {
				haysSGUserData = (HaysSGUserData)session.merge(haysSGUserData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!HaysSGUserDataModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { haysSGUserDataModelImpl.getFROMLOCALE() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FROMLOCALE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FROMLOCALE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((haysSGUserDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FROMLOCALE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						haysSGUserDataModelImpl.getOriginalFROMLOCALE()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FROMLOCALE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FROMLOCALE,
					args);

				args = new Object[] { haysSGUserDataModelImpl.getFROMLOCALE() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FROMLOCALE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FROMLOCALE,
					args);
			}
		}

		entityCache.putResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
			HaysSGUserDataImpl.class, haysSGUserData.getPrimaryKey(),
			haysSGUserData, false);

		haysSGUserData.resetOriginalValues();

		return haysSGUserData;
	}

	protected HaysSGUserData toUnwrappedModel(HaysSGUserData haysSGUserData) {
		if (haysSGUserData instanceof HaysSGUserDataImpl) {
			return haysSGUserData;
		}

		HaysSGUserDataImpl haysSGUserDataImpl = new HaysSGUserDataImpl();

		haysSGUserDataImpl.setNew(haysSGUserData.isNew());
		haysSGUserDataImpl.setPrimaryKey(haysSGUserData.getPrimaryKey());

		haysSGUserDataImpl.setSGUSERID(haysSGUserData.getSGUSERID());
		haysSGUserDataImpl.setSGUSERNAME(haysSGUserData.getSGUSERNAME());
		haysSGUserDataImpl.setSGJOBTITLE(haysSGUserData.getSGJOBTITLE());
		haysSGUserDataImpl.setSGORGANIZATION(haysSGUserData.getSGORGANIZATION());
		haysSGUserDataImpl.setSGLOCATION(haysSGUserData.getSGLOCATION());
		haysSGUserDataImpl.setSGEMAILADDRESS(haysSGUserData.getSGEMAILADDRESS());
		haysSGUserDataImpl.setFROMLOCALE(haysSGUserData.getFROMLOCALE());
		haysSGUserDataImpl.setCREATETIMESTAMP(haysSGUserData.getCREATETIMESTAMP());

		return haysSGUserDataImpl;
	}

	/**
	 * Returns the hays sg user data with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the hays sg user data
	 * @return the hays sg user data
	 * @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	 */
	@Override
	public HaysSGUserData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSGUserDataException {
		HaysSGUserData haysSGUserData = fetchByPrimaryKey(primaryKey);

		if (haysSGUserData == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSGUserDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return haysSGUserData;
	}

	/**
	 * Returns the hays sg user data with the primary key or throws a {@link NoSuchSGUserDataException} if it could not be found.
	 *
	 * @param SGUSERID the primary key of the hays sg user data
	 * @return the hays sg user data
	 * @throws NoSuchSGUserDataException if a hays sg user data with the primary key could not be found
	 */
	@Override
	public HaysSGUserData findByPrimaryKey(long SGUSERID)
		throws NoSuchSGUserDataException {
		return findByPrimaryKey((Serializable)SGUSERID);
	}

	/**
	 * Returns the hays sg user data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hays sg user data
	 * @return the hays sg user data, or <code>null</code> if a hays sg user data with the primary key could not be found
	 */
	@Override
	public HaysSGUserData fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
				HaysSGUserDataImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		HaysSGUserData haysSGUserData = (HaysSGUserData)serializable;

		if (haysSGUserData == null) {
			Session session = null;

			try {
				session = openSession();

				haysSGUserData = (HaysSGUserData)session.get(HaysSGUserDataImpl.class,
						primaryKey);

				if (haysSGUserData != null) {
					cacheResult(haysSGUserData);
				}
				else {
					entityCache.putResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
						HaysSGUserDataImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
					HaysSGUserDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return haysSGUserData;
	}

	/**
	 * Returns the hays sg user data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SGUSERID the primary key of the hays sg user data
	 * @return the hays sg user data, or <code>null</code> if a hays sg user data with the primary key could not be found
	 */
	@Override
	public HaysSGUserData fetchByPrimaryKey(long SGUSERID) {
		return fetchByPrimaryKey((Serializable)SGUSERID);
	}

	@Override
	public Map<Serializable, HaysSGUserData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, HaysSGUserData> map = new HashMap<Serializable, HaysSGUserData>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			HaysSGUserData haysSGUserData = fetchByPrimaryKey(primaryKey);

			if (haysSGUserData != null) {
				map.put(primaryKey, haysSGUserData);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
					HaysSGUserDataImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (HaysSGUserData)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_HAYSSGUSERDATA_WHERE_PKS_IN);

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

			for (HaysSGUserData haysSGUserData : (List<HaysSGUserData>)q.list()) {
				map.put(haysSGUserData.getPrimaryKeyObj(), haysSGUserData);

				cacheResult(haysSGUserData);

				uncachedPrimaryKeys.remove(haysSGUserData.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(HaysSGUserDataModelImpl.ENTITY_CACHE_ENABLED,
					HaysSGUserDataImpl.class, primaryKey, nullModel);
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
	 * Returns all the hays sg user datas.
	 *
	 * @return the hays sg user datas
	 */
	@Override
	public List<HaysSGUserData> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<HaysSGUserData> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<HaysSGUserData> findAll(int start, int end,
		OrderByComparator<HaysSGUserData> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<HaysSGUserData> findAll(int start, int end,
		OrderByComparator<HaysSGUserData> orderByComparator,
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

		List<HaysSGUserData> list = null;

		if (retrieveFromCache) {
			list = (List<HaysSGUserData>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_HAYSSGUSERDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HAYSSGUSERDATA;

				if (pagination) {
					sql = sql.concat(HaysSGUserDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HaysSGUserData>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HaysSGUserData>)QueryUtil.list(q,
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
	 * Removes all the hays sg user datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HaysSGUserData haysSGUserData : findAll()) {
			remove(haysSGUserData);
		}
	}

	/**
	 * Returns the number of hays sg user datas.
	 *
	 * @return the number of hays sg user datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HAYSSGUSERDATA);

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
		return HaysSGUserDataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hays sg user data persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(HaysSGUserDataImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_HAYSSGUSERDATA = "SELECT haysSGUserData FROM HaysSGUserData haysSGUserData";
	private static final String _SQL_SELECT_HAYSSGUSERDATA_WHERE_PKS_IN = "SELECT haysSGUserData FROM HaysSGUserData haysSGUserData WHERE SGUSERID IN (";
	private static final String _SQL_SELECT_HAYSSGUSERDATA_WHERE = "SELECT haysSGUserData FROM HaysSGUserData haysSGUserData WHERE ";
	private static final String _SQL_COUNT_HAYSSGUSERDATA = "SELECT COUNT(haysSGUserData) FROM HaysSGUserData haysSGUserData";
	private static final String _SQL_COUNT_HAYSSGUSERDATA_WHERE = "SELECT COUNT(haysSGUserData) FROM HaysSGUserData haysSGUserData WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "haysSGUserData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HaysSGUserData exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HaysSGUserData exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(HaysSGUserDataPersistenceImpl.class);
}