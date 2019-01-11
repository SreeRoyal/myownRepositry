<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@ page import="com.hays.portlet.constants.SalaryGuideConstants"%>
<%@ page import="com.hays.service.salaryguide.service.HaysSalaryGuideLocalServiceUtil" %>
<%@ page import="com.hays.service.salaryguide.model.HaysSalaryGuide"%>
<%@ page import="java.util.List"%>

<script src='https://www.google.com/recaptcha/api.js'></script>


<liferay-theme:defineObjects />

<portlet:defineObjects />