package com.feelfreetocode.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feelfreetocode.assignment.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
