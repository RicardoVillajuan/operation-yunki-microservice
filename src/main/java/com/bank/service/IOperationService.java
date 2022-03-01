package com.bank.service;

import com.bank.model.Operation;
import com.bank.model.AccountYunki;

import reactor.core.publisher.Mono;

public interface IOperationService {
	Mono<AccountYunki> send (Operation operation);
}
