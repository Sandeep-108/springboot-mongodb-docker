package com.practice.springbootmongodbdocker.repository;

import com.practice.springbootmongodbdocker.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Long> {
}
