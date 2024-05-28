package com.CRUD_DAW.CRUD_DAW.repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import com.CRUD_DAW.CRUD_DAW.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author diegod
 */

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
    
}
