package com.practice.springbootmongodbdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("employee")
public class Employee implements Serializable {

    @Id
    private Long id;
    private String name;
    private String department;
    private Double salary;
}
