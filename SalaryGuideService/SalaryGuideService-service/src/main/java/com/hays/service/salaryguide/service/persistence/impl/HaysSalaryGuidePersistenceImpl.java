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

import com.hays.service.salaryguide.exception.NoSuchSalaryGuideException;
import com.hays.service.salaryguide.model.HaysSalaryGuide;
import com.hays.service.salaryguide.model.impl.HaysSalaryGuideImpl;
import com.hays.service.salaryguide.model.impl.HaysSalaryGuideModelImpl;
import com.hays.service.salaryguide.service.persistence.HaysSalaryGuidePersistence;

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
 * The persistence implementation for the hays salary guide service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HaysSalaryGuidePersistence
 * @see com.hays.service.salaryguide.service.persistence.HaysSalaryGuideUtil
 * @generated
 */
@ProviderType
public class HaysSalaryGuidePersistenceImpl extends BasePersistenceImpl<HaysSalaryGuide>
	implements HaysSalaryGuidePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HaysSalaryGuideUtil} to access the hays salary guide persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HaysSalaryGuideImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED,
			HaysSalaryGuideImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED,
			HaysSalaryGuideImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INDUSTRY = new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED,
			HaysSalaryGuideImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIndustry",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUSTRY =
		new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED,
			HaysSalaryGuideImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIndustry",
			new String[] { String.class.getName() },
			HaysSalaryGuideModelImpl.INDUSTRY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INDUSTRY = new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIndustry",
			new String[] { String.class.getName() });

	/**
	 * Returns all the hays salary guides where INDUSTRY = &#63;.
	 *
	 * @param INDUSTRY the industry
	 * @return the matching hays salary guides
	 */
	@Override
	public List<HaysSalaryGuide> findByIndustry(String INDUSTRY) {
		return findByIndustry(INDUSTRY, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<HaysSalaryGuide> findByIndustry(String INDUSTRY, int start,
		int end) {
		return findByIndustry(INDUSTRY, start, end, null);
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
	@Override
	public List<HaysSalaryGuide> findByIndustry(String INDUSTRY, int start,
		int end, OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return findByIndustry(INDUSTRY, start, end, orderByComparator, true);
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
	@Override
	public List<HaysSalaryGuide> findByIndustry(String INDUSTRY, int start,
		int end, OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUSTRY;
			finderArgs = new Object[] { INDUSTRY };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INDUSTRY;
			finderArgs = new Object[] { INDUSTRY, start, end, orderByComparator };
		}

		List<HaysSalaryGuide> list = null;

		if (retrieveFromCache) {
			list = (List<HaysSalaryGuide>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HaysSalaryGuide haysSalaryGuide : list) {
					if (!Objects.equals(INDUSTRY, haysSalaryGuide.getINDUSTRY())) {
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

			query.append(_SQL_SELECT_HAYSSALARYGUIDE_WHERE);

			boolean bindINDUSTRY = false;

			if (INDUSTRY == null) {
				query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_1);
			}
			else if (INDUSTRY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_3);
			}
			else {
				bindINDUSTRY = true;

				query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HaysSalaryGuideModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindINDUSTRY) {
					qPos.add(INDUSTRY);
				}

				if (!pagination) {
					list = (List<HaysSalaryGuide>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HaysSalaryGuide>)QueryUtil.list(q,
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
	 * Returns the first hays salary guide in the ordered set where INDUSTRY = &#63;.
	 *
	 * @param INDUSTRY the industry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays salary guide
	 * @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide findByIndustry_First(String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException {
		HaysSalaryGuide haysSalaryGuide = fetchByIndustry_First(INDUSTRY,
				orderByComparator);

		if (haysSalaryGuide != null) {
			return haysSalaryGuide;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("INDUSTRY=");
		msg.append(INDUSTRY);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSalaryGuideException(msg.toString());
	}

	/**
	 * Returns the first hays salary guide in the ordered set where INDUSTRY = &#63;.
	 *
	 * @param INDUSTRY the industry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide fetchByIndustry_First(String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		List<HaysSalaryGuide> list = findByIndustry(INDUSTRY, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hays salary guide in the ordered set where INDUSTRY = &#63;.
	 *
	 * @param INDUSTRY the industry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays salary guide
	 * @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide findByIndustry_Last(String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException {
		HaysSalaryGuide haysSalaryGuide = fetchByIndustry_Last(INDUSTRY,
				orderByComparator);

		if (haysSalaryGuide != null) {
			return haysSalaryGuide;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("INDUSTRY=");
		msg.append(INDUSTRY);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSalaryGuideException(msg.toString());
	}

	/**
	 * Returns the last hays salary guide in the ordered set where INDUSTRY = &#63;.
	 *
	 * @param INDUSTRY the industry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide fetchByIndustry_Last(String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		int count = countByIndustry(INDUSTRY);

		if (count == 0) {
			return null;
		}

		List<HaysSalaryGuide> list = findByIndustry(INDUSTRY, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HaysSalaryGuide[] findByIndustry_PrevAndNext(String SGID,
		String INDUSTRY, OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException {
		HaysSalaryGuide haysSalaryGuide = findByPrimaryKey(SGID);

		Session session = null;

		try {
			session = openSession();

			HaysSalaryGuide[] array = new HaysSalaryGuideImpl[3];

			array[0] = getByIndustry_PrevAndNext(session, haysSalaryGuide,
					INDUSTRY, orderByComparator, true);

			array[1] = haysSalaryGuide;

			array[2] = getByIndustry_PrevAndNext(session, haysSalaryGuide,
					INDUSTRY, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HaysSalaryGuide getByIndustry_PrevAndNext(Session session,
		HaysSalaryGuide haysSalaryGuide, String INDUSTRY,
		OrderByComparator<HaysSalaryGuide> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HAYSSALARYGUIDE_WHERE);

		boolean bindINDUSTRY = false;

		if (INDUSTRY == null) {
			query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_1);
		}
		else if (INDUSTRY.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_3);
		}
		else {
			bindINDUSTRY = true;

			query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_2);
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
			query.append(HaysSalaryGuideModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindINDUSTRY) {
			qPos.add(INDUSTRY);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(haysSalaryGuide);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HaysSalaryGuide> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hays salary guides where INDUSTRY = &#63; from the database.
	 *
	 * @param INDUSTRY the industry
	 */
	@Override
	public void removeByIndustry(String INDUSTRY) {
		for (HaysSalaryGuide haysSalaryGuide : findByIndustry(INDUSTRY,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(haysSalaryGuide);
		}
	}

	/**
	 * Returns the number of hays salary guides where INDUSTRY = &#63;.
	 *
	 * @param INDUSTRY the industry
	 * @return the number of matching hays salary guides
	 */
	@Override
	public int countByIndustry(String INDUSTRY) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INDUSTRY;

		Object[] finderArgs = new Object[] { INDUSTRY };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HAYSSALARYGUIDE_WHERE);

			boolean bindINDUSTRY = false;

			if (INDUSTRY == null) {
				query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_1);
			}
			else if (INDUSTRY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_3);
			}
			else {
				bindINDUSTRY = true;

				query.append(_FINDER_COLUMN_INDUSTRY_INDUSTRY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindINDUSTRY) {
					qPos.add(INDUSTRY);
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

	private static final String _FINDER_COLUMN_INDUSTRY_INDUSTRY_1 = "haysSalaryGuide.INDUSTRY IS NULL";
	private static final String _FINDER_COLUMN_INDUSTRY_INDUSTRY_2 = "haysSalaryGuide.INDUSTRY = ?";
	private static final String _FINDER_COLUMN_INDUSTRY_INDUSTRY_3 = "(haysSalaryGuide.INDUSTRY IS NULL OR haysSalaryGuide.INDUSTRY = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCALE = new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED,
			HaysSalaryGuideImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLocale",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALE =
		new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED,
			HaysSalaryGuideImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocale",
			new String[] { String.class.getName() },
			HaysSalaryGuideModelImpl.SITELOCALE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCALE = new FinderPath(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocale",
			new String[] { String.class.getName() });

	/**
	 * Returns all the hays salary guides where SITELOCALE = &#63;.
	 *
	 * @param SITELOCALE the sitelocale
	 * @return the matching hays salary guides
	 */
	@Override
	public List<HaysSalaryGuide> findByLocale(String SITELOCALE) {
		return findByLocale(SITELOCALE, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<HaysSalaryGuide> findByLocale(String SITELOCALE, int start,
		int end) {
		return findByLocale(SITELOCALE, start, end, null);
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
	@Override
	public List<HaysSalaryGuide> findByLocale(String SITELOCALE, int start,
		int end, OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return findByLocale(SITELOCALE, start, end, orderByComparator, true);
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
	@Override
	public List<HaysSalaryGuide> findByLocale(String SITELOCALE, int start,
		int end, OrderByComparator<HaysSalaryGuide> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALE;
			finderArgs = new Object[] { SITELOCALE };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCALE;
			finderArgs = new Object[] { SITELOCALE, start, end, orderByComparator };
		}

		List<HaysSalaryGuide> list = null;

		if (retrieveFromCache) {
			list = (List<HaysSalaryGuide>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HaysSalaryGuide haysSalaryGuide : list) {
					if (!Objects.equals(SITELOCALE,
								haysSalaryGuide.getSITELOCALE())) {
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

			query.append(_SQL_SELECT_HAYSSALARYGUIDE_WHERE);

			boolean bindSITELOCALE = false;

			if (SITELOCALE == null) {
				query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_1);
			}
			else if (SITELOCALE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_3);
			}
			else {
				bindSITELOCALE = true;

				query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HaysSalaryGuideModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSITELOCALE) {
					qPos.add(SITELOCALE);
				}

				if (!pagination) {
					list = (List<HaysSalaryGuide>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HaysSalaryGuide>)QueryUtil.list(q,
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
	 * Returns the first hays salary guide in the ordered set where SITELOCALE = &#63;.
	 *
	 * @param SITELOCALE the sitelocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays salary guide
	 * @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide findByLocale_First(String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException {
		HaysSalaryGuide haysSalaryGuide = fetchByLocale_First(SITELOCALE,
				orderByComparator);

		if (haysSalaryGuide != null) {
			return haysSalaryGuide;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SITELOCALE=");
		msg.append(SITELOCALE);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSalaryGuideException(msg.toString());
	}

	/**
	 * Returns the first hays salary guide in the ordered set where SITELOCALE = &#63;.
	 *
	 * @param SITELOCALE the sitelocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide fetchByLocale_First(String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		List<HaysSalaryGuide> list = findByLocale(SITELOCALE, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hays salary guide in the ordered set where SITELOCALE = &#63;.
	 *
	 * @param SITELOCALE the sitelocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays salary guide
	 * @throws NoSuchSalaryGuideException if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide findByLocale_Last(String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException {
		HaysSalaryGuide haysSalaryGuide = fetchByLocale_Last(SITELOCALE,
				orderByComparator);

		if (haysSalaryGuide != null) {
			return haysSalaryGuide;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SITELOCALE=");
		msg.append(SITELOCALE);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSalaryGuideException(msg.toString());
	}

	/**
	 * Returns the last hays salary guide in the ordered set where SITELOCALE = &#63;.
	 *
	 * @param SITELOCALE the sitelocale
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hays salary guide, or <code>null</code> if a matching hays salary guide could not be found
	 */
	@Override
	public HaysSalaryGuide fetchByLocale_Last(String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		int count = countByLocale(SITELOCALE);

		if (count == 0) {
			return null;
		}

		List<HaysSalaryGuide> list = findByLocale(SITELOCALE, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HaysSalaryGuide[] findByLocale_PrevAndNext(String SGID,
		String SITELOCALE, OrderByComparator<HaysSalaryGuide> orderByComparator)
		throws NoSuchSalaryGuideException {
		HaysSalaryGuide haysSalaryGuide = findByPrimaryKey(SGID);

		Session session = null;

		try {
			session = openSession();

			HaysSalaryGuide[] array = new HaysSalaryGuideImpl[3];

			array[0] = getByLocale_PrevAndNext(session, haysSalaryGuide,
					SITELOCALE, orderByComparator, true);

			array[1] = haysSalaryGuide;

			array[2] = getByLocale_PrevAndNext(session, haysSalaryGuide,
					SITELOCALE, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HaysSalaryGuide getByLocale_PrevAndNext(Session session,
		HaysSalaryGuide haysSalaryGuide, String SITELOCALE,
		OrderByComparator<HaysSalaryGuide> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HAYSSALARYGUIDE_WHERE);

		boolean bindSITELOCALE = false;

		if (SITELOCALE == null) {
			query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_1);
		}
		else if (SITELOCALE.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_3);
		}
		else {
			bindSITELOCALE = true;

			query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_2);
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
			query.append(HaysSalaryGuideModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSITELOCALE) {
			qPos.add(SITELOCALE);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(haysSalaryGuide);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HaysSalaryGuide> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hays salary guides where SITELOCALE = &#63; from the database.
	 *
	 * @param SITELOCALE the sitelocale
	 */
	@Override
	public void removeByLocale(String SITELOCALE) {
		for (HaysSalaryGuide haysSalaryGuide : findByLocale(SITELOCALE,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(haysSalaryGuide);
		}
	}

	/**
	 * Returns the number of hays salary guides where SITELOCALE = &#63;.
	 *
	 * @param SITELOCALE the sitelocale
	 * @return the number of matching hays salary guides
	 */
	@Override
	public int countByLocale(String SITELOCALE) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCALE;

		Object[] finderArgs = new Object[] { SITELOCALE };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HAYSSALARYGUIDE_WHERE);

			boolean bindSITELOCALE = false;

			if (SITELOCALE == null) {
				query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_1);
			}
			else if (SITELOCALE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_3);
			}
			else {
				bindSITELOCALE = true;

				query.append(_FINDER_COLUMN_LOCALE_SITELOCALE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSITELOCALE) {
					qPos.add(SITELOCALE);
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

	private static final String _FINDER_COLUMN_LOCALE_SITELOCALE_1 = "haysSalaryGuide.SITELOCALE IS NULL";
	private static final String _FINDER_COLUMN_LOCALE_SITELOCALE_2 = "haysSalaryGuide.SITELOCALE = ?";
	private static final String _FINDER_COLUMN_LOCALE_SITELOCALE_3 = "(haysSalaryGuide.SITELOCALE IS NULL OR haysSalaryGuide.SITELOCALE = '')";

	public HaysSalaryGuidePersistenceImpl() {
		setModelClass(HaysSalaryGuide.class);
	}

	/**
	 * Caches the hays salary guide in the entity cache if it is enabled.
	 *
	 * @param haysSalaryGuide the hays salary guide
	 */
	@Override
	public void cacheResult(HaysSalaryGuide haysSalaryGuide) {
		entityCache.putResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideImpl.class, haysSalaryGuide.getPrimaryKey(),
			haysSalaryGuide);

		haysSalaryGuide.resetOriginalValues();
	}

	/**
	 * Caches the hays salary guides in the entity cache if it is enabled.
	 *
	 * @param haysSalaryGuides the hays salary guides
	 */
	@Override
	public void cacheResult(List<HaysSalaryGuide> haysSalaryGuides) {
		for (HaysSalaryGuide haysSalaryGuide : haysSalaryGuides) {
			if (entityCache.getResult(
						HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
						HaysSalaryGuideImpl.class,
						haysSalaryGuide.getPrimaryKey()) == null) {
				cacheResult(haysSalaryGuide);
			}
			else {
				haysSalaryGuide.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all hays salary guides.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HaysSalaryGuideImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the hays salary guide.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HaysSalaryGuide haysSalaryGuide) {
		entityCache.removeResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideImpl.class, haysSalaryGuide.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HaysSalaryGuide> haysSalaryGuides) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HaysSalaryGuide haysSalaryGuide : haysSalaryGuides) {
			entityCache.removeResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
				HaysSalaryGuideImpl.class, haysSalaryGuide.getPrimaryKey());
		}
	}

	/**
	 * Creates a new hays salary guide with the primary key. Does not add the hays salary guide to the database.
	 *
	 * @param SGID the primary key for the new hays salary guide
	 * @return the new hays salary guide
	 */
	@Override
	public HaysSalaryGuide create(String SGID) {
		HaysSalaryGuide haysSalaryGuide = new HaysSalaryGuideImpl();

		haysSalaryGuide.setNew(true);
		haysSalaryGuide.setPrimaryKey(SGID);

		return haysSalaryGuide;
	}

	/**
	 * Removes the hays salary guide with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SGID the primary key of the hays salary guide
	 * @return the hays salary guide that was removed
	 * @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	 */
	@Override
	public HaysSalaryGuide remove(String SGID)
		throws NoSuchSalaryGuideException {
		return remove((Serializable)SGID);
	}

	/**
	 * Removes the hays salary guide with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hays salary guide
	 * @return the hays salary guide that was removed
	 * @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	 */
	@Override
	public HaysSalaryGuide remove(Serializable primaryKey)
		throws NoSuchSalaryGuideException {
		Session session = null;

		try {
			session = openSession();

			HaysSalaryGuide haysSalaryGuide = (HaysSalaryGuide)session.get(HaysSalaryGuideImpl.class,
					primaryKey);

			if (haysSalaryGuide == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSalaryGuideException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(haysSalaryGuide);
		}
		catch (NoSuchSalaryGuideException nsee) {
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
	protected HaysSalaryGuide removeImpl(HaysSalaryGuide haysSalaryGuide) {
		haysSalaryGuide = toUnwrappedModel(haysSalaryGuide);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(haysSalaryGuide)) {
				haysSalaryGuide = (HaysSalaryGuide)session.get(HaysSalaryGuideImpl.class,
						haysSalaryGuide.getPrimaryKeyObj());
			}

			if (haysSalaryGuide != null) {
				session.delete(haysSalaryGuide);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (haysSalaryGuide != null) {
			clearCache(haysSalaryGuide);
		}

		return haysSalaryGuide;
	}

	@Override
	public HaysSalaryGuide updateImpl(HaysSalaryGuide haysSalaryGuide) {
		haysSalaryGuide = toUnwrappedModel(haysSalaryGuide);

		boolean isNew = haysSalaryGuide.isNew();

		HaysSalaryGuideModelImpl haysSalaryGuideModelImpl = (HaysSalaryGuideModelImpl)haysSalaryGuide;

		Session session = null;

		try {
			session = openSession();

			if (haysSalaryGuide.isNew()) {
				session.save(haysSalaryGuide);

				haysSalaryGuide.setNew(false);
			}
			else {
				haysSalaryGuide = (HaysSalaryGuide)session.merge(haysSalaryGuide);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!HaysSalaryGuideModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { haysSalaryGuideModelImpl.getINDUSTRY() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_INDUSTRY, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUSTRY,
				args);

			args = new Object[] { haysSalaryGuideModelImpl.getSITELOCALE() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((haysSalaryGuideModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUSTRY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						haysSalaryGuideModelImpl.getOriginalINDUSTRY()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INDUSTRY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUSTRY,
					args);

				args = new Object[] { haysSalaryGuideModelImpl.getINDUSTRY() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INDUSTRY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUSTRY,
					args);
			}

			if ((haysSalaryGuideModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						haysSalaryGuideModelImpl.getOriginalSITELOCALE()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALE,
					args);

				args = new Object[] { haysSalaryGuideModelImpl.getSITELOCALE() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALE,
					args);
			}
		}

		entityCache.putResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
			HaysSalaryGuideImpl.class, haysSalaryGuide.getPrimaryKey(),
			haysSalaryGuide, false);

		haysSalaryGuide.resetOriginalValues();

		return haysSalaryGuide;
	}

	protected HaysSalaryGuide toUnwrappedModel(HaysSalaryGuide haysSalaryGuide) {
		if (haysSalaryGuide instanceof HaysSalaryGuideImpl) {
			return haysSalaryGuide;
		}

		HaysSalaryGuideImpl haysSalaryGuideImpl = new HaysSalaryGuideImpl();

		haysSalaryGuideImpl.setNew(haysSalaryGuide.isNew());
		haysSalaryGuideImpl.setPrimaryKey(haysSalaryGuide.getPrimaryKey());

		haysSalaryGuideImpl.setINDUSTRY(haysSalaryGuide.getINDUSTRY());
		haysSalaryGuideImpl.setLOCATIONNAME(haysSalaryGuide.getLOCATIONNAME());
		haysSalaryGuideImpl.setSECTOR(haysSalaryGuide.getSECTOR());
		haysSalaryGuideImpl.setPOSITIONTYPE(haysSalaryGuide.getPOSITIONTYPE());
		haysSalaryGuideImpl.setAREA(haysSalaryGuide.getAREA());
		haysSalaryGuideImpl.setCOMPANY(haysSalaryGuide.getCOMPANY());
		haysSalaryGuideImpl.setPOSITIONNAME(haysSalaryGuide.getPOSITIONNAME());
		haysSalaryGuideImpl.setSALARYRANGE(haysSalaryGuide.getSALARYRANGE());
		haysSalaryGuideImpl.setSALARYTYPICAL(haysSalaryGuide.getSALARYTYPICAL());
		haysSalaryGuideImpl.setNOTE(haysSalaryGuide.getNOTE());
		haysSalaryGuideImpl.setSITELOCALE(haysSalaryGuide.getSITELOCALE());
		haysSalaryGuideImpl.setSGDDOCNAME(haysSalaryGuide.getSGDDOCNAME());
		haysSalaryGuideImpl.setSGID(haysSalaryGuide.getSGID());
		haysSalaryGuideImpl.setSALARYTYPE(haysSalaryGuide.getSALARYTYPE());

		return haysSalaryGuideImpl;
	}

	/**
	 * Returns the hays salary guide with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the hays salary guide
	 * @return the hays salary guide
	 * @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	 */
	@Override
	public HaysSalaryGuide findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSalaryGuideException {
		HaysSalaryGuide haysSalaryGuide = fetchByPrimaryKey(primaryKey);

		if (haysSalaryGuide == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSalaryGuideException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return haysSalaryGuide;
	}

	/**
	 * Returns the hays salary guide with the primary key or throws a {@link NoSuchSalaryGuideException} if it could not be found.
	 *
	 * @param SGID the primary key of the hays salary guide
	 * @return the hays salary guide
	 * @throws NoSuchSalaryGuideException if a hays salary guide with the primary key could not be found
	 */
	@Override
	public HaysSalaryGuide findByPrimaryKey(String SGID)
		throws NoSuchSalaryGuideException {
		return findByPrimaryKey((Serializable)SGID);
	}

	/**
	 * Returns the hays salary guide with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hays salary guide
	 * @return the hays salary guide, or <code>null</code> if a hays salary guide with the primary key could not be found
	 */
	@Override
	public HaysSalaryGuide fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
				HaysSalaryGuideImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		HaysSalaryGuide haysSalaryGuide = (HaysSalaryGuide)serializable;

		if (haysSalaryGuide == null) {
			Session session = null;

			try {
				session = openSession();

				haysSalaryGuide = (HaysSalaryGuide)session.get(HaysSalaryGuideImpl.class,
						primaryKey);

				if (haysSalaryGuide != null) {
					cacheResult(haysSalaryGuide);
				}
				else {
					entityCache.putResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
						HaysSalaryGuideImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
					HaysSalaryGuideImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return haysSalaryGuide;
	}

	/**
	 * Returns the hays salary guide with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SGID the primary key of the hays salary guide
	 * @return the hays salary guide, or <code>null</code> if a hays salary guide with the primary key could not be found
	 */
	@Override
	public HaysSalaryGuide fetchByPrimaryKey(String SGID) {
		return fetchByPrimaryKey((Serializable)SGID);
	}

	@Override
	public Map<Serializable, HaysSalaryGuide> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, HaysSalaryGuide> map = new HashMap<Serializable, HaysSalaryGuide>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			HaysSalaryGuide haysSalaryGuide = fetchByPrimaryKey(primaryKey);

			if (haysSalaryGuide != null) {
				map.put(primaryKey, haysSalaryGuide);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
					HaysSalaryGuideImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (HaysSalaryGuide)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_HAYSSALARYGUIDE_WHERE_PKS_IN);

		for (int i = 0; i < uncachedPrimaryKeys.size(); i++) {
			query.append(StringPool.QUESTION);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			QueryPos qPos = QueryPos.getInstance(q);

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				qPos.add((String)primaryKey);
			}

			for (HaysSalaryGuide haysSalaryGuide : (List<HaysSalaryGuide>)q.list()) {
				map.put(haysSalaryGuide.getPrimaryKeyObj(), haysSalaryGuide);

				cacheResult(haysSalaryGuide);

				uncachedPrimaryKeys.remove(haysSalaryGuide.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(HaysSalaryGuideModelImpl.ENTITY_CACHE_ENABLED,
					HaysSalaryGuideImpl.class, primaryKey, nullModel);
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
	 * Returns all the hays salary guides.
	 *
	 * @return the hays salary guides
	 */
	@Override
	public List<HaysSalaryGuide> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<HaysSalaryGuide> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<HaysSalaryGuide> findAll(int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<HaysSalaryGuide> findAll(int start, int end,
		OrderByComparator<HaysSalaryGuide> orderByComparator,
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

		List<HaysSalaryGuide> list = null;

		if (retrieveFromCache) {
			list = (List<HaysSalaryGuide>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_HAYSSALARYGUIDE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HAYSSALARYGUIDE;

				if (pagination) {
					sql = sql.concat(HaysSalaryGuideModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HaysSalaryGuide>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HaysSalaryGuide>)QueryUtil.list(q,
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
	 * Removes all the hays salary guides from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HaysSalaryGuide haysSalaryGuide : findAll()) {
			remove(haysSalaryGuide);
		}
	}

	/**
	 * Returns the number of hays salary guides.
	 *
	 * @return the number of hays salary guides
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HAYSSALARYGUIDE);

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
		return HaysSalaryGuideModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hays salary guide persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(HaysSalaryGuideImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_HAYSSALARYGUIDE = "SELECT haysSalaryGuide FROM HaysSalaryGuide haysSalaryGuide";
	private static final String _SQL_SELECT_HAYSSALARYGUIDE_WHERE_PKS_IN = "SELECT haysSalaryGuide FROM HaysSalaryGuide haysSalaryGuide WHERE SGID IN (";
	private static final String _SQL_SELECT_HAYSSALARYGUIDE_WHERE = "SELECT haysSalaryGuide FROM HaysSalaryGuide haysSalaryGuide WHERE ";
	private static final String _SQL_COUNT_HAYSSALARYGUIDE = "SELECT COUNT(haysSalaryGuide) FROM HaysSalaryGuide haysSalaryGuide";
	private static final String _SQL_COUNT_HAYSSALARYGUIDE_WHERE = "SELECT COUNT(haysSalaryGuide) FROM HaysSalaryGuide haysSalaryGuide WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "haysSalaryGuide.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HaysSalaryGuide exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HaysSalaryGuide exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(HaysSalaryGuidePersistenceImpl.class);
}