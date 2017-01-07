/**
 * 
 */
package com.metalbird.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.metalbird.controller.model.LoginAccountDto;
import com.metalbird.dao.UserAccountRepository;
import com.metalbird.dao.model.UserAccount;

/**
 * @author YoungMin
 *
 */
@Service
public class UserAccountService implements UserDetailsService {
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	private UserAccount getAccount(String accountId) {
		return userAccountRepository.findOneByAccountId(accountId);
	}

	public UserDetails loadUserByUsername(String acccountId) throws UsernameNotFoundException {
		UserAccount userAccount = getAccount(acccountId);
		if (userAccount == null) {
			throw new UsernameNotFoundException("not found user account id.");
		}
		return new LoginAccountDto(userAccount);
	}
}
