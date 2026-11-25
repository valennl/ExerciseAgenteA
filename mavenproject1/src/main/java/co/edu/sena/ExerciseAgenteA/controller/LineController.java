/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Line;
import java.util.List;
import co.edu.sena.ExerciseAgenteA.Data.DataStore;
import co.edu.sena.ExerciseAgenteA.db.DBLine;

/**
 * Fecha: 29/10/2026
 * @author: Nicolas Valencia
 * Objetivo: Controler linea
 */
public class LineController implements ILineController {
    private DBLine dbline = new DBLine();
    public static List<Line> lineList = DataStore.getLineList();

    @Override
    public void insert(Line line) throws Exception {
        if (line == null)
        {
            throw new Exception("El galpon esta vacio");
        }
        if("".equals(line.getName()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        dbline.insert(line);
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
        Line lineExist = find(line.getId());
        
        if(lineExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        
        dbline.update(line);
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
        
        
        return dbline.find(id);
    }

    @Override
    public List<Line> findAll() throws Exception {
        return (List<Line>) dbline.find(0);
    }
    
}

