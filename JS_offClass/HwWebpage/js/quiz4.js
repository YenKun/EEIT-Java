var count = 1;
var imgTimer = setInterval(changeImg, 1000);
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

document.getElementById("it4").addEventListener("click", changeImg);

document.getElementById("next").addEventListener("click", function() {
  changeImg();
  stop();
});

document.getElementById("prev").addEventListener("click", function() {
  prevImg();
  stop();
})

document.getElementById("play").addEventListener("click", play);

document.getElementById("pause").addEventListener("click", stop);

for (let i = 1; i <= 9; i++) {
  document.getElementById("token" + i).addEventListener("click", function() {
    stop();
    if (count == 1) {
      before(10 - count);
    } else {
      before(count - 1);
    }
    after(i);
    if (i == 9)
      count = 1;
    else {
      count = i + 1;
    }
  })
  document.getElementById("img0" + i).addEventListener("click", function() {
    open(link[i - 1], "_blank");
  })
}

function after(index) {
  document.getElementById("img0" + index).style.display = "block";
  document.getElementById("token" + index).style.width = "96px";
  document.getElementById("token" + index).style.borderColor = "#548C00"
  document.getElementById("token" + index).style.backgroundColor = "#FFF";
}

function before(index) {
  document.getElementById("img0" + index).style.display = "none";
  document.getElementById("token" + index).style.width = "72px";
  document.getElementById("token" + index).style.borderColor = "#8600FF";
  document.getElementById("token" + index).style.backgroundColor = "#D9FFFF";
}

function changeImg() {
  after(count);
  if (count == 1) {
    before(10 - count);
  } else {
    before(count - 1);
  }
  if (count == 9)
    count = 1;
  else {
    count++;
  }
}

function prevImg() {
  if (count > 2) {
    count -= 2;
  } else {
    count = (count - 2) + 9;
  }
  after(count);
  if (count == 9) {
    count = 1;
    before(count);
  } else {
    before(count + 1)
    count++;
  }
}

function stop() {
  clearInterval(imgTimer);
  document.getElementById("play").style.display = "inline";
  document.getElementById("pause").style.display = "none";
}

function play() {
  imgTimer = setInterval(changeImg, 1000);
  document.getElementById("play").style.display = "none";
  document.getElementById("pause").style.display = "inline";
}
