<?php

	//include('returnFunction.php');
	class Model 
	{
		private $mysqli = null;
		private $stmt = null;

		function __construct()
		{
		    try
		    {
		    	$servername = "localhost";
				$username = "root";
				$password = "";
				$db_name = "carsale";
		      	$this->mysqli = new mysqli($servername, $username, $password, $db_name);
		    } 
		    catch (Exception $ex) 
		    { 
		    	die($ex->getMessage()); 
		    }
		}

		function __destruct()
		{
		    if ($this->stmt!==null) { $this->stmt = null; }
		    if ($this->mysqli!==null) { $this->mysqli = null; }
		}
		
		public function insert($request)
		{
			$result = false;
			$org_filename = $_FILES['upIphoto']['name'];
			$tmp = $_FILES['upIphoto']['tmp_name'];
			$filename = "../CarSelling/image/$org_filename";
			$cartype=$request['cartype'];
			$carname=$request['carname'];
			$model=$request['model'];
			$color=$request['color'];
			$power=$request['enginepower'];
			$price=$request['price'];
			$license=$request['license'];
			$control=$request['iControl'];
			$oil=$request['iPetrol'];
			$drive=$request['iDrive'];
			$company=$request['iCompany'];
			$uplload=0;
			if($org_filename)
			{
				if(move_uploaded_file($tmp, "../CarSelling/image/$org_filename"))
				{
					$uplload++;
				}
			}
			if($uplload > 0)
			{
				try
				{
					$query= $this->mysqli->prepare("INSERT INTO checkall (colorId,modelId,carNameId,carTypeId,eId,priceId,licenceId,control,petrol,handDrive,companyId,photo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
					$query->bind_param("iiiiiiiiiiis",$color,$model,$carname,$cartype,$power,$price,$license,$control,$oil,$drive,$company,$filename);
					if($query->execute())
					{
						$last_id=$this->mysqli->insert_id;
						try
						{
								$query= $this->mysqli->prepare("SELECT color.color,model.model,name.name,type.carTypeName,engine.enginePower,price.priceRange,licence.town,company.companyName,alls.control,alls.petrol,alls.handDrive,alls.photo,alls.carId FROM checkall alls LEFT JOIN carcolor color ON color.colorId=alls.colorId LEFT JOIN carmodel model ON model.modelId=alls.modelId LEFT JOIN carname name ON name.carNameId=alls.carNameId LEFT JOIN cartype type ON type.carTypeId=alls.carTypeId LEFT JOIN carenginepower engine ON engine.eId=alls.eId LEFT JOIN price price ON price.priceId=alls.priceId LEFT JOIN carlicence licence ON licence.licenceId=alls.licenceId LEFT JOIN company company ON company.companyId=alls.companyId WHERE alls.carId=?");
								$query->bind_param("i",$last_id);
								$query->execute();
								$result = $query->get_result();
								$result = $result->fetch_all(MYSQLI_ASSOC);
						}
						catch (Exception $ex)
						{ 
							die($ex->getMessage()); 
						}
					}						 
				}
				catch (Exception $ex)
				{ 
					die($ex->getMessage()); 
				}
			}
		    $this->mysqli = null;
		    return $result;
		}
		public function carType($id)
		{
			$result = false;
		    try
		    {
		      $query= $this->mysqli->prepare("SELECT * FROM carname WHERE carTypeId=?");
		      $query->bind_param("i",$id);
		      $query->execute();
		      $result = $query->get_result();
		      $result = $result->fetch_all(MYSQLI_ASSOC);
		    }
		    catch (Exception $ex)
		    { 
		    	die($ex->getMessage()); 
		    }
		    //$this->mysqli = null;
		    return $result;
		}
		public function selectAll($sql)
		{
			$result = false;
		    try
		    {
		      $query= $this->mysqli->prepare($sql);
		      $query->execute();
		      $result = $query->get_result();
		      $result = $result->fetch_all(MYSQLI_ASSOC);
		    }
		    catch (Exception $ex)
		    { 
		    	die($ex->getMessage()); 
		    }
		    //$this->mysqli = null;
		    return $result;
		}
		public function selectId($table,$column,$id)
		{
			$result = false;
		    try
		    {
		      $query= $this->mysqli->prepare("SELECT * FROM $table WHERE $column=?");
		      $query->bind_param("i",$id);
		      $query->execute();
		      $result = $query->get_result();
		      $result = $result->fetch_all(MYSQLI_ASSOC);
		    }
		    catch (Exception $ex)
		    { 
		    	die($ex->getMessage()); 
		    }
			//$this->mysqli = null;
		    return $result;
		}
		public function checkAll($request)
		{
			$id=$request['carname'];
			$result = false;
		    try
		    {
			      $query= $this->mysqli->prepare("SELECT color.color,model.model,name.name,type.carTypeName,engine.enginePower,price.priceRange,licence.town,company.companyName,alls.control,alls.petrol,alls.handDrive,alls.photo,alls.carId FROM checkall alls LEFT JOIN carcolor color ON color.colorId=alls.colorId LEFT JOIN carmodel model ON model.modelId=alls.modelId LEFT JOIN carname name ON name.carNameId=alls.carNameId LEFT JOIN cartype type ON type.carTypeId=alls.carTypeId LEFT JOIN carenginepower engine ON engine.eId=alls.eId LEFT JOIN price price ON price.priceId=alls.priceId LEFT JOIN carlicence licence ON licence.licenceId=alls.licenceId LEFT JOIN company company ON company.companyId=alls.companyId WHERE alls.carNameId=?");
			      $query->bind_param("i",$id);
			      $query->execute();
			      $result = $query->get_result();
			      $result = $result->fetch_all(MYSQLI_ASSOC);
		    }
		    catch (Exception $ex)
		    { 
		    	die($ex->getMessage()); 
		    }
			//$this->mysqli = null;
		    return $result;
		}
		public function update($request)
		{
			$price=$request['price'];
			$id=$request['carid'];
			$result = false;
		    try
		    {
		      $query= $this->mysqli->prepare("UPDATE checkall SET priceId=? WHERE carTypeId=?");
		      $query->bind_param("ii",$price,$id);
		      if($query->execute())
		      {
					try
					{
							$query= $this->mysqli->prepare("SELECT color.color,model.model,name.name,type.carTypeName,engine.enginePower,price.priceRange,licence.town,company.companyName,alls.control,alls.petrol,alls.handDrive,alls.photo,alls.carId FROM checkall alls LEFT JOIN carcolor color ON color.colorId=alls.colorId LEFT JOIN carmodel model ON model.modelId=alls.modelId LEFT JOIN carname name ON name.carNameId=alls.carNameId LEFT JOIN cartype type ON type.carTypeId=alls.carTypeId LEFT JOIN carenginepower engine ON engine.eId=alls.eId LEFT JOIN price price ON price.priceId=alls.priceId LEFT JOIN carlicence licence ON licence.licenceId=alls.licenceId LEFT JOIN company company ON company.companyId=alls.companyId WHERE alls.carId=?");
							$query->bind_param("i",$id);
							$query->execute();
							$result = $query->get_result();
							$result = $result->fetch_all(MYSQLI_ASSOC);
					}
					catch (Exception $ex)
					{ 
						die($ex->getMessage()); 
					}
			  }
		    }
		    catch (Exception $ex)
		    { 
		    	die($ex->getMessage()); 
		    }
			//$this->mysqli = null;
		    return $result;
		}

	}

?>