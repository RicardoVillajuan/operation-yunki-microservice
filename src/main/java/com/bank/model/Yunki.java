package com.bank.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Yunki implements Serializable{
	
	private String id;
	private String phonenumber;
	private String typedocument;
	private String documentnumber;
	private String imei;
	private String email;
	private Double balance;
	private String idaccount;
	
	private static final long serialVersionUID=1L;
}
