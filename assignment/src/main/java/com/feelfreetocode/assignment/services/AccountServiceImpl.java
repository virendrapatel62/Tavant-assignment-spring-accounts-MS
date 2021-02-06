package com.feelfreetocode.assignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feelfreetocode.assignment.models.Account;
import com.feelfreetocode.assignment.repository.AccountRepository;
@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepo;

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return this.accountRepo.save(account);
	}

	

	@Override
	public void deleteAccount(Long accountNumber) {
		// TODO Auto-generated method stub
		this.accountRepo.deleteById(accountNumber);
	}

	@Override
	public Account updateAccount(Long accountNumber , Account account) {
		// TODO Auto-generated method stub
		account.setAccountNumber(accountNumber);
		return this.accountRepo.save(account);
	}



	@Override
	public List getAccounts() {
		return this.accountRepo.findAll();
	}

}
