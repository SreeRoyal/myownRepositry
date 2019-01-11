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

import com.hays.service.salaryguide.model.HaysSalGuideUserDataUk;
import com.hays.service.salaryguide.service.HaysSalGuideUserDataUkService;
import com.hays.service.salaryguide.service.persistence.HaysSGUserDataPersistence;
import com.hays.service.salaryguide.service.persistence.HaysSalGuideUserDataUkPersistence;
import com.hays.service.salaryguide.service.persistence.HaysSalaryGuideFinder;
import com.hays.service.salaryguide.service.persistence.HaysSalaryGuidePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the hays sal guide user data uk remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.hays.service.salaryguide.service.impl.HaysSalGuideUserDataUkServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.hays.service.salaryguide.service.impl.HaysSalGuideUserDataUkServiceImpl
 * @see com.hays.service.salaryguide.service.HaysSalGuideUserDataUkServiceUtil
 * @generated
 */
public abstract class HaysSalGuideUserDataUkServiceBaseImpl
	extends BaseServiceImpl implements HaysSalGuideUserDataUkService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.hays.service.salaryguide.service.HaysSalGuideUserDataUkServiceUtil} to access the hays sal guide user data uk remote service.
	 */

	/**
	 * Returns the hays salary guide local service.
	 *
	 * @return the hays salary guide local service
	 */
	public com.hays.service.salaryguide.service.HaysSalaryGuideLocalService getHaysSalaryGuideLocalService() {
		return haysSalaryGuideLocalService;
	}

	/**
	 * Sets the hays salary guide local service.
	 *
	 * @param haysSalaryGuideLocalService the hays salary guide local service
	 */
	public void setHaysSalaryGuideLocalService(
		com.hays.service.salaryguide.service.HaysSalaryGuideLocalService haysSalaryGuideLocalService) {
		this.haysSalaryGuideLocalService = haysSalaryGuideLocalService;
	}

	/**
	 * Returns the hays salary guide remote service.
	 *
	 * @return the hays salary guide remote service
	 */
	public com.hays.service.salaryguide.service.HaysSalaryGuideService getHaysSalaryGuideService() {
		return haysSalaryGuideService;
	}

	/**
	 * Sets the hays salary guide remote service.
	 *
	 * @param haysSalaryGuideService the hays salary guide remote service
	 */
	public void setHaysSalaryGuideService(
		com.hays.service.salaryguide.service.HaysSalaryGuideService haysSalaryGuideService) {
		this.haysSalaryGuideService = haysSalaryGuideService;
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
	 * Returns the hays sal guide user data uk remote service.
	 *
	 * @return the hays sal guide user data uk remote service
	 */
	public HaysSalGuideUserDataUkService getHaysSalGuideUserDataUkService() {
		return haysSalGuideUserDataUkService;
	}

	/**
	 * Sets the hays sal guide user data uk remote service.
	 *
	 * @param haysSalGuideUserDataUkService the hays sal guide user data uk remote service
	 */
	public void setHaysSalGuideUserDataUkService(
		HaysSalGuideUserDataUkService haysSalGuideUserDataUkService) {
		this.haysSalGuideUserDataUkService = haysSalGuideUserDataUkService;
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
	 * Returns the hays sg user data remote service.
	 *
	 * @return the hays sg user data remote service
	 */
	public com.hays.service.salaryguide.service.HaysSGUserDataService getHaysSGUserDataService() {
		return haysSGUserDataService;
	}

	/**
	 * Sets the hays sg user data remote service.
	 *
	 * @param haysSGUserDataService the hays sg user data remote service
	 */
	public void setHaysSGUserDataService(
		com.hays.service.salaryguide.service.HaysSGUserDataService haysSGUserDataService) {
		this.haysSGUserDataService = haysSGUserDataService;
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
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
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
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
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
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HaysSalGuideUserDataUkService.class.getName();
	}

	protected Class<?> getModelClass() {
		return HaysSalGuideUserDataUk.class;
	}

	protected String getModelClassName() {
		return HaysSalGuideUserDataUk.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = haysSalGuideUserDataUkPersistence.getDataSource();

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

	@BeanReference(type = com.hays.service.salaryguide.service.HaysSalaryGuideLocalService.class)
	protected com.hays.service.salaryguide.service.HaysSalaryGuideLocalService haysSalaryGuideLocalService;
	@BeanReference(type = com.hays.service.salaryguide.service.HaysSalaryGuideService.class)
	protected com.hays.service.salaryguide.service.HaysSalaryGuideService haysSalaryGuideService;
	@BeanReference(type = HaysSalaryGuidePersistence.class)
	protected HaysSalaryGuidePersistence haysSalaryGuidePersistence;
	@BeanReference(type = HaysSalaryGuideFinder.class)
	protected HaysSalaryGuideFinder haysSalaryGuideFinder;
	@BeanReference(type = com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalService.class)
	protected com.hays.service.salaryguide.service.HaysSalGuideUserDataUkLocalService haysSalGuideUserDataUkLocalService;
	@BeanReference(type = HaysSalGuideUserDataUkService.class)
	protected HaysSalGuideUserDataUkService haysSalGuideUserDataUkService;
	@BeanReference(type = HaysSalGuideUserDataUkPersistence.class)
	protected HaysSalGuideUserDataUkPersistence haysSalGuideUserDataUkPersistence;
	@BeanReference(type = com.hays.service.salaryguide.service.HaysSGUserDataLocalService.class)
	protected com.hays.service.salaryguide.service.HaysSGUserDataLocalService haysSGUserDataLocalService;
	@BeanReference(type = com.hays.service.salaryguide.service.HaysSGUserDataService.class)
	protected com.hays.service.salaryguide.service.HaysSGUserDataService haysSGUserDataService;
	@BeanReference(type = HaysSGUserDataPersistence.class)
	protected HaysSGUserDataPersistence haysSGUserDataPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}