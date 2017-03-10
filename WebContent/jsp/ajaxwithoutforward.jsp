<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SystemTime</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	setInterval(function() {
		getSystime();
	}, 1000);
	function getSystime()
	{
		$.ajax({
			url : "/StrutsExample/systemTime.do",
			type : "GET",
			data : {},
			error : function(
					req, error,
					errorThrown) {
				alert("Your request cound not be carried out because of "
						+ error);
			},
			success : function(
					data) {
				$("#sysTime").html('Time now '+data);
			}
		});
	}
</script>
</head>
<body>
	<div id="sysTime">
	</div>
</body>
</html>