package ejerciciosParcialFinal.ejercicio7;

public class ServTecnico implements IEmpresa {
    private NotiPago notificacion;

    public ServTecnico(){
        notificacion = new NotiPago();
        notificacion.subscriptionOwners(new Owners("Presidente"));
        notificacion.subscriptionOwners(new Owners("Vicepresidente"));
        notificacion.subscriptionOwners(new Owners("Contabilidad"));
    }

    @Override
    public void repairLaptop(Laptop laptop) {
        System.out.println(">>> Reparando la laptop");
        laptop.showInfo();
        pagar(laptop.getPrice());
        notificacion.sendNotification();

    }

    @Override
    public void repairPC(PC pc) {
        System.out.println(">>> Reparando la PC");
        pc.showInfo();
        pagar(pc.getPrice());
        notificacion.sendNotification();
    }

    @Override
    public void repairTablet(Tablet tablet) {
        System.out.println(">>> Reparando la Tablet");
        tablet.showInfo();
        pagar(tablet.getPrice());
        notificacion.sendNotification();
    }

    public void pagar(int cantidad){
        Account.getInstance().pagar(cantidad);
    }
}
