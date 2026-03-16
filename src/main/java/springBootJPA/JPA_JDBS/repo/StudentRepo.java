package springBootJPA.JPA_JDBS.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import springBootJPA.JPA_JDBS.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    // for specifying specific req for specific column name etc
    // @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name);

    List<Student> findByMarks(int marks);
    List<Student> findByMarksGreaterThan(int marks);
}
