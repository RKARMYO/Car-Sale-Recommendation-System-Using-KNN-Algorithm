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
           <li><a href="index.php?operation=insertForm">Back</a></li>
          	<li><a href="../index.php">Home</a></li>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
        
         <b><font face="Time New Roman" color="blue" size="5">Successfully Inserteda</font></b>  
        <br></br> 

    <table border="0" width="60%" cellspacing="0" cellpadding="0" >
			<tr>
	        <td align="left" height="50">
	            <b><font face="Time New Roman" color="#C9" size="3">Car Id:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
                  <b>
                    <?php 
                        foreach ($allData as $key => $value)
                        {
                            echo $value['carId'];
                        }
                    ?>
                  </b>
              </font>          					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Car Type:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
                  foreach ($allData as $key => $value)
                  {
                      echo $value['carTypeName'];
                  }
							?>
          		</font>         					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Car Name:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
                  foreach ($allData as $key => $value)
                  {
                      echo $value['name'];
                  }
							?>
          		</font>         					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Price:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
                  foreach ($allData as $key => $value)
                  {
                      echo $value['priceRange'];
                  }
							?>
          		</font>
          					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Model:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
								foreach ($allData as $key => $value)
                {
                    echo $value['model'];
                }
							?>
          		</font>
          					
					</td>
			</tr>

			<tr>
	         	 	<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Color:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
									foreach ($allData as $key => $value)
                  {
                      echo $value['color'];
                  }
							?>
          		</font>
          					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Regional License:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
								foreach ($allData as $key => $value)
                {
                    echo $value['town'];
                }
							?>
          		</font>         					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Enging Power:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
								foreach ($allData as $key => $value)
                {
                    echo $value['enginePower'];
                }
							?>
          		</font>
          					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Control:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
                  foreach ($allData as $key => $value)
                  {
                      $ccontrol='';
                      $control=$value['control'];
                      if ($control == 1)
                      {
                        $ccontrol ='Auto';
                      }
                      else
                      {
                        $ccontrol ='Manual';
                      }
                      echo $ccontrol;
                  }
							?>
          		</font>         					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Oil:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
                  foreach ($allData as $key => $value)
                  {
                      $coil='';
                      $oil=$value['petrol'];
                      if ($oil == 1)
                      {
                        $coil ='Petrol';
                      }
                      else
                      {
                        $coil ='Diesel';
                      }
                      echo $coil;
                  }								
							?>
          		</font>
          					
					</td>
			</tr>

			<tr>
	        <td align="left" height="50">
	          	<b><font face="Time New Roman" color="#C9" size="3">Hand Drive:</font></b>
					</td>
					<td align="left" height="50"> 
							<font face="Time New Roman" size="3">
							<?php
                  foreach ($allData as $key => $value)
                  {
                      $cdrive='';
                      $drive=$value['handDrive'];
                      if ($drive == 1)
                      {
                        $cdrive ='Right Drive';
                      }
                      else
                      {
                        $cdrive ='Left Drive';
                      }
                      echo $cdrive;
                  }								
							?>
          		</font>         					
					</td>
			</tr>
</table>

</div>
    </div>
     <div class="sidebar">
        <div class="gadget">
         <div class="img">
            <img width="250" height="200" alt="" class="fl" src="<?php 
              foreach ($allData as $key => $value)
              {
                echo $value['photo'];
              }         
            ?>"></img></div>
        </div>
   	</div> 
   	</div>
   	</div>
   	</div>
</body>
</html>