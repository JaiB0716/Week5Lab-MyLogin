/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.AccountService;

/**
 *
 * @author Owner
 */
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username1 = request.getParameter("username");
        String username2 = request.getParameter("username");
        String password = request.getParameter("password");
        
     if(username == username1 and password == password) {
                request.setAttribute("username1", "abe");
                request.setAttribute("hello", true);
              getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
         return;
            }
        
    }

}
