<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@ include file="init.jsp" %>
<%@ include file="validations/salary-checker-validations.jsp" %>


<%
	JSONObject dropDownList = (JSONObject)renderRequest.getAttribute("dropDownList");
	List<String> salaryGuides = (List<String>) renderRequest.getAttribute("salGuideList");
	JSONObject languageKeys = (JSONObject)renderRequest.getAttribute("languageKeysObj");
%>

<p><%=languageKeys.get("lr_SGSummaryText")%></p>


<c:set value="<%=dropDownList.length() %>" var="dropDownLength"/>

<!-- !! Salary Guide Constants !!-->

<c:set var="getCategoriesConst" value="<%=SalaryGuideConstants.CATEGORY%>"/>
<c:set var="getareasConst" value="<%=SalaryGuideConstants.AREA%>"/>
<c:set var="getOrganizatioTypeConst" value="<%=SalaryGuideConstants.ORGANIZATION_TYPE%>"/>
<c:set var="getJobtitlesConst" value="<%=SalaryGuideConstants.JOB_TITLE%>"/>
<c:set var="getRegionsConst" value="<%=SalaryGuideConstants.REGION%>"/>

<c:set var="dataSiteKey" value="<%=SalaryGuideConstants.DATA_SITEKEY %>"/>
<c:set var="checkSalary" value="<%=SalaryGuideConstants.SALARY_CHECKER %>"/>


<c:set var="areaOfExpertise" value="<%=languageKeys.get("lr_SGAreaOfExpertiseLabel") %>"></c:set>
<c:set var="category" value="<%=languageKeys.get("lr_SGCategoryLabel") %>"/>
<c:set var="areaLabel" value="<%=languageKeys.get("lr_SGArea") %>"/>
<c:set var="organisationType" value="<%=languageKeys.get("lr_SGOrganisationType") %>"/>
<c:set var="jobTitle" value="<%=languageKeys.get("lr_SGJobTitleLabel") %>"/>
<c:set var="region" value="<%=languageKeys.get("lr_SGRegionLabel") %>"/>
<c:set var="emailAddressWaterMark" value="<%=languageKeys.get("lr_SGUserEmailWatermark") %>"/>
<c:set var="emailAddress" value="<%=languageKeys.get("lr_SGEmailAddressLabel")%>"></c:set>
<c:set var="termsAndCondition" value="<%=languageKeys.get("lr_SalaryGuideFormTermAndCond") %>"/>
<%
String currentSalary = languageKeys.get("lr_SGCurrentSalaryLabel") +StringPool.SPACE + StringPool.OPEN_PARENTHESIS+ languageKeys.get("lr_SGCurrencySymbol") + StringPool.CLOSE_PARENTHESIS;
%>
<c:set var="currencySalaryLabel" value="<%=currentSalary%>"/>
<c:set var="defaultSelectOption" value="<%=languageKeys.get("lr_SGDropDownSelect") %>"/>
<c:set var="checkMySalary" value="<%=languageKeys.get("lr_SGSubmitButtonLabel") %>"/>
<c:set var="salaryGuideList" value="<%=salaryGuides %>"/>
<c:set var="salaryPlaceHolder" value="<%=languageKeys.get("lr_SGCurrentSalaryWatermark") %>"/>

<portlet:resourceURL var="salaryCheckerURL">
	<portlet:param name="constant" value="${checkSalary}"/>
</portlet:resourceURL>

<portlet:resourceURL var="baseResourceUrl"/>

<%--
<%=salaryGuides%>
<c:if test="${not empty salaryGuideList}"> 
 <%=renderRequest.getContextPath()%> 
<c:set value="<%=renderRequest.getContextPath()%>" var="contextPath"/>
<portlet:renderURL var="languageURL">
	<portlet:param name="jspPage" value="/SalaryGuide/salary-guide.jsp"/>
</portlet:renderURL>
<a href="${languageURL}">Language</a>
--%>

<c:set var="industry" value="<%=dropDownList.get("Industry")%>"/>
<c:set var="sector" value="<%=dropDownList.get("Sector")%>"/>
<c:set var="area" value="<%=dropDownList.get("Area")%>"/>
<c:set var="company" value="<%=dropDownList.get("Company")%>"/>
<c:set var="positionName" value="<%=dropDownList.get("positionName")%>"/>
<c:set var="region" value="<%=dropDownList.get("Location")%>"/>


<div class="col col-4 first">
	<form id="salaryChecker" name="salaryChecker" method="post">
		<ul>
			<c:if test="${industry}">
				<li>
				  <label class="required">${areaOfExpertise}</label> <select
					name="areaOfExpertise" id="areaOfExpertise"
					onchange="getCategories();">
						<option value="">${defaultSelectOption}</option>
						<%
							for (String salGuide : salaryGuides) {
						 %>
						<option value="<%=salGuide%>"><%=salGuide%></option>
						<%
							}
						%>
				</select> <span id="indusError" style="color: #e98300;"></span>
			   </li>
			</c:if>
			<c:if test="${sector}">
				<li>
				<label class="required">${category}</label>
					<select name="categories" id="categories" onchange="getAreas();">
					<option value="">${defaultSelectOption}</option>
				 </select>
				 <span id="catError" style="color:#e98300;"></span>
				</li>
			</c:if>
			<li>
			<label class="required">${areaLabel}</label>
				<select  name="area" id="area" onchange="getOrganizationType();">
					<option value="">${defaultSelectOption}</option>
			 </select>
			 <span id="areaError" style="color:#e98300;"></span>
			</li>
			<c:if test="${company}">
				<li id="Company">
				<label class="required">${organisationType}</label>
					<select name="orgType" id="orgType" onchange="getJobTitles();">
						<option value="">${defaultSelectOption}</option>
				 </select>
				 <span id="orgTypeError" style="color:#e98300;"></span>
				</li>
			</c:if>
			<li id="PositionName">
			   <label class="required">${jobTitle}</label>
				<select name="jobTitle" id="jobTitle" onchange="getRegions();">
					<option value="">${defaultSelectOption}</option>
			 </select>
			 <span id="jobTitleError" style="color:#e98300;"></span>
			</li>
			<li id="Location">
			<label class="required">${region}</label>
				<select name="region" id="region">
					<option value="">${defaultSelectOption}</option>
			 </select>
			 <span id="regionError" style="color:#e98300;"></span>
			</li>
			<li>
				<label class="required">${currencySalaryLabel}</label>
			 <input type="text" name="curSalary" id="curSalary"  placeholder="${salaryPlaceHolder}" maxlength="8">
			 <span id="currencyError" style="color:#e98300;"></span>
			</li>
			<li>
			 <label>${emailAddress}</label>
			 <input type="text" name="emailAddress" id="emailAddress" placeholder="${emailAddressWaterMark}" onfocus="disclimer();">
			 <span id="emailError" style="color:#e98300;"></span>
			</li>
			<li>
			
			 <p>
			 <input type="checkbox" name="termsAndConditions" id="termsAndConditions">
			 ${termsAndCondition}
			 <span id="tcError" style="color:#e98300;"></span>
			 </p>	
			</li>
			</ul>
			 <div class="g-recaptcha" data-sitekey="${dataSiteKey}" data-callback="callback"></div>
			 <span id="capError" style="color:#e98300;"></span>
			
			 <button type="button" onclick="validateFields();">${checkMySalary}</button>
			 <span id="desclimerText"></span>
			 <!-- <button type="reset">Reset</button> -->
	</form>
</div>
<c:set var="lr_SalaryGuideFormDisclaimer" value="<%=languageKeys.get("lr_SalaryGuideFormDisclaimer")%>"/>


<div class="col col-4 barometerDisplay last floatRight barometer-active" style="">
	<p class="text-headingforuk">
		<b><%=languageKeys.get("lr_SGBaromoterHeadingText") %></b>
	</p>
	<div class="barometerSGUpdated">
		<div id="baramoterAngle"></div>
		<!-- style="transform: rotate(57.5deg);" -->
	</div>
	<div class="legend legendSGUpdated">
		<table>
			<tbody>
				<tr>
					<td class="color-palate"><img
						src="/o/com.hays.portlet/images/legend_self.png" class="self"
						alt=""></td>
					<td class="nameUK"><%=languageKeys.get("lr_SGYouLabel")%></td>
					<td id="self_salary" class="amount"></td>
				</tr>
				<tr>
					<td class="color-palate"><img
						src="/o/com.hays.portlet/images/legend_highest.png"
						class="highest" alt=""></td>
					<td class="nameUK"><%=languageKeys.get("lr_SGHighestLabel")%></td>
					<td id="highest_salary" class="amount"></td>
				</tr>
				<tr>
					<td class="color-palate"><img
						src="/o/com.hays.portlet/images/legend_avarage.png"
						class="avarage" alt=""></td>
					<td class="nameUK"><%=languageKeys.get("lr_SGAverageLabel")%></td>
					<td id="average_salary" class="amount"></td>
				</tr>
				<tr>
					<td class="color-palate"><img
						src="/o/com.hays.portlet/images/legend_lowest.png" class="lowest"
						alt=""></td>
					<td class="nameUK"><%=languageKeys.get("lr_SGLowestLabel")%></td>
					<td id="lowest_salary" class="amount"></td>
				</tr>
			</tbody>
		</table>
	</div>
	<!--Changes for my salary display -->

	<div class="salary-data">
		<p id="salary-range" class="salary-range lowest"></p>
		<div id="user-salary" class="user-salary"></div>
		<span class="myCurrentSalary"></span>
	</div>
	<div class="action hideInSGUpdated">
		<a href="https://m.hays.co.uk/speculativeCV/" class="input btn"><%=languageKeys.get("lr_SGSendCVButtonText") %></a>
		 <a href="https://m.hays.co.uk/office-locator/" class="input btn"><%=languageKeys.get("lr_SGContactUsButtonText") %></a>
	</div>
</div>

<div class="clearfix" style="clear: both;"></div> 

<div class="box similarJobs">
	<section>
		<div class="hays-tabs">
			<div>
				<ul>
					<h2><%=languageKeys.get("lr_SGSImilarJobs")%></h2>
				</ul>
			</div>
			<ul class="tab-contents">
			</ul>
		</div>
	</section>
</div>

<style>

.barometerSGUpdated {
    text-align: center;
    margin-top: 15px;
    background: url(/o/com.hays.portlet/images/barometer.jpg) no-repeat 92px 0;
    width: 440px;
    height: 270px;
    position: relative;}
    
    .barometerSGUpdated>div {
    background: url(/o/com.hays.portlet/images/kanta_V3.png) no-repeat;
    width: 26px;
    height: 88px;
    position: absolute;
    left: 200px;
    top: 78px;
}

</style>

<script type="text/javascript">

<!--Type Of Constants -->

var category = '${getCategoriesConst}';
var area = '${getareasConst}';
var orgType = '${getOrganizatioTypeConst}';
var jobtitle = '${getJobtitlesConst}';
var region = '${getRegionsConst}';
var desclimer = '${lr_SalaryGuideFormDisclaimer}';

alert(desclimer);

<!--  function is used to fetch the  Category -->
var loading  = '<%=languageKeys.get("lr_LoadingSG")%>';


function getCategories(){

	var areaOfExtertise = $("#areaOfExpertise").val();
	
	$("#categories").empty();
	$("#categories").append('<option value=" ">' + loading +'</option>');     
	 
	/* alert("Type Of Request >>>" + areaOfExtertise); */
	
	$.ajax({
		 url : '<%=baseResourceUrl%>',
		 type : 'Post',
		 dataType:'json',
		 data : {
		       "<portlet:namespace/>typeOfConstant" : category,
		       "<portlet:namespace/>areaOfExpertise" : areaOfExtertise
		    },
		    success : function(data) {              
		        //alert('Data: '+data);
		        
		        var stringJson = JSON.stringify(data);
		        var catList = JSON.parse(stringJson);
                
		       /*  console.log("stringJson >>" , stringJson);
		        console.log("catList >>" , catList); */
                
                if (catList.length === 1) {
                	
                	 $("#categories").empty();
                	 
                	 $("#categories").append('<option value="'+catList[0]+'">' + catList[0]+ '</option>');
                 	 $("#categories").prop('readonly', true);
                 	 
                 	 if(catList[0] == "NA"){
                 		 
                 		$("#categories").attr('disabled', true); 
                 	 }
                	  isValidateCategory(); 
                      getAreas();
                    
                 }
                else {
                	
                	$("#categories").empty();
               	     $("#categories").append('<option value=" ">Please select</option>');
                     
               	     $.each(catList, function(index, value) {
	                      $("#categories").append('<option value="'+value+'">' + value+ '</option>');
	                 }); 
      			}
		    },
		     error : function(error){
		        alert("!!! Something Went Wrong !!!");
		    }
	});
};	


<!--  function is used to fetch the  Areas -->

function getAreas(){
	
	//alert("Inside area Function >>>" + area);
	
	var areaOfExtertise = $("#areaOfExpertise").val();
	var categoryType = $("#categories").val();
	
	$("#area").empty();
	$("#area").append('<option value=" ">' + loading +'</option>');
	/* console.log("area >>",area);
	console.log("areaOfExtertise >>",areaOfExtertise);
	console.log("categoryType >>",categoryType); */
	
	$.ajax({
		 url : '<%=baseResourceUrl%>',
		 type : 'Post',
		 dataType:'json',
		 data : {
			  "<portlet:namespace/>typeOfConstant" : area,
		       "<portlet:namespace/>categoryType" : categoryType,
		       "<portlet:namespace/>areaOfExpertise" : areaOfExtertise
		    },
		    success : function(data) {              
		        
		    	/* alert('Data: '+data); */
		        
		        var stringJson = JSON.stringify(data);
		        var areaList = JSON.parse(stringJson);
                
		        /* console.log("catList >>", areaList); */
		        
                if (areaList.length === 1) {

					 /* console.log("length >>" + areaList.length);
                     console.log("Length Value >>" + areaList[0]); */
                     
	                  $("#area").empty();
                     
                      $("#area").append('<option value="'+areaList[0]+'">' + areaList[0]+ '</option>');
                 	  $("#area").prop('readonly', true);
                 	  
                 	 if(areaList[0] == "NA"){
                 		 
                  		$("#area").attr('disabled', true); 
                  	 }
	                  
	               	  isValidateArea();
	               	  getOrganizationType();
                   
                }
                else {
                	
                	  $("#area").empty();
                      $("#area").append('<option value=" ">Please select</option>');
                      
                      $.each(areaList, function(index, value) {
	                      $("#area").append('<option value="'+value+'">' + value+ '</option>');
	                 }); 
      			}
		    },error : function(request,error){
		        alert(" !!! Somt thing Went Wrong !!");
		    }
	});

};

function getOrganizationType(){
	
	//alert("Inside OrgType Function >>" + orgType);
	
	var areaOfExtertise = $("#areaOfExpertise").val();
	var categoryType = $("#categories").val();
	var area = $("#area").val();
	
	$("#orgType").empty();
	$("#orgType").append('<option value=" ">' + loading +'</option>');
/* 	
	console.log("orgType >>",orgType);
	console.log("area >>",area);
	console.log("areaOfExtertise >>",areaOfExtertise);
	console.log("categoryType >>",categoryType); */
	
	$.ajax({
		 url : '<%=baseResourceUrl%>',
		 type : 'Post',
		 dataType:'json',
		 data : {
			  "<portlet:namespace/>typeOfConstant" : orgType,
		       "<portlet:namespace/>categoryType" : categoryType,
		       "<portlet:namespace/>areaOfExpertise" : areaOfExtertise,
		       "<portlet:namespace/>area" : area
		    },
		    success : function(data) { 
		    	
		        //alert('Data: '+data);
		        
		        var stringJson = JSON.stringify(data);
		        var orgList = JSON.parse(stringJson);
                
		        //console.log("orgList >>" , orgList);
		        

                if (orgList.length === 1) {
                	
                	 $("#orgType").empty();
                	  
               		 $("#orgType").append('<option value="'+orgList[0]+'">' + orgList[0]+ '</option>');
                     $("#orgType").prop('readonly', true);
                     
                     if(orgList[0] == "NA"){
                    	 
                   		$("#orgType").attr('disabled', true); 
                   	 }
                     
                	  isValidateOrganizatioType();
                	  getJobTitles();
                	  
                  
                }
                else {
                	
                	  $("#orgType").empty();
                	  $("#orgType").append('<option value=" ">Please select</option>');
                	  
                      $.each(orgList, function(index, value) {
	                      $("#orgType").append('<option value="'+value+'">' + value+ '</option>');
	                 }); 
      			}
		    },
		    error : function(request,error){
		        alert("!!! Some thing Went Wrong !!!");
		    }
	});
};

function getJobTitles(){
	
	//alert("Inside Job Titles Function");
	
	
	var areaOfExtertise = $("#areaOfExpertise").val();
	var categoryType = $("#categories").val();
	var area = $("#area").val();
	var orgType = $("#orgType").val();
	
	$("#jobTitle").empty();
	$("#jobTitle").append('<option value=" ">' + loading +'</option>');
	
	/* console.log("jobtitle >>>",jobtitle);
	console.log("area >>",area);
	console.log("areaOfExtertise >>",areaOfExtertise);
	console.log("categoryType >>",categoryType);
	console.log("orgType >>",orgType); */
	
	$.ajax({
		 url : '<%=baseResourceUrl%>',
		 type : 'Post',
		 dataType:'json',
		 data : {
			  "<portlet:namespace/>typeOfConstant" :jobtitle ,
			  "<portlet:namespace/>areaOfExpertise" : areaOfExtertise,
		       "<portlet:namespace/>categoryType" : categoryType,
		       "<portlet:namespace/>orgType" : orgType,
		       "<portlet:namespace/>area" : area,
		    },
		    success : function(data) { 
		    	
		        //alert('Data: '+data);
		        
		        var stringJson = JSON.stringify(data);
		        var jobTitleList = JSON.parse(stringJson);
                
		       /*  console.log("jobTitleList >>" , jobTitleList);
                console.log(jobTitleList); */
                
                if (jobTitleList.length === 1) {
                	
                	  $("#jobTitle").empty();
                	  
                	  $("#jobTitle").append('<option value="'+jobTitleList[0]+'">' + jobTitleList[0]+ '</option>');
                  	  $("#jobTitle").prop('readonly', true);
                  	
                  	  if(jobTitleList[0] == "NA"){
                  		  
                   		$("#jobTitle").attr('disabled', true); 
                      }
                  	  isValidateJobTitle();
                  	  getRegions();
                	 
                 }
                else {
                	
                	  $("#jobTitle").empty();
                	  $("#jobTitle").append('<option value=" ">Please select</option>');
                	  
                      $.each(jobTitleList, function(index, value) {
	                      $("#jobTitle").append('<option value="'+value+'">' + value+ '</option>');
	                 }); 
      			}
		    },
		    error : function(){
		        alert('!! Somr thing Went Wrong !!');
		    }
	});
};


function getRegions(){
	
	//alert("Inside getRegions Function");
	
	var areaOfExtertise = $("#areaOfExpertise").val();
	var categoryType = $("#categories").val();
	var area = $("#area").val();
	var orgType = $("#orgType").val();
	var jobTitle = $("#jobTitle").val();
	
	$("#region").empty();
	$("#region").append('<option value=" ">' + loading +'</option>');
	
	/* console.log("region >>>",region);
	console.log("jobtitle >>>",jobtitle);
	console.log("area >>",area);
	console.log("areaOfExtertise >>",areaOfExtertise);
	console.log("categoryType >>",categoryType);
	console.log("orgType >>",orgType);
 */	
	$.ajax({
		 url : '<%=baseResourceUrl%>',
		 type : 'Post',
		 dataType:'json',
		 data : {
			   "<portlet:namespace/>typeOfConstant" :region ,
			   "<portlet:namespace/>areaOfExpertise" : areaOfExtertise,
		       "<portlet:namespace/>categoryType" : categoryType,
		   	   "<portlet:namespace/>orgType" : orgType,
		       "<portlet:namespace/>jobTitle" : jobTitle,
		       "<portlet:namespace/>area" : area
			   },
			   
		  	  success : function(data) { 
		    	
		        //alert('Data: '+data);
		        
		        var stringJson = JSON.stringify(data);
		        var regionsList = JSON.parse(stringJson);
                
		        //console.log("regionsList >>" , regionsList);
		        
                if (regionsList.length === 1) {
                
                	$("#region").empty();
                	
                	$("#region").append('<option value="'+regionsList[0]+'">' + regionsList[0]+ '</option>');
               	    $("#region").prop('readonly', true);
               	 	
               	    if(regionsList[0] == "NA"){
               	    	
                		$("#region").attr('disabled', true); 
                	 }
                	isValidateRegion();
                 }
                else {
                	
                	 $("#region").empty();
               	     $("#region").append('<option value=" ">Please select</option>');
                      $.each(regionsList, function(index, value) {
                    	   $("#region").append('<option value="'+value+'">' + value+ '</option>');
	                 }); 
      			}
		    },
		    error : function(request,error){
		        alert("!! Some thing went Wrong !!!");
		    }
	});
}; 


<!--Data Populaing By Salry Form Completed -->

	  
 <!-- field Validations Start -->
  
 $('#areaOfExpertise').on('click change',function(){
 	isValidateIndustry();
 });

 $('#categories').on('click change',function(){
 	isValidateCategory();
 });

 $('#area').on('change',function(){
 	isValidateArea();
 });

 $('#orgType').on('change',function(){
 	isValidateOrganizatioType();
 });

 $('#jobTitle').on('change',function(){
 	isValidateJobTitle();
 });

 $('#region').on('change',function(){
 	isValidateRegion();
 });
 
 $('#curSalary').on('keyup',function(){
	 isValidateCurrency();
 }); 

 $('#emailAddress').on('keyup',function(){
	 isValidateEmail();
 });
 
 
 function disclimer(){
	 console.log(desclimer);
	 $("#desclimerText").html(desclimer);
 }
 
$('#termsAndConditions').on('click',function(){
	 
	isValidateTermsandCondition();
 });
 
function callback(){
	 iscapthaValidate();
}
 
 <!-- field Validations End -->
 
 
 <!-- Form Validation -->

 function validateFields(){
	
	/* alert("inside Validations"); */
	
	var industry,category,area,orgType,jobTitle,region,currSalary,emailAddres,checkBox,captchaVerified;
	
	 industry = isValidateIndustry();
	 category = isValidateCategory();
	 area = isValidateArea();
	 orgType = isValidateOrganizatioType();
	 jobTitle =  isValidateJobTitle();
	 region = isValidateRegion();
	 currSalary = isValidateCurrency();
	 checkBox =  isValidateTermsandCondition();
	 captchaVerified = iscapthaValidate();
	 
	/*  console.log("industry >>" , industry);
	 console.log("category >>" , category);
	 console.log("area >>" , area);
	 console.log("orgType >>" , orgType);
	 console.log("jobTitle >>" , jobTitle);
	 console.log("region >>" , region);
	 console.log("checkBox >>" , checkBox);
	 console.log("captchaVerified >>" , captchaVerified); */
	 
	if(!industry){
		isValidateIndustry();
	}
	if(!category){
		isValidateCategory();
	}
	if(!area){
		isValidateArea();
	}
	if(!orgType){
		isValidateOrganizatioType();
	}
	if(!jobTitle){
		isValidateJobTitle();
	}
	if(!region){
		isValidateRegion();
	}
	if(!currSalary){
		isValidateCurrency();
	}
	if(!checkBox){
		isValidateTermsandCondition();
	}
	if(!captchaVerified){
		
		iscapthaValidate();
	}
	
	if(region && currSalary && jobTitle && orgType && area && category && industry && checkBox && captchaVerified){
		
		if($('#emailAddress').val().length > 0){
			
			reResponse = isValidateEmail();
			
			if(reResponse){
				submitSalaryCheckerData();
			}else{
				isValidateEmail();
			}
		}else{
			submitSalaryCheckerData();
		}
	}
 };
 
 <!--Submitted Final form Data -->
 
 function submitSalaryCheckerData(){
	 //alert("!!! This is Inside Submit data !!!");
	
	 var finalData =  $("form").serialize();
	
	$.ajax({
		 url : '<%=salaryCheckerURL%>',
		 type : 'Post',
		 dataType:'json',
		 data : finalData,
		 success : function(data){
			 
			 //alert("data :: "+data);
			 
			 //Barometer Logic Begins Here.
		        
		        var salaryCheckerStringObj = JSON.stringify(data);
		        var salaryCheckerJsonObj = JSON.parse(salaryCheckerStringObj);
		        var sperator = ',';
		        //console.log("salaryCheckerJsonObj >>>",salaryCheckerJsonObj);
		        
		        if(salaryCheckerJsonObj.captchaResponse){
		        	$(".tab-contents").empty();
		        	$(".barometerDisplay").show();
		        	$(".similarJobs").show();
		        	//Update salary with separator.
		        	var currentsalarySep = salaryCheckerJsonObj.currentsalary;
		        	currentsalarySep =(currentsalarySep + "").replace(/(\d)(?=(\d{3})+(?!\d))/g, salrySymb+sperator);
		        	var highestSep = salaryCheckerJsonObj.highest;
		        	highestSep =(highestSep + "").replace(/(\d)(?=(\d{3})+(?!\d))/g, salrySymb+sperator);
		        	var avgSalSep = salaryCheckerJsonObj.avgSal;
		        	avgSalSep =(avgSalSep + "").replace(/(\d)(?=(\d{3})+(?!\d))/g, salrySymb+sperator);
		        	var lowestSep = salaryCheckerJsonObj.lowest;
		        	lowestSep =(lowestSep + "").replace(/(\d)(?=(\d{3})+(?!\d))/g, salrySymb+sperator);
		        	var diffSalarySep = salaryCheckerJsonObj.diffSalary;
		        	diffSalarySep =(diffSalarySep + "").replace(/(\d)(?=(\d{3})+(?!\d))/g, salrySymb+sperator);
		        	
		        	$("#self_salary").text(salaryCheckerJsonObj.currencySymbol + currentsalarySep);
			        $("#highest_salary").text(salaryCheckerJsonObj.currencySymbol + highestSep);
			        $("#average_salary").html(salaryCheckerJsonObj.currencySymbol +avgSalSep);
			        $("#lowest_salary").html(salaryCheckerJsonObj.currencySymbol + lowestSep);
			        
			        var averageSalaryO = salaryCheckerJsonObj.avgSal;
			        var currentSalaryO = salaryCheckerJsonObj.currentsalary;
			        var diffSalary = salaryCheckerJsonObj.currencySymbol + diffSalarySep;
			        //diffSalary =(diffSalary + "").replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1"+sperator);
			        var jobTitle = salaryCheckerJsonObj.jobTitle;
			        var highestSalary = salaryCheckerJsonObj.highest;
			        var lowestSalary = salaryCheckerJsonObj.lowest;
			        
						showSalaryMessage(currentSalaryO,averageSalaryO,diffSalary,jobTitle);
						
						showAngleUnit(currentSalaryO,lowestSalary,highestSalary);
						
						$(".tab-contents").append("");
		        }
		 },
		 error :function() {
			 alert("!!! some thing went wrong !!!");
		 }
	});
 };
 
 function showSalaryMessage(currentSalaryO,averageSalaryO,diffSalary,jobTitle){
	 
	// alert("Inside Salary Message Function");
	 
	/*  console.log("currentSalaryO >>>",currentSalaryO);
	 console.log("averageSalaryO >>>",averageSalaryO);
	 console.log("currentSalary >>>",diffSalary);
	 console.log("jobTitle >>>",jobTitle); */
	 
	 
	 var salaryInfo_1= '<%=languageKeys.get("lr_SalaryInfoDataPart1")%>';
	 var salaryInfo_2 = '<%=languageKeys.get("lr_SalaryInfoDataPart2")%>';
	 var high = '<%=languageKeys.get("lr_SGHigherSalary")%>';
	 var low = '<%=languageKeys.get("lr_SGLowerSalary")%>';
	 var salrySymb = '<%=languageKeys.get("lr_SGCurrencySymbol")%>';
	 var sperator = '<%=languageKeys.get("lr_SGCurrencySeparator")%>';
	 
	 
	 
	 //alert(eval(diffSalary));
	 
		 if(currentSalaryO > averageSalaryO){			 
			
			var salaryInfo = salaryInfo_1+'&nbsp'+diffSalary+'&nbsp'+high+'&nbsp'+salaryInfo_2 ;
				
				$("#salary-range").html(salaryInfo);
				$("#salary-range").css('color','#739600');
			
			}
			else if(currentSalaryO < averageSalaryO){
				
				var salaryInfo = salaryInfo_1+'&nbsp'+diffSalary+'&nbsp'+low+'&nbsp'+salaryInfo_2;
				
				$("#salary-range").html(salaryInfo);
				$("#salary-range").css('color','#d71f85');
			}
			else{
				
			 var salaryInfo = '<%=languageKeys.get("lr_NodifferInSalaryComparison")%>';
			 
			  $("#salary-range").html(salaryInfo);
			  $("#salary-range").css('color','#e98300');
			}
	 			var annum = '<%=languageKeys.get("lr_AnnumSG")%>';
	 			var currentSalarySep = currentSalaryO;
	 			currentSalarySep =(currentSalarySep + "").replace(/(\d)(?=(\d{3})+(?!\d))/g, salrySymb+sperator);
			 $("#user-salary").html(salrySymb  + currentSalarySep+"<strong>/"+annum+"</strong>");
			 
			 var jobtitleMessage = '<%=languageKeys.get("lr_SGCurrentSalary")%>';
			 
			 $(".myCurrentSalary").html(jobtitleMessage + "&nbsp;" + jobTitle);
     }
 
 
	 function showAngleUnit(currentSalary,lowerRange,upperRange){
		 
		 var $bElement = $("#baramoterAngle");
		 
		 	var differece = (upperRange - lowerRange);
			
			var angleUnit = 239/differece;
			var transAngleBase = 61.5;
			var transAngleHigh = 300.5;
			var transAngleLowest = 57.5;
			var transAngleHighest = 305.5;
		 
		 if (currentSalary < lowerRange){
				$bElement.css({ transform: 'rotate(' + transAngleLowest + 'deg)'});
				$bElement.css('-webkit-transform', 'rotate('+transAngleLowest+'deg)');
		}
		else if(currentSalary > upperRange){
				$bElement.css({ transform: 'rotate(' + transAngleHighest + 'deg)'});
				$bElement.css('-webkit-transform', 'rotate('+transAngleHighest+'deg)');
		}
		else
		{
			var rangeDiff = currentSalary - lowerRange;
			var angleToRotate = transAngleBase + (rangeDiff * angleUnit);
			$bElement.css({ transform: 'rotate(' + angleToRotate + 'deg)'});
			$bElement.css('-webkit-transform', 'rotate('+angleToRotate+'deg)');
		}
	 }
 
	 
 function displayNonDrodowns(){
	 
	 var dropDownIds = '<%=dropDownList%>';
	 
	 
	  var stringJson_1 = JSON.stringify(dropDownIds);
      var regionsList_1 = JSON.parse(stringJson_1);
      
      
      console.log("Main >>",dropDownIds);
      console.log("json Str >>",stringJson_1);
	  console.log("json Array >>",regionsList_1);
	 
	 var dropDown = '${dropDownLength}';
	 
	 console.log(dropDown);
	 
	 if(dropDown > 0){
		 alert('!! Working !!');
		 
			/*  $.each([""], function(key,value){
				 
				 
			 }); */
		  	   //$('#'+value).css('display','none');
		  	  /*  alert("Before Console")
		  	   console.log(value); */ 
		 
		/*  $.each(dropDownIds, function(index,value) {
		  	   //$('#'+value).css('display','none');
		  	   console.log('#'+value);
		     });  */
	   }
	 
 }
	 
$(document).ready(function(){
	//alert("Working Fine");
	//displayNonDrodowns();
	$(".barometerDisplay").hide();
	$(".similarJobs").hide();
});
</script>