package Ejercicio2;

public class ModoTransferencia implements Transferencia{

    @Override
    public void realizarTransferencia(int monto, String numeroCuenta){
        System.out.println("Se ha realizado una Transacción de $" + monto + " A la cuenta " + numeroCuenta);

    }
}
