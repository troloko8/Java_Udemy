package Nafty.MVC.JAVA.Prj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeContraller {

    // @RequestMapping("/", method=RequestMethod.GET)
    // public String requestMethodName(@RequestParam String param) {
    //     return new String();
    // }

    @RequestMapping("/")
    public String home() {
        System.err.println(" -- -- -  - -HEOLLO");
        return "index.jsp";
    }
}
