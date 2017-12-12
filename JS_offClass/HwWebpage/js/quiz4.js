var count = 1;
var imgTimer;
var link = ["https://wiki.52poke.com/wiki/%E5%A6%99%E8%9B%99%E7%A7%8D%E5%AD%90",
  "https://wiki.52poke.com/wiki/%E5%A6%99%E8%9B%99%E8%8D%89",
  "https://wiki.52poke.com/wiki/%E5%A6%99%E8%9B%99%E8%8A%B1",
  "https://wiki.52poke.com/wiki/%E5%B0%8F%E7%81%AB%E9%BE%99",
  "https://wiki.52poke.com/wiki/%E7%81%AB%E6%81%90%E9%BE%99",
  "https://wiki.52poke.com/wiki/%E5%96%B7%E7%81%AB%E9%BE%99",
  "https://wiki.52poke.com/wiki/%E6%9D%B0%E5%B0%BC%E9%BE%9F",
  "https://wiki.52poke.com/wiki/%E5%8D%A1%E5%92%AA%E9%BE%9F",
  "https://wiki.52poke.com/wiki/%E6%B0%B4%E7%AE%AD%E9%BE%9F"
];


imgTimer = setInterval(
  function() {
    changeImg();
  }, 1000);

document.getElementById("it4").addEventListener("click", function() {
  changeImg()
});


function changeImg() {
  document.getElementById("img0" + count).style.display = "block";
  document.getElementById("token" + count).style.width = "96px";
  document.getElementById("token" + count).style.borderColor = "#548C00"
  document.getElementById("token" + count).style.backgroundColor = "#FFF";
  if (count == 1) {
    document.getElementById("img0" + 9).style.display = "none";
    document.getElementById("token" + 9).style.width = "72px";
    document.getElementById("token" + 9).style.borderColor = "#8600FF";
    document.getElementById("token" + 9).style.backgroundColor = "#D9FFFF";
  } else {
    document.getElementById("img0" + (count - 1)).style.display = "none";
    document.getElementById("token" + (count - 1)).style.width = "72px";
    document.getElementById("token" + (count - 1)).style.borderColor = "#8600FF";
    document.getElementById("token" + (count - 1)).style.backgroundColor = "#D9FFFF";
  }
  if (count < 9)
    count++;
  else {
    count = 1
  }
}

function prevImg() {
  if (count > 2) {
    count -= 2;
  } else {
    count = (count - 2) + 9;
  }
  document.getElementById("img0" + count).style.display = "block";
  document.getElementById("token" + count).style.width = "96px";
  document.getElementById("token" + count).style.borderColor = "#548C00";
  document.getElementById("token" + count).style.backgroundColor = "#FFF";
  if (count == 9) {
    count = 1;
    document.getElementById("img0" + count).style.display = "none";
    document.getElementById("token" + count).style.width = "72px";
    document.getElementById("token" + count).style.borderColor = "#8600FF";
    document.getElementById("token" + count).style.backgroundColor = "#D9FFFF";
  } else {
    document.getElementById("img0" + (count + 1)).style.display = "none";
    document.getElementById("token" + (count + 1)).style.width = "72px";
    document.getElementById("token" + (count + 1)).style.borderColor = "#8600FF";
    document.getElementById("token" + (count + 1)).style.backgroundColor = "#D9FFFF";
    count++;
  }
}


function stop() {
  clearInterval(imgTimer);
  document.getElementById("play").style.display = "inline";
  document.getElementById("pause").style.display = "none";
}

function play() {
  imgTimer = setInterval(
    function() {
      changeImg();
    }, 1000);
  document.getElementById("play").style.display = "none";
  document.getElementById("pause").style.display = "inline";
}

document.getElementById("next").addEventListener("click", function() {
  stop();
  changeImg();
});

document.getElementById("prev").addEventListener("click", function() {
  prevImg();
  stop();
})

document.getElementById("play").addEventListener("click", function() {
  play();
})

document.getElementById("pause").addEventListener("click", function() {
  stop();
})

for (let i = 1; i <= 9; i++) {
  document.getElementById("token" + i).addEventListener("click", function() {
    stop();
    if (count != 1) {
      document.getElementById("img0" + (count - 1)).style.display = "none";
      document.getElementById("token" + (count - 1)).style.width = "72px";
      document.getElementById("token" + (count - 1)).style.borderColor = "#8600FF";
      document.getElementById("token" + (count - 1)).style.backgroundColor = "#D9FFFF";
    } else {
      document.getElementById("img0" + 9).style.display = "none";
      document.getElementById("token" + 9).style.width = "72px";
      document.getElementById("token" + 9).style.borderColor = "#8600FF";
      document.getElementById("token" + 9).style.backgroundColor = "#D9FFFF";
    }
    document.getElementById("img0" + i).style.display = "block";
    document.getElementById("token" + i).style.width = "96px";
    document.getElementById("token" + i).style.borderColor = "#548C00";
    document.getElementById("token" + i).style.backgroundColor = "#FFF";
    if(i!=9)
    count = i + 1;
    else {
    count = 1;
    }
  })

  document.getElementById("img0" + i).addEventListener("click", function() {
    open().location = link[i - 1];
  })


}
