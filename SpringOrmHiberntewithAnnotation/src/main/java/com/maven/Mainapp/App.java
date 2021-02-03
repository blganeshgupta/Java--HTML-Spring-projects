package com.maven.Mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maven.config.EmployeeConfig;
import com.maven.controller.EmployeeController;


public class App 
{
    public static void main( String[] args )
    {
   AnnotationConfigApplicationContext acac= new AnnotationConfigApplicationContext(EmployeeConfig.class);
    EmployeeController employeeContoller =(EmployeeController) acac.getBean("employeeController");
   employeeContoller.findById();
  //  employeeContoller.delete();
    //employeeContoller.save();
    //employeeContoller.update();
    acac.close();
    }
}
