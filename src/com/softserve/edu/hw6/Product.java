package com.softserve.edu.hw6;

import java.util.Objects;
import java.util.Scanner;

public class Product {                                    //creates new class "Product"
    private String productName;                          //creates new string field: "Product Name"
    private double price;                                // creates new number field: "Price"

    public Product(String productName, double price) {  //constructor to initialize objects
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {                    //getter which returns "Product Name" variable
        return productName;
    }

    public void setProductName(String productName) {  //setter which set "Product Name" value
        this.productName = productName;
    }

    public double getPrice() {                         //getter which returns "Price" variable
        return price;

    }

    public void setPrice(double price) {              //setter which set "Price" value
        this.price = price;
    }

    @Override //overrides method of string class
    public String toString() {
        return "Product Name: " + productName + "," + " Price: " + price;
    }


    @Override
    public boolean equals(Object o) {

        if (o instanceof Product) {
            Product product = (Product) o;
            return productName.equals(product.productName);
        }
        return false;

    }


    public static void main(String[] args) {  //creates new array
        Product[] products = new Product[5];

        products[0] = new Product("Bread", 10.99);
        products[1] = new Product("Wine", 25.49);
        products[2] = new Product("Coffee", 5.99);
        products[3] = new Product("Water", 17.99);
        products[4] = new Product("Wine", 15.09);

        for (int i = 0; i < products.length - 1; i++) {  //loop
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    System.out.println("Found a repeated product 1: " + products[i]);
                    System.out.println("Found a repeated product 2: " + products[j]);
                }
            }
        }


    }
}