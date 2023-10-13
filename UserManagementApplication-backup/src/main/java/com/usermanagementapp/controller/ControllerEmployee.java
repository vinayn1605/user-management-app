package com.usermanagementapp.controller;

import com.usermanagementapp.dto.Employee;
import com.usermanagementapp.service.ServiceEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@EnableAutoConfiguration
@RequestMapping(path="/app")
public class ControllerEmployee {



    Logger logger
            = LoggerFactory.getLogger(ControllerEmployee.class);
    @Autowired
    ServiceEmployee serviceEmployee;

//    @Autowired
//    AppConf appConf;

//    @Autowired// Field injection
//    public ControllerEmployee(ServiceEmployee serviceEmployee) {
//        this.serviceEmployee = serviceEmployee;
//    }

    public ControllerEmployee() {
    }

    @GetMapping
    public List<Employee> findAll() {
        logger.warn("hello vinay");
        List<Employee> employees = serviceEmployee.findAll();
        logger.error("list of employees"+employees.toString());
        return employees;
   }
//    @GetMapping("/allEmployees")
//    @Query(value = "select * from employee")
//    public List<Employee> empNames(){
//        logger.warn("hello vinay");
//        List<Employee> employees = service.empNames();
//        logger.error("list of employees"+employees.toString());
//        return employees;
//    }
//    @GetMapping("/emp/eid/{id}")
//    public Employee getEmployee(@PathVariable int id){
//
//        return service.getEmployee(id);
//    }
//    @GetMapping("/emp/number/{mobileNumber}")
//    public Employee getEmpNum(@PathVariable long mobileNumber){
//        return service.getEmpNum(mobileNumber);
//    }
//    @PostMapping ("/add")
//    public Employee getNewEmployee(@RequestBody Employee employee){
//        return service.getNewEmployee(employee);
//    }
//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee){
//         service.updateEmployee(id, employee);
//        return employee;
//    }
//    @DeleteMapping ("/delete/{empId}")
//    public Employee deleteEmployee(@PathVariable int empId){
//        return service.deleteEmployee(empId);
//    }
//

}
