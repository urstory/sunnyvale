
(function($) {

	$(document).ready( function() {

		// init scrollspy
		$('body').scrollspy({ target: '#main-nav' });
		
		// init scroll-to effect navigation, adjust the scroll speed in milliseconds			
		$('#main-nav').localScroll(1000);
		$('#header').localScroll(1000);


		
		// form validation 
		Modernizr.load({
			test: Modernizr.input.autocomplete,		
			nope: ['assets/js/jquery.validate.js', 'assets/js/jquery.validate.bootstrap.js'],
		});

		// ajax contact form
		$('.contact-form form').submit( function(e) {
			
			e.preventDefault();
			$theForm = $(this);
			$btn = $(this).find('#submit-button');
			$alert = $(this).parent().find('.alert');			

			// just to check if validation supported without response, such as safari 5.1. Removing JS error on chrome
			if( !Modernizr.input.autocomplete ) {
				
				$theForm.validate({

					messages: {
						email: { required: "Email is required", email: "Please enter a valid email address"}
					}
				});	

				if( !$theForm.valid() ) {
					return;
				}
			}
			$btn.addClass('loading');
			$btn.attr('disabled', 'disabled');
			//var data = {};
			//var arr = $(this).serializeArray();
			//$.each( arr, function() {
			//		data[this.name] = this.value;
			//	});

			//var jsonString = JSON.stringify(data);
			
			//document.domain = "sunnyvale.co.kr";



			$.ajax({
				url:'http://sm.sunnyvale.co.kr/send.json', 
				type:"POST",
				dataType:"jsonp",
				jsonp : "callback",
				headers: {
'Accept':'application/json',
'Content-Type':'application/json'
				},
				data: $(this).serialize(), 
				success:function(data){
			
					//$message = data.message;
					
					if( data.result == "success" ){
						$theForm.slideUp('medium', function() {
							$alert.removeClass('alert-danger');
							$alert.addClass('alert-success').html("메일 보내기 성공했습니다").slideDown('medium');	
						});				
					}else {
						$alert.addClass('alert-danger').html("메일 보내기 실패했습니다").slideDown('medium');	
					}

					$btn.removeClass('loading');
					$btn.removeAttr('disabled');

				},error:function( jqXHR,textStatus,errorThrown ) {
						$.log( "error:Event.__inlineSubmit:" + errorThrown );
				}
			});
		});

	});

})(jQuery);