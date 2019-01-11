<%@page import="com.hays.sg.form.portlet.constants.SalaryGuideFormPortletKeys"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@ include file="init.jsp"%>
<%@ include file="validations/validation.jsp" %>

<%

JSONObject languageKeys = (JSONObject)renderRequest.getAttribute("langugaeKeys");
%>


<c:set var="name" value="<%=languageKeys.get("lr_SGName")%>"/>
<c:set var="jobTitle" value="<%=languageKeys.get("lr_SGTitle") %>"/>
<c:set var="organization" value="<%=languageKeys.get("lr_SGOrganisation")%>"/>
<c:set var="location" value="<%=languageKeys.get("lr_SGState")%>"/>
<c:set var="emailAddress" value="<%=languageKeys.get("lr_SGEmailAddressLabel")%>"/>


<c:set var="namePlcaeHolder" value="<%=languageKeys.get("lr_SGNameWatermark")%>"/>
<c:set var="titlePlaceHolder" value="<%=languageKeys.get("lr_SGJobTitleWatermark")%>"/>
<c:set var="organizationPlaceHolder" value="<%=languageKeys.get("lr_SGOrganisationWatermark")%>"/>
<c:set var="locationPlcaeHolder" value="<%=languageKeys.get("lr_SGLocationWatermark")%>"/>
<c:set var="emailPlaceHolder" value="<%=languageKeys.get("lr_SGEmailAddressWatermark")%>"/>

<c:set var="lr_SGPDFButtonText" value="<%=languageKeys.get("lr_SGPDFButtonText")%>"></c:set>

<c:set var="mailHeading" value="<%=languageKeys.get("lr_SGReportHeadingText")%>"/>


<c:set var="dataSiteKey" value="<%=SalaryGuideFormPortletKeys.DATA_SITEKEY%>"/>

<portlet:resourceURL var="sgDataURl"/>

<form method="post" name="sgData">
<div class="salary-guide-download">
	<h2 class="underline">${mailHeading}</h2>
	<ul class="form label-in-row">
		<li class="first">
		<label >${name}</label>
			<div class="input">
				<input autocomplete="off" class="mandatory" type="text" placeholder="${namePlcaeHolder}" name="sg_name" id="sg_name" maxlength="50" onkeyup="isValidName();">
				<span id="nameErr" style="color:#e98300;"></span>
			</div>
		</li>
		<li>
			<label class="required">${jobTitle}</label>
			<div class="input">
				<input autocomplete="off" class="mandatory" type="text" placeholder="${titlePlaceHolder}" name="sg_title" id="sg_title" maxlength="50" onkeyup="isValidTitle();">
				<span id="titleErr" style="color:#e98300;"></span>
			</div>
		</li>
		<li>
			<label class="required">${organization}</label>
			<div class="input">
				<input autocomplete="off" class="mandatory" type="text" placeholder="${organizationPlaceHolder}" name="sg_organisation" id="sg_organisation" maxlength="50" onkeyup="isValidOrganization();">
				<span id="orgErr" style="color:#e98300;"></span>
			</div>
		</li>
		<li>
			<label class="required">${location}</label>
			<div class="input">
				<input autocomplete="off" class="mandatory" type="text" placeholder="${locationPlcaeHolder}" name="sg_state" id="sg_state" maxlength="50" onkeyup="isValidateLocation();">
				<span id="locErr" style="color:#e98300;"></span>
			</div>
		</li>
		<li>
			<label class="required">${emailAddress}</label>
			<div class="input">
				<input class="mandatory email" type="text" placeholder="${emailPlaceHolder}" autocomplete="off" name="sg_email_id" id="sg_email_id" maxlength="50" onkeyup="isValidatedEmail();">
				<span id="emailSgErr" style="color:#e98300;"></span>
			</div>
		</li>
		
		<div class="g-recaptcha" data-sitekey="${dataSiteKey}" data-callback="callback"></div>
	    <span id="capError" style="color:#e98300;"></span>
		<li>
			<button type="button" id="sg_submit_button" name="sg_submit_button" class="btn btn-block" onclick="submitSGFormDetails();">
				<span>${lr_SGPDFButtonText}</span>
			</button>
		</li>
		<span>By downloading the Hays Salary Guide you consent to Hays contacting you in the future. </span>
		<br>
		<span> View our Privacy Notice <a href="http://www.hays.com.mx/general-content/politica-de-privacidad-426171" target="_blank">here</a></span>
    </ul>
  </div>
</form>

<script>

function callback(){
	
	iscapthaValidate();
}


function submitSGFormDetails(){
	
	var isNameValid,isTitleValid,isValidOrg,isValidLoc,isValidEmail,isValidCaptcha;
	
	isNameValid = isValidName();
	isTitleValid = isValidTitle();
	isValidOrg = isValidOrganization();
	isValidLoc = isValidateLocation();
	isValidEmail = isValidatedEmail();
	isValidCaptcha = iscapthaValidate();
	
	/* console.log("isValidName >>",isNameValid);
	console.log("isValidTitle >>",isTitleValid);
	console.log("isValidOrg >>",isValidOrg);
	console.log("isValidLoc >>",isValidLoc);
	console.log("isValidEmail >>",isValidEmail);
	console.log("isValidCaptcha >>",isValidCaptcha); */

	if(isNameValid && isTitleValid && isValidOrg && isValidLoc && isValidEmail && isValidCaptcha){
		//alert("!! Allowing Inside !!!!");
		downloadSalaryGuideForm();
	}	
}


function downloadSalaryGuideForm(){
	
	var finalData =  $("form").serialize();
	
	$.ajax({
		 url : '<%=sgDataURl%>',
		 type : 'Post',
		 dataType:'json',
		 data : finalData,
		 success : function(data){
			 //console.log(data);
			 if(data){
				window.open('http://www.hays.com.au/cs/groups/hays_common/@au/@content/documents/digitalasset/hays_1309100.pdf', '_blank');
				window.location.reload();
			 }
		 }
	
    });
}
</script>