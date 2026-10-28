/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 28/10/2026
 * @author Nicolas Valencia
 * Objetivo: controlador galpon
 */
public class ShedController implements IShedController{
    
    public static List<Shed> shedList = new ArrayList<>();

    public ShedController() {
        shedList.add(new Shed(1, "DISPONIBLE"));
        shedList.add(new Shed(2, "DISPONIBLE"));
        shedList.add(new Shed(3, "OCUPADO"));
    }
    
    @Override
    public void insert(Shed shed) throws Exception {
        if (shed == null)
        {
            throw new Exception("El galpon esta vacio");
        }
        if(shed.getId() == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        if("".equals(shed.getStatus()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        shedList.add(shed);
    }

    @Override
    public void update(Shed shed) throws Exception {
        if (shed == null)
        {
            throw new Exception("El galpon esta vacio");
        }
        if(shed.getId() == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        if("".equals(shed.getStatus()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        //verificar existencia del galpon a actualizar 
            boolean exists = false;
            for (int i = 0; i < shedList.size(); i++) {
                 if(shedList.get(i).getId() == shed.getId())
                 {
                     shedList.set(i, shed); //actualizar
                     exists = true;
                     break;
                 }
        }
        
        if(!exists)
        {
            throw new Exception("El galpon no existe");
        }
        
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        
        //verificar existencia del galpon a eliminar
        boolean exists = false;
        for (int i = 0; i < shedList.size(); i++) {
             if(shedList.get(i).getId() == id)
             {
                 shedList.remove(i); //actualizar
                 exists = true;
                 break;
             }
        }
        
        if(!exists)
        {
            throw new Exception("El galpon no existe");
        }
    }

    @Override
    public Shed find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        
        Shed shed = null;
        for (Shed s : shedList) {
            if(s.getId() == id)
            {
                shed = s;
            }
        }
        
        return shed;
    }

    @Override
    public List<Shed> findAll() throws Exception {
        return shedList;
    }
    
}
    

    

