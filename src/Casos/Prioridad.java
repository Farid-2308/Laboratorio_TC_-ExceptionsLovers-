/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Casos;

/**
 *
 * @author Farid
 */
public enum Prioridad {
    ALTA ("Alta"),
    MEDIA ("Media"),
    BAJA ("Baja");

    private String Prioridad;

    private Prioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getPrioridad() {
        return Prioridad;
    }
}
