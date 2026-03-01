package web_spring_boot;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloSarvlet extends HttpServlet {


    public void service (HttpServletRequest req, HttpServletResponse res) {
        System.err.println("HttpServletRequest");
    }
    
}