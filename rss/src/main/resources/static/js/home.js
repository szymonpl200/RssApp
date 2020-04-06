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
 		timeout: 500,
 		data: JSON.stringify(message),
 		dataType: "text",
 		contentType: 'application/json',
        success: function (data) {
        	console.log('success');
        	console.log(data);
        	$('#rss_button').text(data);
        },
 		fail: function(){
 			console.log("fail");
 		},
 		error: function(e){
 		    console.log(e);
 		}
	});
});