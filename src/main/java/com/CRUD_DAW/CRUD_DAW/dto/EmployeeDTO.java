package com.CRUD_DAW.CRUD_DAW.dto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

/**
 *
 * @author diegod
 */

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmployeeDTO {
    private int idEmployee;
    private String firstName;
    private String lastName;
    private int employeeNumber;
    private String email;
    private int age;
}
