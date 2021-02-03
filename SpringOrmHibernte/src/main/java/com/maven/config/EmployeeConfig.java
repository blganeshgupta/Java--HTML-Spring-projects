package com.maven.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@PropertySource("classpath:properties/jdbc.properties")
@ComponentScan("basePackages:com.maven")
public class EmployeeConfig {

	
	Environment environment;
	public LocalSessionFactoryBean sessionFactory() {
	
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
				DriverManagerDataSource datasource=new DriverManagerDataSource
						(environment.getProperty("jdbc.url"),environment.getProperty("jdbc.username"),environment.getProperty("jdbc.password"));
				sessionFactory.setDataSource(datasource);
		
		
		return null;
		
	}
	
}
