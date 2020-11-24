package ec.edu.espol.modelos;

import java.util.ArrayList;

/**
 *
 * @author paul.bustos
 */
public class Paciente extends Persona {

    protected String email;
    protected HistoriaClinica historiaClinica;
    protected Cita cita;
    protected ArrayList<Receta> recetas; //puede usarse otro tipo de coleccion

    public boolean solicitarCita() {
        return true;
    }
}
