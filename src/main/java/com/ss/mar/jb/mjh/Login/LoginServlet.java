package com.ss.mar.jb.mjh.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MarvinLogin", value = "/MarvinLogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");

    RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginstatus.html");
    requestDispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        String wantedUsername = "marv";
        String wantedPassword = "123";

        boolean successfulLogin = (userName.equals(wantedUsername) && password.equals(wantedPassword));

        response.sendRedirect("login?success=" + successfulLogin);


    }
}
