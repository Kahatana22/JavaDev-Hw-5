package org.example.entities;

public class PrintProjectPrice {
    private String id;
    private int price;

    public PrintProjectPrice(String id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PrintProjectPrice{" +
                "id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
