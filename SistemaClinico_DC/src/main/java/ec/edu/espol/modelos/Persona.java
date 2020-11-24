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

    public boolean login() {
        return true;
    }

    public boolean logOut() {
        return true;
    }
}
