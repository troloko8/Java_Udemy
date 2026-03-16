package springBootJPA.JPA_JDBS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springBootJPA.JPA_JDBS.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {}
