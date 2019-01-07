package com.hays.search.form.service.persistence.impl;

import com.hays.search.form.model.Employee;
import com.hays.search.form.service.persistence.EmployeeFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.List;

public class EmployeeFinderImpl extends  EmployeeFinderBaseImpl implements EmployeeFinder{

	
	@SuppressWarnings("unchecked")
	public List<Object[]> findbyDesignation(String designation){
		
		System.out.println("Name Of Designation >>" + designation);
		
		if(designation != null && designation.length() > 0){
			
			Session session = null;
			session = openSession();
			try{
				String sql = CustomSQLUtil.get(Employee.class, FIND_BY_DESIGNATION);
				
				SQLQuery query = session.createSQLQuery(sql);
				
				QueryPos qPos = QueryPos.getInstance(query);
				qPos.add(designation+"%");
				
				System.out.println("query >>" + sql);
				System.out.println("qPos >>" + qPos);
				
				return (List<Object[]>)query.list();
			}catch(Exception e){
				e.getMessage();
			}finally{
				session.clear();
				closeSession(session);
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> employeeName(){
		
		Session session = openSession();
		try{
		String sql = CustomSQLUtil.get(Employee.class,EMPLOYEE_NAME);

		Query query = session.createSQLQuery(sql);
		
		QueryPos qPos = QueryPos.getInstance(query);

		
		System.out.println("query" + sql + "qPos >>" + qPos);
		
		return (List<Object>)query.list();
		}catch(Exception e){
			e.getMessage();
		}finally{
			session.clear();
			closeSession(session);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getUserList(){
		
		Session session = openSession();
		try{
			Query query = session.createSQLQuery("select * from user_");
			
			QueryPos qPos = QueryPos.getInstance(query);
			
			System.out.println("query >>" + query);
			System.out.println("qPos >>" + qPos);
			
			return (List<Object[]>)query.list();
		}catch(Exception e){
			e.getMessage();
		}finally{
			session.clear();
			closeSession(session);
		}
		return null;
		
	}
	
	private static final String FIND_BY_DESIGNATION = EmployeeFinder.class.getName() +".findbyDesignation";
	private static final String EMPLOYEE_NAME = EmployeeFinder.class.getName() +".employeeName";

}
