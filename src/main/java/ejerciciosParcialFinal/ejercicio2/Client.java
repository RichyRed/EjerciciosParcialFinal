package ejerciciosParcialFinal.ejercicio2;

public class Client {
    public static void main(String[] args){
        IPago efectivo = new Efectivo();

        InstAgua instalacion1 = new InstAgua(400);
        instalacion1.setPago(efectivo);
        instalacion1.pagarInstalacion();

        IPago transferencia = new Transferencia();

        InstAlcantarillado instalacion2 = new InstAlcantarillado(600);
        instalacion2.setPago(transferencia);
        instalacion2.pagarInstalacion();

        IPago tigoMoney = new TigoMoney();

        InstElectrica instalacion3 = new InstElectrica(800);
        instalacion3.setPago(tigoMoney);
        instalacion3.pagarInstalacion();

        IPago app = new Aplicacion();

        instalacion3.setPago(app);
        instalacion3.pagarInstalacion();
    }
}
