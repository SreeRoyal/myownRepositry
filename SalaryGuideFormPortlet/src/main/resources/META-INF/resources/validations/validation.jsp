<script type="text/javascript">
function isValidName(){
	
	var name  = $("#sg_name").val();
	
	var regX = /^[A-Za-z\s]+$/  ;
	 
	 //console.log("name >>",name);
	 
	 /* 
	 console.log("Field Length >>" ,currentSalary.length); */
	 
	 if (name.length > 0 && !name.match(regX)) {

         $("#nameErr").show();
         $("#nameErr").html("Please enter alphabits only");

     }else if (name.length > 0 && name.match(regX)) {

         $("#nameErr").hide();
         
         return true;
         
     }else if(name.length == 0){
    	 
    	 $("#nameErr").show();
         $("#nameErr").html("This field is required");
         
     }
	  return false;
}



function isValidTitle(){
	
	var title  = $("#sg_title").val();
	
	var regX = /^[A-Za-z\s]+$/  ;
	 
	 //console.log("title >>",title);
	 
	 if (title.length > 0 && !title.match(regX)) {

         $("#titleErr").show();
         $("#titleErr").html("Please enter alphabits only");

     }else if (title.length > 0 && title.match(regX)) {

         $("#titleErr").hide();
         
         return true;
         
     }else if(title.length == 0){
    	 
    	 $("#titleErr").show();
         $("#titleErr").html("This field is required");
         
     }
	  return false;
}

function isValidOrganization(){
	
	var organization  = $("#sg_organisation").val();
	
	var regX = /^[A-Za-z\s]+$/  ;
	 
	 //console.log("organization >>",organization);
	 
	 
	 if (organization.length > 0 && !organization.match(regX)) {

         $("#orgErr").show();
         $("#orgErr").html("Please enter alphabits only");

     }else if (organization.length > 0 && organization.match(regX)) {

         $("#orgErr").hide();
         
         return true;
         
     }else if(organization.length == 0){
    	 
    	 $("#orgErr").show();
         $("#orgErr").html("This field is required");
         
     }
	  return false;
}


function isValidateLocation(){
	
	var location  = $("#sg_state").val();
	
	var regX = /^[A-Za-z\s]+$/ ;
	 
	 //console.log("location >>",location);
	 
	 
	 if (location.length > 0 && !location.match(regX)) {

         $("#locErr").show();
         $("#locErr").html("Please enter alphabits only");

     }else if (location.length > 0 && location.match(regX)) {

         $("#locErr").hide();
         
         return true;
         
     }else if(location.length == 0){
    	 
    	 $("#locErr").show();
         $("#locErr").html("This field is required");
         
     }
	  return false;
}

function isValidatedEmail(){
	
	var validEmail = $("#sg_email_id").val();
	
	 //console.log("validEmail >>>",validEmail);
		
	 var emailEx = '^[A-Za-z0-9](([_\.\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([\.\-]?[a-zA-Z0-9]+)*)\.([A-Za-z]{2,})$';
	
			 
		 if (validEmail.length > 0 && !validEmail.match(emailEx)) {

            $("#emailSgErr").show();
            $("#emailSgErr").html("Please Enter Valid email Address");

        }else if (validEmail.length > 0 && validEmail.match(emailEx)) {

            $("#emailSgErr").hide();

            return true;
        }else if(validEmail.length == 0){
       	 	
       	    $("#emailSgErr").show();
            $("#emailSgErr").html("This field is required");
            
        }
	  		return false;
   };

   function iscapthaValidate(){
   	
  	 var captchLengtha = grecaptcha.getResponse();
  	 
  	 if(captchLengtha.length == 0){
  		 $("#emailSgErr").show();
           $("#emailSgErr").html("Plese Verify Captcha");
  	 }else{
  		 $("#capError").hide();
  		  return true;
  	 }
  	  return false;
   }

</script>
