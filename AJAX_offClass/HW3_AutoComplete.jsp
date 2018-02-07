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
			<div class="card-header">AutoComplete</div>
			<div class="card-body">
				<!-- 每頁不同的內容從這裡開始 -->

				<form name="myData" action="Index.jsp" method="get">
					<div class="form-group">
						<input type="text" class="form-control" id="txtSearch"
							name="keyword" autocomplete="off">
						<!--<input type="submit" value="送出" class="btn btn-default btn-xs"> -->
					</div>
				</form>
				<div id="div1"></div>

				<!-- 每頁不同的內容到這裡結束 -->
			</div>
		</div>
	</div>

	<jsp:include page="partial/sections.html" /> </main>

	<jsp:include page="partial/footer.jsp" />
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>
		var show;
		var docFrag;
		window.addEventListener("load", init, false);
		function init() {
			var txt = document.getElementById("txtSearch");
			txt.addEventListener("keyup", getSource);
			show = document.getElementById("div1");
			docFrag = document.createDocumentFragment();
		}

		function getSource() {
			show.style.display = "block";

			while (show.hasChildNodes()) {
				show.removeChild(show.firstChild);
			}

			var xhr = new XMLHttpRequest();
			if (xhr != null) {
				xhr.addEventListener("load", function() {
					match(xhr)
				});
				var key = document.myData.keyword.value;
				xhr.open("GET", "JsonSimpleDemo?keyword=" + key);
				xhr.send();
			} else {
				alert("Browser not supported AJAX");
			}

		}

		function match(xhr) {
			if (xhr.status == 200) {

				var jsonObj = JSON.parse(xhr.responseText);
				for (key in jsonObj) {
					var opt = document.createTextNode(jsonObj[key]);
					var btn = document.createElement("button");
					btn.className = "list-group-item list-group-item-action";
					btn.setAttribute("type", "button");
					btn
							.addEventListener(
									"click",
									function() {
										document.myData.keyword.value = this.firstChild.nodeValue;
										show.style.display = "none";
									});

					btn.addEventListener("mouseover", function() {
						this.setAttribute("style", "color:red;cursor:pointer");
					});

					btn.addEventListener("mouseout", function() {
						this.setAttribute("style", "color:black");
					});

					btn.appendChild(opt);
					docFrag.appendChild(btn);
				}
				show.appendChild(docFrag);
			} else {
				alert(xhr.status);
			}

		}
	</script>
</body>
</html>