package com.hays.search.form.service.persistence.impl;

import com.hays.search.form.service.persistence.SreeSoluctionsFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.List;

public class SreeSoluctionsFinderImpl extends SreeSoluctionsFinderBaseImpl implements SreeSoluctionsFinder{


	private static final String USER_DETAILS = SreeSoluctionsFinder.class.getName() + ".getUserDetails";
	private static final String USER_DETAILS_BY_AND_CONDITION = SreeSoluctionsFinder.class.getName() + ".getUserDetails";
	public  List<Object[]> getUserDetails(){
		
		System.out.println("className >>"  + SreeSoluctionsFinder.class.getName() + ".getUserDetails");
		
		Session session = null;
		
		try{
			session = openSession();
			
			String queryString = CustomSQLUtil.get(getClass(), USER_DETAILS);
			
			System.out.println("Query >>" + queryString);
			
			Query query = session.createSQLQuery(queryString);
			
			QueryPos pos = QueryPos.getInstance(query);
			
			System.out.println("pos >>>" + pos);
			
			System.out.println("Size >>" + query.list().size());
			
			return (List<Object[]>)query.list();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		System.out.println("before Null Return >>");
		return null;
		
	}
	
	
	public List<Object[]> getUserByOrCondition(String jobTitle,String name){
		//Ex : '%Software%' 
		
		Session session = null;
		
		session = openSession();
		
		String queryString = CustomSQLUtil.get(getClass(), USER_DETAILS_BY_AND_CONDITION);
		
		Query query = session.createQuery(queryString);
		
		QueryPos qPos = QueryPos.getInstance(query);
		
		jobTitle = "%"+jobTitle+"%";
		name = "%"+name+"%";
				
		qPos.add(jobTitle);
		qPos.add(name);
		return (List<Object[]>)query.list();
	}
	
}
