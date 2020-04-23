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
          <b><font face="Time New Roman" color="blue" size="5">Choice the price to Update</font></b>  
        	<br/><br/>


          <form action='index.php' method="POST">
            <input type='hidden' value='updatedata' name='operation'>
            <table border="0" width="80%" cellspacing="0" cellpadding="0" >
                <tr>
                  <td align="left" height="50">
                      <b><font face="Time New Roman" color="#C9" size="3">Updat Price:</font></b>
                  </td>
                  <td align="left" height="50"> 
                    <select name="price">
                        <?php
                            foreach($carPrice as $key =>$value)
                            {
                                echo "<option value=' ".$value['priceId']. " '> ". $value['pricerange']. "</option>";  
                            }
                        ?>
                    </select>
                  </td>
                </tr>
                <tr>
                  <td colspan="2"><center><button type='submit'>Update</button></center></td>
                </tr>
            </table>
        <input type='number' name='carid' value="<?php $id=$_GET['id']; echo $id;?>" hidden>
      </form>
    </div>
    </div>
      
    <div class="sidebar">
        <div class="gadget">
          <div class="img"><img src="../images/update1.jpg" width="200" height="200" alt="" class="fl" /></div>
        </div>
    </div> 
    </div>
    </div>
    </div>
</body>
</html>