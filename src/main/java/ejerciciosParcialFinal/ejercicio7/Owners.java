package ejerciciosParcialFinal.ejercicio7;

public class Owners implements IUser {
    String cargo;

    public Owners(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void update(String msg) {
        System.out.println("Tienes una nueva notificacion > " + cargo);
        System.out.println(msg);
    }
}
