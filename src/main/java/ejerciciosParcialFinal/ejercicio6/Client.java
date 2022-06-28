package ejerciciosParcialFinal.ejercicio6;

public class Client {
    public static void main(String[] args){
        App aplicacion = new App();

        Cel celular = new Cel("Samsung Note9", 130);
        Compu computadora = new Compu("Lenovo", 10);
        Tele televisor = new Tele("Samsung algo", 85);

        aplicacion.visitCelular(celular);
        aplicacion.visitComputadora(computadora);
        aplicacion.visitTelevisor(televisor);
    }
}
