package ejerciciosParcialFinal.ejercicio5;

public class AplicacionEscritorio implements IEmpresa2 {
    private String name;
    private String tipo;

    public AplicacionEscritorio(String name) {
        this.name = name;
        tipo = "Escritorio";
    }

    @Override
    public void iniciarSesion() {
        System.out.println(">>> Desarrollando el inicio de sesion");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Tipo de app: " + tipo);
        System.out.println();
    }

    @Override
    public void cerrarSesion() {
        System.out.println(">>> Desarrollando el cierre de sesion");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Tipo de app: " + tipo);
        System.out.println();
    }

    @Override
    public void generarDatos() {
        System.out.println(">>> Generando los datos de la app");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Tipo de app: " + tipo);
        System.out.println();
    }
}
