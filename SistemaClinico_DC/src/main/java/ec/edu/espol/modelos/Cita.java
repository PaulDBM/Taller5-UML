/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.modelos;

import java.util.Date;

/**
 *
 * @author Milen Ortega Hp
 */
public class Cita {
    
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;

    public Cita(Date fecha, boolean pagada, String registradoPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
    }
    
    
    
    
    public void realizarPago(Pago pago){
        
    }
    
}
