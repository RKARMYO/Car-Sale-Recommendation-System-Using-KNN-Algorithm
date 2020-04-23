<?php include '../dbconnect.php';?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Car Selling</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link href="../style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../js/jquery-1.3.2.min.js"></script>
    <script type="text/javascript" src="../js/script.js"></script>
    <script type="text/javascript" src="../js/cufon-yui.js"></script>
    <script type="text/javascript" src="../js/arial.js"></script>
    <script type="text/javascript" src="../js/cuf_run.js"></script>
    <link href="../css/tcal.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../js/tcal.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
            <li><a href="../index.php">Home</a></li>
            <li><a href="index.php?operation=updatePage">Back</a></li>  
          </ul>
        </div>
        <div class="clr"></div>
      </div>
    </div>

    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
              <div class="article">
                <b><font face="Time New Roman" color="blue" size="5">Choice the car to Update</font></b>  
              	<br/><br/>
                <table border="1" width="100%" cellspacing="0" cellpadding="0" >
              
                  <tbody>
                  <tr height="50">  
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">No</font></b></th>
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Car Id</font></b></th>  
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Car Type</font></b></th>                    
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Car Name</font></b></th>
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Car Price</font></b></th>   
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Model</font></b></th>
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Color</font></b></th>
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Regional Licence</font></b></th>    
                    <th><b><font face="Time New Roman" color="cyanblack" size="2">Engine Power</font></b></th>  
                    <th></th> 
                  </tr>

                  <?php
                      $no=1;
                      foreach ($checkAll as $key => $value)
                      {
                          echo "<tr height='50'><td>".$no."</td><td>".$value['carId']."</td>";
                          echo "<td>".$value['carTypeName']."</td>";
                          echo "<td>".$value['name']."</td>";
                          echo "<td>".$value['priceRange']."</td>";
                          echo "<td>".$value['model']."</td>";
                          echo "<td>".$value['color']."</td>";
                          echo "<td>".$value['town']."</td>";
                          echo "<td>".$value['enginePower']."</td>";                   
                          $url = "index.php?operation=updateChoice&id=".$value['carId'];
                          echo "<td><a href='$url'><img src='../images/update.jpg' width=40 height=40></a>";
                          echo "</td>";
                          $no++;
                      }
                  ?>
              </tbody>
            </table>
            </div>
          </div>
          
            <div class="sidebar">
                <div class="gadget">
                  <div class="img"><img src="../images/update3.jpg" width="200" height="200" alt="" class="fl" /></div>
                </div>
            </div> 
        </div>
      </div>
    </div>
</body>
</html>