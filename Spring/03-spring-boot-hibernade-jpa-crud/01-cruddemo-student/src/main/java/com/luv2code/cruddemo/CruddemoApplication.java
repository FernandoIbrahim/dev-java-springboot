package com.luv2code.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import java.util.List;
@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return (runner) -> {
			//createStudent( studentDAO);

			//createMultStudent( studentDAO);

			//findStudentById( studentDAO);

			//findAll( studentDAO);

			//String lastName = "Ibrahim";
			//findByLastName( lastName,  studentDAO)

			//Sting name = "Ibrahim";
			//findAndEdit( name,  studentDAO)
			
			//int id = 1;
			// removeStudent(1, studentDAO)

			String LastName = "Ferreira";
			removeByLastName(LastName,studentDAO);
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


		findByLastName("Ibrahim", studentDAO);
	}

	private void findStudentById(StudentDAO studentDAO){
		Student student = studentDAO.findById(1);
		System.out.println(student.toString());
	}


	private void findAll(StudentDAO studentDAO){
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			System.out.println(student.toString()+"\n\n");
		}
	}

	private void findByLastName(String lastName, StudentDAO studentDAO){
		List<Student> students = studentDAO.findByLastName(lastName);

		System.out.println("Estudentes com o sobrenome " + lastName + ":");
		for(Student student: students){
			System.out.println(student.toString()+"\n");
		}

	}


	private void findAndEdit(String name, StudentDAO studentDAO){
		Student student = studentDAO.findById(1);
		student.setFirstName(name);
		studentDAO.update(student);
		System.out.println("Estudante alterado com sucesso:"+ student.toString());
	}
	private void removeByLastName(String lastName, StudentDAO studentDAO){	
		studentDAO.deleteByLastName(lastName);
		System.out.println("Deleting Students with: "+ lastName);
	}

	private void removeStudent(int id, StudentDAO studentDAO){
		studentDAO.delete(id);
		System.out.println("Deleting Student ID: "+ id);
	}

}
