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

package com.hays.service.salaryguide.service.base;

import aQute.bnd.annotation.ProviderType;

import com.hays.service.salaryguide.model.HaysSalaryGuide;
import com.hays.service.salaryguide.service.HaysSalaryGuideLocalService;
import com.hays.service.salaryguide.service.persistence.HaysSGUserDataPersistence;
import com.hays.service.salaryguide.service.persistence.HaysSalGuideUserDataUkPersistence;
import com.hays.service.salaryguide.service.persistence.HaysSalaryGuideFinder;
import com.hays.service.salaryguide.service.persistence.HaysSalaryGuidePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the hays salary guide local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.hays.service.salaryguide.service.impl.HaysSalaryGuideLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.impl.HaysSalaryGuideLocalServiceImpl
 * @see com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class HaysSalaryGuideLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements HaysSalaryGuideLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil} to access the hays salary guide local service.
	 */

	/**
	 * Adds the hays salary guide to the database. Also notifies the appropriate model listeners.
	 *
	 * @param haysSalaryGuide the hays salary guide
	 * @return the hays salary guide that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public HaysSalaryGuide addHaysSalaryGuide(HaysSalaryGuide haysSalaryGuide) {
		haysSalaryGuide.setNew(true);

		return haysSalaryGuidePersistence.update(haysSalaryGuide);
	}

	/**
	 * Creates a new hays salary guide with the primary key. Does not add the hays salary guide to the database.
	 *
	 * @param SGID the primary key for the new hays salary guide
	 * @return the new hays salary guide
	 */
	@Override
	public HaysSalaryGuide createHaysSalaryGuide(String SGID) {
		return haysSalaryGuidePersistence.create(SGID);
	}

	/**
	 * Deletes the hays salary guide with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SGID the primary key of the hays salary guide
	 * @return the hays salary guide that was removed
	 * @throws PortalException if a hays salary guide with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public HaysSalaryGuide deleteHaysSalaryGuide(String SGID)
		throws PortalException {
		return haysSalaryGuidePersistence.remove(SGID);
	}

	/**
	 * Deletes the hays salary guide from the database. Also notifies the appropriate model listeners.
	 *
	 * @param haysSalaryGuide the hays salary guide
	 * @return the hays salary guide that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public HaysSalaryGuide deleteHaysSalaryGuide(
		HaysSalaryGuide haysSalaryGuide) {
		return haysSalaryGuidePersistence.remove(haysSalaryGuide);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(HaysSalaryGuide.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return haysSalaryGuidePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.service.salaryguide.model.impl.HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return haysSalaryGuidePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.service.salaryguide.model.impl.HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return haysSalaryGuidePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return haysSalaryGuidePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return haysSalaryGuidePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public HaysSalaryGuide fetchHaysSalaryGuide(String SGID) {
		return haysSalaryGuidePersistence.fetchByPrimaryKey(SGID);
	}

	/**
	 * Returns the hays salary guide with the primary key.
	 *
	 * @param SGID the primary key of the hays salary guide
	 * @return the hays salary guide
	 * @throws PortalException if a hays salary guide with the primary key could not be found
	 */
	@Override
	public HaysSalaryGuide getHaysSalaryGuide(String SGID)
		throws PortalException {
		return haysSalaryGuidePersistence.findByPrimaryKey(SGID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return haysSalaryGuideLocalService.deleteHaysSalaryGuide((HaysSalaryGuide)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return haysSalaryGuidePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the hays salary guides.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hays.service.salaryguide.model.impl.HaysSalaryGuideModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of hays salary guides
	 * @param end the upper bound of the range of hays salary guides (not inclusive)
	 * @return the range of hays salary guides
	 */
	@Override
	public List<HaysSalaryGuide> getHaysSalaryGuides(int start, int end) {
		return haysSalaryGuidePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of hays salary guides.
	 *
	 * @return the number of hays salary guides
	 */
	@Override
	public int getHaysSalaryGuidesCount() {
		return haysSalaryGuidePersistence.countAll();
	}

	/**
	 * Updates the hays salary guide in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param haysSalaryGuide the hays salary guide
	 * @return the hays salary guide that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public HaysSalaryGuide updateHaysSalaryGuide(
		HaysSalaryGuide haysSalaryGuide) {
		return haysSalaryGuidePersistence.update(haysSalaryGuide);
	}

	/**
	 * Returns the hays salary guide local service.
	 *
	 * @return the hays salary guide local service
	 */
	public HaysSalaryGuideLocalService getHaysSalaryGuideLocalService() {
		return haysSalaryGuideLocalService;
	}

	/**
	 * Sets the hays salary guide local service.
	 *
	 * @param haysSalaryGuideLocalService the hays salary guide local service
	 */
	public void setHaysSalaryGuideLocalService(
		HaysSalaryGuideLocalService haysSalaryGuideLocalService) {
		this.haysSalaryGuideLocalService = haysSalaryGuideLocalService;
	}

	/**
	 * Returns the hays salary guide persistence.
	 *
	 * @return the hays salary guide persistence
	 */
	public HaysSalaryGuidePersistence getHaysSalaryGuidePersistence() {
		return haysSalaryGuidePersistence;
	}

	/**
	 * Sets the hays salary guide persistence.
	 *
	 * @param haysSalaryGuidePersistence the hays salary guide persistence
	 */
	public void setHaysSalaryGuidePersistence(
		HaysSalaryGuidePersistence haysSalaryGuidePersistence) {
		this.haysSalaryGuidePersistence = haysSalaryGuidePersistence;
	}

	/**
	 * Returns the hays salary guide finder.
	 *
	 * @return the hays salary guide finder
	 */
	public HaysSalaryGuideFinder getHaysSalaryGuideFinder() {
		return haysSalaryGuideFinder;
	}

	/**
	 * Sets the hays salary guide finder.
	 *
	 * @param haysSalaryGuideFinder the hays salary guide finder
	 */
	public void setHaysSalaryGuideFinder(
		HaysSalaryGuideFinder haysSalaryGuideFinder) {
		this.haysSalaryGuideFinder = haysSalaryGuideFinder;
	}

	/**
	 * Returns the hays sal guide user data uk local service.
	 *
	 * @return the hays sal guide user data uk local service
	 */
	public com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalService getHaysSalGuideUserDataUkLocalService() {
		return haysSalGuideUserDataUkLocalService;
	}

	/**
	 * Sets the hays sal guide user data uk local service.
	 *
	 * @param haysSalGuideUserDataUkLocalService the hays sal guide user data uk local service
	 */
	public void setHaysSalGuideUserDataUkLocalService(
		com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalService haysSalGuideUserDataUkLocalService) {
		this.haysSalGuideUserDataUkLocalService = haysSalGuideUserDataUkLocalService;
	}

	/**
	 * Returns the hays sal guide user data uk persistence.
	 *
	 * @return the hays sal guide user data uk persistence
	 */
	public HaysSalGuideUserDataUkPersistence getHaysSalGuideUserDataUkPersistence() {
		return haysSalGuideUserDataUkPersistence;
	}

	/**
	 * Sets the hays sal guide user data uk persistence.
	 *
	 * @param haysSalGuideUserDataUkPersistence the hays sal guide user data uk persistence
	 */
	public void setHaysSalGuideUserDataUkPersistence(
		HaysSalGuideUserDataUkPersistence haysSalGuideUserDataUkPersistence) {
		this.haysSalGuideUserDataUkPersistence = haysSalGuideUserDataUkPersistence;
	}

	/**
	 * Returns the hays sg user data local service.
	 *
	 * @return the hays sg user data local service
	 */
	public com.hays.service.salaryguide.service.HaysSGUserDataLocalService getHaysSGUserDataLocalService() {
		return haysSGUserDataLocalService;
	}

	/**
	 * Sets the hays sg user data local service.
	 *
	 * @param haysSGUserDataLocalService the hays sg user data local service
	 */
	public void setHaysSGUserDataLocalService(
		com.hays.service.salaryguide.service.HaysSGUserDataLocalService haysSGUserDataLocalService) {
		this.haysSGUserDataLocalService = haysSGUserDataLocalService;
	}

	/**
	 * Returns the hays sg user data persistence.
	 *
	 * @return the hays sg user data persistence
	 */
	public HaysSGUserDataPersistence getHaysSGUserDataPersistence() {
		return haysSGUserDataPersistence;
	}

	/**
	 * Sets the hays sg user data persistence.
	 *
	 * @param haysSGUserDataPersistence the hays sg user data persistence
	 */
	public void setHaysSGUserDataPersistence(
		HaysSGUserDataPersistence haysSGUserDataPersistence) {
		this.haysSGUserDataPersistence = haysSGUserDataPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.hays.service.salaryguide.model.HaysSalaryGuide",
			haysSalaryGuideLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.hays.service.salaryguide.model.HaysSalaryGuide");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HaysSalaryGuideLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return HaysSalaryGuide.class;
	}

	protected String getModelClassName() {
		return HaysSalaryGuide.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = haysSalaryGuidePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = HaysSalaryGuideLocalService.class)
	protected HaysSalaryGuideLocalService haysSalaryGuideLocalService;
	@BeanReference(type = HaysSalaryGuidePersistence.class)
	protected HaysSalaryGuidePersistence haysSalaryGuidePersistence;
	@BeanReference(type = HaysSalaryGuideFinder.class)
	protected HaysSalaryGuideFinder haysSalaryGuideFinder;
	@BeanReference(type = com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalService.class)
	protected com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalService haysSalGuideUserDataUkLocalService;
	@BeanReference(type = HaysSalGuideUserDataUkPersistence.class)
	protected HaysSalGuideUserDataUkPersistence haysSalGuideUserDataUkPersistence;
	@BeanReference(type = com.hays.service.salaryguide.service.HaysSGUserDataLocalService.class)
	protected com.hays.service.salaryguide.service.HaysSGUserDataLocalService haysSGUserDataLocalService;
	@BeanReference(type = HaysSGUserDataPersistence.class)
	protected HaysSGUserDataPersistence haysSGUserDataPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}