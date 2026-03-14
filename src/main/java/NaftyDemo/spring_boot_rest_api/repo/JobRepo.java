package NaftyDemo.spring_boot_rest_api.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import NaftyDemo.spring_boot_rest_api.model.JobPost;

@Repository
public class JobRepo {
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

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addPost(JobPost job) {
        jobs.add(job);
        System.err.println(jobs);
    }
}
