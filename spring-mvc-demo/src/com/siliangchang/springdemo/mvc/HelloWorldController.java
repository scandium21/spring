package com.siliangchang.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// add a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersion2")
	public String letsShout(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion3")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey from v3 " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
