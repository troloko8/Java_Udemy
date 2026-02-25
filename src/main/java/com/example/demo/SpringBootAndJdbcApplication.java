package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;

@SpringBootApplication
public class SpringBootAndJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAndJdbcApplication.class, args);

		Student st = context.getBean(Student.class);

		st.setRollNum(101);
		st.setMark(99);
		st.setName("Nafty");
	}

}
