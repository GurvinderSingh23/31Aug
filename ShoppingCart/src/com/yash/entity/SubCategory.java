package com.yash.entity;

import java.util.List;

public class SubCategory {
    
    private String subCategoryId;
    private String subCategoryName;
    private List<Product> products;

    public SubCategory() {
    }

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

 

    
    
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "SubCategory{" + "subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName + ", products=" + products + '}';
    }
    
    
    
}
