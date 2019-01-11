package com.hays.sg.form.portlet.constants;

import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author ramayanapus
 */
public class SalaryGuideFormPortletKeys {

	public static final String SalaryGuideForm = "salaryguideform";
	
	
	/*public static final String DATA_SITEKEY = "6LfDDoUUAAAAACwXTwKOkAF2xO-N_Bd2zrmvaujS";
	public static final String DATA_SECRET_KEY = "6LfDDoUUAAAAAC_eGaghWoQMVE19h_KxsmPbq5UV";
	public static final String CAPTCHA_URL =  "https://www.google.com/recaptcha/api/siteverify";*/
	
	public static final String DATA_SITEKEY  = Validator.isNotNull(PropsUtil.get("PublicKey")) ? PropsUtil.get("PublicKey") : "6Leb5hUTAAAAAFzQ2ThiPeTqaWujG5kVnsK2QLaZ";
	public static final String DATA_SECRET_KEY  = Validator.isNotNull(PropsUtil.get("PrivateKey")) ? PropsUtil.get("PrivateKey") : "6Leb5hUTAAAAAD1vTU5PMXKBkBRUKWWf8uwyWWwg";
	public static final String CAPTCHA_URL  = Validator.isNotNull(PropsUtil.get("url")) ? PropsUtil.get("url") : "https://www.google.com/recaptcha/api/siteverify";

}