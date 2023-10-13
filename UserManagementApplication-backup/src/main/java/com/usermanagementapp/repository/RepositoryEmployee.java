package com.usermanagementapp.repository;

import com.usermanagementapp.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployee extends JpaRepository<Employee, Integer> {

    }
