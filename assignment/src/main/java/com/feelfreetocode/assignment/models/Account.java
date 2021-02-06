package com.feelfreetocode.assignment.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
@Entity(name = "Account")
public class Account {
	@Id
	@NotNull
	private long accountNumber;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	
	@NotBlank()
	@Length(max = 20 , min = 5)
	private String accountHolderName;
	
	
	private Double balance = 0.0;
	
	
	@NotBlank
	private String branch;
	
	@NotBlank
	private String address;
}
