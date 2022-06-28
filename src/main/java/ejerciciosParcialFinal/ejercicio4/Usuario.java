package ejerciciosParcialFinal.ejercicio4;

public class Usuario {
    private String username;
    private int number;

    public Usuario(String username, int number) {
        this.username = username;
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void showInfo(){
        System.out.println("--- Info Usuario ----");
        System.out.println("Username: " + username);
        System.out.println("User number: " + number);
        System.out.println();
    }
}
