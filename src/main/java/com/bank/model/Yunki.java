package com.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Yunki {
	
	private String id;
	private String phonenumber;
	private String typedocument;
	private String documentnumber;
	private String imei;
	private String email;
	private Double balance;
	private String idaccount;
}
