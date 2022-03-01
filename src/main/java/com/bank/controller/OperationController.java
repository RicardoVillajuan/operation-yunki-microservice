package com.bank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Operation;

import com.bank.servicedb.OperationServicedb;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/operation")
public class OperationController {

	
	
	private final OperationServicedb serviceOperation;
	
	@PostMapping
	public void send(@RequestBody Operation operation){
		
		serviceOperation.sendMessage(operation.getPhonenumbersubmit());
	}
	
	/*@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<AccountYunki> send(@RequestBody Operation operation){
		
		return serviceOperation.send(operation);
	}*/
}
