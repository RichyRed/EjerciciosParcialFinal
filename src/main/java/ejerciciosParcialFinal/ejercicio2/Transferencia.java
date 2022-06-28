package ejerciciosParcialFinal.ejercicio2;

public class Transferencia implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println(">>> PAgo por transferencia bancaria");
        double descuento = monto - monto*0.05;
        System.out.println("Precio total: " + monto + "Bs");
        System.out.println("Precio con el descuento: " + descuento + "Bs");
        System.out.println();
    }
}
