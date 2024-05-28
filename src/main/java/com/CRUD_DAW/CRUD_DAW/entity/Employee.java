/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CRUD_DAW.CRUD_DAW.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author diegod
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee {
    @Id
    private int idEmployee;
    private String firstName;
    private String lastName;
    private int employeeNumber;
    private String email;
    private int age;
}
