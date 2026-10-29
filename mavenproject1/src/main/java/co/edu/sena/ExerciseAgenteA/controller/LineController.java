/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Line;
import java.util.List;
import co.edu.sena.ExerciseAgenteA.Data.DataStore;

/**
 * Fecha: 29/10/2026
 * @author: Nicolas Valencia
 * Objetivo: Controler linea
 */
public class LineController implements ILineController {
    
    public static List<Line> lineList = DataStore.getLineList();

    @Override
    public void insert(Line line) throws Exception {
        if (line == null)
        {
            throw new Exception("El galpon esta vacio");
        }
         if(line.getId() == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        if("".equals(line.getName()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        lineList.add(line);
    }

    @Override
    public void update(Line line) throws Exception {
        if (line == null)
        {
            throw new Exception("El galpon esta vacio");
        }
        if(line.getId() == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        if("".equals(line.getName()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        //verificar existencia del galpon a actualizar 
            boolean exists = false;
            for (int i = 0; i < lineList.size(); i++) {
                 if(lineList.get(i).getId() == line.getId())
                 {
                     line.setName(line.getName().trim());
                     lineList.set(i, line); //actualizar
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
        for (int i = 0; i < lineList.size(); i++) {
             if(lineList.get(i).getId() == id)
             {
                 lineList.remove(i); //actualizar
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
    public Line find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        
        Line line = null;
        for (Line s : lineList) {
            if(s.getId() == id)
            {
                line = s;
            }
        }
        
        return line;
    }

    @Override
    public List<Line> findAll() throws Exception {
        return lineList;
    }
    
}

