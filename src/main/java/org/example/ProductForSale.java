package org.example;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPricedItem(int qty){
        System.out.println(qty+" qty at $"+price+" each");

    }

    public double getSalesPrice(int qty){
        return qty*price;
    }

    public abstract void showDetails();

}
