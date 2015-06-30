package com.springwebbasic.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springwebbasic.spring.model.Result;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/controller", method = RequestMethod.GET)
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		System.out.println("HOME PAGE");
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/compute", method = {RequestMethod.POST, RequestMethod.GET})
	public String computeData(Model model, @ModelAttribute ("result") Result result) {		
		logger.info("computeData Called");
		
		//this is wrong but for sample purposes
		int sum = result.getValue1() +  result.getValue2();
		
		logger.info("sum is", sum);
		System.out.println("sum is" +  sum);
		model.addAttribute("sum", sum);
		
		return "compute";
	}
	
	
	@RequestMapping(value = "/redirect", method = {RequestMethod.POST, RequestMethod.GET})
	public String redirect(Model model, @ModelAttribute ("result") Result result) {		
		
		//this is wrong but for sample purposes
				int sum = result.getValue1() +  result.getValue2();
				
				logger.info("sum is", sum);
				System.out.println("sum is" +  sum);
				model.addAttribute("sum", sum);
		return "redirect:compute";
	}
	
	@RequestMapping(value = "/forward", method = {RequestMethod.POST, RequestMethod.GET})
	public String forward(Model model, @ModelAttribute ("result") Result result) {		
		//this is wrong but for sample purposes
				int sum = result.getValue1() +  result.getValue2();
				
				logger.info("sum is", sum);
				System.out.println("sum is" +  sum);
				model.addAttribute("sum", sum);
		return "forward:compute";
	}
	
}
