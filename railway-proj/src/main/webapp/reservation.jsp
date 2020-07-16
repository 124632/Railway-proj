<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservation Form</title>
</head>
<body>
	<h3>Railway Reservation Form</h3>  
	<form  action="search.odc" method="post"  >
	<pre>
	Name<input type="text" name="name"/>
	Age<input type="text" name="age"/>
	Source<input type="text" name="source"/>
	Destination<input type="text" name="destination"/>
	Date<input type="text" name="date"/>
	<button type="submit">submit</button>
	<a href="search.jsp">search train</a> 
	</pre>
	</form>
</body>
</html>