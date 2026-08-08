package com.bhalchandra.studentregistrationmvc.controller;
//Made for SPRING REST 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bhalchandra.studentregistrationmvc.model.Student;
import com.bhalchandra.studentregistrationmvc.repo.StudentRepo;

@RestController
public class SController {
	@Autowired
	public StudentRepo repo;
	
	@GetMapping(path="/student",produces={"application/json"})
	public List<Student> showStudents() {
		List<Student> list= repo.findAll();
		System.out.println("fetching..");
		return list;
	}
	@GetMapping("/student/{sid}")
	public Student getOne(@PathVariable("sid") int sid) {
		Student student = repo.findById(sid).orElse(new Student(0,null, null,0));
		return student;
	}
	
	@PostMapping("/student")
	public Student addStudent(Student student) {
		
	repo.save(student);
		return student;
	}
	
}
