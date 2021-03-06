package ec.edu.espol.modelos;

import java.util.Date;

/**
 *
 * @author paul.bustos
 */
public class Persona {

    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    protected Administrador registradoPor;

    public Persona() {
    }

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.registradoPor = registradoPor;
    }

    public boolean login() {
        return true;
    }

    public boolean logOut() {
        return true;
    }
}
