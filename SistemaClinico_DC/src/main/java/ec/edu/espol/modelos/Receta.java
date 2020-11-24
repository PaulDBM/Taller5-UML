package ec.edu.espol.modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ana Briones
 */
public class Receta {

    protected Date fecha;
    protected Doctor doctor;
    protected Paciente paciente;
    protected ArrayList<Medicamento> medicamentos;
    protected PlanNutricional planNut;

    public Receta(Date fecha, Doctor doctor, Paciente paciente, ArrayList<Medicamento> medicamentos, PlanNutricional planNut) {
        this.fecha = fecha;
        this.doctor = doctor;
        this.paciente = paciente;
        this.medicamentos = medicamentos;
        this.planNut = planNut;
    }

}
