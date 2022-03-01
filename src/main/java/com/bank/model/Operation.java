package com.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class Operation {
	
	private String phonenumbersubmit;
	private String phonenumberreceive;
	private Double balance;
}
