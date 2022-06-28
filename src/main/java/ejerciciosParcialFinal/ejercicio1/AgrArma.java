package ejerciciosParcialFinal.ejercicio1;

import java.util.Random;

public class AgrArma extends Habilidad {
    private String[] armas = {"espada", "hacha", "escopeta"};

    public AgrArma(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println(">> Se le añadio un arma al personaje");
        int nroArma = new Random().nextInt(3);
        personaje.setArmas(armas[nroArma]);
        double nuevoAtaque = personaje.getPuntosAtaque() + 30;
        personaje.setPuntosAtaque(nuevoAtaque);
        int nuevoNivel = personaje.getNivel() * 2;
        personaje.setNivel(nuevoNivel);
        personaje.showInfo();
    }
}
