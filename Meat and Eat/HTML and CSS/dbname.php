<?php
	$dbserverName="localhost";
	$dbuserName="root";
	$dbuserpassword="";
	$dbname="dbms";
	
	$conn=mysqli_connect($dbserverName,$dbuserName,$dbuserpassword,$dbname);
	mysqli_select_db($conn,'dbms');
?>