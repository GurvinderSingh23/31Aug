package com.yash.controller;

import com.yash.entity.Category;
import com.yash.entity.Items;
import com.yash.entity.Product;
import com.yash.repository.ShoppingCartRepository;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartController {
    
     ShoppingCartRepository scr=new ShoppingCartRepository();
    public List<Category> getCategory()
    {
       
         return scr.getCategorys();
       }
    public void addCart(Product product,int quantity)
    {
       scr.selectedItems(product, quantity);
    }
    public List<Items> getCart()
    {
        return scr.getCart();
    }
    public boolean deleteCart(Items item)
    {
        return scr.deleteItem(item);
    }
    
}
