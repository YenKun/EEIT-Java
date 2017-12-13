var startyear = 2010;
var endyear = 2020;
var changeDateFlag = true;
var getDate, getMonth, getYear;

function clear() {
  document.getElementById("dateQ5").innerHTML = "";
}

function createD(dNum) {
  for (var i = 1; i <= dNum; i++) {
    var d = document.createElement("option");
    d.setAttribute("id", "date" + i);
    d.setAttribute("value", i);
    d.innerHTML = i;
    document.getElementById("dateQ5").appendChild(d);
  }
}

function checkDate(){
  clear();
  getMonth = document.getElementById("monthQ5").value;
  getYear = document.getElementById("yearQ5").value;

  var dd = new Date("" + getYear + "/" + getMonth + "/29");
  if (getMonth == 2) {
    if (dd.getDate() == 29) {
      createD(29);
    } else {
      createD(28);
    }
  } else if (getMonth == 4 || getMonth == 6 || getMonth == 9 || getMonth == 11) {
    createD(30);
  } else {
    createD(31);
  }
}
function printDate(){
  getDate = document.getElementById("dateQ5").value;
  getMonth = document.getElementById("monthQ5").value;
  getYear = document.getElementById("yearQ5").value;
  document.getElementById("outputBar").innerHTML = "您選的日期為"+getYear+"年"+getMonth+"月"+getDate+"日";
}

for (var i = startyear; i <= endyear; i++) {
  var y = document.createElement("option");
  y.setAttribute("id", "year" + i);
  y.setAttribute("value", i);
  y.innerHTML = i;
  document.getElementById("yearQ5").appendChild(y);
}
for (var i = 1; i <= 12; i++) {
  var y = document.createElement("option");
  y.setAttribute("id", "month" + i);
  y.setAttribute("value", i);
  y.innerHTML = i;
  document.getElementById("monthQ5").appendChild(y);
}

for (var i = 1; i <= 31; i++) {
  var d = document.createElement("option");
  d.setAttribute("id", "date" + i);
  d.setAttribute("value", i);
  d.innerHTML = i;
  document.getElementById("dateQ5").appendChild(d);
}

printDate();

document.getElementById("monthQ5").addEventListener("change", function() {
  checkDate();
  printDate();
})

document.getElementById("yearQ5").addEventListener("change", function() {
  checkDate();
  printDate();
})

document.getElementById("dateQ5").addEventListener("change", function() {
  printDate();
})
