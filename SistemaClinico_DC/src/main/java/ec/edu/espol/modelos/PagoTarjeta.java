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
        if (this.monto >= monto) {
            return true;
        }
        return false;
    }

}
