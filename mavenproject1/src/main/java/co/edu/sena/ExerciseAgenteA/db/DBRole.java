/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.db;

import co.edu.sena.ExerciseAgenteA.Utils.MessageUtils;
import static co.edu.sena.ExerciseAgenteA.db.DBConnection.connection;
import static co.edu.sena.ExerciseAgenteA.db.DBConnection.statment;
import co.edu.sena.ExerciseAgenteA.model.Role;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clase para conexion a la tabla
 */
public class DBRole extends DBConnection{
    public List<Role> findAll()
    {
        List<Role> result = new ArrayList<>();
        try {
            connect();
            String query = "select * from role";
            statment = connection.createStatement();
            ResultSet resultSet = statment.executeQuery(query);
            
            while(resultSet.next())
            {
                Role role = new Role(resultSet.getInt("id"), resultSet.getString("name"));
                result.add(role);
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar las líneas " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return result;
    }
    
    
    
    
    public Role find(int id)
    {
        
        Role role = null;
        try {
            connect();
            String query = "select * from line where id = ?";
            PreparedStatement ps = connection.prepareCall(query);
            ps.setInt(1, id);
            ResultSet resulSet = ps.executeQuery(query);
            
            if(resulSet.next())
            {
                role = new Role(resulSet.getInt("id"), resulSet.getString("name"));
            }
            
            resulSet.close();
            ps.close();
            
            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar los role" + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return role;
    }
    
}
