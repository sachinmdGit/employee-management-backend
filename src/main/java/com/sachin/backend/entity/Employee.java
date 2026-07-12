package com.sachin.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data          // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor  // generates empty constructor
@AllArgsConstructor // generates constructor with all fields
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String department;
    private double salary;
}