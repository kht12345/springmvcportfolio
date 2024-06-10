/**
 * 
 */
$(document).ready(function(){
	$("#memberid").change(function() {
		
		$.ajax({
			url: 'http://192.168.0.13:8090/springmvcportfolio/validateUser',
			data: {
				id:$("#memberid").val()
			},
			
			success: function(responseText) {
				$("#errMsg").text(responseText);
				
				if(responseText != "") {
					$("#memberid").focus();
				}
			}
		});
	});
});