package ejerciciosParcialFinal.ejercicio5;

public class WindowsPhone implements IEmpresa1 {
    private String name;
    private String OS;

    public WindowsPhone(String name) {
        this.name = name;
        OS = "WindowsPhone";
    }

    @Override
    public void login() {
        System.out.println(">>> Desarrollando Login");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Sistema operativo: " + OS);
        System.out.println();
    }

    @Override
    public void logout() {
        System.out.println(">>> Desarrollando Logout");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Sistema operativo: " + OS);
        System.out.println();
    }

    @Override
    public void reporte() {
        System.out.println(">>> Generando el deporte");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Sistema operativo: " + OS);
        System.out.println();
    }
}
