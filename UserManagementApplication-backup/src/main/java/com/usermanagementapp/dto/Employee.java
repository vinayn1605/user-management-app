package com.usermanagementapp.dto;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {//implements Serializable
    @Id
    @GeneratedValue
    @Column(name="Id", unique = true)
    private int empId;
    @Column(name="Name")
    private String empName;
    @Column(name="address")
    private String address;

    @Column(name="jobRole")
    private String jobRole;
    @Column(name="phoneNumber")
    private long phoneNumber;





   public Employee(int empId, String empName, String address, String jobRole, long phoneNumber) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.jobRole = jobRole;
        this.phoneNumber = phoneNumber;
    }

    public Employee() {
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", address='" + address + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
