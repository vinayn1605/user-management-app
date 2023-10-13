package com.usermanagementapp.service;

import com.usermanagementapp.dto.Employee;
import com.usermanagementapp.repository.RepositoryEmployee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmployeeImpl implements ServiceEmployee {

    RepositoryEmployee repositoryEmployee;
//    @Autowired
//    public ServiceEmployeeImpl(RepositoryEmployee repositoryEmployee) {
//        this.repositoryEmployee = repositoryEmployee;
//    }
    public ServiceEmployeeImpl() {

    }


    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    public List<Employee> findAll() {
        return repositoryEmployee.findAll();
    }

}
