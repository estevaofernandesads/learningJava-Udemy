package org.example.Projects.Product_Constructor;

import org.example.Projects.Produto.Product;

public class ProductConstruct {

    public String name;
    public double price;
    public int quantity;

    public ProductConstruct(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return String.format("%s, $%.2f, %d unidade, Total: $ %.2f", name, price, quantity, totalValueInStock());
    }

}
