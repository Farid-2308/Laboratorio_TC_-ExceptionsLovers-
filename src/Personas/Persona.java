package Personas;

/**
 *
 * @author UTN
 */
public abstract class Persona {
    protected String cedula;
    protected String nombre;
    protected String correo;
    protected String numero;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    private static boolean validarNumero(String numero){
        return numero.matches("^(\\+506\\s?)?[24578]\\d{7}$");
    }
    
    private static boolean validarCorreo(String correo){
        return correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public Persona(String cedula, String nombre, String correo, String numero) {
        this.cedula = cedula;
        this.nombre = nombre;
        if (validarCorreo(correo)) {
            this.correo = correo;
        }
        if (validarNumero(numero)) {
            this.numero = numero;
        }  
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", numero=" + numero + '}';
    }
    
    
}
