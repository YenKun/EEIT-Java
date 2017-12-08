var errormsg = "<i class='fa fa-times-circle'style='color:red;margin-left:10px'>錯誤格式</i>";
var correctmsg = "<i class='fa fa-check-circle'style='color:green;margin-left:10px'>成功</i>"
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
document.getElementById("pwd").addEventListener("blur",
  function() {
    var pwd = document.getElementById("pwd").value;
    if(pwd.length<6){
      document.getElementById("warning2").innerHTML = errormsg;
    }else{
      var reg = /^(?=.*\d)(?=.*[a-zA-Z])(?=.*\W).{6,10}$/;
      if(reg.test(pwd)){
        document.getElementById("warning2").innerHTML = correctmsg;
      }else{
        document.getElementById("warning2").innerHTML = errormsg;
      }
    }
  });
 document.getElementById("date").addEventListener("blur",
 function(){
   var reg = /^\d{4}\/\d{2}\/\d{2}$/;
   var date = document.getElementById("date").value;
   if(reg.test(date)){
     document.getElementById("warning3").innerHTML = correctmsg;
   }else{
     document.getElementById("warning3").innerHTML = errormsg;
   }
 });
