package com.maven.MainApp;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.maven.configuration.Buildingclass;
import com.maven.pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = null;
		Transaction transaction = null;

		try {

			session =Buildingclass.getSessionFactory();
		
transaction=session.beginTransaction();
			
			
			

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			if (session != null) {
				Buildingclass.close();
			}
		}
    }
    @SuppressWarnings("unused")
	private static void createRecord(Session session) {
		Employee employee = new Employee();
		employee.setEid("IND18");
		employee.setEname("kohli");
		employee.setEage("35");
		employee.setEaddress("RCB");

		String pkId = (String) session.save(employee);
		System.out.println("Inserted Succesfully with the id :" + pkId);
	}
    @SuppressWarnings("unused")
	private static void readRecord(Session session) {
		String pkId = "IND18";
		Employee employee = session.get(Employee.class, pkId);

		if (employee != null) {
			System.out.println("Employee is :" + employee);

		} else {
			System.out.println("Employee Record does not exists for the id :" + pkId);
		}
	}
    @SuppressWarnings("unused")
	private static void deleteRecord(Session session, Transaction transaction) {
		String pkId = "IND18";
		Employee employee = session.get(Employee.class, pkId);

		if (employee != null) {

			session.delete(employee);
			transaction.commit();
			System.out.println("Record deleted for the id :" + employee.getEid());

		} else {
			System.out.println("Deletion not possible for the id: " + pkId);
		}
	}

	@SuppressWarnings("unused")
	private static void UpdateRecord(Session session, Transaction transaction) {
		String pkId = "IND10";
		Employee employee = session.get(Employee.class, pkId);
		if (employee == null) {

			Employee empRecord = new Employee();
			empRecord.setEid(pkId);
			empRecord.setEname("dhoni");
			empRecord.setEage("39");
			empRecord.setEaddress("CSK");
			session.saveOrUpdate(empRecord);
			transaction.commit();
			System.out.println("New Record inserted with the id:" + pkId);

		} else {

			employee.setEname("sachin");
			employee.setEage("49");
			employee.setEaddress("MI");

			session.update(employee);
			transaction.commit();
			System.out.println("Employee record got updated!!!");
		}
	}
}
    

