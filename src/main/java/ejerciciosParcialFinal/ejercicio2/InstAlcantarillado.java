package ejerciciosParcialFinal.ejercicio2;

public class InstAlcantarillado implements Instalacion {
    private IPago pago;
    private int precio;

    public InstAlcantarillado(int precio) {
        this.precio = precio;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    @Override
    public void pagarInstalacion() {
        System.out.println("--- Pagando por la instalacion alcantarillado");
        pago.pagar(precio);
    }
}
