package com.ylliu.springboot.curddemo.dao;

import com.ylliu.springboot.curddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.unwrap(Session.class).createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int theId) {
        return entityManager.unwrap(Session.class).get(Employee.class, theId);
    }

    @Override
    public void save(Employee theEmployee) {
        entityManager.unwrap(Session.class).saveOrUpdate(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        entityManager.unwrap(Session.class).delete(findById(theId));
    }
}
