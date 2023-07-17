package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController
public class UserController {
	
	@Autowired
	public UserRepository ur;
	
	
	@GetMapping("/")
	public String user() {
		
		return "index";
	}
	
	@GetMapping("/save")
	public String save(User u) {
		
		ur.save(u);
		return "success";
		
	}
	
	@GetMapping("/delete")
	public String delete(int id) {
		ur.deleteById(id);
		
		return "delete";
		
	}
	
	@GetMapping("/search")
	public ModelAndView search(@RequestParam Integer id) {
		ModelAndView mv=new ModelAndView("success");
		
		User user=ur.findById(id).orElse(new User());
		mv.addObject("User",user);
		return mv;
	}
	@GetMapping("/users")
//	@ResponseBody
	public String GetUsers() {
		
		return ur.findAll().toString();
	
	}
	
	@PostMapping("/users")
	public User saveUser(User u) {
		ur.save(u);
		return u;
		
	}
	@DeleteMapping("/users")
	public String deleteUser(User u) {
		ur.delete(u);
		return "record deleted...!";
		
	}
	
}
