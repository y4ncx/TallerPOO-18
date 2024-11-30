package Ejercicio2;

public class Prueba2 {
    public static void main(String[] args) {
        ModoRetiro retiro = new ModoRetiro();
        retiro.realizarRetiro(250000000);

        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ModoTransferencia transferencia = new ModoTransferencia();
        transferencia.realizarTransferencia(400000, "A44526");

        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ModoPagoFactura pagodefactura = new ModoPagoFactura();
        pagodefactura.pagarFactura(30000000, "SDF419");

        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        OperacionesGenerales general = new OperacionesGenerales();
        general.realizarRetiro(2000000);
        general.realizarTransferencia(3000000, "A35476");
        general.pagarFactura(40000, "XHD4981");
    }


}
