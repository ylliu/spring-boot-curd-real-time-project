package com.ylliu.springboot.curddemo.dao;

import com.ylliu.springboot.curddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
