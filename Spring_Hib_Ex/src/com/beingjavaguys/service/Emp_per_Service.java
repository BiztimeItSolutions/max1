package com.beingjavaguys.service;

import java.util.List;

import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Employee_personel;



public interface Emp_per_Service {
	
	public void addUser(Employee_personel emp);
	public List<Employee_personel> getUser();
	public void deleteEmployee(Employee_personel employee);
	public Employee_personel getEmployee(int empid);
	
	public void updateUser(Employee_personel emp);

}
