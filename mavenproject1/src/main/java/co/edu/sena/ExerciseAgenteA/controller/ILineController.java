/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Line;
import java.util.List;

/**
 * Fecha: 29/10/2026
 * @author: Nicolas Valencia
 * Objetivo: IControler linea
 */
public interface ILineController {
    public void insert(Line line) throws Exception;
    public void update (Line line) throws Exception;
    public void delete (int id) throws Exception;
    public Line find(int id) throws Exception;
    public List<Line> findAll() throws Exception;
}



