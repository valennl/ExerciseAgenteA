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
    private String Status;

    public Shed() {
    }

    public Shed(int id, String shedStatus) {
        this.id = id;
        this.Status = shedStatus;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return Status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return id +"-"+ Status;
    }

    
    
    
}
    
  