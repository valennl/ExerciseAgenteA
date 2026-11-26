/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.db;

import co.edu.sena.ExerciseAgenteA.Utils.MessageUtils;
import co.edu.sena.ExerciseAgenteA.model.Line;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 25/11/2026
 * @author Nicolas Valencia
 * Objetivo: clase para conexion a tabla line
 */
public class DBLine extends DBConnection{
    public void insert(Line line)
    {
        try {
            connect();
            String sql = "insert into line(name) values (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, line.getName());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al insertar la linea " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
    }
    
    public void update(Line line)
    {
        try {
            connect();
            String sql = "update line set name = ? where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, line.getName());
            ps.setInt(2, line.getId());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al modificar la linea " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
    
    public void delete(Line line)
    {
        try {
            connect();
            String sql = "delete from line where where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            String id = null;
            ps.setString(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al eliminar la linea " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
    
    public List<Line> findAll()
    {
        List<Line> result = new ArrayList<>();
        try {
            connect();
            String query = "select * from line";
            statment = connection.createStatement();
            ResultSet resultSet = statment.executeQuery(query);
            
            while(resultSet.next())
            {
                Line line = new Line(resultSet.getInt("id"), resultSet.getString("name"));
                result.add(line);
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
    
    
    
    
    public Line find(int id)
    {
        
        Line line = null;
        try {
            connect();
            String query = "select * from line where id = ?";
            PreparedStatement ps = connection.prepareCall(query);
            ps.setInt(1, id);
            ResultSet resulSet = ps.executeQuery(query);
            
            if(resulSet.next())
            {
                line = new Line(resulSet.getInt("id"), resulSet.getString("name"));
            }
            
            resulSet.close();
            ps.close();
            
            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar las lineas" + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return line;
    }
    
}
