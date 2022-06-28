package ejerciciosParcialFinal.ejercicio6;

import java.util.Random;

public class App implements IApp {

    @Override
    public void visitCelular(Cel celular) {
        System.out.println("Recomendacion = Aplicar mantenimiento preventivo al celular");
        celular.showInfo();
    }

    @Override
    public void visitComputadora(Compu computadora) {
        if(new Random().nextInt(20) % 2 == 0){
            System.out.println("Recomendacion = Aplicar mantenimiento preventivo a la computadora");
        } else {
            System.out.println("Recomendacion = Aplicar mantenimiento correctivo a la computadora");
        }
        computadora.showInfo();
    }

    @Override
    public void visitTelevisor(Tele televisor) {
        System.out.println("Recomendacion = Ver informacion del televisor");
        televisor.showInfo();
    }
}
