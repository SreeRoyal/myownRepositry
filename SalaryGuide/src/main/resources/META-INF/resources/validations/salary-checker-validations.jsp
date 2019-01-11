<%@ include file="../init.jsp" %>
<%
JSONObject validationObj = (JSONObject)renderRequest.getAttribute("languageKeysObj");
%>

<script type="text/javascript">

var requiredField = '<%=validationObj.get("lr_SGRequiredField")%>';
var digitsOnly = '<%=validationObj.get("lr_SGOnlyDigits")%>';
var validEmailAdd = '<%=validationObj.get("lr_SGValidEmail")%>';
var termsCon = '<%=validationObj.get("lr_SGTermsAndCon")%>';

console.log("Validations >>",requiredField,digitsOnly,validEmailAdd,termsCon);

    function isValidateIndustry() {

        var areaOfExpertise = $('#areaOfExpertise').val();
        
        if (areaOfExpertise.length == 0) {

            $("#indusError").show();
            $("#indusError").html(requiredField);
        
        } else {

            $("#indusError").hide();
        }
        //console.log("AreaOf Expertise >>>", areaOfExpertise);

        if (areaOfExpertise.length > 0) {

            return true;
        }
        return false;    
    };
    
     function isValidateCategory() {

        var categoryType = $("#categories").val();
       
       // console.log("categoryType >>>", categoryType);

              
        	 if (categoryType.length == 0) {

                 $("#catError").show();
                 $("#catError").html(requiredField);

             } else {

                 $("#catError").hide();
             }

             if (categoryType.length > 0) {

                 return true;
             }     

        return false;
    };

    function isValidateArea() {

        var area = $("#area").val();

        //console.log("area >>>", area);

        if (area.length == 0) {

            $("#areaError").show();
            $("#areaError").html(requiredField);

        } else {

            $("#areaError").hide();
        }

        if (area.length > 0) {

            return true;
        }

        return false;
    };

    function isValidateOrganizatioType() {

        var orgType = $("#orgType").val();

        if (orgType.length == 0) {

            $("#orgTypeError").show();
            $("#orgTypeError").html(requiredField);

        } else {

            $("#orgTypeError").hide();
        }

        if (orgType.length > 0) {

            return true;
        }

        return false;

    };

    function isValidateJobTitle() {

        var jobTitle = $("#jobTitle").val();

        //console.log("jobTitle >>>", jobTitle);

        if (jobTitle.length == 0) {

            $("#jobTitleError").show();
            $("#jobTitleError").html(requiredField);

        } else {

            $("#jobTitleError").hide();
        }

        if (jobTitle.length > 0) {

            return true;
        }

        return false;

    };

    function isValidateRegion() {

        var region = $("#region").val();

        if (region.length == 0) {

            $("#regionError").show();
            $("#regionError").html(requiredField);

        } else {

            $("#regionError").hide();
        }

        if (region.length > 0) {

            return true;
        }

        return false;
    };
    
    function isValidateCurrency(){
    	
    	 var currentSalary = $("#curSalary").val();
    	 
    	 var regXdigits = "^[0-9]*$";
    	 
    	 /* console.log("currentSalary >>",currentSalary);
    	 console.log("Field Length >>" ,currentSalary.length); */
    	 
    	 if (currentSalary.length > 0 && !currentSalary.match(regXdigits)) {

             $("#currencyError").show();
             $("#currencyError").html(digitsOnly);

         }else if (currentSalary.length > 0 && currentSalary.match(regXdigits)) {

             $("#currencyError").hide();
             
             return true;
             
         }else if(currentSalary.length == 0){
        	 
        	 //alert("Inside Length 0");
        	 
        	 $("#currencyError").show();
             $("#currencyError").html(requiredField);
             
         }
    	  return false;
    };

    function isValidateEmail(){
    	
    	var validEmail = $("#emailAddress").val();
    	
    	/* console.log("emailAddress >>>",validEmail);
    	console.log("emailAddress >>>",validEmail.length); */
    	
    	 var emailEx = '^[A-Za-z0-9](([_\.\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([\.\-]?[a-zA-Z0-9]+)*)\.([A-Za-z]{2,})$';
    	
    			 
   		 if (validEmail.length > 0 && !validEmail.match(emailEx)) {

                $("#emailError").show();
                $("#emailError").html(validEmailAdd);

            }else if (validEmail.length > 0 && validEmail.match(emailEx)) {

                $("#emailError").hide();
	
                return true;
            }else if(validEmail.length == 0){
            	 $("#emailError").hide();
           	  /*  $("#emailError").show();
                $("#emailError").html("This field is required"); */
                
            }
   	  		return false;
       };
    
    
    function isValidateTermsandCondition(){
    	
    	var isChecked = document.getElementById('termsAndConditions').checked;
    	
    	//console.log("inside Terms and Cond >>" , isChecked);
    	
    	if(!isChecked){
            $("#tcError").show();
            $("#tcError").html(termsCon);
    	}else{
    		$("#tcError").hide();
    		 
    	  return true;
    	}
    	  return false;
    }
    
    function iscapthaValidate(){
    	
    	 var captchLengtha = grecaptcha.getResponse();
    	 
    	 if(captchLengtha.length == 0){
    		 $("#capError").show();
             $("#capError").html(requiredField);
    	 }else{
    		 $("#capError").hide();
    		  return true;
    	 }
    	  return false;
     }
    
    
    
    function getDependentAlert(Obj){
		var sgFormIds = ['areaOfExpertise','categories','area','orgType','jobTitle','region'];
		$(".dependent").remove();
		var currentId = $(Obj).attr("id");
		for (i=0; i<sgFormIds.length;i++){
			if(sgFormIds[i] == currentId) {
				break;
			}
			if($("#"+sgFormIds[i]).val() == "" && $("#"+sgFormIds[i]).next('label').length==0)
				$( "<label class='error dependent'>This field is required.</label>" ).insertAfter("#"+sgFormIds[i]);
		}
		if($('#'+currentId+' > option[value!=""]').length == 0){
			$("#"+currentId).blur();
		}
	}
    
    
   /*  areaOfExpertise
	 categories
	 area
	 orgType
	 jobTitle
	 region */
 //Match Search replace

</script>