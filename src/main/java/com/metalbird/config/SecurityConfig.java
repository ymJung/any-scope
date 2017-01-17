/**
 * 
 */
package com.metalbird.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Configuration for Security.
 * @author YoungMin
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(WebSecurity web) throws Exception	{
		web.ignoring().antMatchers("/css/**", "/script/**", "/error", "/", "/board/**");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')	")
		.antMatchers("/storage/**").access("hasRole('ROLE_ADMIN')");
		
		http.formLogin().loginProcessingUrl("/user/login").failureForwardUrl("/user/fail");
		http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/user/logout")).logoutSuccessUrl("/");
		
	}
}
