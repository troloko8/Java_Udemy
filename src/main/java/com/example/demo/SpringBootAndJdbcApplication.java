package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

@SpringBootApplication
public class SpringBootAndJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAndJdbcApplication.class, args);

		Student st = context.getBean(Student.class);

		st.setRollNum(104);
		st.setMark(99);
		st.setName("Nafty");

		StudentService service = (context.getBean(StudentService.class));

		// service.addStudent(st);

		List<Student> students = service.getStudents();

		System.err.println(students);

	}

}
