package com.example.emsa.controller;

import com.example.emsa.model.Employee;
import com.example.emsa.repository.EmplyeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmplyeeRepository employeesRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeesRepository.findAll();
    }
}
