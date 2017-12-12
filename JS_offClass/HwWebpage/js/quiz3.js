var stars = document.querySelectorAll(".star");
var flagstar = true;

for (let i = 0; i < stars.length; i++) {
  stars[i].addEventListener("mouseover",
    function() {
      if (flagstar) {
        for (var j = 0; j <= i; j++) {
          stars[j].src = "res/starfull.png"
        }
        document.getElementById("g_text").style.visibility = "visible";
        document.getElementById("gradeNumber").innerHTML = i + 1;
      }
    });
  stars[i].addEventListener("click", function() {
    if (flagstar) {
      for (var j = 0; j <= i; j++) {
        stars[j].src = "res/starfull.png"
      }
    }
    flagstar = false;
  })
}


document.getElementById("stararea").addEventListener("mouseout", function() {
  if (flagstar) {
    for (let i = 0; i < stars.length; i++) {
      stars[i].src = "res/star.png";
    }
    document.getElementById("g_text").style.visibility = "hidden";
  }
})


document.getElementById("quiz3btn").addEventListener("click", function() {
  flagstar = true;
  for (let i = 0; i < stars.length; i++) {
    stars[i].src = "res/star.png";
  }
  document.getElementById("g_text").style.visibility = "hidden";
});

document.getElementById("it3").addEventListener("click", function() {
  flagstar = true;
  for (let i = 0; i < stars.length; i++) {
    stars[i].src = "res/star.png";
  }
  document.getElementById("g_text").style.visibility = "hidden";
})
