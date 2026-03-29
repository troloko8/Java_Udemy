package Nathan.spring_security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Nathan.spring_security.model.Student;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
        new Student(1, "Nathan", "Java"),
        new Student(2, "Alice", "Python"),
        new Student(3, "Bob", "JavaScript")
    ));

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping("student")
    public void addStudent(@RequestBody Student student) {

        students.add(student);
        System.out.println(student);
    }
    
    
}
