<%@ page import="java.util.List" %>
<%@ page import="com.iesemilidarder.restaurants.web.Restaurant" %><%--
  Created by IntelliJ IDEA.
  User: mcabot
  Date: 19/01/2018
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String q = (String)request.getAttribute("q");
    List<Restaurant> list = (List)request.getAttribute("resultats");

    out.println("REsultats de la cerca "+q+"("+list.size()+"):<br>");
    if (list!=null) {
        for (Restaurant rest : list) {
            out.println(rest.getNombre() + "<br>");
        }
    }
%>
</body>
</html>
