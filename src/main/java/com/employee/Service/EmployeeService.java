package com.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
@Service
public class EmployeeService {

	private final EmployeeRepository repo;

	@Autowired
	public EmployeeService(EmployeeRepository repo) {
	    this.repo = repo;
	}


public Employee saveemp(Employee emp)
{
	return repo.save(emp);
}
public List<Employee> getAll(){
	return repo.findAll();	
}
public void delete(Long id) {
	repo.deleteById(id);
}
}
