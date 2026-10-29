/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.Data;


import co.edu.sena.ExerciseAgenteA.model.Line;
import co.edu.sena.ExerciseAgenteA.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 28/10/2026
 * @author Nicolas Valencia
 * Objetivo: almacen de datos o listas de datos
 */
public class DataStore {
    private static List<Shed> shedList = new ArrayList();
    private static List<Line> lineList = new ArrayList();
    
    static{
        //carga inicial de datos
        shedList.add(new Shed(1, "DISPONIBLE"));
        shedList.add(new Shed(2, "DISPONIBLE"));
        shedList.add(new Shed(3, "OCUPADO"));
        
        lineList.add(new Line(1, "Gallina Backcock"));
        lineList.add(new Line(2, "Gallina jersey blanca gigante"));
        lineList.add(new Line(3, "Gallina Light Sussex"));
    }

    public static List<Shed> getShedList() {
        return shedList;
    }

    public static List<Line> getLineList() {
        return lineList;
    }
    
    
    
    
}
