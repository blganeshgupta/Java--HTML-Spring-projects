package com.maven.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.maven.model.Employee;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:properties/jdbc.properties")
@ComponentScan(basePackages = "com.maven")
public class EmployeeConfig {

	@Autowired
	Environment environment;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		DriverManagerDataSource dataSource = new DriverManagerDataSource(environment.getProperty("jdbc.url"),
				environment.getProperty("jdbc.username"), environment.getProperty("jdbc.password"));

		sessionFactory.setDataSource(dataSource);

		Properties properties = new Properties();
		properties.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));

		sessionFactory.setHibernateProperties(properties);

		sessionFactory.setAnnotatedClasses(Employee.class);

		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {

		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				getSessionFactory().getObject());

		return transactionManager;

	}

	@Bean
	public HibernateTemplate hibernateTemplate() {

		HibernateTemplate hibernateTemplate = new HibernateTemplate();

		hibernateTemplate.setSessionFactory(getSessionFactory().getObject());

		return hibernateTemplate;
	}

}
