package NaftyDemo.spring_boot_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import NaftyDemo.spring_boot_rest_api.model.JobPost;
import NaftyDemo.spring_boot_rest_api.service.JobService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;




// @Controller // by default waiting for res as a view Format
@RestController // by default waiting for res as a JSON format
// CORS settings
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
    // @ResponseBody // show an intention to send JSON data insdead of view response
    public List<JobPost> viewjobs(Model model) {
        List<JobPost> jobs = service.getAllJobs();

        return jobs;
    }

    @GetMapping("jobPost/{postID}")
    public JobPost getMethodName(
        // @PathVariable // In order to indetify that this is the var from the path params
        @PathVariable("postID")
        int id
    ) {
        return service.getJob(id);
    }

    @PostMapping("jobPost")
    public JobPost addJob(
        @RequestBody  //  In order to indetify that this is the body of req
        JobPost jobpost
    ) {
        service.addJob(jobpost);

        return jobpost;
    }

    @PutMapping("jobPost")
    public JobPost updateJob(
        @RequestBody  //  In order to indetify that this is the body of req
        JobPost jobpost
    ) {
        service.updatePost(jobpost);

        return service.getJob(jobpost.getPostId());
    }

    @DeleteMapping("jobPost/{id}")
    public String deleteJob(
        @PathVariable int id
    ) {
        service.deleteJob(id);

        return "Deleted";
    }
}

