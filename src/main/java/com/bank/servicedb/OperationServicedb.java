package com.bank.servicedb;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.stereotype.Service;
import com.bank.model.Operation;
import com.bank.model.Yunki;
import com.bank.service.IOperationService;
import reactor.core.publisher.Mono;


@Service
public class OperationServicedb implements IOperationService{
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	
	
	@Override
	public Mono<Yunki> send(Operation operation) {
		// TODO Auto-generated method stub
		Mono<Yunki> accountsubmit=null;// aca va la consulta ala entidad account tunki
		Mono<Yunki> accountreceive=null;// aca va la consulta ala entidad account tunki
		
		
				
		//ar.setBalance(ar.getBalance()+operation.getBalance());
		//as.setBalance(ar.getBalance()-operation.getBalance());
		return null;
	}
	
	//Entidad operacion
	//Enviamos el id a travez de kafka
	public void sendMessage(Operation operation) {
		//estamos enviando un string
		kafkaTemplate.send("yunki", operation.getPhonenumbersubmit());
		
	}
	
	@KafkaListener(topics = "enviocuatro")
    public void consumeMessage(Yunki yunki){
        //recibir el objeto
        System.out.println("---------------"+yunki.toString());      
    }
	
	
}
