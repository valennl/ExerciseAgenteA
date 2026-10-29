/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.Data;


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
    
    static{
        //carga inicial de datos
        shedList.add(new Shed(1, "DISPONIBLE"));
        shedList.add(new Shed(2, "DISPONIBLE"));
        shedList.add(new Shed(3, "OCUPADO"));
    }

    public static List<Shed> getShedList() {
        return shedList;
    }
    
    
    
    
}
