
$(function(){
	$("#submit").click(function(){
	console.log(data1);
		$.ajax({
		  type: 'POST',
		  url: "/addUser",
		  data:{
		  "userPhone":$("#phoneNumber").val(),
		  "userEmail":$("#userEmail").val(),
		  "userPwd":$("#userPwd").val()
		  },
		  success: function(data){
		  	alert(data);
		  	alert("注册成功");
	  }
	});
	});
});


