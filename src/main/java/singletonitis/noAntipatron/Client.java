package singletonitis.noAntipatron;

public class Client {

    public static void main(String[] args) {

        SoyUnico tony = SoyUnico.getSingletonInstance("Tony Stark");
        SoyUnico steve = SoyUnico.getSingletonInstance("Steve Rogers");

        System.out.println(tony.getNombre());
        System.out.println(steve.getNombre());
    }
}
