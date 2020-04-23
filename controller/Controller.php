<?php
	include_once("../model/Model.php");
	header("Access-Control-Allow-Origin: *");

	class Controller
	{
		public $model;
		
		public function __construct()  
	    {  
	        $this->model = new Model();

	    }
		public function invoke()
		{
			// if (!isset($_GET['operation']) && !isset($_POST['operation']))
			// {
			// 	$allPersons = $this->model->getAllPersons();
			// 	include 'view/booklist.php';
			// }
			
			if(isset($_POST['operation']))
			{
				$request= $_POST;
				switch ($_POST['operation'])
				{
					case 'searchResult':
						$carType=$this->model->selectId("cartype","carTypeId",$_POST['cartypeid']);
						$carName=$this->model->selectId("carname","carNameId",$_POST['carname']);
						$carPrice=$this->model->selectId("price","priceId",$_POST['price']);
						$carModel=$this->model->selectId("carmodel","modelId",$_POST['model']);
						$carColor=$this->model->selectId("carcolor","colorId",$_POST['color']);
						$carLicence=$this->model->selectId("carlicence","licenceId",$_POST['license']);
						include '../view/calculate.php';
					break;

					case 'carInsert':
						$allData=$this->model->insert($request);
						include '../view/insertdataok.php';
					break;

					case 'updateForm':
						$checkAll=$this->model->checkAll($request);
						include '../view/updateprice.php';
					break;

					case 'updatedata':
						$checkAll=$this->model->update($request);
						include '../view/updatepricedata.php';
					break;
								
					default:
					# code...
					break;
				}
			}
			if(isset($_GET['operation']))
			{
				switch ($_GET['operation'])
				{
					case 'searchPage':
						include '../view/searchhome.html';
					break;

					case 'searchForm':
						$carType=$this->model->carType($_GET['searchid']);
						$carPrice=$this->model->selectAll("SELECT * FROM price");
						$carModel=$this->model->selectAll("SELECT * FROM carmodel");
						$carColor=$this->model->selectAll("SELECT * FROM carcolor");
						$carLicence=$this->model->selectAll("SELECT * FROM carlicence");
						include '../view/searchinput.php';
					break;

					case 'about':
						include '../view/aboutUs.php';
					break;

					case 'adminPage':
						include '../view/adminpage.php';
					break;

					case 'login':
						include '../view/admin.php';
					break;

					case 'insertForm':
						$carType=$this->model->selectAll("SELECT * FROM cartype");
						$carName=$this->model->selectAll("SELECT * FROM carname");
						$carPrice=$this->model->selectAll("SELECT * FROM price");
						$carModel=$this->model->selectAll("SELECT * FROM carmodel");
						$carColor=$this->model->selectAll("SELECT * FROM carcolor");
						$carLicence=$this->model->selectAll("SELECT * FROM carlicence");
						$carEngine=$this->model->selectAll("SELECT * FROM carenginepower");
						$carCompany=$this->model->selectAll("SELECT * FROM company");
						include '../view/insert.php';
					break;

					case 'updatePage':
						$carName=$this->model->selectAll("SELECT * FROM carname");
						include '../view/update.php';
					break;

					case 'updateChoice':
						$carPrice=$this->model->selectAll("SELECT * FROM price");
						include '../view/updatechoiceprice.php';
					break;

					default:
									
					break;
				}
			}
		}
	}

?>