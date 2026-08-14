package org.example.Projects.Product_incapsulamento;

public class ProductIncapsulamento {

    private String name;
    private double price;
    private int quantity;

    // ------------------------USING CONSTRUCTOR DEFAULT-----------------
    public ProductIncapsulamento(){
    }
    // ------------------------USING CONSTRUCTOR DEFAULT-----------------
    public ProductIncapsulamento(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // ------------------------USING CONSTRUCTOR OVERLOADING-----------------

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int  getQuantity(){
        return quantity;
    }

    /*
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    */

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