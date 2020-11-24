package ec.edu.espol.modelos;

import java.util.ArrayList;

/**
 *
 * @author Milen Ortega Hp
 */
public class HistoriaClinica {

    protected int nro;
    protected ArrayList enfermedades;
    protected ArrayList alergias;
    protected ArrayList otros;

    public HistoriaClinica(int nro, ArrayList enfermedades, ArrayList alergias, ArrayList otros) {
        this.nro = nro;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otros = otros;
    }

}
