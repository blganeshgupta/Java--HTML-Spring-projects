package com.maven.Dao;

import com.maven.model.Employee;

public interface EmployeeDao {
	public String save(Employee employee);
	 public String update(Employee employee);
public Employee findby (String id) ;
public String  deleteById(String id) ;





}
