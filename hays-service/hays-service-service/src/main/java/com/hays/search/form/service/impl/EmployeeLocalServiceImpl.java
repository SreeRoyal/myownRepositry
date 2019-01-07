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

package com.hays.search.form.service.impl;

import com.hays.search.form.exception.NoSuchEmployeeException;
import com.hays.search.form.model.Employee;
import com.hays.search.form.service.EmployeeLocalServiceUtil;
import com.hays.search.form.service.base.EmployeeLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hays.search.form.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sreenivasulu
 * @see EmployeeLocalServiceBaseImpl
 * @see com.hays.search.form.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.hays.search.form.service.EmployeeLocalServiceUtil} to access the employee local service.
	 */
	
	@Indexable(type = IndexableType.REINDEX)
	public Employee updateEmployee(long employeeId,
			ServiceContext serviceContext, String employeeName, String address,
			String mobileNumber, String emailAddress, String designation)
			throws SystemException {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: updateEmployee ");

		Employee employee = null;

		if (employeeId > 0) {
			try {
				employee = fetchEmployee(employeeId);
				employee.setModifiedDate(new Date());
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}

		if (employee == null) {

			try {
				employee = createEmployee(counterLocalService
						.increment(Employee.class.getName()));
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}

		employee.setEmployeeName(employeeName);
		employee.setAddress(address);
		employee.setMobileNumber(mobileNumber);
		employee.setEmailAddress(emailAddress);
		employee.setDesignation(designation);

		employee.setUserId(serviceContext.getUserId());
		User user = UserLocalServiceUtil.fetchUser(serviceContext.getUserId());
		employee.setUserName(user.getFullName());
		employee.setGroupId(serviceContext.getScopeGroupId());
		employee.setCompanyId(serviceContext.getCompanyId());

		serviceContext.setAddGroupPermissions(true);
		serviceContext.setAddGuestPermissions(true);

		
		employee.setCreatedDate(new Date());

		employee = addEmployee(employee);
		
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Employee.class);
		try {
			indexer.reindex(employee);
		} catch (SearchException e) {
			e.printStackTrace();
		}
		
		return employee;

	}
	
	/*
	 * This Method is For Delete Employee --> D
	 */
	
	public Employee deleteEmployee(Employee employee) {
		
		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: deleteEmployee >>");

		if (employee != null) {
			try {
				employee = EmployeeLocalServiceUtil.deleteEmployee(employee);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		
		return employee;
	}
	
	/*
	 * This Method is For Update Employee---> U
	 */
	
	public Employee updateEmployee(long employeeId, String employeeName, String emailAddress, String designation, String mobileNumber, String address){
		
		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: updateEmployee >>");

		Employee employee = null;
		
		if(employeeId > 0){
			try {
				employee = EmployeeLocalServiceUtil.fetchEmployee(employeeId);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		
		if(employee != null){
			
			employee.setEmployeeName(employeeName);
			employee.setEmailAddress(emailAddress);
			employee.setDesignation(designation);
			employee.setMobileNumber(mobileNumber);
			employee.setEmailAddress(emailAddress);
			employee.setAddress(address);
			employee.setModifiedDate(new Date());
			
			try {
				employee = updateEmployee(employee);
				
				Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Employee.class);
				try {
					indexer.reindex(employee);
				} catch (SearchException e) {
					e.printStackTrace();
				}
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		
		return employee;
	}
	
	/*
	 * This Method is For Reading Employee using FinderQuery
	 */

	public Employee findByName(String employeeName) {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: findByName >>" + employeeName);

		if (employeeName != null && employeeName.length() > 0) {

			try {
				return employeePersistence.findByEmployee_Name(employeeName);
			} catch (NoSuchEmployeeException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
	
	/*
	 * This Method is For Reading Employee using FinderQuery
	 */
	public List<Employee> findByDesignation(String designation) {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: findByDesignation >>>" + designation);

		if (designation != null && designation.length() > 0) {

			try {
				return employeePersistence.findByDesignation(designation);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	 * This Method is For Reading Employee using FinderQuery
	 * Taking list Data
	 */
	public List<Employee> findByDesignation(String designation, int start,
			int end) {

		System.out
				.println("Class Name --> EmployeeLocalServiceImpl Method Name :: findByDesignation "
						+ designation + "start >>" + start + "End >>" + end);

		if (designation != null && designation.length() > 0) {

			try {
				return employeePersistence.findByDesignation(designation,
						start, end);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	/*
	 * This Method is For Reading Employee using DynamicQuery
	 * Using RestrictionFactory Util
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> findByDesignationUsingRestrictionFactoryInDynamicQuery(String designation) {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: findByDesignationUsingRestrictionFactoryInDynamicQuery "+ designation);

		DynamicQuery employeeQuery = DynamicQueryFactoryUtil.forClass(Employee.class);

		List<Employee> employees = Collections.EMPTY_LIST;

		if (designation != null && designation.length() > 0) {

			employeeQuery.add(RestrictionsFactoryUtil.like("designation",
					designation));

			try {
				employees = EmployeeLocalServiceUtil.dynamicQuery(employeeQuery);
				return employees;
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	

	/*
	 * This Method is For Reading Employee using DynamicQuery
	 * Using PropertyFactory Util
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> findByDesignationUsingPropertyFactoryInDynamicQuery(
			String designation) {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: findByDesignationUsingPropertyFactoryInDynamicQuery "+ designation);

		DynamicQuery employeeQuery = DynamicQueryFactoryUtil
				.forClass(Employee.class);

		List<Employee> employees = Collections.EMPTY_LIST;

		if (designation != null && designation.length() > 0) {

			employeeQuery.add(PropertyFactoryUtil.forName("designation").like(designation));

			try {
				employees = EmployeeLocalServiceUtil.dynamicQuery(employeeQuery);
				return employees;
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	 * This Method is For Reading Employee using Custom SQL
	 * Hibernate Query Language
	 */

	/*public List<Object[]> findByDesignationUsingCustomSQL(String designation) {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: findByDesignationUsingCustomSQL " + designation);

		if (designation != null && designation.length() > 0) {

			return EmployeeFinderUtil.
		}
		return null;
	}
	
	public List<Object> findBySample() {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: findBySample ");

		return EmployeeFinderUtil.employeeName();
	}
	public List<Object[]> getUserList() {

		System.out.println("Class Name --> EmployeeLocalServiceImpl Method Name :: getUserList ");

		return EmployeeFinderUtil.getUserList();
	}*/
}