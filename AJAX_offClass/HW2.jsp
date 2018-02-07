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
			<div class="card-header">RSS閱讀器</div>
			<div class="card-body" id="card-body">
				<!-- 每頁不同的內容從這裡開始 -->
				<article>
					<h4>
						<a
							href="https://tw.news.yahoo.com/%E8%A7%A3%E9%99%A4%E7%B5%82%E7%94%9F%E7%A6%81%E8%B3%BD-%E4%BF%8413%E9%81%8B%E5%8B%95%E5%93%A1%E6%88%96%E5%8F%AF%E5%8F%83%E5%8A%A0%E5%86%AC%E5%A5%A7-132818544.html">解除終生禁賽
							俄13運動員或可參加冬奧</a>
					</h4>
					<hr>
					<small>Sat, 03 Feb 2018 21:28:18 +0800</small>
					<p>（中央社南韓平昌3日綜合外電報導）國際奧林匹克委員會今天表示，獲體育仲裁法庭取消終生禁賽令的13名俄羅斯運動員及2名教練，也許能獲准參加南韓平昌冬季奧運。他們原先遭禁賽與涉嫌服用禁藥有關。</p>
				</article>
				<article>
					<h4>
						<a
							href="https://tw.news.yahoo.com/%E8%B6%B3%E7%90%83-%E4%B8%AD%E8%8F%AF%E9%9A%8A%E5%91%8A%E6%8D%B75-4%E5%8B%9D%E9%A6%AC%E4%BE%86%E8%A5%BF%E4%BA%9E-%E5%B1%85%E5%88%86%E7%B5%84%E7%AC%AC-130115215.html">足球／中華隊告捷5:4勝馬來西亞
							居分組第一</a>
					</h4>
					<hr>
					<small>Sat, 03 Feb 2018 21:01:15 +0800</small>
					<p>2018五人制亞錦賽今(3)日世界第80名中華隊第二戰交手世界排名第53的馬來西亞，中華隊經歷領先到被追平，倒數1分17秒林志紘攻進致勝球，最終賴明輝和林志紘2人都梅開二度、加上紀聖珐1球中華隊以5:4拿下首勝，總積分4分暫居小組第一。中華隊排出與昨天相同的先發陣容應戰</p>
				</article>
				<!-- 每頁不同的內容到這裡結束 -->
			</div>
		</div>
	</div>

	<jsp:include page="partial/sections.html" /> </main>

	<jsp:include page="partial/footer.jsp" />
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>
		var xhr = new XMLHttpRequest();
		var body = document.getElementById("card-body");
		
		while(body.hasChildNodes()){
			body.removeChild(body.firstChild);
		}
		
		if (xhr != null) {
			xhr.addEventListener("load", read);
			xhr.open("GET", "LoadRSS");
			xhr.send();
		} else {
			alert("Browser not supported AJAX");
		}

		function read() {
			if (xhr.status == 200) {
				var doc = xhr.responseXML;

				var items = doc.getElementsByTagName("item");
				var docFrag = document.createDocumentFragment();

				for (var i = 0, max = items.length; i < max; i++) {
					var links = items[i].getElementsByTagName("link");
					var descriptions = items[i].getElementsByTagName("description");
					var titles = items[i].getElementsByTagName("title");
					var pubDates = items[i].getElementsByTagName("pubDate");
					
					var link = links[0].firstChild.nodeValue;
					var title = titles[0].firstChild.nodeValue;
					var description = descriptions[0].firstChild.nodeValue;
					var pubDate = pubDates[0].firstChild.nodeValue;
					
					var h4 = document.createElement("h4");
					var a = document.createElement("a");
					var title_text = document.createTextNode(title);
					a.setAttribute("href",link);
					a.appendChild(title_text);
					h4.appendChild(a);
					
					var hr = document.createElement("hr");
					
					var small = document.createElement("small");
					var pubDate_text = document.createTextNode(pubDate);
					small.appendChild(pubDate_text);
					
					var p = document.createElement("p");
					var description_text = document.createTextNode(description);
					p.appendChild(description_text);
					
					var br1 = document.createElement("br");
					var br2 = document.createElement("br");
					
					var article = document.createElement("article");
					article.appendChild(h4);
					article.appendChild(hr);
					article.appendChild(small);
					article.appendChild(p);
					article.appendChild(br1);
					article.appendChild(br2);
					
					docFrag.appendChild(article);
				}
				
				body.appendChild(docFrag);

				



			} else {
				alert(xhr.status);
			}
		}

		//呼叫LoadRSS Servlet，回傳XML文件
		//讀取XML文件中的資料，參考上面的顯示方式
		//您也可以設計自己的顯示方式
	</script>
</body>
</html>