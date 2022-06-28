package ejerciciosParcialFinal.ejercicio7;

public class PC implements ICompu {
    private String size;
    private int price;

    public PC(String size, int price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showInfo(){
        System.out.println("--- Info de la pc ----");
        System.out.println("Tamaño: " + size);
        System.out.println("Precio de reparacion: " + price);
    }
}