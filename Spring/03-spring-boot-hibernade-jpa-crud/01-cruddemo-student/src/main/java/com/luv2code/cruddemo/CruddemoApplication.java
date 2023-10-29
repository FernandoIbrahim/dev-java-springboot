package com.luv2code.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return (runner) -> {
			createMultStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){
		//create theStudent
		System.out.println("Creating new Student obejct");
		Student tempStudent = new Student("Fernando", "Ibrahim", "offut14@gmail.com");

		//save theStudent
		System.out.println("Saving the Student");
		studentDAO.save(tempStudent);

		//display the Id of the saved Student
		System.out.println("Saved Student generating id:" + tempStudent.getId());

	}


	private void createMultStudent(StudentDAO studentDAO){
		Student tempStudent1 = new Student("James", "Porquinho", "james@gmail.com");
		Student tempStudent2 = new Student("Renato", "Cazolete", "renato@gmail.com");
		Student tempStudent3 = new Student("Antonio", "Ferreira", "toni@gmail.com");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}


}
