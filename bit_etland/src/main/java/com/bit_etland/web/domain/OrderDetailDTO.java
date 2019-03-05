package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class OrderDetailDTO {
	private String orderdetailID,
				 	orderID,
				 	productsID,
				 	quantity;

	public String getOrderdetailID() {
		return orderdetailID;
	}

	public void setOrderdetailID(String orderdetailID) {
		this.orderdetailID = orderdetailID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getProductsID() {
		return productsID;
	}

	public void setProductsID(String productsID) {
		this.productsID = productsID;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


}
