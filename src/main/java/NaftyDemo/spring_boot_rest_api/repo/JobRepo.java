package NaftyDemo.spring_boot_rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NaftyDemo.spring_boot_rest_api.model.JobPost;
import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String keyword2);
    
}
