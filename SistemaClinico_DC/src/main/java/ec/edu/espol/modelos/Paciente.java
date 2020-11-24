package ec.edu.espol.modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author paul.bustos
 */
public class Paciente extends Persona {

    protected String email;
    protected HistoriaClinica historiaClinica;
    protected Cita cita;
    protected ArrayList<Receta> recetas;

    public Paciente(String email, HistoriaClinica historiaClinica,
            Cita cita, ArrayList<Receta> recetas, String usuario, String clave,
            String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.email = email;
        this.historiaClinica = historiaClinica;
        this.cita = cita;
        this.recetas = recetas;
    }

    public boolean solicitarCita() {
        return true;
    }
}
