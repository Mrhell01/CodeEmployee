package com.EmployeeProject.DemoProject.Repositary;

import com.EmployeeProject.DemoProject.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Long> {

}
