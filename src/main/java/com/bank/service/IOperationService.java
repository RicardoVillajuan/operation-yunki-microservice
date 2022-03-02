package com.bank.service;

import com.bank.model.Operation;
import com.bank.model.Yunki;

import reactor.core.publisher.Mono;

public interface IOperationService {
	Mono<Yunki> send (Operation operation);
}
