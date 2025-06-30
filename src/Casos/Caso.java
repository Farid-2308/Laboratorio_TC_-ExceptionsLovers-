/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;
import.Victimas.Victima;
import java.time.LocalDate;
/**
 *
 * @author Farid
 */
public class Caso {
    private  int id;
    private Victimas Victima;
    private String descripcion;
    private Tipo tipo;
    private LocalDate Fecha;
    private Prioridad prioridad;

    public int getId() {
        return id;
    }

    public Victimas getVictima() {
        return Victima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Caso(int id, Victimas Victima, String descripcion, Tipo tipo, LocalDate Fecha, Prioridad prioridad) {
        this.id = id;
        this.Victima = Victima;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.Fecha = Fecha;
        this.prioridad = Prioridad.BAJA;
    }

    @Override
    public String toString() {
        return "Caso{" + "id=" + id + ", Victima=" + Victima + ", descripcion=" + descripcion + ", tipo=" + tipo + ", Fecha=" + Fecha + ", prioridad=" + prioridad + '}';
    }
    
}
