package com.maven.service;

import com.maven.model.Employee;

public interface EmployeeService {
public String save(Employee employee);
public String update(Employee employee);
public Employee findby (String id) ;
public String  deleteById (String id) ;
}
