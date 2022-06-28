package ejerciciosParcialFinal.ejercicio7;

public class Client {
    public static void main(String[] args){
        ServTecnico servicio = new ServTecnico();

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repairLaptop(new Laptop("Pequeña", 200));
            }
        });

        hilo1.start();

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repairTablet(new Tablet("Mediana", 450));
            }
        });

        hilo2.start();

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repairPC(new PC("Grande", 600));
            }
        });

        hilo3.start();
    }
}
