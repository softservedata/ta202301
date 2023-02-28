package com.softserve.edu.hw6;

public class Product {

    private String itemName;
    private double price;

    public Product(String itemName ,double price){
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }

    public void setItemName(String itemName) {
    this.itemName = itemName;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item Name: " + this.itemName + "," + " Price: " + this.price;
    }

    @Override
    public boolean equals(Object name) {
        if (name instanceof Product) {
            Product product = (Product) name;
            return itemName.equals(product.itemName);
        }
        return false;
    }

    public static void main(String[] args) {
        Product[] item = new Product[5];

        item[0] = new Product("Tea", 12.25);
        item[1] = new Product("Burger", 50.99);
        item[2] = new Product("Tea", 15.50);
        item[3] = new Product("Hot Dog", 50.99);
        item[4] = new Product("Coffee", 25.75);

        for (int i = 0; i < item.length - 1; i++) {
            System.out.println("Item Name: " + item[i].getItemName() + "," + " Price: " + item[i].getPrice());
        }

        for (int i = 0; i < item.length - 1; i++) {
            for (int j = i + 1; j < item.length; j++) {
                if (item[i].equals(item[j])) {
                    System.out.println(item[i] + " == " + item[j]);
                }
            }
        }
    }
}
