/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.db;

/**
 *
 * @author Aprendiz
 */
public class TestConnection {
    public static void main(String[] args) {
        DBconnection dbc = new DBconnection();
        dbc.connect();
        dbc.disconnect();
    }
}
