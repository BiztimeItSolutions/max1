package com.beingjavaguys.dao;

import java.util.List;

import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Employee_personel;



public interface EmpPerDao {
	public void saveUser ( Employee_personel emp );
	public void  updateUser ( Employee_personel emp );
	public List<Employee_personel> getUser();
	
	public void deleteEmployee(Employee_personel employee);
}
