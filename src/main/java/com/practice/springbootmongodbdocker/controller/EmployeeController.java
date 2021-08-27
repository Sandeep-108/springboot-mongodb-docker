package com.practice.springbootmongodbdocker.controller;

import com.practice.springbootmongodbdocker.model.Employee;
import com.practice.springbootmongodbdocker.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return repository.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return repository.findAll();
    }
}
