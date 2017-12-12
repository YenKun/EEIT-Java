function start() {
  var x = document.createElement("TABLE");
  x.setAttribute("id", "myTable");
  document.getElementById("quiz1table").appendChild(x);
  for (var i = 1; i < 10; i++) {
    var y = document.createElement("TR");
    y.setAttribute("id", "myTr" + i);
    document.getElementById("myTable").appendChild(y);
    for (var j = 1; j < 10; j++) {
      var z = document.createElement("TD");
      var t = document.createTextNode(i + " X " + j + " = " + i*j);
      z.appendChild(t);
      document.getElementById("myTr" + i).appendChild(z);
    }
  }
}
function fanish(){
  document.getElementById("quiz1btn").style.display="none";
}

document.getElementById("quiz1btn").addEventListener("click",function(){start();fanish()});


document.getElementById("it1").addEventListener("click",
function(){
  document.getElementById("quiz1btn").style.display="block";
  document.getElementById("quiz1table").innerHTML = "";
})
