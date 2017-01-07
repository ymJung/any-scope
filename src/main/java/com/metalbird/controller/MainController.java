/**
 * 
 */
package com.metalbird.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author YoungMin
 *
 */
@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView("/hello");
		mav.addObject("message", "hello ^^");
		mav.addObject("time", new Date());
		return mav;
	}
}
