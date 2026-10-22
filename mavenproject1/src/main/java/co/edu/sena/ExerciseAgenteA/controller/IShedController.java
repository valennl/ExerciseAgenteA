/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Shed;
import java.util.List;

/**
 * Fecha: 22/10/2026
 * @author Nicolas Valencia
 * Objetivo: model shed
 */
public interface IShedController {
    public void register(Shed shed) throws Exception;
    public void modify (Shed shed) throws Exception;
    public void delete (int id) throws Exception;
    public void clean (int id) throws Exception;
    public List<Shed> findAll() throws Exception;
}
