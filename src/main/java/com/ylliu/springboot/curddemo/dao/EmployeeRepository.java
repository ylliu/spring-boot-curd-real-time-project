package com.ylliu.springboot.curddemo.dao;

import com.ylliu.springboot.curddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
