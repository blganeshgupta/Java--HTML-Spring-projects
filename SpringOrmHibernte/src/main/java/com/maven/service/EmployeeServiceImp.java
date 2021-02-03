package com.maven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maven.Dao.EmployeeDao;
import com.maven.model.Employee;
@Service("employeeService")
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	
	private EmployeeDao employeeDAO;
	@Override
	@Transactional
	public String save(Employee employee) {
	String status = employeeDAO.save(employee);
	return status;
	}

	@Override
	@Transactional
	public String update(Employee employee) {
		String status = employeeDAO.update(employee);
		return status;
	}

	@Override
	public Employee findby(String id) {
		Employee employee = employeeDAO.findby(id);
		
		return employee;
	}

	@Override
	@Transactional
	public String deleteById(String id) {
		String status = employeeDAO.deleteById(id);
		return status;
	}

}
