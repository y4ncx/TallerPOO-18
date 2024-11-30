package Ejercicio3;

public class ClasePrueba {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.conducir();

        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancia();


    }
}
