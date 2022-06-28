package ejerciciosParcialFinal.ejercicio6;

public class Cel implements IDispositivo {
    private String modelo;
    private int memoria;

    public Cel(String modelo, int memoria) {
        this.modelo = modelo;
        this.memoria = memoria;
    }

    @Override
    public void showInfo() {
        System.out.println("--- Info del celular ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
        System.out.println();
    }
}
