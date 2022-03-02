package com.bank.servicedb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.bank.model.Operation;
import com.bank.model.Yunki;
import com.bank.service.IOperationService;
import reactor.core.publisher.Mono;


@Service
public class OperationServicedb implements IOperationService{
	
	@Autowired
	KafkaTemplate<String, Operation> kafkaTemplate;
	
	
	
	@Override
	public Mono<Yunki> send(Operation operation) {
		// TODO Auto-generated method stub
		//Yunki yun=consumeMessage();
		//ar.setBalance(ar.getBalance()+operation.getBalance());
		//as.setBalance(ar.getBalance()-operation.getBalance());
		return null;
	}
	
	//producer
	public void sendConsultAccount(Operation operation) {
		//estamos enviando un string
		//le estoy enviando el numero
		kafkaTemplate.send("yunki", operation);
		
	}
	
	//consume
	@KafkaListener(topics = "enviocuatro")
    public void consumeMessage(Yunki yunki){
        //recibir el objeto
        System.out.println("---------------"+yunki.toString()); 
        System.out.println("---------------"+yunki.toString()); 
        System.out.println("---------------"+yunki.toString()); 
        System.out.println("---------------"+yunki.toString()); 
        System.out.println("---------------"+yunki.toString()); 
        System.out.println("---------------"+yunki.toString()); 
        
    }
	
	
}
