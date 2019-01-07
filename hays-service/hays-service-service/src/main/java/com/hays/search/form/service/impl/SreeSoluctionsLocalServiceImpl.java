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

import com.hays.search.form.service.base.SreeSoluctionsLocalServiceBaseImpl;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;

import java.util.List;

/**
 * The implementation of the sree soluctions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hays.search.form.service.SreeSoluctionsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sreenivasulu
 * @see SreeSoluctionsLocalServiceBaseImpl
 * @see com.hays.search.form.service.SreeSoluctionsLocalServiceUtil
 */
public class SreeSoluctionsLocalServiceImpl
	extends SreeSoluctionsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.hays.search.form.service.SreeSoluctionsLocalServiceUtil} to access the sree soluctions local service.
	 */
	public JSONObject getUserList(){
		
		System.out.println("Inside Persistance Impl Class");
		
		JSONObject resObj = JSONFactoryUtil.createJSONObject();
		List<Object[]> userList = sreeSoluctionsFinder.getUserDetails();
		
		for(int i=0 ; i< userList.size(); i++){
			resObj.put(String.valueOf(i), userList.get(i)[i]);
		}
		return resObj;
	}
	public JSONObject getUsersByNameAndDesignation(String jobTitle, String name){
		
		System.out.println("Inside Persistance Impl Class");
		
		JSONObject resObj = JSONFactoryUtil.createJSONObject();
		
		List<Object[]> userList = sreeSoluctionsFinder.getUserByOrCondition(jobTitle, name);
		
		for(int i=0 ; i< userList.size(); i++){
			
			resObj.put(String.valueOf(i), userList.get(i)[i]);
		}
		return resObj;
	}
}