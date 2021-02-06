package com.feelfreetocode.assignment.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.feelfreetocode.assignment.models.Account;
import com.feelfreetocode.assignment.services.AccountService;
import com.sun.el.stream.Optional;

@RestController
@RequestMapping("/api/accounts")

public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping()
	public List getAccounts() {
		return this.accountService.getAccounts();
	}
	
	@PostMapping()
	public Account createAccount(@RequestBody @Valid Account account) {
		return this.accountService.createAccount(account);
	}
	
	@DeleteMapping("/{id}")
	public void createAccount(@PathVariable  Long id) {
		this.accountService.deleteAccount(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAccount(@PathVariable  Long id , @RequestBody @Valid Account account) {
		
		Account account2 =  this.accountService.updateAccount(id  , account);
		return new ResponseEntity(account2 , HttpStatus.OK);
	}
}
















