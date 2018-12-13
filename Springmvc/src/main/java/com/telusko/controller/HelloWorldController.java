package com.telusko.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
	
	@Autowired
	private User user;

	//System.out.println(this.getClass().getSimpleName()+" created...");
	
	//Calculate cal = new Calculate() ;
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView printHello() {
		System.out.println("oye");
		ModelAndView mv= new ModelAndView();
		//model.addAttribute("message", "Hello Spring MVC Framework!");
		mv.setViewName("index");
		// int value= cal.calculate();
		// model.addAttribute("value", value);
		return mv;
	}
        

@RequestMapping(value="/hello", method = RequestMethod.GET ,headers="Accept=application/json")
public @ResponseBody User getUser(HttpServletRequest request) {
	System.out.println("In controller");
	String username=request.getParameter("name");
	String lastname=request.getParameter("lastname");
	
	//User user = new User();
	user.setName(username);
	user.setLastname(lastname);
	return user;
	
	
}

	
	

}
