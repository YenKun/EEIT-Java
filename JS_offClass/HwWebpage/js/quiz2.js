var errormsg = "<i class='fa fa-times-circle'style='color:red;margin-left:10px'>錯誤格式</i>";
var correctmsg = "<i class='fa fa-check-circle'style='color:green;margin-left:10px'>成功</i>";
document.getElementById("name").addEventListener("focus",
  function() {
    document.getElementById("warning1").innerHTML = "";
  });
document.getElementById("name").addEventListener("blur",
  function() {
    var name = document.getElementById("name").value;
    if (name.length < 2) {
      document.getElementById("warning1").innerHTML = errormsg;
    } else {
      for (var i = 0; i < name.length; i++) {
        var tname = name.charCodeAt(i);
        if (tname < 0x4E00 || tname > 0x9FFF) {
          document.getElementById("warning1").innerHTML = errormsg;
        } else {
          document.getElementById("warning1").innerHTML = correctmsg;
        }
      }
    }
  });
document.getElementById("pwd").addEventListener("focus",
  function() {
    document.getElementById("warning2").innerHTML = "";
  });
document.getElementById("pwd").addEventListener("blur",
  function() {
    var pwd = document.getElementById("pwd").value;
    var reg = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*\W).{6,}$/;
    if (reg.test(pwd)) {
      document.getElementById("warning2").innerHTML = correctmsg;
    } else {
      document.getElementById("warning2").innerHTML = errormsg;
    }
  });
document.getElementById("date").addEventListener("focus",
  function() {
    document.getElementById("warning3").innerHTML = "";
  });
document.getElementById("date").addEventListener("blur",
  function() {
    var reg = /^[1-2]{1}[09]{1}\d{2}\/[01]{1}\d{1}\/[0-3]{1}\d{1}$/;
    var date = document.getElementById("date").value;
    if (reg.test(date)) {
      var dd = new Date(date).getDate();
      if (dd == (date.substring(date.length - 2))) {
        document.getElementById("warning3").innerHTML = correctmsg;
      } else {
        document.getElementById("warning3").innerHTML = errormsg;
      }
    } else {
      document.getElementById("warning3").innerHTML = errormsg;
    }
  });
