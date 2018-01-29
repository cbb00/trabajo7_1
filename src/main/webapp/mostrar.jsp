<%@ page import="java.util.ArrayList" %>
<%@ page import="com.iesemilidarder.restaurants.web.Restaurant" %><%--
  Created by IntelliJ IDEA.
  User: mcabot
  Date: 10/01/2018
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Llista de restaurants:<br>
    <%
        ArrayList<Restaurant> restaurants = (ArrayList)request.getAttribute("restaurants");
        if (restaurants!=null) {
            for (Restaurant rs : restaurants) {
                out.println(rs.getNom() + " " + rs.getEstrelles() + "<BR>");
            }
        }
    %>
</body>
</html>
