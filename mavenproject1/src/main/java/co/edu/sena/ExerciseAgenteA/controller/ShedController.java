/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class ShedController implements IShedController {
    
    public static List<Shed> Sheds = new ArrayList<>();


    public ShedController() {
    
    Shed shed1 = new Shed (1, "Disponible");
    Sheds.add(shed1);
    Shed shed2 = new Shed (2, "Disponible");
    Sheds.add(shed2);
    }
    
    @Override
    public void register(Shed shed) throws Exception {
        if (shed == null) 
        {
            throw new Exception("El galpon esta vacio");
        }
        if (shed.getId() == 0)
        {
            throw new Exception("El numero del galpon es obligatorio");
        }
        if (shed.getShedStatus() == null)
        {
            throw new Exception("EL Estaus del galpon es obligatorio");
        }
        Sheds.add(shed);
    }
    
    

    @Override
    public void delete(int id) throws Exception {
        for (Shed shed : Sheds){
            if (shed.getId() == id)
            {
                Sheds.remove(shed);
                break;
            }
        }
    }
    
    @Override
    public void modify (Shed shed) throws Exception {
                if(Sheds == null)
        {
            throw new Exception("El departamento está vacío");
        }
        
        if(shed.getId() == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        if("".equals(shed.getShedStatus() == null))
        {
            throw new Exception("El estatus es obligatorio");
        }
        
        //validar si el departamento a actualizar existe        
        boolean exists = false;
        for (int i = 0; i < Sheds.size(); i++) {
            if(Sheds.get(i).getId() == shed.getId())
            {
                Sheds.set(i, shed);
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("No existe el departamento a actualizar");
        }        
    }
          
    
    @Override
    public void clean (int id) throws Exception {
        for (Shed shed : Sheds){
            if (shed.getId() == id)
            {
                Sheds.clear();
                break;
            }
        }
    }

    @Override
    public List<Shed> findAll() throws Exception {
        return Sheds;
    }
        
        

}
    

