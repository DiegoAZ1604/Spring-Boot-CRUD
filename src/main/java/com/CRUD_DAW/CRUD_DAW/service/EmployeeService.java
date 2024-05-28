package com.CRUD_DAW.CRUD_DAW.service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.CRUD_DAW.CRUD_DAW.dto.EmployeeDTO;
import com.CRUD_DAW.CRUD_DAW.entity.Employee;
import com.CRUD_DAW.CRUD_DAW.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author diegod
 */

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private ModelMapper modelMapper;
    
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
        return employeeDTO;
    }
    
    public List<EmployeeDTO> getAllEmployees(){
        List<Employee> employeeList = employeeRepository.findAll();
        return modelMapper.map(employeeList, new TypeToken<List<EmployeeDTO>>(){}.getType());
    }
    
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO){
        employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
        return employeeDTO;
    }
    
    public boolean deleteEmployee(EmployeeDTO employeeDTO){
        employeeRepository.delete(modelMapper.map(employeeDTO, Employee.class));
        return true;
    }
    
}
