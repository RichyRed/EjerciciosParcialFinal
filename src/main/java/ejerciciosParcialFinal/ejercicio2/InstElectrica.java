package ejerciciosParcialFinal.ejercicio2;

public class InstElectrica implements Instalacion {
    private IPago pago;
    private int precio;

    public InstElectrica(int precio) {
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
        System.out.println("--- Pagando por la instalacion electrica");
        pago.pagar(precio);
    }
}
