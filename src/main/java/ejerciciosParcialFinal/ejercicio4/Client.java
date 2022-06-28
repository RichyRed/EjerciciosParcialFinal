package ejerciciosParcialFinal.ejercicio4;

public class Client {
    public static void main(String[] args){
        IServidor proxy = new Proxy();

        proxy.userLogin(new Usuario("tony3000", 16));
        proxy.userLogin(new Usuario("steve1", 5));
        proxy.userLogin(new Usuario("clint77", 45));
        proxy.userLogin(new Usuario("natasha9", 22));

        proxy.atenderUsuarios();
    }
}
