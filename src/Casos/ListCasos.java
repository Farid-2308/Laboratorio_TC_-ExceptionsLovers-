/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;
import Listas.Lista;

/**
 *
 * @author Farid
 */
public class ListCasos {
    
    private Caso[] casos = new Caso[100];
    private int cantidad;
    private int max;
    
    public void add(Caso caso) {
        max = casos.length;
        cantidad = 0;
        if (cantidad < max) {
            casos[cantidad++] = caso;
        }
    }

    public int contarCasosPorPrioridad(Prioridad prioridad) {
        int contador = 0;
        for (int i = 0; i < max; i++) {
            if (casos[i].getPrioridad() == prioridad) {
                contador++;
            }
        }
        return contador;
    }
}
