package com.semajthomasprimm.shoestore.domain;

import org.springframework.context.annotation.Scope;

import java.io.Serializable;
import java.util.List;

@Scope("singleton")
public class Cart implements Serializable {

    public Cart(){}

    private List<Product> items;
    private double priceTotal = 0.00;
    private int quantity = 0;

    // Adds item to cart
    public void addToCart(Product newItem){
        items.add(newItem);
        quantity += newItem.getQuantity();
        priceTotal += (newItem.getPrice() * newItem.getQuantity());
    }

    // Removes item from cart with id
    public void removeItem(Product item){
        // find item with item.id, remove from items
    }

    // Updates item with id
    public void updateItem(Product item){
        // if quantity changes,
    }

    // Empties cart
    public void clearCart(){
        items.clear();
        quantity = 0;
        priceTotal = 0.00;
    }

    // Returns quantity
    public int getQuantity(){
        return quantity;
    }

    // Returns total of items prices
    public double getPriceTotal(){
        return priceTotal;
    }
}
