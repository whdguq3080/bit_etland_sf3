package com.bit_etland.web.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.Data;

@Data @Component @SessionAttributes
public class CustomerDTO {
	private String 	rnum,
					customerID,
					customerName,
					password,
					ssn, //900101-1
					photo,
					phone,
					city,
					address,
					postalCode;

	
					


	
}
