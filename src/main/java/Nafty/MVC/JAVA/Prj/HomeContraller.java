package Nafty.MVC.JAVA.Prj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeContraller {
    @RequestMapping("/")
    public String home() {
        System.err.println(" -- -- -  - -HEOLLO");
        return "index.jsp";
    }

    @RequestMapping("add")
    // public String add(HttpServletRequest req, HttpSession session) {
    // public String add(int num1, int num2, HttpSession session) {// destructorization
    public String add( 
        @RequestParam("num1") int a, 
        @RequestParam("num2") int b, 
        // HttpSession session
        Model model
    ) {

        // int num1 = Integer.parseInt(req.getParameter("num1"));
        // int num2 = Integer.parseInt(req.getParameter("num2"));
        // int result = num1 + num2;
        int result = a + b;

        // session.setAttribute("result", result);
        model.addAttribute("result", result);

        System.err.println("res :" + result);
        return "result.jsp";
    }
}
