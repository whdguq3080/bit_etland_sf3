package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class SupplierDTO {
	private String supplierID,
					supplierNAME,
					address,
					city,
					postalcode,
					phone;

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierNAME() {
		return supplierNAME;
	}

	public void setSupplierNAME(String supplierNAME) {
		this.supplierNAME = supplierNAME;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
					
}
