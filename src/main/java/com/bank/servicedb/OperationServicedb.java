package com.bank.servicedb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.bank.model.Operation;
import com.bank.model.AccountYunki;
import com.bank.service.IOperationService;
import reactor.core.publisher.Mono;


@Service
public class OperationServicedb implements IOperationService{
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	
	
	@Override
	public Mono<AccountYunki> send(Operation operation) {
		// TODO Auto-generated method stub
		Mono<AccountYunki> accountsubmit=null;// aca va la consulta ala entidad account tunki
		Mono<AccountYunki> accountreceive=null;// aca va la consulta ala entidad account tunki
		
		return accountsubmit.doOnNext(as->{
			if(as.getBalance() < operation.getBalance())
				throw new RuntimeException("Usted no cuenta con el saldo disponible para el envio");
		}).flatMap(as->{
			return accountreceive.flatMap(ar->{
				
				ar.setBalance(ar.getBalance()+operation.getBalance());
				as.setBalance(ar.getBalance()-operation.getBalance());
				//repoweb.updateAccount(as.getId(), as).subscribe();
				
				//productorKafka.send(ar);
				
				
				return null;
			});
		});
	}
	
	public void sendMessage(String operation) {
		kafkaTemplate.send("yunki", operation);
		
	}
	
	@KafkaListener(topics = "yunkisubmit")
    public void consumeMessage(String ddd){
        System.out.println("consumidor operation :"+ddd);
        
        sendMessage("PAso por operation");
    }
	
}
