<%@page import="com.model.StudentTo"%>
<%!StudentTo sto;%>
<%
	sto = (StudentTo) request.getAttribute("sto");
%>
<html>
<body bgcolor="lightblue">
	<center>
		<br> <br> <br>
		<table border="1" bgcolor="white">
			<tr>
				<td>Student Id</td>
				<td><%=sto.getSid()%></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><%=sto.getSname()%></td>
			</tr>
			<tr>
				<td>Student Address</td>
				<td><%=sto.getSaddr()%></td>
			</tr>
		</table>
	</center>
</body>
</html>