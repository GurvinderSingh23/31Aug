package com.yash.repository;

import com.yash.entity.Category;
import com.yash.entity.Items;
import com.yash.entity.Product;
import com.yash.entity.SubCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCartRepository {
    
    public List<Category> getCategorys()
    {
        Product p111=new Product();
        p111.setProductId("CAT001-SCAT001-PRD001");
        p111.setProductName("iPhone 13 pro max");
        p111.setProductDescription("New iPhone pro max 2021 Having"+"\n"
                + "RAM-6GB , Rom-128GB "+"\n"
                + "Very low budget Phone");
        p111.setProductPrice(13999.00);
        Product p112=new Product();
        p112.setProductId("CAT001-SCAT001-PRD002");
        p112.setProductName("OnePlus 9 Pro 5G");
        p112.setProductDescription("New 1+ 9 pro 5G 2021 Having"+"\n"
                + "RAM-6GB , Rom-128GB "+"\n"
                + "Very low budget Phone");
        p112.setProductPrice(10999.00);
        Product p113=new Product();
        p113.setProductId("CAT001-SCAT001-PRD003");
        p113.setProductName("Samsung Galaxy Z Series Fold3");
        p113.setProductDescription("New Samsung Galaxy Z Series Fold3 "+"\n"
                + "RAM-12GB , Rom-256GB "+"\n"
                + "Phantom Black, Smartphone");
        p113.setProductPrice(12999.00);
        SubCategory sc11=new SubCategory();
        sc11.setSubCategoryId("CAT001-SCAT001");
        sc11.setSubCategoryName("Mobile/SmartPhones");
        sc11.setProducts(Arrays.asList(p111,p112,p113));
        
        Product p121=new Product();
        p121.setProductId("CAT001-SCAT002-PRD001");
        p121.setProductName("Mi 108 cm");
        p121.setProductDescription("New Mi 108 cm 2021 Having"+"\n"
                + "43 inches "+"\n"
                + " Horizon Edition Full HD Android LED TV");
        p121.setProductPrice(17999.00);
        Product p122=new Product();
        p122.setProductId("CAT001-SCAT002-PRD002");
        p122.setProductName("SAMSUNG Curv LED");
        p122.setProductDescription("New Samsung 138 cm 2021 Having"+"\n"
                + "55 inch "+"\n"
                + "  Ultra HD (4K) Curved LED Smart TV");
        p122.setProductPrice(110999.00);
        
        Product p123=new Product();
        p123.setProductId("CAT001-SCAT002-PRD003");
        p123.setProductName("SVu Masterpiece 215 cm");
        p123.setProductDescription("New Samsung 138 cm 2021 Having"+"\n"
                + "85 inch "+"\n"
                + "  QLED Ultra HD (4K) Smart Android TV  (85QPX)");
        p123.setProductPrice(99999.00);
        SubCategory sc12=new SubCategory();
        sc12.setSubCategoryId("CAT001-SCAT002");
        sc12.setSubCategoryName("LCD/LED");
        sc12.setProducts(Arrays.asList(p121,p122,p123));
        
        Product p131=new Product();
        p131.setProductId("CAT001-SCAT003-PRD001");
        p131.setProductName("SAMSUNG 253 L Refrigerator");
        p131.setProductDescription("New SAMSUNG 253 L Refrigerator"+"\n"
                + "  SAMSUNG 253 L Frost Free Double Door 3 Star Refrigerator");
        p131.setProductPrice(13459.00);
        Product p132=new Product();
        p132.setProductId("CAT001-SCAT003-PRD002");
        p132.setProductName(" Godrej 236 L Refrigerator");
        p132.setProductDescription("New  Godrej 236 L Refrigerator"+"\n"
                + "  Frost Free Double Door 2 Star Refrigerator  (Sleek Steel, RF EON 236B 25 HI SI ST)");
        p132.setProductPrice(9959.00);
        SubCategory sc13=new SubCategory();
        sc13.setSubCategoryId("CAT001-SCAT003");
        sc13.setSubCategoryName("Refrigerator");
        sc13.setProducts(Arrays.asList(p131,p132));
        
        Product p141=new Product();
        p141.setProductId("CAT001-SCAT004-PRD001");
        p141.setProductName(" Panasonic Air-Conditioner");
        p141.setProductDescription("New Panasonic Air-Conditioner"+"\n"
                + " Panasonic 2 Ton 3 Star Split Inverter AC with Wi-fi Connect");
        p141.setProductPrice(30999.00);
        Product p142=new Product();
        p142.setProductId("CAT001-SCAT004-PRD002");
        p142.setProductName(" Whirlpool Air-Conditioner");
        p142.setProductDescription("New Whirlpool Air-Conditioner"+"\n"
                + " Whirlpool 4 in 1 Convertible Cooling 1.5 Ton 5 Star Split Inverter AC - White");
        p142.setProductPrice(16999.00);
        
        SubCategory sc14=new SubCategory();
        sc14.setSubCategoryId("CAT001-SCAT004");
        sc14.setSubCategoryName("AC/Cooler");
        sc14.setProducts(Arrays.asList(p141,p142));
        
       Category c1=new Category();
       c1.setCategoryId("CAT001");
       c1.setCategoryName("Electronics");
       c1.setSubCategories(Arrays.asList(sc11,sc12,sc13,sc14));
       
       
       Product p211=new Product();
       p211.setProductId("CAT002-SCAT001-PRD001");
       p211.setProductName("Girls Top");
       p211.setProductDescription("Girls Casual Denim Blue Top ");
       p211.setProductPrice(250.00);
       Product p212=new Product();
       p212.setProductId("CAT002-SCAT001-PRD002");
       p212.setProductName("Girls Top");
       p212.setProductDescription("Casual Regular Sleeves Printed Women Pink Top");
       p212.setProductPrice(225.00);
       
       SubCategory sc21=new SubCategory();
       sc21.setSubCategoryId("CAT002-SCAT001");
       sc21.setSubCategoryName("Girls");
       sc21.setProducts(Arrays.asList(p211,p212));
       
       Product p221=new Product();
       p221.setProductId("CAT002-SCAT002-PRD001");
       p221.setProductName("Levis Boy jeans");
       p221.setProductDescription("Tapered Fit Boys Blue Jeans");
       p221.setProductPrice(655.00);
       Product p222=new Product();
       p222.setProductId("CAT002-SCAT002-PRD002");
       p222.setProductName("Levis Boy jeans"); 
       p222.setProductDescription("Boot Cut Boys Black Jeans");
       p222.setProductPrice(755.00);
       Product p223=new Product();
       p223.setProductId("CAT002-SCAT002-PRD003");
       p223.setProductName("Mens Shirt"); 
       p223.setProductDescription("Men Slim Fit Solid Spread Collar Casual Shir");
       p223.setProductPrice(225.00);
       Product p224=new Product();
       p224.setProductId("CAT002-SCAT002-PRD004");
       p224.setProductName("Mens T-Shirt"); 
       p224.setProductDescription("Striped Men Round Neck Dark Blue T-Shirt");
       p224.setProductPrice(175.00);
      SubCategory sc22=new SubCategory();
       sc22.setSubCategoryId("CAT002-SCAT002");
       sc22.setSubCategoryName("Boys");
       sc22.setProducts(Arrays.asList(p221,p222,p223,p224));
       
       Product p231=new Product();
       p231.setProductId("CAT002-SCAT003-PRD001");
       p231.setProductName("ADIDAS UNISEX SHOES");
       p231.setProductDescription("Nova flow Black/Blue color shoes ");
       p231.setProductPrice(1099.00);
       Product p232=new Product();
       p232.setProductId("CAT002-SCAT003-PRD002");
       p232.setProductName("Bata Women Shoes"); 
       p232.setProductDescription("Statix Women Blue Running Shoes");
       p232.setProductPrice(455.00);
       
       SubCategory sc23=new SubCategory();
       sc23.setSubCategoryId("CAT002-SCAT003");
       sc23.setSubCategoryName("Shoes");
       sc23.setProducts(Arrays.asList(p231,p232));
       
       Category c2=new Category();
       c2.setCategoryId("CAT002");
       c2.setCategoryName("Clothes And Style");
       c2.setSubCategories(Arrays.asList(sc21,sc22,sc23));
       
       
       Product p311=new Product();
       p311.setProductId("CAT003-SCAT001-PRD001");
       p311.setProductName("Sports Watch For Men");
       p311.setProductDescription("G843 G-Shock ( GWG-1000-1A1DR ) Analog-Digital Watch - For Men ");
       p311.setProductPrice(5999.00);
       Product p312=new Product();
       p312.setProductId("CAT003-SCAT001-PRD002");
       p312.setProductName("Casual Watch For Men"); 
       p312.setProductDescription("Casual, Dress/Formal, Luxury, Skeleton Forsining Analog Watch - For Men");
       p312.setProductPrice(3999.00);
       SubCategory sc31=new SubCategory();
        sc31.setSubCategoryId("CAT003-SCAT001");
        sc31.setSubCategoryName("Watches");
        sc31.setProducts(Arrays.asList(p311,p312));
        
        Product p321=new Product();
       p321.setProductId("CAT003-SCAT002-PRD001");
       p321.setProductName("Ray-Ban EyeGlasses");
       p321.setProductDescription("Polarized Clubmaster Sunglasses (54)  (For Men & Women, Green)");
       p321.setProductPrice(4499.00);
       Product p322=new Product();
       p322.setProductId("CAT003-SCAT002-PRD002");
       p322.setProductName("Ray-Ban UV Protect"); 
       p322.setProductDescription("UV Protection Over-sized Sunglasses (54)  (For Men & Women, Brown)");
       p322.setProductPrice(4299.00);
        SubCategory sc32=new SubCategory();
        sc32.setSubCategoryId("CAT003-SCAT002");
        sc32.setSubCategoryName("EyeGlasses/Specs");
        sc32.setProducts(Arrays.asList(p321,p322));
        Category c3=new Category();
       c3.setCategoryId("CAT005");
       c3.setCategoryName("Accesories");
       c3.setSubCategories(Arrays.asList(sc31,sc32));
       
       
       return Arrays.asList(new Category[] {c1,c2,c3});
        
    }
    private List<Items> items=new ArrayList<>();
    public void selectedItems(Product product,int quantity)
    {
        Items item=new Items();
        item.setProducts(product);
        item.setProductQuantity(quantity);
        item.setTotalPrice(quantity*product.getProductPrice());
        items.add(item);
    }
    public List<Items> getCart()
    {
        return items;
    }
    public boolean deleteItem(Items item)
    {
        return items.remove(item);
    }
    
            
}
