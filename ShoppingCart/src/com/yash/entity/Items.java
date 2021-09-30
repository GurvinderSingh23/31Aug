package com.yash.entity;

import java.util.List;

public class Items {
    
    private Product products;
    private int productQuantity;
    private double totalPrice;

    public Items() {
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

  

    @Override
    public String toString() {
        return "Items{" + "products=" + products + ", productQuantity=" + productQuantity + ", totalPrice=" + totalPrice + '}';
    }
    
    
    
}
