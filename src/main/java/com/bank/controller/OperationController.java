package com.bank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Operation;
import com.bank.model.Yunki;
import com.bank.servicedb.OperationServicedb;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;


@RestController
@RequiredArgsConstructor
@RequestMapping("/operation")
public class OperationController {

	
	
	private final OperationServicedb serviceOperation;
	
	@PostMapping
	public void send(@RequestBody Operation operation){
		
		serviceOperation.sendConsultAccount(operation);
	}
	
	/*@PostMapping
	public void send(@RequestBody Operation operation){
		
		serviceOperation.sendConsultAccount(operation);
	}*/
}
