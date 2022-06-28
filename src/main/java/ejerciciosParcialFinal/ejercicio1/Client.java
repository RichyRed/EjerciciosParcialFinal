package ejerciciosParcialFinal.ejercicio1;

public class Client {
    public static void main (String []args){
        Personaje p1 = new Personaje("Barry Allen");

        IJuego warcraft = new Warcraft();
        warcraft.crearPersonaje(p1);

        warcraft = new AgrArma(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new AgrEscudo(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new AgrCuracion(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new AgrArma(warcraft);
        warcraft.agregarHabilidad(p1);
    }
}
