package com.myproject.employeesystemapi.repository;

import com.myproject.employeesystemapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
