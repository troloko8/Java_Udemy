package NaftyDemo.spring_boot_rest_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NaftyDemo.spring_boot_rest_api.model.JobPost;
import NaftyDemo.spring_boot_rest_api.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job) {

        repo.addPost(job);

    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost getJob(int i) {
        JobPost jobpost = repo.getJob(i);

        return jobpost;
    }
}
