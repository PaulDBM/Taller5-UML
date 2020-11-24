package ec.edu.espol.modelos;

import java.util.Date;

/**
 *
 * @author paul.bustos
 */
public class Secretaria extends Persona {

    protected Doctor doctor;

    public Secretaria(Doctor doctor, String usuario, String clave, String nombre, String apellido,
            String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.doctor = doctor;
    }

    public void verificarCita() {
    }

    public boolean agendarCita() {
        return true;
    }
}
