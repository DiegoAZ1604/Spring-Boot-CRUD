package com.CRUD_DAW.CRUD_DAW.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.CRUD_DAW.CRUD_DAW.dto.EmployeeDTO;
import com.CRUD_DAW.CRUD_DAW.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author diegod
 */

@RestController
@RequestMapping(value = "api/v1/employees")
@CrossOrigin

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/getEmployees")
    public List<EmployeeDTO> getEmployee(){
        return employeeService.getAllEmployees();
    }
    
    @PostMapping("/saveEmployee")
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.saveEmployee(employeeDTO);
    }
    
    @PutMapping("/updateEmployee")
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.updateEmployee(employeeDTO);
    }
    
    @DeleteMapping("/deleteEmployee")
    public boolean deleteEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.deleteEmployee(employeeDTO);
    }

}
