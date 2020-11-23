package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployee")

    private int saveEmployee(@RequestBody Employee employee)
    {
      employeeService.saveOrUpdate(employee);
        return employee.getId();
    }


    @GetMapping("/getEmployee")
    private List<Employee> getID()

    {
        return employeeService.getEmployeeList();
    }


    @PutMapping("/updateEmployee")
    private int updateEmp(@RequestBody Employee employee)
    {
        employeeService.saveOrUpdate(employee);
        return employee.getId();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    private int updateEmp(@PathVariable Integer id)
    {
        employeeService.delete(id);
        return id;
    }
}


