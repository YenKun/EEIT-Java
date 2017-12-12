var flag = [true,true,true,true,true];
function h_icon_in(a) {
  document.getElementById("h_icon" + a).style.display = "inline";
}

function h_icon_out(a) {
  document.getElementById("h_icon" + a).style.display = "none";
}
for (let i = 1; i <= 5; i++) {
  document.getElementById(("it" + i)).addEventListener("mouseover", function() {
    hover_in(i);

  });
  document.getElementById(("it" + i)).addEventListener("mouseout", function() {
    if(flag[i-1])
    hover_out(i);
  });
}
for (var i = 1; i <= 5; i++) {
  var page = document.getElementById("quiz" + i).style;
  page.width = "100%";
  page.height = "100%";
  page.margin = "0 auto";
  page.display = "none";
  page.borderRadius = "50px";
  page.overflow = "auto";
}

function colorPicker(){
  var a = new Date().getSeconds();
  var sec = Math.floor(a/5);
  var colors = ["#5B00AE","#930093","#BF0060","#0000C6","#009393","#01B468","#FFF","#EA7500","#6C6C6C","#FFFFDF","	#8CEA00","#9999CC"];
  document.getElementById("bg").style.background="radial-gradient(ellipse,"+colors[sec]+","+colors[11-sec]+")";
}

function hover_in(i){
  var stle = document.getElementById("it" + i).style;
  stle.color = "#5151A2";
  stle.fontSize = "120%";
  stle.backgroundColor = "#FFF";
  stle.fontWeight = "800";
  h_icon_in(i);
}
function hover_out(i){
  var stle = document.getElementById("it" + i).style;
  stle.color = "#000";
  stle.fontSize = "100%";
  stle.backgroundColor = "#D8D8EB";
  stle.fontWeight = "600";
  h_icon_out(i);
}


function checkDisplay(){
  for(let i = 1;i<=5;i++){
    if (document.getElementById("quiz" + i).style.display == "block") {
      hover_in(i);
      flag[i-1] = false;

  }else if(document.getElementById("quiz" + i).style.display == "none"){
    hover_out(i);
    flag[i-1] = true;
  }
}

}

var x = setInterval(function () {colorPicker()}, 100);

for (let i = 1; i <= 5; i++) {
  document.getElementById("it" + i).addEventListener("click",
    function() {
      document.getElementById("main").style.display="block";

      document.getElementById("quiz" + i).style.display = "block";

      for(var k=1;k<=5;k++){
        document.getElementById("quiz"+k).style.display="none";
      }

      document.getElementById("quiz"+i).style.display="block";

      checkDisplay();
    });
}
document.getElementById("h_icon0").addEventListener("click",function(){
  document.getElementById("main").style.display="none";
  for(var i=1;i<=5;i++){
  hover_out(i);
  flag[i-1] = true;}
})
