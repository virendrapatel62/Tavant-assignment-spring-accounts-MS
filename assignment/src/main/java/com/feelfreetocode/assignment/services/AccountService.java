package com.feelfreetocode.assignment.services;

import java.util.List;

import com.feelfreetocode.assignment.models.Account;
import com.sun.el.stream.Optional;

public interface AccountService {
	Account createAccount(Account  account);
	List getAccounts(); 
	void deleteAccount(Long accountNumber);
	Account updateAccount(Long accountNumber , Account account);
}
