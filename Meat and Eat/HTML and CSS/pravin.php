<?php
	$conn = include_once 'dbname.php';
	$query="select * from cart";
	$result= $conn-> query($query);
?>

<!DOCTYPE html>
<html>
<head>
	<title>cart</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<header>
	<h1 id="head1">meet and eat
	<img src="logo1.jpg" alt="logo" id="logo"></h1>
</header>
<nav>
	<div class="navf">
	<ul class="nav">
	<li><a href="home.html">Home</a></li> 
    <li><a href="cart.html">Cart</a></li>   
    <li><a href="myorder.html">MyOrders</a> </li> 
    <li><a href="about.html">About us</a></li>
    <li><a href="login.html">logout</a></li>
	</ul>
	</div>
</nav>
<article>
<div class="pro">
<h1>
	Eat to Live! live to eat!
</h1>
</div>
</article>
<div class="ta">
	<table class="cart">
		<col width="250">
		<col width="100">
		<col width="100">
		<tr>
			<th>Item name</th>
			<th>Price</th>
			<th>Qty</th>
		</tr>
		<?php 
			while($rows=mysql_fetch_assoc($result))
			{
				?>
				<tr>
					<td><?php echo $rows['iname']; ?></td>
					<td><?php echo $rows['price']; ?></td>
					<td><?php echo $rows['qty']; ?></td>

				</tr>
				<?php
			}
			?>
	</table>
</div>
<div class="item1">
<form>
	<button name="order" type="button" >Order</button>
</form>
</div>
<footer class="footer">
	<img src="logo1.jpg" id="logo">
	<ul>
		<li>contact us: 9898989898</li>
		<li>instagram: meet_and_eat123</li>
		<li>facebook: foooody</li>
	</ul>
</footer>
</body>
</html>