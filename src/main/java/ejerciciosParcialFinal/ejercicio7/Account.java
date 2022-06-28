package ejerciciosParcialFinal.ejercicio7;

public class Account {
    private static Account account;
    private int saldo;

    private Account(){
        saldo = 0;
        System.out.println();
        System.out.println("Iniciar el saldo: " + saldo);
    }

    private synchronized static void  multiThreadControl(){
        if (account == null)
            account = new Account();
    }

    public static Account getInstance(){
        if(account == null)
            multiThreadControl();
        return account;
    }

    public synchronized void pagar(int cantidad){
        saldo = saldo + cantidad;
        System.out.println("Pagando " + cantidad + " Bs por la reparacion");
        System.out.println("Su saldo actual es de: " + saldo);
        System.out.println();
    }
}
