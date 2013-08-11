
<%@page import="edu.cadsoft.model.bean.Alumno"%>
<%@page import="java.util.List"%>
<%@page import="edu.cadsoft.service.Servicio"%>
<%@page import="edu.cadsoft.service.impl.ServiceImpl"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Servicio serv=new ServiceImpl();%>
<% List<Alumno> list=serv.mostrarTotAlumnos(); %>

<table border="1">
<tr>
<td>Ap.Paterno</td>
<td>Ap.Materno</td>
</tr>
<%for(Alumno alu:list){ %>
<tr>
<td><%=alu.getApePatAlumno() %></td>
<td><%=alu.getApeMatAlumno() %></td>
</tr>
<%} %>
</table>
</body>
</html>