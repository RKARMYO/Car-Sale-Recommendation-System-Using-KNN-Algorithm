<?php 
  include '../dbconnect.php';
?>

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
      a:link{ text-decoration: none;}
      a:hover {
        color: red;
        background-color: transparent;
        text-decoration: underline;
      }
      #user_num
        {
          width:200px;
          height:30px;
        }
      table
      {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          
          margin-left: 200;
          margin-right: 50;
      }

      td, th 
      {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
      }

      tr:nth-child(even) 
      {
          background-color: #dddddd;
      }
      span.blue
      {
      	color:blue;
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
          <li class="active"><a href="#">Search</a></li>
          <?php
              foreach ($carType as $key => $value) 
              {
                echo "<li><a href='index.php?operation=searchForm&searchid=".$value['carTypeId']."'>Back</a></li>";
              }
          ?>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
<?php
  	$cartypeid=$_POST['cartypeid'];
  	$carname=$_POST['carname'];
  	$price=$_POST['price'];
  	$model=$_POST['model'];
  	$color=$_POST['color'];
  	$license=$_POST['license'];

  	$input = array ($cartypeid,$carname,$price,$model,$color,$license);
  	//print_r($input);
  	echo "<br>";
  	//echo "type".$cartypeid." name ".$carname." price ".$price." model ".$model." color ".$color. " license ".$license;

    foreach ($carType as $key => $value) 
    {
      echo "<br><center><font size='3'>Car type= <span class='blue'>".$value['carTypeName']."</span></font>";
    }
    foreach ($carName as $key => $value) 
    {
      echo "<font size='3'> Car Name= <span class='blue'>".$value['name']."</span></font>";
    }
    foreach ($carPrice as $key => $value) 
    {
      echo "<font size='3'> Price=<span class='blue'>".$value['pricerange']."</span></font>";
    }
    foreach ($carModel as $key => $value) 
    {
      echo "<font size='3'> Model=<span class='blue'>".$value['model']."</span></font> ";
    }
    foreach ($carColor as $key => $value) 
    {
      echo "<font size='3'> Color=<span class='blue'>".$value['color']." </span></font>";
    }
    foreach ($carLicence as $key => $value) 
    {
      echo "<font size='3'> License= <span class='blue'>".$value['town']."</span></font> </center>";
    }


  	$train = array();
  	$traindata =array();$num=0;
  	$sql = "SELECT * FROM checkall ";
  	$result = $conn->query($sql);
  	if($result)
    {
  		while($data =$result->fetch_assoc()){
  			$traindata[$num] = array($data['carTypeId'],$data['carNameId'],$data['priceId'],$data['modelId'],$data['colorId'],$data['licenceId'],$data['carId']);
  			//$train[$] = $traindata;
  			$num++;
  		}
  	}
  	//print_r($traindata);

  	// first we have to calculate distance for each trainData
  	$distance_arr = array();
  	$dist_count = 0 ; 



    //echo "<br> (5 - 3 ) ^ 2 =>".((5-3)*(5-3)) ;

  	//	$dist = 
  	// field 0 => car type id 

    for($i = 0 ; $i<count($traindata) ; $i++)
    {

    	//echo "<h3> traindata ".$i." => 0 ".$traindata[$i][0] ."</h3>";
    	if($input[0] == 0 ) $car_type_id_diff = 0 ;
    	else $car_type_id_diff =( ($input[0] - $traindata[$i][0])  * ($input[0] - $traindata[$i][0]) ) ; 
    	
    	if($input[1] == 0 ) $car_name_id_diff = 0 ;
    	else $car_name_id_diff = ( ($input[1] - $traindata[$i][1]) * ($input[1] - $traindata[$i][1])  ) ; 

    	if($input[2] == 0 ) $car_price_id_diff = 0; 
    	else $car_price_id_diff = (($input[2] - $traindata[$i][2]) * ($input[2] - $traindata[$i][2])   ) ; 

    	if($input[3] == 0 ) $car_model_id_diff = 0 ;
    	else $car_model_id_diff = (($input[3] - $traindata[$i][3]) * ($input[3] - $traindata[$i][3])  ) ; 

    	if($input[4] == 0 ) $car_color_id_diff = 0 ;
    	else $car_color_id_diff = (($input[4] - $traindata[$i][4]) * ($input[4] - $traindata[$i][4])  ) ; 

    	if($input[5] == 0 ) $car_license_id_diff = 0;
    	else $car_license_id_diff = (($input[5] - $traindata[$i][5]) * ($input[5] - $traindata[$i][5])  ) ; 

    	$total_diff = $car_type_id_diff + $car_name_id_diff + $car_price_id_diff + $car_model_id_diff + $car_color_id_diff + $car_license_id_diff ;

    	//echo "<br> total diff => ".$total_diff;
    	$diff = sqrt($total_diff);

    	//echo "<br>diff is => ".$diff;
    	$distance_arr[$i] = $diff;

    	//echo "loop ".$i;

    }


    $sorted_dist_arr = $distance_arr;
    sort($sorted_dist_arr);
    $old_index = array();

    //echo "<br> distance_arr => ".json_encode($distance_arr);
    //echo "<br> sorted dist arr => ".json_encode($sorted_dist_arr);


    for($i = 0 ; $i<count($sorted_dist_arr); $i++)
    {
    	for($j = 0; $j<count($distance_arr); $j++){
    		if($sorted_dist_arr[$i] == $distance_arr[$j] ){
    			$old_index[$i] = $j;
    			$distance_arr[$j] = "9999999";
    			$j = count($distance_arr);
    			//$j = 9999999999;
    		}
    	}
    }


    //echo "<br> org dist arr => ".json_encode($distance_arr);
    //echo "<br> Sorted training data index dist arr index is ".json_encode($old_index);


    // change training data index to car id 
    $car_id_list = array();
    for($i = 0 ; $i<count($old_index); $i++){
    	$min_index = $old_index[$i] ; 
    	$car_id_list[$i]= $traindata[$min_index][6];
    }

    //echo "<br> car id list in sorted => ".json_encode($car_id_list);



    //echo "<table>";

    $js_array = array();
    $js_count = 0 ;

    for($i = 0 ; $i < count($car_id_list); $i++)
    {
      	$sql = "SELECT * FROM checkallresult1 WHERE carId = ".$car_id_list[$i];
      	$result = $conn->query($sql);
      	if ($result->num_rows > 0)
        {
      		$car = $result->fetch_assoc();
      		/*
      		echo "<tr>".
      		"<td>".$car['carTypeName']."</td>".
      		"<td>".$car['name']."</td>".
      		"<td>".$car['pricerange']."</td>".
      		"<td>".$car['model']."</td>".
      		"<td>".$car['color']."</td>".
      		"</tr>";
      		*/
      		$car['diff'] = $sorted_dist_arr[$js_count];
      		$car['car_id_delete'] = $car_id_list[$i];
      		$js_array[$js_count] = $car;
      		$js_count++;
      	}
    }
    //echo "</table>";


  //echo "<Br> js array is =>".json_encode($js_array);

  echo "<span id='js_array' style='display:none'>".json_encode($js_array)."</span>";

?>



  <br><br>
  <font size=5><center>Enter K-Value(Number of Items):</center></font><br><br>
  <center><input type='number' id='user_num'  placeholder='Enter num' />
  <button id='user_button' class='btn'>Search</button></center><br>

  <div id="car_list_div">

  </div>




<script type="text/javascript">
	
	$("#user_button").click(function()
  {
		  var car_count = $("#user_num").val();
		  if(car_count == "")
      {
  			alert("Enter num");
  			return;
      }


  		//alert("clicked num is "+$("#user_num").val());

  		$("#car_list_div").html("");

  		var js_array_text = $("#js_array").text();
  		var js_array = JSON.parse(js_array_text);

  		var t_body_html = "";
  		for(var i = 0 ; i< car_count; i++)
      {
  				if(js_array[i]['control'] == 1 ) js_array[i]['control'] = "Auto";
  				else js_array[i]['control'] = "Manual";


  				if(js_array[i]['petrol'] == 1 ) js_array[i]['petrol'] = "Petrol";
  				else js_array[i]['petrol'] = "Diescel";



  				if(js_array[i]['handDrive'] == 1 ) js_array[i]['handDrive'] = "Right";
  				else js_array[i]['handDrive'] = "Left";

  				var no=i+1;
    			var table_text =js_array[i]['car_id_delete']+"<h3><center><font size='4'  style='color:red;'>"+ no+"</font><font size=4, color='blue'> Nearest Neighbor</font></center></h3><br><center><table style='color:black;width:500px;' border='1'>"+
      "<tr >"+
        "<td colspan='2'><center><img class='car_img' width='100%' height='300' src='../"+js_array[i]['photo']+"'></center></td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Distance </td>"+
        "<td align='left' height='30' style='color:red;'>"+js_array[i]['diff']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Type </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['carTypeName']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Name </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['name']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Price </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['pricerange']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Model </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['model']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td  align='left' height='30'>Car Color </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['color']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Control </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['control']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Hand </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['handDrive']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car petrol </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['petrol']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Engine </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['enginePower']+"</td>"+
      "</tr>"+
      "<tr>"+
        "<td align='left' height='30'>Car Licence </td>"+
        "<td align='left' height='30'  style='color:blue;'>"+js_array[i]['town']+"</td>"+
      "</tr>"+
    "</table></center><br>";



    			t_body_html = t_body_html + table_text;

    		}

		$("#car_list_div").html(t_body_html);

	});
</script>

 


</body>
</html>