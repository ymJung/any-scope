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
@Controller("/storage")
public class StorageController {
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView("storage/view");
		mav.addObject("message", "hello ^^");
		mav.addObject("time", new Date());
		return mav;
	}
}
