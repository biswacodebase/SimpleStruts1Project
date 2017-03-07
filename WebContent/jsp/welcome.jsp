<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<body>
 
 Welcome <c:out value="${userObject.firstName}  ${userObject.lastName}"></c:out>.
  
 
 Your user name is <c:out value="${userObject.userName}"></c:out>
</body>
</html>