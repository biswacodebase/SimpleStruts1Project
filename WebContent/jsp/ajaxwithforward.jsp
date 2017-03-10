<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>

<html>
<head>
<title>SystemTime</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	function getCountry(continent)
	{
		$.ajax({
			url : "/StrutsExample/getCountry.do",
			type : "GET",
			data : {continent:continent},
			error : function(
					req, error,
					errorThrown) {
				alert("Your request cound not be carried out because of "
						+ error);
			},
			success : function(
					data) {
				$("#country").html(data);
			}
		});
	}
</script>
</head>
<body>
	<html:form action="getGeo" >
		<table>
			<tr>
				<td><label>Continent</label></td>
				<td><html:select property="continent" onchange="javascript:getCountry(this.value)">
						<html:option value="Asia">Asia</html:option>
						<html:option value="Europe">Europe</html:option>
					</html:select>
				</td>
			</tr>
			<tr>
				<td><label>Country</label></td>
				<td><html:select  styleId="country" property="country">
					</html:select>
				</td>
			</tr>
			</table>
	</html:form>
</body>
</html>