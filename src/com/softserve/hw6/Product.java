package com.softserve.hw6;
/*Homework 6 (from 17.02.2023)
        1) Створити клас Product з такими полями: назва продукту та ціна.
        Клас повинен містити конструктор, гетери та сетери, методu toString(), equals().
        В методі main створити масив з п'яти екземплярів типу Product. Можна захардкодити, наприклад:
        Product products = {new Product("Coffee", 80), new Product("Bread", 20), ...};
        Вивести на екран продукти, які повторюються (натайпати, щоб співпадіння були).
        Для коду використати пакет com.softserve.edu.hw6
        Запушати код на github у свою вітку.*/

public class Product {
    private String Name;
    private double Price;

    public Product(String name, double price) {
        this.Name = name;
        this.Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Product) {
            Product products = (Product) o;
            return Name.equals(products.Name);
        }
        return false;}


    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Coffee", 110.25);
        products[1] = new Product("Apples", 38.75);
        products[2] = new Product("Milk", 49.99);
        products[3] = new Product("Chocolate", 50.50);
        products[4] = new Product("Coffee", 90.90);


        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    System.out.println("First repeat of the product: " + products[i]);
                    System.out.println("Second repeat of the product: " + products[j]);
                }
            }
        }
    }
}
