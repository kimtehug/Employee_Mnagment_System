package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Service.EmployeeService;
import com.employee.entity.Employee;
@RestController
@RequestMapping("/api/employee")
public class EmpController {
private final EmployeeService empservice;
	
@Autowired
public EmpController(EmployeeService empservice) {
	this.empservice = empservice;
} 
@GetMapping("/test")
public String test() {
    return "Working!";
}

@PostMapping
public Employee addEmployee(@RequestBody Employee emp)
{
	return empservice.saveemp(emp);
}
@GetMapping
public List<Employee> getAllemp(){
	return empservice.getAll();
	}


@DeleteMapping("/{id}")
public void deleteemp(@PathVariable Long id) {
    empservice.delete(id);
}





}