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
    private String shedStatus;

    public Shed() {
    }

    public Shed(int id, String shedStatus) {
        this.id = id;
        this.shedStatus = shedStatus;
    }

    public int getId() {
        return id;
    }

    public String getShedStatus() {
        return shedStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setShedStatus(String shedStatus) {
        this.shedStatus = shedStatus;
    }

    @Override
    public String toString() {
        return id + shedStatus;
    }

    
    
    
}
    
  