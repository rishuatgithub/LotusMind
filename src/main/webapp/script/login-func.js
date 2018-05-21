function login_div_show() {
document.getElementById('login').style.display = "block";
/*document.getElementById('loginbutton').style.display = "none";*/
}
function login_div_hide() {
/*document.getElementById('loginbutton').style.display = "block";*/
document.getElementById('login').style.display = "none";
}

// When the user scrolls the page, execute myFunction 
window.onscroll = function() { 
    myFunction()
};
var header = document.getElementsByClassName("titlebar")
var sticky = header.offsetTop;

// Add the sticky class to the header when you reach its scroll position. Remove "sticky" when you leave the scroll position
function myFunction() {
  if (window.pageYOffset >= sticky) {
    header.classList.add("sticky");
  } else {
    header.classList.remove("sticky");
  }
}