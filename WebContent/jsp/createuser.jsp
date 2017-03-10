<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<body>
	<html:form action="createUser" >
		<table>
			<tr>
				<td><label>User Name</label><span style="color:red">*</span></td>
				<td><html:text property="userName" /></td>
				<td><logic:messagesPresent property="userName">
							<font color="red"><html:errors property="userName" /></font>
					</logic:messagesPresent>
				</td>
			</tr>
			<tr>
				<td><label>First Name</label><span style="color:red">*</span></td>
				<td><html:text property="firstName" /></td>
				<td><logic:messagesPresent property="firstName">
							<font color="red"><html:errors property="firstName" /></font>
					</logic:messagesPresent>
				</td>
			</tr>
			<tr>
				<td><label>Last Name</label><span style="color:red">*</span></td>
				<td><html:text property="lastName" /></td>
				<td><logic:messagesPresent property="lastName">
							<font color="red"><html:errors property="lastName" /></font>
					</logic:messagesPresent>
				</td>
			</tr>
			<tr>
				<td><label>Date Of Birth</label><span style="color:red">*</span></td>
				<td><input type="date" name="dob"/></td>
				<td><logic:messagesPresent property="dob">
							<font color="red"><html:errors property="dob" /></font>
					</logic:messagesPresent>
				</td>
			</tr>
			<tr>
				<td><label><bean:message key="userform.phone" /></label> <font color="red">*</font>
				</td>
				<td>
					<html:text property="phone" /></td>
				<td>
					<logic:messagesPresent property="phone">
							<font color="red"><html:errors property="phone" /></font>
					</logic:messagesPresent>
				</td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" value="click" />
				</td>
			</tr>
		</table>
	</html:form>
</body>
</html>