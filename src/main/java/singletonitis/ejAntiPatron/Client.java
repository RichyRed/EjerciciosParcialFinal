package singletonitis.ejAntiPatron;

public class Client {

    public static void main(String[] args) {

        SoyUnicoAnti tony = SoyUnicoAnti.getSingletonInstance("Tony Stark");
        SoyUnicoAnti steve = SoyUnicoAnti.getSingletonInstance("Steve Rogers");

        System.out.println(tony.getNombre());
        System.out.println(steve.getNombre());
    }
}
