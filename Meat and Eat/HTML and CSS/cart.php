<?php
	include_once('dbname.php');
	$query="select * from cart";
	$result=mysqli_query($conn,$query);
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
<div class="ta1" style="margin-left: 510px; margin-top: 50px;">
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
			while($rows=mysqli_fetch_array($result))
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
<div style="margin-left:1000px; margin-top: 30px;">
<div class="item1" >
<form>
	<button name="order" type="button" >Order</button>
</form>
</div>
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