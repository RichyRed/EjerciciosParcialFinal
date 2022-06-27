package singletonitis.ejAntiPatron;

public class SoyUnicoAnti {

    private String nombre;
    private static SoyUnicoAnti soyUnico;

    public SoyUnicoAnti(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static SoyUnicoAnti getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new SoyUnicoAnti(nombre);
        }
        return soyUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
