package com.bhalchandra.studentregistrationmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhalchandra.studentregistrationmvc.model.Student;
import com.bhalchandra.studentregistrationmvc.repo.StudentRepo;

@Controller
public class StudentController {
	final StudentRepo repo;


	StudentController(StudentRepo repo) {
		this.repo = repo;
	}
	
	
	@ModelAttribute
	public void commanData(ModelMap m) {
		m.addAttribute("college","TSEC");
	}
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@PostMapping("addStudent")
	public String addStudent(@ModelAttribute Student s) {	
		repo.save(s);
		return "result";
	}
	
	@GetMapping("/showStudents")
	public String showStudents(ModelMap m) {
		List<Student> list= repo.findAll();
		m.addAttribute("s",list);
		return "student";
	}
	
	@GetMapping("/getStudent")
	public String getStudent(@RequestParam("sid")int id,ModelMap m) {
		Student student = repo.findById(id).orElse(null);
		m.addAttribute("student", student);
		return "result";
	}
	
	@PostMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("sid") int id) {

	    if (repo.existsById(id)) {
	        repo.deleteById(id);
	    }

	    return "redirect:/showStudents";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student student, ModelMap m) {

	    if (repo.existsById(student.getSid())) {
	        repo.save(student);
	        m.addAttribute("msg", "Student updated successfully.");
	    } else {

	        m.addAttribute("msg", "Student ID not found.");
	    }

	    m.addAttribute("students", repo.findAll());

	    return "student";
	}

}
