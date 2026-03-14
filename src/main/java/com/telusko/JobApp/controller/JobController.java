package com.telusko.JobApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("viewalljobs")
    public String viewjobs(Model model) {
        List<JobPost> jobs = service.getAllJobs();

        for (JobPost jobPost : jobs) {
            System.err.println(jobPost);
        }

        model.addAttribute("jobPosts", jobs);

        return "viewalljobs";
    }
}

