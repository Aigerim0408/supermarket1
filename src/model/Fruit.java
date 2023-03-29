package model;

public class Fruit {
    private String name;
    private int price;
    private int qolich;

    public Fruit(String name, int price, int qolich) {
        this.name = name;
        this.price = price;
        this.qolich = qolich;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQolich() {
        return qolich;
    }

    public void setQolich(int qolich) {
        this.qolich = qolich;
    }

}
