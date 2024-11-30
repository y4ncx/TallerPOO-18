package Ejercicio1;

public class Moto implements Limpieza, Reparacion{
    @Override
    public void realizarReparacion(){

        System.out.println("Se le está haciendo mantenimiento a la moto...");


    }

    @Override
    public void realizarLimpieza(){
        System.out.println("A la moto se le está haciendo Limpeza...");
    }
}
