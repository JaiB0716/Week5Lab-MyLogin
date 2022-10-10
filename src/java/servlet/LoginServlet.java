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

/**
 *
 * @author Owner
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      /*HttpSession session = request.getSession();
        
         String logOut = request.getParameter("logOut");
         
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request,response);*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
      if(username == null || username.equals("") || password == null || password.equals("")) {
          request.setAttribute("username", username);
          request.setAttribute("password", password);
          request.setAttribute("missing", true);
          
                   getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request,response);
         return;
      }
      
      getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    }
}
