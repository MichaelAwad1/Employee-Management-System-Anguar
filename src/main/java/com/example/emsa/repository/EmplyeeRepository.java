package com.example.emsa.repository;

import com.example.emsa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplyeeRepository extends JpaRepository<Employee, Long> {

}
