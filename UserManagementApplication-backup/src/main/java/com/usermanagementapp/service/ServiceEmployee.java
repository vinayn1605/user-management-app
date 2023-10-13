package com.usermanagementapp.service;

import com.usermanagementapp.dto.Employee;

import java.util.List;


public interface ServiceEmployee {
    List<Employee> getAllEmployees();


    List<Employee> findAll();
}
