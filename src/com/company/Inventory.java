package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Inventory {
    ArrayList<Item> stock = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    //Future; Create polymorphic method that allows a client to pass any argument to edit any attribute of the object
    public void addStdItems(){}

    public void customItem(){
        boolean isBrand;
        String user_name;
        String user_brand = "";
        int user_quantity;
        double user_price;
        System.out.println("Is the item a brand?");
        isBrand = input.nextBoolean();
        input = new Scanner(System.in);
        if (isBrand){
            System.out.println("Enter brand name: ");
            user_brand = input.nextLine();
        }
        System.out.println("Enter Item Name: ");
        user_name = (String) input.nextLine();
        System.out.println("Enter Item Quantity: ");
        user_quantity = input.nextInt();
        System.out.println("Enter Item Price: ");
        user_price = input.nextDouble();
        System.out.println("");
        if(isBrand){
            newItem(user_name, user_quantity, user_price);
        } else {
            newItem(user_brand, user_name, user_quantity, user_price);
        }
    }

    public void newItem(String name, int quantity, double price){
        stock.add(new Item(name,quantity,price));
    }

    public void newItem(String brand, String name, int quantity, double price){
        stock.add(new Brand(brand, name, quantity, price));
    }

    //set quantity
    //to set a new quantity we need an index for the item and a new quantity
    public void printNames(){
        for (int i = 0; i < stock.size(); i++){
            System.out.println(stock.get(i).getName());
            System.out.println(stock.get(i).getQuantity());
            System.out.println(stock.get(i).getPrice());
        }
    }
    
    public int findItem(String name){
        int index = -1;
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getName().equals(name)){
                System.out.println("Found our item!");
                System.out.println(i);
                index = i;
            }
        }
        //returns -1 if not found
        return index;
    }

    public int findBrand(String brand, String name){
        int index = -1;
        Brand brands;
        for (int i = 0; i < stock.size(); i++) {
            //only runs on brand items and when getBrand returns the specified name
            if (stock.get(i) instanceof Brand && (((Brand) stock.get(i)).getBrand().equals(brand))){
                //second check to make sure the items name is also right
                if (stock.get(i).getName().equals(name)){
                    System.out.println("Found our Branded item!");
                    index = i;
                }
            }
        }
        return index;
    }
    
    public void setQuantity(String name, int new_quantity){
        int index = findItem(name);
        Item item = stock.get(index);
        item.setQuantity(new_quantity);
    }

    public void setQuantity(String brand, String name, int new_quantity){
        int index = findBrand(brand, name);
        Brand item = (Brand) stock.get(index); //just remember to cast item to brand
        item.setQuantity(new_quantity);
    }

    public void setPrice(String name, int new_price){
        int index = findItem(name);
        Item item = (Item) stock.get(index);
        item.setPrice(new_price);
    }
    public void setPrice(String brand, String name, int new_price){
        int index = findBrand(brand, name);
        Brand item = (Brand) stock.get(index);
        item.setPrice(new_price);
    }

    // get price
    public double getPrice(String name){
        int index = findItem(name);
        Item item = (Item) stock.get(index);
        return item.getPrice();
    }
    public double getPrice(String brand, String name){
        int index = findBrand(brand, name);
        Brand item = (Brand) stock.get(index);
        return item.getPrice();
    }

}
