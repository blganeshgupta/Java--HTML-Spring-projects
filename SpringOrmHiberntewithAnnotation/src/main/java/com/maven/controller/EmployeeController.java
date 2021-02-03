package com.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.maven.model.Employee;
import com.maven.service.EmployeeService;



@Controller("employeeController")
public class EmployeeController {
 
	@Autowired
	private EmployeeService employeeService;
	public void findById() {
		String id="IND11";
		
		Employee employee = employeeService.findby(id);
		if(employee==null) {
			System.out.println("Employee Id does not exist");
		}
		else {
			System.out.println("Employee Details:"+employee);
		}
	}
	public void delete() {
		String id="IND10";
		String status = employeeService.deleteById(id);
		if(status=="sucess") {
		
		System.out.println("Details deleted sucessfully related id of:"+id);
		}
		else if(status=="not exists") {
			System.out.println("details are not exists");
		}
		else {
			System.out.println("unable to delete the details of the Id:"+id);
		}
		}
	public void save() {
		Employee employee=new Employee("IND001","Dhoni","39","India");
		String status = employeeService.save(employee);
		if(status=="sucess") {
			
			System.out.println("Details added sucessfully ");
			}
			else if(status==" exists") {
				System.out.println("details are already Exists");
			}
			else {
				System.out.println("unable to save the details");
			}
		
	}
	public void update() {
		Employee employee=new Employee("IND005","raina","38","India");
	String status=	employeeService.update(employee);
	if(status=="sucess") {
		System.out.println("Details updated sucessfully with the id of:"+employee.getEid());
	}
	else if(status=="save") {
		System.out.println("your Details are saved sucessfully:"+employee.getEid());
	}
	else {
		System.out.println("unable to updated your Details");
	}
		
	}
	}
	
	

