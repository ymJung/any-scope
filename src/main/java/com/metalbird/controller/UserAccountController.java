/**
 * @author YoungMin
 *
 */
package com.metalbird.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.metalbird.service.UserService;

@RestController
@RequestMapping("/user")
public class UserAccountController {
	
	@RequestMapping("/logout")
	public String logout() {
		return "byebye";
	}
}
