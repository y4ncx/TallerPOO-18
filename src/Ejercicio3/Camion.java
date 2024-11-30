package Ejercicio3;

public class Camion implements Conducir, CargarMercancia{

    @Override
    public void cargarMercancia(){
        System.out.println("El camión está cargando la mercancía...");
    }

    @Override
    public void conducir(){
        System.out.println("El camión está conduciendo...");
    }

}
