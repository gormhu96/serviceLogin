package com.login.ws.rest.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class Conexion {

	@Autowired

	private Environment env;

	@Bean

	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.jdbc.Driver");

		dataSource.setUrl("jdbc:mysql://172.17.0.3:3306/bdprueba?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

		dataSource.setUsername("guillermo");

		dataSource.setPassword("123456");

		return dataSource;

	}

	@Bean

	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {

		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();

		entityManagerFactory.setDataSource(dataSource);

		entityManagerFactory.setPackagesToScan(env.getProperty("entitymanager.packagesToScan"));

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

		entityManagerFactory.setJpaVendorAdapter(vendorAdapter);

		Properties additionalProperties = new Properties();

		additionalProperties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));

		additionalProperties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));

		additionalProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));

		entityManagerFactory.setJpaProperties(additionalProperties);

		return entityManagerFactory;

	}

}
