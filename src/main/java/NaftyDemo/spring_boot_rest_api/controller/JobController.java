package NaftyDemo.spring_boot_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import NaftyDemo.spring_boot_rest_api.model.JobPost;
import NaftyDemo.spring_boot_rest_api.service.JobService;


// @Controller // by default waiting for res as a view Format
@RestController // by default waiting for res as a JSON format
public class JobController {

    @Autowired
    private JobService service;

    // @RequestMapping({"/", "/home"})
    // public String home() {
    //     return "home";
    // }

    // @RequestMapping("addjob")
    // public String addJob() {
    //     return "addjob";
    // }

    // @PostMapping("handleForm")
    // public String handleForm(JobPost jobPost) {
    //     System.err.println(jobPost);
    //     service.addJob(jobPost);
    //     return "success";
    // }

    @GetMapping("jobPosts")
    // @ResponseBody // show an intention to send JSON data insdead of view response
    public List<JobPost> viewjobs(Model model) {
        List<JobPost> jobs = service.getAllJobs();

        for (JobPost jobPost : jobs) {
            System.err.println(jobPost);
        }

        return jobs;
    }
}

