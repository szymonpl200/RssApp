$('#rss_button').on('click', function(){
	
	var email = $('#email_input').val();
	var url = $('#url_input').val();
	
	var message = {
			url: url,
			email: email
	}
	$('#spinner').addClass('hide');
	$.ajax({
 		type: "POST",
 		url: 'sendRss',
 		timeout: 500,
 		data: JSON.stringify(message),
 		dataType: "text",
 		contentType: 'application/json',
        success: function (data) {
        	console.log('success');
        	$('#spinner').removeClass('hide');
        	console.log(data);
        	$('#rss_button').html(data);
        },
 		fail: function(){
 			console.log("fail");
 		},
 		error: function(e){
 		    console.log(e);
 		}
	});
});