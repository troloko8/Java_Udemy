package web_spring_boot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloSarvlet extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.err.println("HttpServletRequest");

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<h1><b>Hello world</b></h1>");
    }
    
}