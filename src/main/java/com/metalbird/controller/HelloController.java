/**
 * 
 */
package com.metalbird.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Welcome controller
 * @author YoungMin
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("message", "hello ^^");
		mav.addObject("time", new Date());
		return mav;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView globalExceptionHandler(Exception e) {
	    ModelAndView modelAndView = new ModelAndView("error");
	    modelAndView.addObject("message", e.getMessage());
	    return modelAndView;
	}

}
