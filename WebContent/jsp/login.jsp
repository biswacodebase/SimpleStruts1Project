<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<html:form action="userLogIn">
		<table>
			<tbody>
				<tr>
					<td><label>User Name</label></td>
					<td><html:text property="userName"></html:text></td>
				</tr>
				<tr>
					<td><label>First Name</label></td>
					<td><html:text property="firstName"></html:text></td>
				</tr>
				<tr>
					<td><label>Last Name</label></td>
					<td><html:text property="lastName"></html:text></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="click"></td>
				</tr>
			</tbody>
		</table>
	</html:form>

</body>
</html>