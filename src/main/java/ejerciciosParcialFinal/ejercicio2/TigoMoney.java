package ejerciciosParcialFinal.ejercicio2;

public class TigoMoney implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println(">>> Pagando mediante TigoMoney");
        double descuento = monto - monto*0.02;
        System.out.println("Precio total: " + monto + "Bs");
        System.out.println("Precio con el descuento: " + descuento + "Bs");
        System.out.println();
    }
}
