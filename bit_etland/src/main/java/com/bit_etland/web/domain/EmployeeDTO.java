package com.bit_etland.web.domain;

import lombok.Data;

@Data
public class EmployeeDTO {
	private String employeesID,
					manager,
					name,
					birthDate,
					photo,
					notes;

}
