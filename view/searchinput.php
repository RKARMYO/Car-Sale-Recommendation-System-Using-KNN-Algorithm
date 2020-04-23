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
    <script type="text/javascript" src="../src/bootstrap.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        .inputselect
        {
          width:200px;
          height:30px;
        }
        .searchinputdiv,.sidebar
        {
          background-color:rgba(0,0,0,0.1);
          margin-top:200px;
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
          <li class="active"><a href="../index.php">Home</a></li>
          <li><a href="index.php?operation=searchPage">Back</a></li>
         
        </ul>
      </div>
      <div class="clr"></div>


      <div class="sidebar">
        <div class="gadget">
          <div class="img"><img src="../images/images4.jpg" width="200" height="200" alt="" class="fl" /></div>
        </div>
      </div>
<div class='searchinputdiv'>
  <form action="index.php" method="post" enctype="multipart/form-data">
      <input type="hidden" name="operation" value="searchResult">
      <input type='number' name='cartypeid' value='<?php $cartypeid=$_GET['searchid'];?>' hidden>
      <table border="0"  cellspacing="0" cellpadding="0" style='color:black;'>
        <tr><td>Car Name:</td>
          <td align="left" height="50">

            <select name='carname' class='inputselect'>
              <option value='0'>--Car Name--</option>
              <?php
                  foreach ($carType as $key => $value)
                  {
                      echo "<option value=' ".$value['carNameId']. " '> ". $value['name']. "</option>"; 
                  }
              ?>
            </select>
          </td>
        </tr>

        <tr><td align="left" height="50">Price:</td>
          <td>
            <select name='price' class='inputselect'>
              <option value='0'>--Price--</option>
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
        <td align="left" height="50">Model:</td>
        <td>
          <select name='model' class='inputselect'>
            <option value='0'>--Model--</option>
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
        <td align="left" height="50">Color:</td>
        <td>
          <select name='color' class='inputselect'>
            <option value='0'>--Color--</option>
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
        <td align="left" height="50">Regional License:</td>
        <td>
          <select name='license' class='inputselect'>
            <option value='0'>--Town--</option>
            <?php
                foreach ($carLicence as $key => $value)
                {
                    echo "<option value=' ".$value['licenceId']. " '> ". $value['town']. "</option>"; 
                }
            ?>
          </select>
        </td>
      </tr>
      </table>

      <input type='number' name='cartypeid' value='<?php echo $cartypeid ; ?>' hidden>
      <button type='submit' class='btn'>Search</button>
  </form>
  </div>
</div>
</div>
</div>
</body>
</html>