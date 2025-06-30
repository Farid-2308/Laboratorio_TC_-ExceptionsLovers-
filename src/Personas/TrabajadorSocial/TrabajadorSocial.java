/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.TrabajadorSocial;
import Personas.Persona;

public class TrabajadorSocial extends Persona{
    private String canton;

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public TrabajadorSocial(String canton, String cedula, String nombre, String correo, String numero) {
        super(cedula, nombre, correo, numero);
        this.canton = canton;
    }

    @Override
    public String toString() {
        return "TrabajadorSocial{" + "canton=" + canton + '}';
    }
    
        
}
