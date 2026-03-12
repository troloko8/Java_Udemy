package com.telusko.JobApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class JobController {

    @RequestMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    // @RequestMapping({"/", "/home"})
    // public String home() {
    //     return "home";
    // }

    // @RequestMapping({"/", "/home"})
    // public String home() {
    //     return "home";
    // }


}

