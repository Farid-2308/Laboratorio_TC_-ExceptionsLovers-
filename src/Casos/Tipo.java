/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Casos;

/**
 *
 * @author Farid
 */
public enum Tipo {
    VIOLENCIA_DOMESTICA ("Violencia Domestica"),
    ABANDONO ("Abandono"),
    TRATA ("Trata");
    
    private String Tipo;

    private Tipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }
    
}
