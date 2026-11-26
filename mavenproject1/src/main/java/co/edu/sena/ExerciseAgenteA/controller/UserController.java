/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.controller;

import co.edu.sena.ExerciseAgenteA.model.Line;
import java.util.List;
import co.edu.sena.ExerciseAgenteA.Data.DataStore;
import co.edu.sena.ExerciseAgenteA.db.DBUser;
import co.edu.sena.ExerciseAgenteA.model.User;

/**
 * Fecha: 29/10/2026
 * @author: Nicolas Valencia
 * Objetivo: Controler usuario
 */
public class UserController implements IUserController {
    private DBUser dbuser = new DBUser();

    @Override
    public void insert(User user) throws Exception {
        if (user == null)
        {
            throw new Exception("El usuario esta vacio");
        }
        
        if(user.getDocument() == 0)
        {
            throw new Exception("El documento es obligatorio");
        }
        
        if("".equals(user.getFullname()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        if("".equals(user.getEmail()))
        {
            throw new Exception("El correo es obligatorio");
        }
        if("".equals(user.getPassword()))
        {
            throw new Exception("La contraseña es obligatoria");
        }
        if(user.getRole() == null)
        {
            throw new Exception("El rol es obligatorio");
        }
        
        dbuser.insert(user);
    }

    @Override
    public void update(User user) throws Exception {
        if (user == null)
        {
            throw new Exception("El usuario esta vacio");
        }
        
        if(user.getDocument() == 0)
        {
            throw new Exception("El documento es obligatorio");
        }
        
        if("".equals(user.getFullname()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        if("".equals(user.getEmail()))
        {
            throw new Exception("El correo es obligatorio");
        }
        if("".equals(user.getPassword()))
        {
            throw new Exception("La contraseña es obligatoria");
        }
        if(user.getRole() == null)
        {
            throw new Exception("El rol es obligatorio");
        }
        
        //verificar existencia del galpon a actualizar 
        User userExist = find(user.getId());
        if(userExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        
        dbuser.update(user);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        
        //verificar existencia del galpon a eliminar
        User userExist = find(id);
        if(userExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        
        dbuser.delete(id);
    }

    @Override
    public User find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El numero es obligatorio");
        }
        
        
        return dbuser.find(id);
    }

    @Override
    public List<User> findAll() throws Exception {
        return dbuser.findAll();
    }
    
}

