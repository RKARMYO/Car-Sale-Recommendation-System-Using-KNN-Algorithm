<?php
  session_start();
  if($_SESSION['authuser']!=1)
  {
    echo "INCORRECT Username and Password.";
    exit();
  }
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?php //include '../dbconnect.php';?>
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
          <li class="active"><a href="#">Insert</a></li>        
          <li><a href="index.php?operation=login">Back</a></li>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <b><font face="Time New Roman" color="blue" size="5">Please Enter Car Information:</font></b>  
        	<br/><br/> 
        <form action="index.php" enctype="multipart/form-data" method="POST">
  			<input type='hidden' name='operation' value='carInsert'>
          <table border="0" width="80%" cellspacing="0" cellpadding="0" >
          		
				
				<tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Type of Car:</font></b>
	          		</td>
	          		<td align="left" height="50"> 
						<select name="cartype">
               				<?php
							    foreach ($carType as $key => $value)
								{
									echo "<option value=' ".$value['carTypeId']. " '> ". $value['carTypeName']. "</option>";
								}
							?>
             			</select>
					</td>
	             </tr>
				<tr>
	         	 	<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Car Name:</font></b>
					</td>
					<td align="left" height="50"> 
					<select name="carname">
               				<?php
							    foreach ($carName as $key => $value)
								{
									echo "<option value=' ".$value['carNameId']. " '> ". $value['name']. "</option>"; 
								}
							?>
             			</select>

					</td>
				</tr>
				<tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Model:</font></b>
	          		</td>
	          		<td align="left" height="50"> 

						<select name="model">
               				<?php
							 	 foreach ($carModel as $key => $value)
								  {
									  echo "<option value=' ".$value['modelId']. " '> ". $value['model']. "</option>";
								  }
							?>
             			</select>

					</td>
	             </tr>
	            <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Color:</font></b>
	          		</td>
	          		<td align="left" height="50"> 
						<select name="color">
               				<?php
							 	foreach ($carColor as $key => $value)
								 {
									echo "<option value=' ".$value['colorId']. " '> ". $value['color']. "</option>"; 
								 }
							?>
             			</select>
					</td>
	             </tr>
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Engine Power:</font></b>
	          		</td>
	          		<td align="left" height="50"> 
						<select name="enginepower">
							<?php
								foreach ($carEngine as $key => $value)
								{
								   echo "<option value=' ".$value['eId']. " '> ". $value['enginePower']. "</option>"; 
								}
							?>

             			</select>
					</td>
	             </tr>
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Price:</font></b>
	          		</td>
	          		<td align="left" height="50"> 
						<select name="price">
							<?php
							  	foreach ($carPrice as $key => $value)
								  {
									  echo "<option value=' ".$value['priceId']. " '> ". $value['pricerange']. "</option>";
								  }
							?>

             			</select>
					</td>
	             </tr>
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Regional Licence:</font></b>
	          		</td>
	          		<td align="left" height="50"> 
						<select name="license">
               				<?php
							  	foreach ($carLicence as $key => $value)
								  {
									  echo "<option value=' ".$value['licenceId']. " '> ". $value['town']. "</option>"; 
								  }
							?>
             			</select>
					</td>
	             </tr>
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Control:</font></b>
	          		</td>
	          		<td align="left" height="50" > 
							<input type="radio" name="iControl" value="1"/><b><font face="Time New Roman" color="#C9" size="2">Auto</font></b>
							<input type="radio" name="iControl" value="2"/><b><font face="Time New Roman" color="#C9" size="2">Manual</font></b>
					</td>
	             </tr>
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Oil:</font></b>
	          		</td>
	          		<td align="left" height="50" > 
							<input type="radio" name="iPetrol" value="1"/><b><font face="Time New Roman" color="#C9" size="2">Petrol</font></b>
							<input type="radio" name="iPetrol" value="2"/><b><font face="Time New Roman" color="#C9" size="2">Diesel</font></b>
					</td>
	             </tr>
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Hand Drive:</font></b>
	          		</td>
	          		<td align="left" height="50" > 
							<input type="radio" name="iDrive" value="1"/><b><font face="Time New Roman" color="#C9" size="2">Right Drive</font></b>
							<input type="radio" name="iDrive" value="2"/><b><font face="Time New Roman" color="#C9" size="2">Left Drive</font></b>
					</td>
	             </tr>
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Company:</font></b>
	          		</td>
	     
	          		<td align="left" height="50"> 
						<select name="iCompany">
               				<?php
							   foreach ($carCompany as $key => $value)
							   {
								   echo "<option value=' ".$value['companyId']. " '> ". $value['companyName']. "</option>"; 
							   }
							?>
             			</select>
					</td>
	             </tr>
	             
	             <tr>
					<td align="left" height="50">
	          			<b><font face="Time New Roman" color="#C9" size="3">Photo:</font></b>
	          		</td>
	          		<td align="left" height="50"> 
						<input type="file" name="upIphoto" id="fileToUpload" size="25" value=""></input>
					</td>
	             </tr>
	             
	             <tr>
             		<td height="50" colspan="2" align="center"><b> <input type=submit value="Insert"></input></b><br/>
					</td>
				</tr>
	            	
		    </table>
		</form>
          
        </div>
      </div>
    
   	</div>
   	</div>
   	</div>

</body>
</html>