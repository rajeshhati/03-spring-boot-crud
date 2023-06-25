package com.cruddemo.demo.cruddemo;

import com.cruddemo.demo.cruddemo.DAO.studentDAO;
import com.cruddemo.demo.cruddemo.entity.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	public CommandLineRunner commandLineRunner(studentDAO studentDAO){
		return runner -> {createStudent(studentDAO);};
	}
	private void createStudent(studentDAO studentDAO){
		//create the student object
		student theempStudentt = new student(01,"rajesh", "hati", "rajesh@gmail.com");

		//save the student object

		studentDAO.save(theempStudentt);

		//display id of the saved student object
		System.out.println(theempStudentt.getId());

	}

}
