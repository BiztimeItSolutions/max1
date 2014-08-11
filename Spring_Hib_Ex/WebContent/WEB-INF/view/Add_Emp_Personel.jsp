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

<c:url var="empRegistration" value="saveEmp.html"/>
<form:form id="Add_Emp_Personel" modelAttribute="emp" method="post" action="${empRegistration}">
<table width="400px" height="150px">
<tr>
<td><form:label path="fname">First Name</form:label></td>
<td><form:input  path="fname"/></td>
</tr>
<tr>
<td><form:label path="mname">MiddleName</form:label></td>
<td><form:input  path="mname"/></td>
</tr>
<tr>
<td><form:label path="lname">Last name</form:label></td>
<td><form:input path="lname" /></td>

</tr>
<tr>
<td><form:label path="mobno">Mob No</form:label></td>
<td><form:input path="mobno"/></td>
</tr>
<tr><td></td><td>
<input type="submit" value="RegisterEmp" />
</td></tr>
</table>
</form:form>





<a href="empList.html" >Click Here to see User List</a><br>


<br>
</body>
</html>