package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.entities.Entry;
import com.springboot.entities.User;
import com.springboot.services.EntryService;
import com.springboot.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	 @Autowired
	 private UserService userService;
	 @Autowired
	 private EntryService entryService;
	 
	 @Autowired
	 HttpSession session;
	
	
	@RequestMapping("home")
	public String loginpage()
	{
		String ViewName="home";
		return ViewName;	
	}
	@RequestMapping("register")
	public String registrationpage()
	{
		
		String viewName="register";
		
		return viewName;	
	}
	@PostMapping("saveuser")
	public String saveuser(@ModelAttribute("user") User user)
	{
		
		
		userService.saveUser(user);
		String viewName="registrationsuccessful";
		return viewName;
	}
	
	@PostMapping("authenticate")
	public String authenticateuser(@ModelAttribute("user")  User user ,Model model)
	{
		String viewName ="index";
		User user1 = userService.findbyusername(user.getUsername());
		if(user1!=null && user.getPassword().equals(user1.getPassword()))
		{
			viewName="userhomepage";
			model.addAttribute("user",user1);
			
			session.setAttribute("currentuser", user1);
			
			List<Entry> entries=null;
			try {
			entries = entryService.findbyuserid(user1.getId());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("entrieslist", entries);
		}
		
		return viewName;
		
	}
	
	@RequestMapping("addentry")
	public String addentry()
	{
		
		String viewName= "addentry";
		
		
		return viewName;
	}
	@PostMapping("saveentry")
	public String saveentry(@ModelAttribute("entry")  Entry entry , Model model)
	{
		
		String viewName="userhomepage";
		
		entryService.saveUser(entry);
		
		User user1= (User) session.getAttribute("currentuser"); 
		
		List<Entry> entries=null;
		try {
		entries = entryService.findbyuserid(user1.getId());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entrieslist", entries);
		
		
		
		return viewName;
	}
	
	@RequestMapping("display")
	public String viewentry(@RequestParam("id")  int id,Model model)
	{
		
		String viewName="display";
		
		Entry entry = entryService.findbyid(id); 
		model.addAttribute("entry",entry);
		
		return viewName;
	}
	@RequestMapping("userhomepage")
	public String userloginpage(Model model)
	{
		String viewName="userhomepage";
		User user1 = (User)session.getAttribute("currentuser");
		
		List<Entry> entries=null;
		try {
		entries = entryService.findbyuserid(user1.getId());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entrieslist", entries);
		return viewName;	
	}
	@RequestMapping("updateentry")
	public String updateentry(@RequestParam("id")  int id,Model model)
	{
		
		String viewName="updateentry";
		
		Entry entry = entryService.findbyid(id); 
		model.addAttribute("entry",entry);
		
		User user1 = (User)session.getAttribute("currentuser");
		if (user1 == null) {
			viewName="index";
		}
		
		return viewName;
	}
	@RequestMapping("processentryupdate")
	public String processentry(@ModelAttribute("entry")  Entry entry,Model model)
	{
		
		String viewName="userhomepage";
		
		entryService.updateUser (entry);
		
		User user1= (User) session.getAttribute("currentuser"); 
		
		List<Entry> entries=null;
		try {
		entries = entryService.findbyuserid(user1.getId());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entrieslist", entries);
		
		
		
		return viewName;
	}
	@RequestMapping("deleteentry")
	public String deleteentry(@RequestParam("id")  int id,Model model)
	{
		
		String viewName="userhomepage";
		
		Entry entry = entryService.findbyid(id); 
		entryService.deleteUser(entry);
		
		User user1= (User) session.getAttribute("currentuser"); 
		if (user1 == null) {
			viewName="index";
		}
		
		List<Entry> entries=null;
		try {
		entries = entryService.findbyuserid(user1.getId());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entrieslist", entries);
		
		return viewName;
	}
	@RequestMapping("signout")
	public String signout()
	{
		
		String viewName="index";
		session.invalidate();
		
		
		return viewName;
	}

}
