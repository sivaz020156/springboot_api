package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveOrUpdate(Employee employee) {

        employeeRepository.save(employee);
    }

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList =new ArrayList<>();
         employeeRepository.findAll().forEach(employee->employeeList.add(employee));
         return employeeList;
    }


    public void delete(Integer id) {

        employeeRepository.deleteById(id);
    }
}
