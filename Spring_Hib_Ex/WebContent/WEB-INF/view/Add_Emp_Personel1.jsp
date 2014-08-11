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
<c:url var="empRegistration" value="updateEmp.html"/>
<form:form id="Add_Emp_Personel" modelAttribute="emp" commandName="emp" method="get" action="${empRegistration}">

<table border="1" bgcolor="black" width="600px">
<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>Emp Id: ${emp.fname}</td>
<td>First Name</td>
<td>Middle Name</td>
<td>Lastname</td>
<td>MobNo</td>

</tr>

<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>
<form:input path="empid"  value="${emp.empid}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="fname"  value="${emp.fname}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="mname" value="${emp.mname}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="lname"  value="${emp.lname}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="mobno" value="${emp.mobno}" size="25" maxlength="50" /> 
</td>

</tr>

</table>
<input type="submit" value="Submit">
</form:form>


<br>

<br>

<br>

<br>











<a href="empList.html" >Click Here to see User List</a><br>


<br>
</body>
</html>