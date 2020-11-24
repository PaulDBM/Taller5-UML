package ec.edu.espol.modelos;

/**
 *
 * @author anamabri
 */
public class PagoTarjeta implements Pago {

    protected float monto;
    protected String email;

    public PagoTarjeta(float monto, String email) {
        this.monto = monto;
        this.email = email;
    }

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
