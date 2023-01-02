/**
 * 
 */

document.addEventListener("DOMContentLoaded", function(){

	$("#test").on("click", function() {
		$("#test").css("color", "red");
	});
	
	
	$("#ajaxBtn").on("click", function() {
		
		   var param   = $("#param").val();
		   var param2   = $("#param2").val();
		   console.log(param);
		   var option = {
		      url      : "test2",
		      param    : {
		    	  param  : param,
		    	  param2 : param2
		      },
		      callback : successCallback(),
		      errCallback : errCallback 
		   };
		   
		   callService(option);
		
	});

});

function successCallback(json){
	console.log(json);
}
