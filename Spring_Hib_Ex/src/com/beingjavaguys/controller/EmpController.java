package com.beingjavaguys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Employee_personel;


import com.beingjavaguys.service.Emp_per_Service;



@Controller
public class EmpController {
	
	@Autowired
	private Emp_per_Service empService;
	
	@RequestMapping("/addemp")
	public ModelAndView getRegisterForm(@ModelAttribute("emp") Employee_personel emp,
			BindingResult result) {
		
		return new ModelAndView("Add_Emp_Personel");
	}

	
	@RequestMapping("/saveEmp")
	public ModelAndView saveUserData(@ModelAttribute("emp") Employee_personel emp,
			BindingResult result) {
		System.out.println("fromsave "+emp.getFname());
		empService.addUser(emp);
		System.out.println("Save User Data");
		 Map<String,Object> model = new HashMap<String, Object>();
		 
		 model.put("emps", empService.getUser());
		return new ModelAndView("EmpDetails", model);
	}

	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@ModelAttribute("command") Employee emp,
			BindingResult result) {
		System.out.println("Delete User Data"+emp.getEmpid());
		empService.deleteEmployee(prepareModel(emp));
		System.out.println("Delete User Data");
			 Map<String,Object> model = new HashMap<String, Object>();
			// model.put("employee", null);
			 model.put("emps", empService.getUser());
			 return new ModelAndView("EmpDetails", model);
			 }
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	 public ModelAndView editEmployee(@ModelAttribute("emp") Employee employeeBean,
	 BindingResult result) {
	 Map<String, Object> model = new HashMap<String, Object>();
	 System.out.println("emp id in method "+employeeBean.getEmpid());
	 
	 System.out.println("emp fname in method :"+employeeBean.getFname());
	 Employee_personel e1=new Employee_personel();
	 e1=empService.getEmployee(employeeBean.getEmpid());
	 System.out.println(e1.getEmpid());
	 System.out.println(e1.getFname());
	 ArrayList<Employee_personel> al=new ArrayList<Employee_personel>();
	 al.add(e1);
	 
	 
//	 model.put("emps", prepareEmployeeBean(empService.getEmployee(employeeBean.getEmpid())));
//	 model.put("emps", prepareEmployeeBean(empService.getEmployee(employeeBean.getEmpid())));
	 model.put("emp",e1);
	 
	 return new ModelAndView("Add_Emp_Personel1", model);
	 }
	
	@RequestMapping(value = "/updateEmp", method = RequestMethod.GET)
	 public ModelAndView UpdateEmployee(@ModelAttribute("emp") Employee_personel employeeBean,
	 BindingResult result) {
	 Map<String, Object> model = new HashMap<String, Object>();
	 System.out.println("emp id in method "+employeeBean.getEmpid());
	 
	 System.out.println("emp fname in method :"+employeeBean.getFname());
	 
	 
	
	
	 
	 empService.updateUser(employeeBean);
	 
	 
	 model.put("emps", empService.getUser());
		return new ModelAndView("EmpDetails", model);
	 }
	
	
	
	
	
	private List<Employee_personel> prepareListofBean(List<Employee_personel> employees){
		 List<Employee_personel> beans = null;
		 if(employees != null && !employees.isEmpty()){
		 beans = new ArrayList<Employee_personel>();
		 Employee_personel bean = null;
		 for(Employee_personel employee : employees){
		 bean = new Employee_personel();
		 bean.setMobno(employee.getMobno());
		 bean.setMname(employee.getMname());
		 bean.setLname(employee.getLname());
		 bean.setFname(employee.getFname());
		 bean.setEmpid(employee.getEmpid());
		 beans.add(bean);
		 }
		 }
		 return beans;
		 }
		
		 private  ArrayList<Employee> prepareEmployeeBean(Employee_personel employee){
				Employee employee1 = new Employee();
				ArrayList<Employee> AL= new ArrayList<Employee>();
				employee1.setMobno(employee.getMobno());
				employee1.setMname(employee.getMname());
			 employee1.setLname(employee.getLname());
			 employee1.setFname(employee.getFname());
				employee1.setEmpid(employee.getEmpid());
				
				AL.add(employee1);
			//	 employeeBean.setId(null);
			 return AL;
		 }

	
	
	private Employee_personel prepareModel(Employee employee){
		Employee_personel employee1 = new Employee_personel();
		employee1.setMobno(employee.getMobno());
		employee1.setMname(employee.getMname());
	 employee1.setLname(employee.getLname());
	 employee1.setFname(employee.getFname());
		employee1.setEmpid(employee.getEmpid());
	//	 employeeBean.setId(null);
	 return employee1;
		 }
	
	@RequestMapping("/empList")
	public ModelAndView getUserList() {
		System.out.println("getuserlist");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("emps", empService.getUser());
		ArrayList<Employee_personel> al=new ArrayList<Employee_personel>();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		return new ModelAndView("EmpDetails", model);

	}
	
	
	
	
	

}
