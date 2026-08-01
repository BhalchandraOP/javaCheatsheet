package com.bhalchandra.springmvcboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import java.net.http.HttpRequest;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhalchandra.springmvcboot.dao.AlienDao;
import com.bhalchandra.springmvcboot.model.Alien;

import ch.qos.logback.core.model.Model;


@Controller
public class AlienController {
	@Autowired
	private AlienDao dao;

	@ModelAttribute
	
	public void modelData(ModelMap m) {
		m.addAttribute("name", "Aliens");
	}
	@RequestMapping("/")
	public String home(){
//		System.out.println("Welcome in Home Controller");
		return "index";
	}
	@PostMapping("/add")
	public String add(@RequestParam("number1") int i,@RequestParam("number2") int j,ModelMap m) {
//		int i = Integer.parseInt(req.getParameter());
//		int j = Integer.parseInt(req.getParameter("number2"));
		
		int number3 = i+j;
		
		m.addAttribute("number3", number3);
		return "result";
	}
		
		@PostMapping("/addAlien")
	public String addAlien(@ModelAttribute("a") Alien a) {
			dao.saveAlien(a);
		//saveAlien requires alien obj as parameter ,
			//which user input will be taken as
		return "result";
	}
		
		@GetMapping("/getAliens")
	public String getAliens(ModelMap m) {
	
			m.addAttribute("a",dao.getAliens());
		return "showAliens";
	}
		@PostMapping("/getAlien")
		public String getalien(@RequestParam("aid") int id,ModelMap m) {
			Alien alien =dao.getAlien(id);
			m.addAttribute("a", alien);
			return "result";
		}
		
		@PostMapping("/updateAlien")
		public String updateAlien(@RequestParam("aid") int id,@RequestParam("aname") String name, ModelMap m) {
			Alien alien =dao.updateAlien(id, name);
			m.addAttribute("a", alien);
			return "result";
		}
		
		@PostMapping("/deleteAlien")
		public String deleteAlien(@RequestParam("aid") int id, ModelMap m) {
			dao.deleteAlien(id);
			
			 m.addAttribute("message",
			            "Alien with ID " + id + " deleted successfully.");

			 return "redirect:/getAliens";
			
		}

}
