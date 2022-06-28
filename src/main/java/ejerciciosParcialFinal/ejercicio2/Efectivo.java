package ejerciciosParcialFinal.ejercicio2;

public class Efectivo implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println(">>> Pagando en efectivoo");
        System.out.println("Precio total: " + monto);
        System.out.println();
    }
}
