package ejerciciosParcialFinal.ejercicio6;

public class Tele implements IDispositivo {
    private String modelo;
    private int size;

    public Tele(String modelo, int size) {
        this.modelo = modelo;
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("--- Info del televisor ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño: " + size + " pulgadas");
        System.out.println();
    }
}
