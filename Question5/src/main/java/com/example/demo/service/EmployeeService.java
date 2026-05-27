package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveData() {

        Department department = new Department();
        department.setDepartmentName("IT");

        departmentRepository.save(department);

        Employee employee = new Employee();
        employee.setName("Raunak");
        employee.setSalary(50000);
        employee.setDepartment(department);

        employeeRepository.save(employee);
    }
}