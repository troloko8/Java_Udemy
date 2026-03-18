package NaftyDemo.spring_boot_rest_api.service;

import java.util.ArrayList;
import java.util.Arrays;
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

        repo.save(job);

    }

    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public JobPost getJob(int i) {
        JobPost jobpost = repo.findById(i).orElse(new JobPost());

        return jobpost;
    }

    public void updatePost(JobPost jobpost) {
        repo.save(jobpost);
    }

    public void deleteJob(int id) {
        repo.deleteById(id);
    }

    public String load() {
        List<JobPost> jobs = new ArrayList<JobPost>(Arrays.asList(
            new JobPost(1, "Java Developer", "Backend development with Spring Boot", 3,
                    Arrays.asList("Java", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "React application development", 2,
                    Arrays.asList("JavaScript", "React", "CSS")),

            new JobPost(3, "Full Stack Developer", "Working with MERN stack", 4,
                    Arrays.asList("MongoDB", "Express", "React", "Node.js")),

            new JobPost(4, "DevOps Engineer", "CI/CD pipeline management", 5,
                    Arrays.asList("Docker", "Kubernetes", "AWS")),

            new JobPost(5, "Data Scientist", "Machine learning and analytics", 3,
                    Arrays.asList("Python", "TensorFlow", "Pandas")),

            new JobPost(6, "Mobile Developer", "Android app development", 2,
                    Arrays.asList("Kotlin", "Android", "Firebase")),

            new JobPost(7, "QA Engineer", "Manual and automated testing", 2,
                    Arrays.asList("Selenium", "JUnit", "TestNG")),

            new JobPost(8, "Backend Engineer", "Microservices architecture", 4,
                    Arrays.asList("Java", "Spring", "Kafka")),

            new JobPost(9, "Cloud Engineer", "Cloud infrastructure management", 5,
                    Arrays.asList("AWS", "Terraform", "Linux")),

            new JobPost(10, "AI Engineer", "Building AI systems", 3,
                    Arrays.asList("Python", "PyTorch", "NLP"))
        ));

        repo.saveAll(jobs);

        return "Succes";
    }

	public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
	}
}
