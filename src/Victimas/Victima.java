package Victimas;
import java.time.LocalDate;
import java.time.Period;

public class Victima {
    private LocalDate fechaNacimiento;
    
    private String nombre;
    
    private String genero;
    
    private String correo;
    
    private String telefono;
    
    private String Direccion;

    private String cedulaHash;

    public void setCedulaHash(int cedula) {
        String cedulaStr = Integer.toString(cedula);
        this.cedulaHash = String.valueOf(cedulaStr.hashCode());
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCedulaHash() {
        return cedulaHash;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

   public String getNombre() {
    return String.valueOf(nombre.hashCode());
}

    public String getGenero() {
        return genero;
    }

    public Victima(LocalDate fechaNacimiento, String nombre, String genero, String correo, String telefono, String Direccion, String cedulaHash) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.Direccion = Direccion;
        this.cedulaHash = cedulaHash;
    }
    
   public int calcularEdad() {
    if (fechaNacimiento == null) {
        return -1;
    }
    LocalDate hoy = LocalDate.now();
    return Period.between(fechaNacimiento, hoy).getYears();
    }

    @Override
    public String toString() {
        return "Victima{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", genero=" + genero + ", correo=" + correo + ", telefono=" + telefono + ", Direccion=" + Direccion + ", cedulaHash=" + cedulaHash + '}';
    }

   
}