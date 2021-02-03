package com.maven.Mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven.controller.EmployeeController;

public class App 
{
    public static void main( String[] args )
    {
    ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("/spring/applicationcontext.xml");
    EmployeeController employeeContoller = cpxac.getBean(EmployeeController.class ,"employeeController");
   // employeeContoller.findById();
  //  employeeContoller.delete();
    //employeeContoller.save();
    employeeContoller.update();
    cpxac.close();
    }
}
