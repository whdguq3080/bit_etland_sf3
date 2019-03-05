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

	public String getEmployeesID() {
		return employeesID;
	}

	public void setEmployeesID(String employeesID) {
		this.employeesID = employeesID;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}


}
