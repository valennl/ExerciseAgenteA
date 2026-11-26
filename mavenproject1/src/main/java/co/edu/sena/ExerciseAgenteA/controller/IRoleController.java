/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Role;
import java.util.List;

/**
 * Fecha: 22/10/2026
 * @author Nicolas Valencia
 * Objetivo: interface controlador rol
 */
public interface IRoleController {
    public Role find(int id) throws Exception;
    public List<Role> findAll() throws Exception;
}
