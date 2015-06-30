<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form id="result" name="result" method="post" action="/SpringWebLessons/controller/compute">
		<p>
			Demonstrate a normal Controller
		</p>
		<input type="text" id="value1" name="value1"/> <input type="text" id="value2" name="value2"/> 
		<input type="submit" value="Submit Values">
	</form>
	
	<form id="result" name="result" method="post" action="/SpringWebLessons/controller/redirect">
		<p>
			Demonstrate a Redirect Controller
		</p>
		<input type="text" id="value1" name="value1"/> <input type="text" id="value2" name="value2"/> 
		<input type="submit" value="REDIRECT">
	</form>
	
	<form id="result" name="result" method="post" action="/SpringWebLessons/controller/forward">
		<p>
			Demonstrate a Forward Controller
		</p>
		<input type="text" id="value1" name="value1"/> <input type="text" id="value2" name="value2"/> 
		<input type="submit" value="FORWARD">
	</form>
	
	
	<p>
		Sum is ${sum}
	</p>

</body>
</html>