package ec.edu.espol.modelos;
/**
 *
 * @author anamabri
 */


public class PagoEfectivo implements Pago {

    protected float monto;

    @Override
    public boolean realizarPago(float monto) {
        if(this.monto>= monto){
            return true;
        }
     return false;
    }
}
