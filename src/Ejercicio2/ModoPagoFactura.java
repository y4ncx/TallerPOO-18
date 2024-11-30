package Ejercicio2;

public class ModoPagoFactura implements PagoFactura{

    @Override
    public void pagarFactura(int monto, String numeroFactura){
        System.out.println("Se ha pagado la factura " + numeroFactura + " Por un valor de $" + monto);
    }
}
