package com.bhalchandra.studentregistrationmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.bhalchandra.studentregistrationmvc.model.Student;

@Controller
public class StudentController {
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
		return "result";
				}
	
	@GetMapping("/showStudents")
	public String showStudents(ModelMap m) {
		List<Student> showstud = Arrays.asList(new Student(13,"Bhala","Spring",7),new Student(101,"Priya","CS",6),new Student(102,"Rahul","IT",7));
		m.addAttribute("s",showstud);
		return "student";
	}
	

}
