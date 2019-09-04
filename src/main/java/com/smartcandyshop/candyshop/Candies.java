package com.smartcandyshop.candyshop;

enum candyType {
    Chocolate,
    Lollipop,
    Jellybean,
    Bubblegum,
    Marshmallow,
    Candy
}

public class Candies {
    private int ID;
    private candyType type;
    private String candyBrand;
    private Double price;

    public int getId() {
        return ID;
    }

    public candyType getType() {
        return type;
    }

    public String getCandyBrand() {
        return candyBrand;
    }

    public Candies(int ID, candyType type, String candyBrand, Double price) {
        this.ID = ID;
        this.type = type;
        this.candyBrand = candyBrand;
        this.price = price;
    }
}
