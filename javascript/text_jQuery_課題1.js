$(function(){
	$("#fruits,#dessert,#liquor").css({
		"background-color":"#008000",
		"color":"#f8f8ff",
		"height":"25px",
		"width":"120px",
		"border-color":"#006400",
		"border":"1px soild lightgrey",
		"text-align":"center",
		"position":"relative",
		"overflow":"hidden",
		"display":"inline-block",
		"line-height":"25px",
		});
});

$(function(){
	$("#box").css({
		"width":"360px",
		"display":"flex",
		"flex-direction":"row",	
	});
	$(".fruit,.dessert_type,.liquor_type").css({
		"background-color":"#008000",
		"text-align":"center",
		"width":"120px",
		"height":"25px",
		"line-height":"25px",
		"overflow":"hidden",
	});

});

$(function(){
	$("#fruits").hover(function(){
		$(this).css({
			"overflow":"visible",
			"cursor":"pointer",
		});
	},
		function(){
			$(this).css({
				"overflow":"hidden",
				"cursor":"default",
				});
		});
	$("#dessert").hover(function(){
		$(this).css({
			"overflow":"visible",
			"cursor":"pointer",
		});
	},
		function(){
			$(this).css({
				"overflow":"hidden",
				"cursor":"default",
				});
		});
	$("#liquor").hover(function(){
		$(this).css({
			"overflow":"visible",
			"cursor":"pointer",
		});
	},
		function(){
			$(this).css({
				"overflow":"hidden",
				"cursor":"default",
				});
		});	
	
	
	
	
	
	
	$("#fruits,#dessert,#liquor,#apple,#banana,#pitaya,#donut,#castella,#applepie,#wine,#beer,#whisky").hover(function(){
		$(this).animate({
			"background-color":"#6b8e23",
		},200);
	},
		function(){
			$(this).animate({
			"background-color":"#006400"
			},200);
		});
	
	

//	$("#dessert").hover(function(){
//		$(this).animate({
//			"background-color":"#6b8e23",
//		},200);
//	},
//		function(){
//			$(this).animate({
//				"background-color":"#006400",
//			},200);
//		});
//	
//	
//	
//	$("#liquor").hover(function(){
//		$(this).animate({
//
//			"background-color":"#6b8e23",
//		},200);
//	},
//		function(){
//			$(this).animate({
//			"background-color":"#006400",
//			},200);
//		});

});