package com.example.EmployeManagement;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.employee")
@EntityScan("com.employee.entity")
@EnableJpaRepositories("com.employee.repository")
public class EmployeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeManagementApplication.class, args);
	}
}

