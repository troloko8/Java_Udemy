package NaftyDemo.spring_boot_rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NaftyDemo.spring_boot_rest_api.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    
}
