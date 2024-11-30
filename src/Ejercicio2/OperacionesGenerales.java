package Ejercicio2;


public class OperacionesGenerales implements Retiro, Transferencia, PagoFactura{
    @Override
    public void realizarRetiro(int monto){
        System.out.println("Se ha hecho un retiro de $" + monto + " Por medio de una operacion General");

    }

    @Override
    public void realizarTransferencia(int monto, String numeroCuenta){

        System.out.println("Se ha realizado una transferencia de $" + monto + " A la cuenta " + numeroCuenta + " Por medio de una operacion general");

    }

    @Override
    public void pagarFactura(int monto, String numeroFactura){
        System.out.println("Se ha pagado la factura " + numeroFactura + " Por un valor de $" + monto);
    }

}
