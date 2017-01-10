/**
 * @author YoungMin
 *
 */
package com.metalbird.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserAccountController {
	
	@RequestMapping("/user/fail")
	public ModelAndView fail() {
		ModelAndView mav = new ModelAndView("user/fail");
		return mav;
	}
	@RequestMapping("/user/logout")
	public String logout() {
		return "byebye";
	}
}
