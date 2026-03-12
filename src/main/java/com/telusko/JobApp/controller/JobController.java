package com.telusko.JobApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;


@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        System.err.println(jobPost);
        service.addJob(jobPost);
        return "success";
    }

    // @RequestMapping({"/", "/home"})
    // public String home() {
    //     return "home";
    // }


}

