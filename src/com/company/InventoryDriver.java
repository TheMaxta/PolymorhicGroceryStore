package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class InventoryDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isBrand;

        Inventory client = new Inventory();


        //this is the part of the program that will be read and written to a file. I basically just need to make an
        //object that handles all of the i/o and pass data to that object from the driver class. The driver class can handle the interaction

        client.newItem("celery",2,5.99);
        client.newItem("kleenex","facial tissue", 10, 3.99);
        client.newItem("heinz","ketchup", 4, 3.99);
        client.newItem("squirt","hand sanitizer", 100, 1.99);

        //testing:
        //client.findItem("hand sanitizer");
        //client.findBrand("squirt", "hand sanitizer");
        client.setQuantity("celery",90);
        client.printNames();

    }
}
