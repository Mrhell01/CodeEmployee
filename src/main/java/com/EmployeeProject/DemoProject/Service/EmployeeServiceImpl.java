package com.EmployeeProject.DemoProject.Service;

import com.EmployeeProject.DemoProject.Model.Employee;
import com.EmployeeProject.DemoProject.Repositary.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
   private EmployeeRepositary eRepositary;
    @Override
    public List<Employee> getEmployees() {
        return eRepositary.findAll(); // list of Employee
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return eRepositary.save(employee);
    }

    @Override
    public Employee getSingleEmployee(Long id) {
        Optional<Employee> employee = eRepositary.findById(id);
        if (employee.isPresent()){
            return employee.get();
        }
        throw new RuntimeException("Employee not found for id"+id);

    }

    @Override
    public void deleteEmployee(Long id){
        eRepositary.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee){
        return eRepositary.save(employee);
    }


}
