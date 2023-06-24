package org.example;

public class Feature {
    int price;
    float discount;

    public Feature(int price, float discount) {
        this.price = price;
        this.discount = discount;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
