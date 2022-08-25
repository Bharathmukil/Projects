<?php
	
	
	
	
	$dbserver="localhost";
	$dbusername="root";
	$dbpassword="";
	$dbname="dbms";
	
	
	$user=$_POST['username'];
	$pass=$_POST['password'];
	
	$conn=mysqli_connect($dbserver,$dbusername,$dbpassword,$dbname);
	$sql="SELECT * from user where username='$user' and pass='$pass'";
	
		$result=mysqli_query($conn,$sql);
		
		if(mysqli_num_rows($result)==1){
			header("Location: http://localhost/dbms/home.html");
		}
		else{
			$message="INVALID USERNAME OR PASSWORD!!!";
			echo "<script>alert('$message');</script>";

			header("Location: http://localhost/dbms/login.html");

			
			
		}
?>

