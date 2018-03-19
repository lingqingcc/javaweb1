package servlet;


import persistent.DBoperator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyFirstServlet",urlPatterns = "/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
    public MyFirstServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter( "names" );
        DBoperator dBoperator = new DBoperator();
        dBoperator.insert(name);
        PrintWriter out=response.getWriter();
        out.println(name);
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

