$('#rss_button').on('click', function(){
	
	var email = $('#email_input').val();
	var url = $('#url_input').val();
	
	var message = {
			url: url,
			email: email
	}
	
	
	function getData(){ 
		$.ajax({
	 		type: "POST",
	 		url: 'sendRss',
	 		timeout: 500,
	 		contentType: 'application/json',
	 		data: JSON.stringify(message),
	 		dataType: "json",
	        success: function () {
	        	console.log('success');
	        },
	 		fail: function(){
	 			console.log("fail");
	 		},
	 		error: function(e){
	 		    console.log(e);
	 		}
		});
	}
	getData();
});