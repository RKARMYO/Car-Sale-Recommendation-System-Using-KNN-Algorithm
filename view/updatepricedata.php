<?php //include 'dbconnect.php';?>
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
          <li><a href="index.php?operation=updateChoice&id=<?php  
            foreach($checkAll as $key =>$value)
            {
              echo $value['carId'];
            }
          ?>">Back</a></li>  
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
<div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <b><font face="Time New Roman" color="blue" size="5">Successfully Updated</font></b>  
        	<br/><br/>
          <table border='1' width='100%'' cellspacing='0' cellpadding='0' >
            <tr>
              <th><b><font face='Time New Roman' color='cyanblack' size='2'>No</font></b></th>
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Car Id</font></b></th>  
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Car Type</font></b></th>                    
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Car Name</font></b></th>
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Car Price</font></b></th>   
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Model</font></b></th>
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Color</font></b></th>
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Regional Licence</font></b></th>    
                <th><b><font face='Time New Roman' color='cyanblack' size='2'>Engine Power</font></b>
              </th>                
            </tr>
            <?php
                $no=1;
                foreach($checkAll as $key =>$value)
                {
                    echo "<tr><td>".$no."</td><td>".$value['carId']."</td><td>".$value['carTypeName']."</td><td>".$value['name']."</td><td>".$value['priceRange']."</td><td>".$value['model']."</td><td>".$value['color']."</td><td>".$value['town']."</td><td>".$value['enginePower']."</td></tr>";
                  $no++;
                }
            ?>
          </table>
        </div>
      </div>
    </div>
  </body>
</html>
          
