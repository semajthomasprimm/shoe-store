package com.semajthomasprimm.shoestore.domain;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

    private int id = 0;
    private String name;
    private List<String> sizes;
    private int quantity = 1;
    private double price;
    private String description;

    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSizes() {
        return sizes;
    }

    public void setSizes(List<String> sizes) {
        this.sizes = sizes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String formatPrice(double price){
        return "$" + String.format("%,.2f", price);
    }

}
