package com.company;

public class Brand extends Item{

    String brand;

    public Brand(String brand, String name, int quantity, double price) {
        super(name, quantity, price);
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }
}
