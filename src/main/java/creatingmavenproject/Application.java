package creatingmavenproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import creatingmavenproject.model.Student;

@SpringBootApplication
public class Application {
	
	public static List<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
		Student firstStudent = new Student(1, "Abel");
		Student secondStudent = new Student(2, "Bella");
		
		students.add(firstStudent);
		students.add(secondStudent);

	}

}
