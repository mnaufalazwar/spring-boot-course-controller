package creatingmavenproject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import creatingmavenproject.Application;
import creatingmavenproject.model.Student;

@RestController
public class MyController {

	@RequestMapping("/")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public List<Student> getAllStudents() {
		return Application.students;
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST, produces="application/json")
	public String addStudent(
			@RequestParam(value="studentNumber") int studentNumber,
			@RequestParam(value= "name") String name) {
		
		Student student = new Student(studentNumber, name);
		Application.students.add(student);
		return "{\"response\":\"success adding a student data\"}";
	}
	
	@RequestMapping(value="/editFirstStudent", method=RequestMethod.PUT, produces="application/json")
	public List<Student> editFirstStudent(
			@RequestBody Student student) {
		
		Application.students.set(0, student);
		return Application.students;
	}
	
	@RequestMapping(value="/deleteStudent/{index}", method=RequestMethod.DELETE, produces="application/json")
	public List<Student> deleteStudent(
			@PathVariable int index){
		
		Application.students.remove(index);
		return Application.students;
	}
}

