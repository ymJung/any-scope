/**
 * 
 */
package com.metalbird.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author YoungMin
 *
 */
@Controller
@RequestMapping
public class OpenController {
	@RequestMapping(value="/open/view", method=RequestMethod.GET)
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView("open/view");
		mav.addObject("message", "hello ^^");
		mav.addObject("time", new Date());
		return mav;
	}
}
