package com.maven.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.maven.model.Employee;
@Repository("employeeDAO")
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public String save(Employee employee) {
		String status="";
		Employee ed =findby(employee.getEid());
		if(ed!=null) {
		 status = "exists";
		}
		else {
			  try{hibernateTemplate.save(employee);
			  status="sucess";
			  }catch(Exception e) {
				  status=null;
				  e.printStackTrace();
			  }
		}
		return status;
	
	}

	@Override
	public String update(Employee employee) {
		
		String status="";
		try {
		
			status="save";
			hibernateTemplate.saveOrUpdate(employee);
		
		
		
		}catch(Exception e) {
			status=null;
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee findby(String id) {
		try {
		
		Employee employee = hibernateTemplate.get(Employee.class, id);
		System.out.println(employee);
		return employee;
		}catch(Exception e)
		{ e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public String deleteById(String id) {
		String status = "";

		Employee employee = findby(id);
		if (employee == null) {

			status = "notFound";

		} else {

			try {
				hibernateTemplate.delete(employee);
				status = "success";
			} catch (Exception e) {
				status = "failure";
			}

		}

		return status;
	}
	

}
