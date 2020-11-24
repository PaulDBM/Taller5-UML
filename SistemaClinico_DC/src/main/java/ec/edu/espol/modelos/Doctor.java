package ec.edu.espol.modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author paul.bustos
 */
public class Doctor extends Persona {

    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    protected AreaMedica areas;
    protected ArrayList<Cita> citasPendientes;

    public Doctor(int regDoctor, String especialidad, Secretaria secretaria,
            AreaMedica areas, ArrayList<Cita> citasPendientes, String usuario,
            String clave, String nombre, String apellido, String cedula, String direccion,
            Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.secretaria = secretaria;
        this.areas = areas;
        this.citasPendientes = citasPendientes;
    }

    public void recetar() {
    }

    public void agregarPlanNut() {
    }

    public void imprimirReceta() {
    }

    public void registrarSecretaria() {
    }
}
