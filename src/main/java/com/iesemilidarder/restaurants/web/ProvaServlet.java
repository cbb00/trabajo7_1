package com.iesemilidarder.restaurants.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ProvaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Restaurant res = (Restaurant)request.getSession().getAttribute("restaurant");

        if (request.getParameter("reiniciar")!=null) {
            request.getSession().invalidate();
        }

        if (res == null) {
            //res = new Restaurant("Bar Tolo", 1);
        } else {
            //res.setEstrelles(res.getEstrelles()+1);
        }


        request.getSession().setAttribute("restaurant", res);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        /*out.println("<h2>Hello "+res.getNom()+" "+
                res.getEstrelles()+" estrelles</h2>");*/
        out.println(request.getSession().getCreationTime());
        out.println("</body>");
        out.println("</html>");



        //request.getRequestDispatcher("holamon.jsp").forward(request, response);
    }


}
