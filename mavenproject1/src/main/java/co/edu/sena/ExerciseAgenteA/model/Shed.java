/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.model;

import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class Shed {
    private int id;
    private int number;
    private String status;
    
    public Shed() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Shed(int id, int number, String status) {
        this.id = id;
        this.number = number;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return number + " - " + status;
    }

    
}
    
  