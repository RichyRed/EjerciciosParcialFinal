package ejerciciosParcialFinal.ejercicio6;

public class Compu implements IDispositivo {
    private String modelo;
    private int memoria;

    public Compu(String modelo, int memoria) {
        this.modelo = modelo;
        this.memoria = memoria;
    }

    @Override
    public void showInfo() {
        System.out.println("--- Info de la Compu ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
        System.out.println();
    }
}
