package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class OrderDTO {
	private String orderID,
					customerID;

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


					
}
