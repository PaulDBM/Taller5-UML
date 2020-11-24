package ec.edu.espol.modelos;

import java.util.Date;

/**
 *
 * @author Milen Ortega Hp
 */
public class Cita {

    protected Date fecha;
    protected Paciente paciente;
    protected Doctor doctor;
    protected boolean pagada;
    protected String registradoPor;

    public Cita(Date fecha, boolean pagada, String registradoPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
    }

    public void realizarPago(Pago pago) {
    }

}
