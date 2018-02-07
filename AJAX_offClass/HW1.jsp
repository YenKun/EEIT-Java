<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>EEIT - Ajax</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/jumbotron.css">
</head>
<body>
	<jsp:include page="partial/header.html" />
	<main role="main">

	<div class="container">
		<div class="card">
			<div class="card-header">帳號檢查</div>
			<div class="card-body">
				<!-- 每頁不同的內容從這裡開始 -->
				<form class="form-horizontal" name="myData" action="FormDataServlet">
					<div class="form-group">
						<label for="username" class="col-lg-2 control-label">帳號</label>
						<div class="col-lg-10">
							<div class="input-group">
								<span class="glyphicon glyphicon-user input-group-addon"></span>
								<input type="text" id="username" name="name"
									class="form-control" placeholder="請輸入姓名">

							</div>

						</div>
					</div>

					<div class="form-group">
						<label for="password" class="col-lg-2 control-label">密碼</label>
						<div class="col-lg-10">
							<input type="password" id="password" name="password"
								class="form-control" placeholder="請輸入密碼">
						</div>
					</div>

					<div class="form-group">
						<label for="email" class="col-lg-2 control-label">電子郵件</label>
						<div class="col-lg-10">
							<div class="input-group">
								<div class="input-group-prepend">
									<div class="input-group-text">@</div>
								</div>
								<input type="email" id="email" name="email" class="form-control"
									placeholder="請輸入電子郵件">

							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-10 col-lg-offset-2">
							<button type="submit" id="buttonSubmit" class="btn btn-primary">註冊</button>
							<div class="alert alert-primary" role="alert" id="message"></div>
						</div>
					</div>
				</form>
				<!-- 每頁不同的內容到這裡結束 -->
			</div>

		</div>
	</div>
	<jsp:include page="partial/sections.html" /> </main>

	<jsp:include page="partial/footer.jsp" />
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>
		//呼叫AccountCheck Servlet
		//在message的div中顯示檢查完的結果
		document.getElementById("buttonSubmit").addEventListener("click",function(e){
			var username = document.getElementById("username").value;
			var password = document.getElementById("password").value;
			var email = document.getElementById("email").value;
			console.log(password);
			if(!username){
				alert("請輸入帳號");
				e.preventDefault();
			}			
			
			if(!password){
				alert("請輸入密碼");
				e.preventDefault();
			}
			if(!email){
				alert("請輸入Email");
				e.preventDefault();
			}


		});
		document.getElementById("username").addEventListener("blur", checkUsername);

		function checkUsername() {
			var xhr = new XMLHttpRequest;
			var username = document.getElementById("username").value;
			if (xhr != null) {

				xhr.addEventListener("load", function() {
					if (xhr.status == 200) {
						var data = xhr.responseText;
						document.getElementById("message").innerHTML = data;

						if (data == "帳號已存在") {
							document.getElementById("buttonSubmit")
									.setAttribute("disabled", "disabled");
						} else if (data == "帳號不存在") {
							document.getElementById("buttonSubmit")
									.removeAttribute("disabled");
						}

					} else {
						alert(xhr.status);
					}
				})

				xhr.open("GET", "AccountCheck?name=" + username);
				xhr.send();

			} else {
				alert("Browser not support AJAX");
			}
		}

		// 		var btn = document.getElementById("buttonSubmit"), xhr = null;
		// 		myDiv = document.getElementById("message");

		// 		btn.addEventListener("click", load);

		// 		function load(event) {
		// 			//檢查看看按鈕的type是不是sumbit
		// 			//如果是submit按鈕，要透過ajax將資料往Server端傳送
		// 			//需要取消submit按鈕的預設行為?想想看甚麼是submit的預設行為
		// 			//_________________________                                 event.preventDefault();

		// 			xhr = new XMLHttpRequest();

		// 			if (xhr != null) {

		// 				xhr.addEventListener("load", function() {
		// 					if (xhr.status == 200) {
		// 						myDiv.innerHTML = "<h2>" + xhr.responseText + "</h2>";
		// 					} else {
		// 						alert(xhr.status + ":" + xhr.statusText);
		// 					}
		// 				})

		// 				//將表單的資料傳入FormData，產生FormData物件
		// 				//透過POST的方法，將產生的FormData物件透過send()方法傳到Server端

		// 				// 				var formData = new FormData(document.myData);
		// 				// 				xhr.open("POST", document.myData.action);
		// 				// 				xhr.send(formData);
		// 			} else {
		// 				alert("您的瀏覽器不支援Ajax功能!!");
		// 			}
		// 		}
	</script>
</body>
</html>