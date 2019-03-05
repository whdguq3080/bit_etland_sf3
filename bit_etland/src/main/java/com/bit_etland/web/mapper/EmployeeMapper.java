package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.domain.EmployeeDTO;


public interface EmployeeMapper {
	public void insertEmployee(EmployeeDTO emp);
	public List<EmployeeMapper> selectEmployeesList(); 
	public List<EmployeeMapper> selectEmployees(String searchWord);
	public EmployeeMapper selectEmployee(String searchWord);
	public int countEmployees();
	public boolean existsEmployee(EmployeeDTO emp);
	public void updateEmployee(EmployeeMapper emp);
	public void deleteEmployee(EmployeeMapper emp);
}
