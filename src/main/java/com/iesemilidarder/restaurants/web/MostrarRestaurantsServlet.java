package com.iesemilidarder.restaurants.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class MostrarRestaurantsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

/*
        ArrayList restaurants = new ArrayList();
        restaurants.add(new Restaurant("Bar Manolo", 3));
        restaurants.add(new Restaurant("Bar Tolo", 5));
        request.setAttribute("restaurants", restaurants);
        request.getRequestDispatcher("mostrar.jsp").forward(request, response);
*/
    }
}
