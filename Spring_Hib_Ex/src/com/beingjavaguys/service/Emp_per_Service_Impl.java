package com.beingjavaguys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.beingjavaguys.dao.EmpPerDaoImpl;
import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Employee_personel;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class Emp_per_Service_Impl implements Emp_per_Service {

	
	@Autowired
	EmpPerDaoImpl empDao;
	
	public void addUser(Employee_personel emp) {
		// TODO Auto-generated method stub
		System.out.println("in service add User:"+emp.getFname());
		empDao.saveUser(emp);
		
	}

	public List<Employee_personel> getUser() {
		// TODO Auto-generated method stub
		return empDao.getUser();
	}
	
	public void deleteEmployee(Employee_personel employee) {
		empDao.deleteEmployee(employee);
		 }
	
	public Employee_personel getEmployee(int empid) {
		 return empDao.getEmployee(empid);
		 }

	public void updateUser(Employee_personel emp) {
		// TODO Auto-generated method stub
		empDao.updateUser(emp);
	}
	
	
	
	

}
