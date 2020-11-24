package ec.edu.espol.modelos;

/**
 *
 * @author anamabri
 */
public class PagoEfectivo implements Pago {

    protected float monto;

    public PagoEfectivo(float monto) {
        this.monto = monto;
    }

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
