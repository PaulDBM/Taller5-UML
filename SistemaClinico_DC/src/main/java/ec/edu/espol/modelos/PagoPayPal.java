package ec.edu.espol.modelos;

import java.util.Date;

/**
 *
 * @author anamabri
 */
public class PagoPayPal implements Pago {

    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;

    public PagoPayPal(float monto, String numero, Date expira, String propietario, String banco) {
        this.monto = monto;
        this.numero = numero;
        this.expira = expira;
        this.propietario = propietario;
        this.banco = banco;
    }

    @Override
    public boolean realizarPago(float monto) {
        if (this.monto >= monto) {
            return true;
        }
        return false;
    }

}
