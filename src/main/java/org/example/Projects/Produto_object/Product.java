package org.example.Projects.Produto_object;

public class Product {

    public String name;
    public double price;
    public int quantity;

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
