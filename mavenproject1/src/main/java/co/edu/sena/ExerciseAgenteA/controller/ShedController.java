/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.Data.DataStore;
import co.edu.sena.ExerciseAgenteA.db.DBShed;
import co.edu.sena.ExerciseAgenteA.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 28/10/2026
 * @author Nicolas Valencia
 * Objetivo: controlador galpon
 */
public class ShedController implements IShedController{
    
    private DBShed dbshed = new DBShed();


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
        
        dbshed.insert(shed);
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
            Shed shedExist = find(shed.getId());
            if(shedExist == null)
            {
                throw new Exception("No existe el registro a actualizar");   
            }
        
            dbshed.update(shed);
         
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        
        //verificar existencia del galpon a eliminar
        Shed shedExist = find(id);
            if(shedExist == null)
            {
                throw new Exception("No existe el registro a actualizar");   
            }
        
            dbshed.delete(id);
    }

    @Override
    public Shed find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
            
        
        return dbshed.find(id);
    }

    @Override
    public List<Shed> findAll() throws Exception {
        return dbshed.findAll();
    }
    
}
    

    

