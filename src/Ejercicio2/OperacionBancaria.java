package Ejercicio2;

public interface OperacionBancaria {
    void realizarTransferencia(int monto, String numeroCuenta);
    void realizarRetiro(int monto);
    void pagarFactura(int monto, String numeroFactura);
}
