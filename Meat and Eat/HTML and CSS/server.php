<?php
	include_once 'dbname.php';
	
	$username=$_POST["username"];
	$password=$_POST["password"];
	$email=$_POST["email"];
	$mobile=$_POST["mobile"];
	
	$sql="INSERT INTO user(username,pass,email,mobile) VALUES('$username','$password','$email','$mobile');";
	mysqli_query($conn,$sql);
	
	header("Location: http://localhost/dbms/login.html");
	

?>
