package com.demo.form.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.form.models.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
  // get the login (index page)
	//@RequestMapping("/")
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
//post data after login 
	@PostMapping("/login")
	public String handleLogin(@RequestParam("userName") String userName,
			                   @RequestParam("password")String password,
			                   HttpSession session,
			                   RedirectAttributes redirectAttributes ) {
		// let's see the request params 
		System.out.println("UserName : "+ userName+"; password : "+password);
		ArrayList<User> verifiedUsers=new ArrayList<>();
		// create two users
		User user1 = new User("David","12345678");
		User user2 = new User("tnMan","12345678");
		
		// we wil ladd them to the array List (Simulation of db)
		verifiedUsers.add(user1);
		verifiedUsers.add(user2);
		// we will see if the provided credentials exists in the arrayList of verified users 
		for(User user:verifiedUsers) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				session.setAttribute("userName", userName);
				session.setAttribute("password", password);
				return "redirect:/home";
			}
		}
		
		//if i want to clear or remove everything from session : =>> session.invalidate();
		
		redirectAttributes.addFlashAttribute("error", "wrong Credentials !!");
		return "redirect:/";
		
	}
	
// get the home page
	@GetMapping("/home")
	public String homePage() {
		return "home.jsp";
	}
	
}
