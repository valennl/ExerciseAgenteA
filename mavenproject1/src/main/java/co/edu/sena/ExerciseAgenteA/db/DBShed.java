/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.db;

import co.edu.sena.ExerciseAgenteA.Utils.MessageUtils;
import static co.edu.sena.ExerciseAgenteA.db.DBConnection.connection;
import static co.edu.sena.ExerciseAgenteA.db.DBConnection.statment;
import co.edu.sena.ExerciseAgenteA.model.Shed;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 25/11/2026
 * @author Nicolas Valencia
 * Objetivo: clase para conexion a tabla shed 
 */
public class DBShed extends DBConnection{
        public void insert(Shed shed)
    {
        try {
            connect();
            String sql = "insert into shed(name) values (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, shed.getNumber());
            ps.setString(2, shed.getStatus());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al insertar el galpon " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
        
    public void update(Shed shed)
    {
        try {
            connect();
            String sql = "update shed set name = ? where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, shed.getNumber());
            ps.setString(2, shed.getStatus());
            ps.setInt(3, shed.getId());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al modificar el galpon " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
    
    public void delete(int id)
    {
        try {
            connect();
            String sql = "delete from shed where where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al eliminar el galpon " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
    
    public List<Shed> findAll()
    {
        List<Shed> result = new ArrayList<>();
        try {
            connect();
            String query = "select * from shed";
            statment = connection.createStatement();
            ResultSet resultSet = statment.executeQuery(query);
            
            while(resultSet.next())
            {
                Shed shed = new Shed(resultSet.getInt("id"), resultSet.getInt("number"),
                resultSet.getString("status"));
                result.add(shed);
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar los galpones " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return result;
    }
    
    public Shed find(int id)
    {
        
        Shed shed = null;
        try {
            connect();
            String query = "select * from shed where id = ?";
            PreparedStatement ps = connection.prepareCall(query);
            ps.setInt(1, id);
            ResultSet resulSet = ps.executeQuery(query);
            
            if(resulSet.next())
            {
                shed = new Shed(resulSet.getInt("id"), resulSet.getInt("number"),
                resulSet.getString("status"));
            }
            
            resulSet.close();
            ps.close();
            
            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar los galpones" + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return shed;
    }
        
    
}
