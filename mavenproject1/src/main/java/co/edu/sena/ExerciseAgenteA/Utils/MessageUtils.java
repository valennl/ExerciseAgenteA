/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.ExerciseAgenteA.Utils;

import javax.swing.JOptionPane;

/**
 * Fecha: 28/10/2026
 * @author Nicolas Valencia
 * 0bjetivo: utileria para mensajes en pantalla
 */
public class MessageUtils {
    private static MessageUtils instance = null;

    public MessageUtils() {
        
    }

    public static MessageUtils getInstance() {
        if (instance == null)
        {
            instance = new MessageUtils();
        }
        return instance;
    }
    
    public void showInfo (String message)
    {
        JOptionPane.showMessageDialog(null, message, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void showWarning (String message)
    {
        JOptionPane.showMessageDialog(null, message, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
    public void showError (String message)
    {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public int showComfirm (String message)
    {
        return JOptionPane.showConfirmDialog(null, message, "confirmacion", JOptionPane.YES_NO_OPTION);
    }
}
    
    
    
    