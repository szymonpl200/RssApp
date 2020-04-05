$('#rss_button').on('click', function(){
	
	var email = $('#email_input').val();
	var url = $('#url_input').val();
	
	var message = {
			url: url,
			email: email
	}
	
	$.ajax({
 		type: "POST",
 		url: 'sendRss',
 		timeout: 1000,
 		contentType : 'application/json',
 		dataTyp: "text",
 		data: JSON.stringify(message),
        success: function(data) {
        	console.log(data);
        	$('#url_input').text(data);
        },
 		fail: function(){
 			console.log("fail");
 		},
 		error: function(e){
 		   console.log(e);
 		}
	});
});