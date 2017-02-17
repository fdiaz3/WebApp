<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Guessing Game</title>
		<style type="text/css">
		
		body {
			padding: 10%;
		}
		</style>
	</head>

	<body>
		<form action="${pageContext.servletContext.contextPath}/guessingGame" method="post">
			<c:if test="${empty game}">
				<input name="startGame" type="submit" value="Start game" />
				<input name="return" type="Submit" value="Return to Index!">
			</c:if>
			<c:if test="${! empty game}">
				<c:if test="${game.done}">
					<div>
						The number you are thinking of is ${game.guess}
					</div>
					<div>
						<input name="startGame" type="submit" value="Play again" />
						<input name="return" type="Submit" value="Return to Index!">
					</div>
				</c:if>
				<c:if test="${!game.done}">
					<div>
						Are you thinking of ${game.guess}?
					</div>
					<div>
						<input name="gotIt" type="submit" value="Yes, that's it!" />
						<input name="less" type="submit" value="No, that's too big" />
						<input name="more" type="submit" value="No, that's too small" />
						<input name="return" type="Submit" value="Return to Index!">
						<input name="min" type="hidden" value="${game.min}" />
						<input name="max" type="hidden" value="${game.max}" />
					</div>
				</c:if>
			</c:if>
		</form>
	</body>
</html>