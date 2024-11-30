package Ejercicio2;

public class ModoRetiro implements Retiro{

    @Override
    public void realizarRetiro(int monto){
        System.out.println("Se realizó un retiro de $" + monto);
    }
}
