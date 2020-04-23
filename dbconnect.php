<?php
	//echo "Hello  World";

	$servername = "localhost";
	$username = "root";
	$password = "";
	$db_name = "carsale";
	try
	{
		$conn = new mysqli($servername, $username, $password, $db_name);
		//echo "Connected successfully";
	} 
	catch (Exception $ex) 
	{ 
		die($ex->getMessage());
	}

?>