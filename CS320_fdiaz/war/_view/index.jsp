<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
		<style type="text/css">
		
		body {
			padding: 10%;
		}
		</style>
	</head>

	<body>
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<div>
				<input name="gg" type="submit" value="Guessing Game" />
				<input name="add" type="submit" value="Add Numbers" />
				<input name="mult" type="submit" value="Multiply Numbers" />
			</div>
		</form>
		Welcome Back!!
	</body>
</html>
