<?php include '../dbconnect.php';?>

<?php
	session_start();
	$_SESSION['username']=$_POST['adminName'];
	$_SESSION['password']=$_POST['password'];
	$_SESSION['authuser']=0;
	$user=$_SESSION['username'];
	$pass=$_SESSION['password'];
	$sql="SELECT * FROM admin WHERE adminName='$user' AND adminPassword='$pass'";
	$result=$conn->query($sql);
	if ($result->num_rows >0)
	{
		$_SESSION['authuser']=1;
		header("location:../public/index.php?operation=login");
	}
	else
	{
		//echo "INCORRECT Username and Password.<br>";
		echo "<script language='javascript'>";
		  echo "alert('INCORRECT Username and Password.'')";  //not showing an alert box.
		  echo "</script>";
		header("location:../public/index.php?operation=adminPage");
		exit();
	}
?>