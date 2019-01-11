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

import com.hays.service.salaryguide.exception.NoSuchSalGuideUserDataUkException;
import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;
import com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkImpl;
import com.hays.service.salaryguide.model.impl.HaysSalGuideUserDataUkModelImpl;
import com.hays.service.salaryguide.service.persistence.HaysSalGuideUserDataUkPersistence;

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
 * The persistence implementation for the hays sal guide user data uk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalGuideUserDataUkPersistence
 * @see com.hays.service.salaryguide.service.persistence.HaysSalGuideUserDataUkUtil
 * @generated
 */
@ProviderType
public class HaysSalGuideUserDataUkPersistenceImpl extends BasePersistenceImpl<HaysSalGuideUserDataUk>
	implements HaysSalGuideUserDataUkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HaysSalGuideUserDataUkUtil} to access the hays sal guide user data uk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HaysSalGuideUserDataUkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkModelImpl.FINDER_CACHE_ENABLED,
			HaysSalGuideUserDataUkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkModelImpl.FINDER_CACHE_ENABLED,
			HaysSalGuideUserDataUkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SITELOCALE =
		new FinderPath(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkModelImpl.FINDER_CACHE_ENABLED,
			HaysSalGuideUserDataUkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySiteLocale",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITELOCALE =
		new FinderPath(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkModelImpl.FINDER_CACHE_ENABLED,
			HaysSalGuideUserDataUkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySiteLocale",
			new String[] { String.class.getName() },
			HaysSalGuideUserDataUkModelImpl.SGFROMLOCALE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SITELOCALE = new FinderPath(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySiteLocale",
			new String[] { String.class.getName() });

	/**
	 * Returns all the hays sal guide user data uks where SGFROMLOCALE = &#63;.
	 *
	 * @param SGFROMLOCALE the sgfromlocale
	 * @return the matching hays sal guide user data uks
	 */
	@Override
	public List<HaysSalGuideUserDataUk> findBySiteLocale(String SGFROMLOCALE) {
		return findBySiteLocale(SGFROMLOCALE, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<HaysSalGuideUserDataUk> findBySiteLocale(String SGFROMLOCALE,
		int start, int end) {
		return findBySiteLocale(SGFROMLOCALE, start, end, null);
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
	@Override
	public List<HaysSalGuideUserDataUk> findBySiteLocale(String SGFROMLOCALE,
		int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		return findBySiteLocale(SGFROMLOCALE, start, end, orderByComparator,
			true);
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
	@Override
	public List<HaysSalGuideUserDataUk> findBySiteLocale(String SGFROMLOCALE,
		int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITELOCALE;
			finderArgs = new Object[] { SGFROMLOCALE };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SITELOCALE;
			finderArgs = new Object[] {
					SGFROMLOCALE,
					
					start, end, orderByComparator
				};
		}

		List<HaysSalGuideUserDataUk> list = null;

		if (retrieveFromCache) {
			list = (List<HaysSalGuideUserDataUk>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HaysSalGuideUserDataUk haysSalGuideUserDataUk : list) {
					if (!Objects.equals(SGFROMLOCALE,
								haysSalGuideUserDataUk.getSGFROMLOCALE())) {
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

			query.append(_SQL_SELECT_HAYSSALGUIDEUSERDATAUK_WHERE);

			boolean bindSGFROMLOCALE = false;

			if (SGFROMLOCALE == null) {
				query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_1);
			}
			else if (SGFROMLOCALE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_3);
			}
			else {
				bindSGFROMLOCALE = true;

				query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HaysSalGuideUserDataUkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSGFROMLOCALE) {
					qPos.add(SGFROMLOCALE);
				}

				if (!pagination) {
					list = (List<HaysSalGuideUserDataUk>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HaysSalGuideUserDataUk>)QueryUtil.list(q,
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
	 * Returns the first hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	 *
	 * @param SGFROMLOCALE the sgfromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays sal guide user data uk
	 * @throws NoSuchSalGuideUserDataUkException if a matching hays sal guide user data uk could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk findBySiteLocale_First(String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws NoSuchSalGuideUserDataUkException {
		HaysSalGuideUserDataUk haysSalGuideUserDataUk = fetchBySiteLocale_First(SGFROMLOCALE,
				orderByComparator);

		if (haysSalGuideUserDataUk != null) {
			return haysSalGuideUserDataUk;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SGFROMLOCALE=");
		msg.append(SGFROMLOCALE);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSalGuideUserDataUkException(msg.toString());
	}

	/**
	 * Returns the first hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	 *
	 * @param SGFROMLOCALE the sgfromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays sal guide user data uk, or <code>null</code> if a matching hays sal guide user data uk could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk fetchBySiteLocale_First(String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		List<HaysSalGuideUserDataUk> list = findBySiteLocale(SGFROMLOCALE, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	 *
	 * @param SGFROMLOCALE the sgfromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays sal guide user data uk
	 * @throws NoSuchSalGuideUserDataUkException if a matching hays sal guide user data uk could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk findBySiteLocale_Last(String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws NoSuchSalGuideUserDataUkException {
		HaysSalGuideUserDataUk haysSalGuideUserDataUk = fetchBySiteLocale_Last(SGFROMLOCALE,
				orderByComparator);

		if (haysSalGuideUserDataUk != null) {
			return haysSalGuideUserDataUk;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SGFROMLOCALE=");
		msg.append(SGFROMLOCALE);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSalGuideUserDataUkException(msg.toString());
	}

	/**
	 * Returns the last hays sal guide user data uk in the ordered set where SGFROMLOCALE = &#63;.
	 *
	 * @param SGFROMLOCALE the sgfromlocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays sal guide user data uk, or <code>null</code> if a matching hays sal guide user data uk could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk fetchBySiteLocale_Last(String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		int count = countBySiteLocale(SGFROMLOCALE);

		if (count == 0) {
			return null;
		}

		List<HaysSalGuideUserDataUk> list = findBySiteLocale(SGFROMLOCALE,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HaysSalGuideUserDataUk[] findBySiteLocale_PrevAndNext(
		long SGUSERID, String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator)
		throws NoSuchSalGuideUserDataUkException {
		HaysSalGuideUserDataUk haysSalGuideUserDataUk = findByPrimaryKey(SGUSERID);

		Session session = null;

		try {
			session = openSession();

			HaysSalGuideUserDataUk[] array = new HaysSalGuideUserDataUkImpl[3];

			array[0] = getBySiteLocale_PrevAndNext(session,
					haysSalGuideUserDataUk, SGFROMLOCALE, orderByComparator,
					true);

			array[1] = haysSalGuideUserDataUk;

			array[2] = getBySiteLocale_PrevAndNext(session,
					haysSalGuideUserDataUk, SGFROMLOCALE, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HaysSalGuideUserDataUk getBySiteLocale_PrevAndNext(
		Session session, HaysSalGuideUserDataUk haysSalGuideUserDataUk,
		String SGFROMLOCALE,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HAYSSALGUIDEUSERDATAUK_WHERE);

		boolean bindSGFROMLOCALE = false;

		if (SGFROMLOCALE == null) {
			query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_1);
		}
		else if (SGFROMLOCALE.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_3);
		}
		else {
			bindSGFROMLOCALE = true;

			query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_2);
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
			query.append(HaysSalGuideUserDataUkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSGFROMLOCALE) {
			qPos.add(SGFROMLOCALE);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(haysSalGuideUserDataUk);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HaysSalGuideUserDataUk> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hays sal guide user data uks where SGFROMLOCALE = &#63; from the database.
	 *
	 * @param SGFROMLOCALE the sgfromlocale
	 */
	@Override
	public void removeBySiteLocale(String SGFROMLOCALE) {
		for (HaysSalGuideUserDataUk haysSalGuideUserDataUk : findBySiteLocale(
				SGFROMLOCALE, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(haysSalGuideUserDataUk);
		}
	}

	/**
	 * Returns the number of hays sal guide user data uks where SGFROMLOCALE = &#63;.
	 *
	 * @param SGFROMLOCALE the sgfromlocale
	 * @return the number of matching hays sal guide user data uks
	 */
	@Override
	public int countBySiteLocale(String SGFROMLOCALE) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SITELOCALE;

		Object[] finderArgs = new Object[] { SGFROMLOCALE };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HAYSSALGUIDEUSERDATAUK_WHERE);

			boolean bindSGFROMLOCALE = false;

			if (SGFROMLOCALE == null) {
				query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_1);
			}
			else if (SGFROMLOCALE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_3);
			}
			else {
				bindSGFROMLOCALE = true;

				query.append(_FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSGFROMLOCALE) {
					qPos.add(SGFROMLOCALE);
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

	private static final String _FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_1 = "haysSalGuideUserDataUk.SGFROMLOCALE IS NULL";
	private static final String _FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_2 = "haysSalGuideUserDataUk.SGFROMLOCALE = ?";
	private static final String _FINDER_COLUMN_SITELOCALE_SGFROMLOCALE_3 = "(haysSalGuideUserDataUk.SGFROMLOCALE IS NULL OR haysSalGuideUserDataUk.SGFROMLOCALE = '')";

	public HaysSalGuideUserDataUkPersistenceImpl() {
		setModelClass(HaysSalGuideUserDataUk.class);
	}

	/**
	 * Caches the hays sal guide user data uk in the entity cache if it is enabled.
	 *
	 * @param haysSalGuideUserDataUk the hays sal guide user data uk
	 */
	@Override
	public void cacheResult(HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		entityCache.putResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkImpl.class,
			haysSalGuideUserDataUk.getPrimaryKey(), haysSalGuideUserDataUk);

		haysSalGuideUserDataUk.resetOriginalValues();
	}

	/**
	 * Caches the hays sal guide user data uks in the entity cache if it is enabled.
	 *
	 * @param haysSalGuideUserDataUks the hays sal guide user data uks
	 */
	@Override
	public void cacheResult(
		List<HaysSalGuideUserDataUk> haysSalGuideUserDataUks) {
		for (HaysSalGuideUserDataUk haysSalGuideUserDataUk : haysSalGuideUserDataUks) {
			if (entityCache.getResult(
						HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
						HaysSalGuideUserDataUkImpl.class,
						haysSalGuideUserDataUk.getPrimaryKey()) == null) {
				cacheResult(haysSalGuideUserDataUk);
			}
			else {
				haysSalGuideUserDataUk.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all hays sal guide user data uks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HaysSalGuideUserDataUkImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the hays sal guide user data uk.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		entityCache.removeResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkImpl.class,
			haysSalGuideUserDataUk.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HaysSalGuideUserDataUk> haysSalGuideUserDataUks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HaysSalGuideUserDataUk haysSalGuideUserDataUk : haysSalGuideUserDataUks) {
			entityCache.removeResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
				HaysSalGuideUserDataUkImpl.class,
				haysSalGuideUserDataUk.getPrimaryKey());
		}
	}

	/**
	 * Creates a new hays sal guide user data uk with the primary key. Does not add the hays sal guide user data uk to the database.
	 *
	 * @param SGUSERID the primary key for the new hays sal guide user data uk
	 * @return the new hays sal guide user data uk
	 */
	@Override
	public HaysSalGuideUserDataUk create(long SGUSERID) {
		HaysSalGuideUserDataUk haysSalGuideUserDataUk = new HaysSalGuideUserDataUkImpl();

		haysSalGuideUserDataUk.setNew(true);
		haysSalGuideUserDataUk.setPrimaryKey(SGUSERID);

		return haysSalGuideUserDataUk;
	}

	/**
	 * Removes the hays sal guide user data uk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SGUSERID the primary key of the hays sal guide user data uk
	 * @return the hays sal guide user data uk that was removed
	 * @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk remove(long SGUSERID)
		throws NoSuchSalGuideUserDataUkException {
		return remove((Serializable)SGUSERID);
	}

	/**
	 * Removes the hays sal guide user data uk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hays sal guide user data uk
	 * @return the hays sal guide user data uk that was removed
	 * @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk remove(Serializable primaryKey)
		throws NoSuchSalGuideUserDataUkException {
		Session session = null;

		try {
			session = openSession();

			HaysSalGuideUserDataUk haysSalGuideUserDataUk = (HaysSalGuideUserDataUk)session.get(HaysSalGuideUserDataUkImpl.class,
					primaryKey);

			if (haysSalGuideUserDataUk == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSalGuideUserDataUkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(haysSalGuideUserDataUk);
		}
		catch (NoSuchSalGuideUserDataUkException nsee) {
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
	protected HaysSalGuideUserDataUk removeImpl(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		haysSalGuideUserDataUk = toUnwrappedModel(haysSalGuideUserDataUk);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(haysSalGuideUserDataUk)) {
				haysSalGuideUserDataUk = (HaysSalGuideUserDataUk)session.get(HaysSalGuideUserDataUkImpl.class,
						haysSalGuideUserDataUk.getPrimaryKeyObj());
			}

			if (haysSalGuideUserDataUk != null) {
				session.delete(haysSalGuideUserDataUk);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (haysSalGuideUserDataUk != null) {
			clearCache(haysSalGuideUserDataUk);
		}

		return haysSalGuideUserDataUk;
	}

	@Override
	public HaysSalGuideUserDataUk updateImpl(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		haysSalGuideUserDataUk = toUnwrappedModel(haysSalGuideUserDataUk);

		boolean isNew = haysSalGuideUserDataUk.isNew();

		HaysSalGuideUserDataUkModelImpl haysSalGuideUserDataUkModelImpl = (HaysSalGuideUserDataUkModelImpl)haysSalGuideUserDataUk;

		Session session = null;

		try {
			session = openSession();

			if (haysSalGuideUserDataUk.isNew()) {
				session.save(haysSalGuideUserDataUk);

				haysSalGuideUserDataUk.setNew(false);
			}
			else {
				haysSalGuideUserDataUk = (HaysSalGuideUserDataUk)session.merge(haysSalGuideUserDataUk);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!HaysSalGuideUserDataUkModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					haysSalGuideUserDataUkModelImpl.getSGFROMLOCALE()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SITELOCALE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITELOCALE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((haysSalGuideUserDataUkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITELOCALE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						haysSalGuideUserDataUkModelImpl.getOriginalSGFROMLOCALE()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SITELOCALE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITELOCALE,
					args);

				args = new Object[] {
						haysSalGuideUserDataUkModelImpl.getSGFROMLOCALE()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SITELOCALE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITELOCALE,
					args);
			}
		}

		entityCache.putResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalGuideUserDataUkImpl.class,
			haysSalGuideUserDataUk.getPrimaryKey(), haysSalGuideUserDataUk,
			false);

		haysSalGuideUserDataUk.resetOriginalValues();

		return haysSalGuideUserDataUk;
	}

	protected HaysSalGuideUserDataUk toUnwrappedModel(
		HaysSalGuideUserDataUk haysSalGuideUserDataUk) {
		if (haysSalGuideUserDataUk instanceof HaysSalGuideUserDataUkImpl) {
			return haysSalGuideUserDataUk;
		}

		HaysSalGuideUserDataUkImpl haysSalGuideUserDataUkImpl = new HaysSalGuideUserDataUkImpl();

		haysSalGuideUserDataUkImpl.setNew(haysSalGuideUserDataUk.isNew());
		haysSalGuideUserDataUkImpl.setPrimaryKey(haysSalGuideUserDataUk.getPrimaryKey());

		haysSalGuideUserDataUkImpl.setSGUSERID(haysSalGuideUserDataUk.getSGUSERID());
		haysSalGuideUserDataUkImpl.setSGFORMINDUSTRY(haysSalGuideUserDataUk.getSGFORMINDUSTRY());
		haysSalGuideUserDataUkImpl.setSGFORMSECTOR(haysSalGuideUserDataUk.getSGFORMSECTOR());
		haysSalGuideUserDataUkImpl.setSGFORMAREA(haysSalGuideUserDataUk.getSGFORMAREA());
		haysSalGuideUserDataUkImpl.setSGFORMPOSITIONTYPE(haysSalGuideUserDataUk.getSGFORMPOSITIONTYPE());
		haysSalGuideUserDataUkImpl.setSGFORMPOSITIONNAME(haysSalGuideUserDataUk.getSGFORMPOSITIONNAME());
		haysSalGuideUserDataUkImpl.setLOCATIONNAME(haysSalGuideUserDataUk.getLOCATIONNAME());
		haysSalGuideUserDataUkImpl.setSGCOMPANY(haysSalGuideUserDataUk.getSGCOMPANY());
		haysSalGuideUserDataUkImpl.setSGCURRENTSALARY(haysSalGuideUserDataUk.getSGCURRENTSALARY());
		haysSalGuideUserDataUkImpl.setSGEMAIL(haysSalGuideUserDataUk.getSGEMAIL());
		haysSalGuideUserDataUkImpl.setCREATETIMESTAMP(haysSalGuideUserDataUk.getCREATETIMESTAMP());
		haysSalGuideUserDataUkImpl.setSGFROMLOCALE(haysSalGuideUserDataUk.getSGFROMLOCALE());

		return haysSalGuideUserDataUkImpl;
	}

	/**
	 * Returns the hays sal guide user data uk with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the hays sal guide user data uk
	 * @return the hays sal guide user data uk
	 * @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSalGuideUserDataUkException {
		HaysSalGuideUserDataUk haysSalGuideUserDataUk = fetchByPrimaryKey(primaryKey);

		if (haysSalGuideUserDataUk == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSalGuideUserDataUkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return haysSalGuideUserDataUk;
	}

	/**
	 * Returns the hays sal guide user data uk with the primary key or throws a {@link NoSuchSalGuideUserDataUkException} if it could not be found.
	 *
	 * @param SGUSERID the primary key of the hays sal guide user data uk
	 * @return the hays sal guide user data uk
	 * @throws NoSuchSalGuideUserDataUkException if a hays sal guide user data uk with the primary key could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk findByPrimaryKey(long SGUSERID)
		throws NoSuchSalGuideUserDataUkException {
		return findByPrimaryKey((Serializable)SGUSERID);
	}

	/**
	 * Returns the hays sal guide user data uk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hays sal guide user data uk
	 * @return the hays sal guide user data uk, or <code>null</code> if a hays sal guide user data uk with the primary key could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
				HaysSalGuideUserDataUkImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		HaysSalGuideUserDataUk haysSalGuideUserDataUk = (HaysSalGuideUserDataUk)serializable;

		if (haysSalGuideUserDataUk == null) {
			Session session = null;

			try {
				session = openSession();

				haysSalGuideUserDataUk = (HaysSalGuideUserDataUk)session.get(HaysSalGuideUserDataUkImpl.class,
						primaryKey);

				if (haysSalGuideUserDataUk != null) {
					cacheResult(haysSalGuideUserDataUk);
				}
				else {
					entityCache.putResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
						HaysSalGuideUserDataUkImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
					HaysSalGuideUserDataUkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return haysSalGuideUserDataUk;
	}

	/**
	 * Returns the hays sal guide user data uk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SGUSERID the primary key of the hays sal guide user data uk
	 * @return the hays sal guide user data uk, or <code>null</code> if a hays sal guide user data uk with the primary key could not be found
	 */
	@Override
	public HaysSalGuideUserDataUk fetchByPrimaryKey(long SGUSERID) {
		return fetchByPrimaryKey((Serializable)SGUSERID);
	}

	@Override
	public Map<Serializable, HaysSalGuideUserDataUk> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, HaysSalGuideUserDataUk> map = new HashMap<Serializable, HaysSalGuideUserDataUk>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			HaysSalGuideUserDataUk haysSalGuideUserDataUk = fetchByPrimaryKey(primaryKey);

			if (haysSalGuideUserDataUk != null) {
				map.put(primaryKey, haysSalGuideUserDataUk);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
					HaysSalGuideUserDataUkImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (HaysSalGuideUserDataUk)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_HAYSSALGUIDEUSERDATAUK_WHERE_PKS_IN);

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

			for (HaysSalGuideUserDataUk haysSalGuideUserDataUk : (List<HaysSalGuideUserDataUk>)q.list()) {
				map.put(haysSalGuideUserDataUk.getPrimaryKeyObj(),
					haysSalGuideUserDataUk);

				cacheResult(haysSalGuideUserDataUk);

				uncachedPrimaryKeys.remove(haysSalGuideUserDataUk.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(HaysSalGuideUserDataUkModelImpl.ENTITY_CACHE_ENABLED,
					HaysSalGuideUserDataUkImpl.class, primaryKey, nullModel);
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
	 * Returns all the hays sal guide user data uks.
	 *
	 * @return the hays sal guide user data uks
	 */
	@Override
	public List<HaysSalGuideUserDataUk> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<HaysSalGuideUserDataUk> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<HaysSalGuideUserDataUk> findAll(int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<HaysSalGuideUserDataUk> findAll(int start, int end,
		OrderByComparator<HaysSalGuideUserDataUk> orderByComparator,
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

		List<HaysSalGuideUserDataUk> list = null;

		if (retrieveFromCache) {
			list = (List<HaysSalGuideUserDataUk>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_HAYSSALGUIDEUSERDATAUK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HAYSSALGUIDEUSERDATAUK;

				if (pagination) {
					sql = sql.concat(HaysSalGuideUserDataUkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HaysSalGuideUserDataUk>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HaysSalGuideUserDataUk>)QueryUtil.list(q,
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
	 * Removes all the hays sal guide user data uks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HaysSalGuideUserDataUk haysSalGuideUserDataUk : findAll()) {
			remove(haysSalGuideUserDataUk);
		}
	}

	/**
	 * Returns the number of hays sal guide user data uks.
	 *
	 * @return the number of hays sal guide user data uks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HAYSSALGUIDEUSERDATAUK);

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
		return HaysSalGuideUserDataUkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hays sal guide user data uk persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(HaysSalGuideUserDataUkImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_HAYSSALGUIDEUSERDATAUK = "SELECT haysSalGuideUserDataUk FROM HaysSalGuideUserDataUk haysSalGuideUserDataUk";
	private static final String _SQL_SELECT_HAYSSALGUIDEUSERDATAUK_WHERE_PKS_IN = "SELECT haysSalGuideUserDataUk FROM HaysSalGuideUserDataUk haysSalGuideUserDataUk WHERE SGUSERID IN (";
	private static final String _SQL_SELECT_HAYSSALGUIDEUSERDATAUK_WHERE = "SELECT haysSalGuideUserDataUk FROM HaysSalGuideUserDataUk haysSalGuideUserDataUk WHERE ";
	private static final String _SQL_COUNT_HAYSSALGUIDEUSERDATAUK = "SELECT COUNT(haysSalGuideUserDataUk) FROM HaysSalGuideUserDataUk haysSalGuideUserDataUk";
	private static final String _SQL_COUNT_HAYSSALGUIDEUSERDATAUK_WHERE = "SELECT COUNT(haysSalGuideUserDataUk) FROM HaysSalGuideUserDataUk haysSalGuideUserDataUk WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "haysSalGuideUserDataUk.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HaysSalGuideUserDataUk exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HaysSalGuideUserDataUk exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(HaysSalGuideUserDataUkPersistenceImpl.class);
}