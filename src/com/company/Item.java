package com.company;

public class Item {
    String name;
    int quantity;
    double price;

    public Item(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public void setQuantity(int new_quantity){
        this.quantity = new_quantity;
    }
    public void setPrice(double new_price){
        this.price = new_price;
    }
    public void setName(String new_name){
        this.name = new_name;
    }

    public void printName(){
        System.out.println(this.name);
    }


   // public void setAttribute(Enum new_attr){
       // if (new_attr instanceof java.lang.String)
        //method should be able to set any attribute whether it be an int, double or string
   // }
}
