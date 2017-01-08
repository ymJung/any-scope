/**
 * 
 */
package com.metalbird.controller;

import java.util.Date;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.metalbird.controller.model.LoginAccountDto;

/**
 * @author YoungMin
 *
 */
@Controller
public class StorageController {
	@RequestMapping(value="/storage/view", method=RequestMethod.GET)
	public ModelAndView view(@AuthenticationPrincipal LoginAccountDto userDetails) {
		ModelAndView mav = new ModelAndView("storage/view");
		mav.addObject("message", "hello ^^" + userDetails.getUsername());
		mav.addObject("time", new Date());
		return mav;
	}
}
