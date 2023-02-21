package com.softserve.edu.hw6;

public class AppProduct {
    public static void main(String[] args) {
        Product []products = {
            new Product("Coffee", 30.50),
            new Product("Bread", 20.25),
            new Product("White chocolate", 85.75),
            new Product("Milk", 34.50),
            new Product("Coffee", 45.50)
        };
//  Change price for object
        products[4].setPrice(90);
// Print products
        for(int i=0; i < products.length; i+=1){
            System.out.println("Product[" + i + "] -> name: " + products[i].getName() + ", price: " + products[i].getPrice());
        }
// Check on repeated objects
        for (int i = 0; i < products.length-1; i+=1){
            for(int j = i+1; j < products.length; j+=1){
                if(products[i].equals(products[j])){
                    System.out.println("Repeated products: " + products[i] + " and " + products[j]);
                }
            }
        }
    }
}
