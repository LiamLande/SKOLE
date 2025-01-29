var btnCount = document.getElementsByClassName("btnCount");
var count = 0;
var btn = btnCount[0].addEventListener("click", function() {
    console.log("Button clicked");
    count++;
    document.getElementsByClassName("counter")[0].innerHTML = count;
});

var btnShowHide = document.getElementsByClassName("btnShowHide")[0];

var text = document.getElementById("list");

var arr = ["item1", "item2", "item3", "item4", "item5"];

arr.forEach(el => {
    text.innerHTML += "<li>" + el + "</li>";
});


btnShowHide.addEventListener("click", function() {
    if (text.style.display === "none") {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
});
