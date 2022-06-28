package ejerciciosParcialFinal.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class NotiPago implements INoti {
    private  List <IUser> receivers= new ArrayList<>();

    @Override
    public void subscriptionOwners(IUser user) {
        receivers.add(user);
    }

    @Override
    public void sendNotification() {
        for (IUser user : receivers) {
            user.update(">> Se realizo un nuevo pago");
        }
    }
}
