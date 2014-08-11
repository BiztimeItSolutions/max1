<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" bgcolor="black" width="600px">
<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>Emp Id</td>
<td>First Name</td>
<td>Middle Name</td>
<td>Lastname</td>
<td>MobNo</td>

</tr>

<c:forEach items="${emps}" var="emp">
<tr style="background-color:white;color: black;text-align: center;" height="30px" >
<td><c:out value="${emp.empid}"/></td>
<td><c:out value="${emp.fname}"/></td>
<td><c:out value="${emp.mname}"/></td>
<td><c:out value="${emp.lname}"/></td>
<td><c:out value="${emp.mobno}"/></td>
</tr>
</c:forEach>
</table>


<br>

<br>

<br>

<br>











<a href="empList.html" >Click Here to see User List</a><br>


<br>
</body>
</html>