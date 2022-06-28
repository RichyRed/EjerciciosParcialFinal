package ejerciciosParcialFinal.ejercicio1;

public class AgrEscudo extends Habilidad {

    public AgrEscudo(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println(">>> Se le añadio escudo al personaje");
        double nuevaDefensa = personaje.getPuntosDefensa() + 35;
        personaje.setPuntosDefensa(nuevaDefensa);
        double nuevaArmadura = personaje.getPorcentajeArmadura()+ 10;
        personaje.setPorcentajeArmadura(nuevaArmadura);
        personaje.showInfo();
    }
}
