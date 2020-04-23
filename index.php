<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Car Selling</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link href="style.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="js///responsive.css">
    <script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/arial.js"></script>
    <script type="text/javascript" src="js/cuf_run.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
      .mySlides {display: none;}
    </style>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="#">CarSelling<span>CS</span><small>Online Car Sale Recommendation System</small></a></h1>
      </div>
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="#">Home</a></li>
          <li><a href="public/index.php?operation=searchPage">Search</a></li>
          <li><a href="public/index.php?operation=adminPage">Admin Login</a></li>
          <li><a href="public/index.php?operation=about">About Us</a></li>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
    
    <div class="w3-content w3-section">
    <img class="mySlides" src="images/1.jpg" width="1000" height="300">
    <img class="mySlides" src="images/8.jpg" width="1000" height="300">
    <img class="mySlides" src="images/3.jpg" width="1000" height="300">
    <img class="mySlides" src="images/5.jpg" width="1000" height="300">
  </div>
  <script>
  var myIndex= 0;
  carousel();

  function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i= 0; i<x.length; i++){
      x[i].style.display = "none";    }
  
  myIndex++;
  if (myIndex > x.length) { myIndex =1}
    x[myIndex-1].style.display = "block";
  setTimeout (carousel, 3000);
}
</script>

      <div class="mainbar">
        <div class="article">
          <h2><span>Online Car Sale Recommendation System</span></h2>
          <div class="clr"></div>
          <p>Nowadays, Information Technology becomes very popular all over the world and most people use it beneficially. 
          Most of the users want to buy car but they don't have much knowledge about car. 
          This system will replace people tours alot of car centres with online system. 
          The data available on this website, including all tables, numbers and text are provided from myanmarcardb.com
          </p>
          <p>
          In this system insertion and updating can only be done by admin. The user can choose car type and insert require information about car buying.
          </p>
        </div>
      </div>
      <div class="sidebar">
        
        <div class="gadget">
       
          <div class="clr"></div>
          <ul class="sb_menu">
            <li class="active"><a href="#">Home</a></li>
          <li><a href="searchhome.html">Search</a></li>
          <li><a href="adminpage.php">Admin Login</a></li>
          <li><a href="aboutUs.php">About Us</a></li>
          </ul>
        </div>
   
</body>
</html>