package ec.edu.espol.modelos;

import java.util.Date;

/**
 *
 * @author paul.bustos
 */
public class Administrador extends Persona {

    public Administrador(String usuario, String clave,
            String nombre, String apellido, String cedula,
            String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
    }

    public boolean registrarUsuario() {
        return true;
    }

    public boolean asignarRol(Persona persona) {
        return true;
    }
}
