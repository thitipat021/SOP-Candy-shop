package com.smartcandyshop.candyshop;

public class CandyFactory {
    public Candies createChoco(int ID, String candyBrand, Double price){
        return new Candies(ID,candyType.Chocolate,candyBrand,price);
    }

    public Candies createLoli(int ID, String candyBrand, Double price){
        return new Candies(ID,candyType.Lollipop,candyBrand,price);
    }

    public Candies createJelly(int ID, String candyBrand, Double price){
        return new Candies(ID,candyType.Jellybean,candyBrand,price);
    }

    public Candies createBubble(int ID, String candyBrand, Double price){
        return new Candies(ID,candyType.Bubblegum,candyBrand,price);
    }

    public Candies createMello(int ID, String candyBrand, Double price){
        return new Candies(ID,candyType.Marshmallow,candyBrand,price);
    }

    public Candies createCandy(int ID, String candyBrand, Double price){
        return new Candies(ID,candyType.Candy,candyBrand,price);
    }
}
