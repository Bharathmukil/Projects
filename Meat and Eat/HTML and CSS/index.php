
<!DOCTYPE html>
<html>
<head>
	<title>registration</title>
	<link rel="stylesheet"	href="style.css">
	<!--<script src='https://code.jquery.com/jquery-3.4.1.min.js'>
		
	</script>
	<script>
		$('.message a').click(function(){
			$('form').animate({height: "toggle", opacity: "toggle"}, "slow");
		});
	</script>
	<script type="text/javascript">
		function myfunction(){
			var x=document.getElementById("hide1");
			if(x.style.display=="none"){
				x.style.display="block";
			}
			else{
				x.style.display="none";
			}
		}
	</script>-->
</head>

<body>
	<header>
	<h1 id="head1">meet and eat
	<img src="logo1.jpg" alt="logo" id="logo"></h1>
	</header>
	<div class="login">
	<div class="form">
	<form class="reg" method="post" action="server.php">
		
		<input type="text" name="username" placeholder="username"/>
		<input type="password" name="password" placeholder="password"/>
		<input type="text" name="email" placeholder="email"/>
		<input type="number" name="moblie" placeholder="moblie"/>
		<button type="submit" name="register" >create</button>
	<p class="message">Already Registerd?<a href="login.php">sign in</a>
	</p>
    </form>
    <!--<form class="login-form">
    	<input type="text" placeholder="username"/>
    	<input type="password" placeholder="password"/>
    	<button>login</button>
    	<p class="message">Not Registerd?<a href="#" onclick="myfunction()">register</a>
    	</p>
    </form>	-->
	</div>
	</div>
</body>
</html>