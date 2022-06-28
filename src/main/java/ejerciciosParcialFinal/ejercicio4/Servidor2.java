package ejerciciosParcialFinal.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor {
    private List<Usuario> listOfUsers;

    public Servidor2() {
        listOfUsers = new ArrayList<>();
    }

    @Override
    public void userLogin(Usuario user) {
        listOfUsers.add(user);
    }

    @Override
    public void atenderUsuarios() {
        for (Usuario user:listOfUsers) {
            System.out.println("Servidor2 esta con el usuario " + user.getNumber());
            user.showInfo();
        }
    }
}
