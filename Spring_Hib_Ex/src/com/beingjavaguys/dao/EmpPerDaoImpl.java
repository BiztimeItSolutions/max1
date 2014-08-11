package com.beingjavaguys.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Employee_personel;
import com.beingjavaguys.domain.User;
@Repository("EmpPerDao")
public class EmpPerDaoImpl implements EmpPerDao{
	@Autowired
	private SessionFactory sessionfactory;
	
	
	public void saveUser(Employee_personel emp) {
		// TODO Auto-generated method stub
		
		sessionfactory.getCurrentSession().saveOrUpdate(emp);
		
		
		}
	
	public void updateUser(Employee_personel emp) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  " +emp.getFname());
		sessionfactory.getCurrentSession().update(emp);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	
		
		
		}
	
	public void deleteEmployee(Employee_personel employee) {
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Employee_personel WHERE empid = "+employee.getEmpid()).executeUpdate();
		 }
	
	//edit
			

	public List<Employee_personel> getUser() {
		@SuppressWarnings("unchecked")
		List<Employee_personel> emplist = sessionfactory.getCurrentSession()
				.createCriteria(Employee_personel.class).list();
		return emplist;
	}
	
	public Employee_personel getEmployee(int empid) {
		 return  (Employee_personel) sessionfactory.getCurrentSession().get(Employee_personel.class, empid);
		 }

	
	
	

}
