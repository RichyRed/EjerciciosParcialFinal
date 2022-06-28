package ejerciciosParcialFinal.ejercicio1;

public class AgrCuracion extends Habilidad {
    private String[] armas = {"espada", "hacha", "escopeta"};

    public AgrCuracion(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println(">>> Se le añadieron puntos de vida al personaje");
        double nuevaVida = personaje.getPuntosVida() + 80;
        personaje.setPuntosDefensa(nuevaVida);
        personaje.showInfo();
    }
}