/**
 * 
 */
package com.metalbird.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Configuration for Security.
 * 
 * @author YoungMin
 *
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired 
//	private UserService userService;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http
              .csrf().disable()
              .authorizeRequests()
                   .antMatchers("/user/login").permitAll()
                   .antMatchers("/user").hasAuthority("USER")
                   .antMatchers("/admin").hasAuthority("ADMIN")
                   .anyRequest().authenticated()
                   .and().logout()
              ;             
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.getDefaultUserDetailsService();
    }
    
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
         return super.authenticationManagerBean();
    }
}
