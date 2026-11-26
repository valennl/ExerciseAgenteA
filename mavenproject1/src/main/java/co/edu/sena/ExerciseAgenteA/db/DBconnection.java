/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.db;

import co.edu.sena.ExerciseAgenteA.Utils.MessageUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Fecha: 25/11/2026
 * @author Nicolas Valencia
 * Objetivo: clase para conexion a base de datos
 */
public class DBConnection {
    public static Connection connection;
    public static Statement statment;
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE_NAME = "agentea_db";
    private final String USER = "root";
    private final String PASSWORD = "root";
    
    public void connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT +
                                "/" + DATABASE_NAME, USER, PASSWORD);
            IO.print("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE_NAME);
            statment = connection.createStatement();
            IO.println("Conectado...");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e)  {
            MessageUtils.getInstance().showError("Errror de conexion a la base de datos: " +
                    e.getMessage());

        }
        
    }
    
    public void disconnect()
    {
        try {
            if(statment != null)
            {
                statment.close();
            }
            if(connection != null)
            {
                connection.close();
            }
            IO.println("Desconectado...");
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error desconectandose de la base de datos" + e.getMessage());
        }
    }
     
}

