<html xmlns="http://www.w3.org/1999/xhtml">
<?php
  session_start();
  if($_SESSION['authuser']!=1)
  {
    echo "INCORRECT Username and Password.";
    exit();
  }
?>
<head>
    <title>Car Selling</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link href="../style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../js/jquery-1.3.2.min.js"></script>
    <script type="text/javascript" src="../js/script.js"></script>
    <script type="text/javascript" src="../js/cufon-yui.js"></script>
    <script type="text/javascript" src="../js/arial.js"></script>
    <script type="text/javascript" src=".../js/cuf_run.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
      a:link{ text-decoration: none;}
      a:hover {
        color: red;
        background-color: transparent;
        text-decoration: underline;
    }
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
          <li ><a href="index.php?operation=insertForm">Insert</a></li>        
          <li><a href="index.php?operation=updatePage">Update</a></li>        
          <li><a href="../files/logout.php">Logout</a></li>
        </ul>
      </div>


<div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <b><font face="Time New Roman" color="blue" size="5">Admin Page</font></b>  
          <br/><br/> 
               <div class="clr"></div>
               <p>In welcome admin page, admin user can insert,delete and update Car Information.</p>
              
        </div>
      </div>
      <div class="sidebar">
        
        <div class="gadget">
          <div class="img"><img src="../images/images6.jpg" width="200" height="200" alt="" class="fl" /></div>
        </div>
    </div>






</div></div></div>
</body>
</html>