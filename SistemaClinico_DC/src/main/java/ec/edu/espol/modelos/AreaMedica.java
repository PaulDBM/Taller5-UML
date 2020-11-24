package ec.edu.espol.modelos;

import java.util.ArrayList;

/**
 *
 * @author paul.bustos
 */
public class AreaMedica {

    protected String especialidad;
    protected float costo;
    protected ArrayList<Doctor> doctores;

    public AreaMedica(String especialidad, float costo, ArrayList<Doctor> doctores) {
        this.especialidad = especialidad;
        this.costo = costo;
        this.doctores = doctores;
    }

}
