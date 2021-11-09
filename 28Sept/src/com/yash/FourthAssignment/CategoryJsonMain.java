package com.yash.FourthAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.codehaus.jackson.map.ObjectMapper;

public class CategoryJsonMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		Item item1=new Item();
		item1.setItemId("ITEM001");
		item1.setItemDescription("ITEM 1 description");
		item1.setItemPrice(45000);
		
		Item item2=new Item();
		item2.setItemId("ITEM002");
		item2.setItemDescription("ITEM 2 description");
		item2.setItemPrice(25000);
		
		Item item3=new Item();
		item3.setItemId("ITEM003");
		item3.setItemDescription("ITEM 3 description");
		item3.setItemPrice(7000);
		
		Product product1=new Product();
		product1.setProductId("PROD001");
		product1.setProductName("PROD 001 Name");
		product1.setItems(Arrays.asList(new Item[] {item1,item2}));
		
		Product product2=new Product();
		product2.setProductId("PROD002");
		product2.setProductName("PROD 002 Name");
		product2.setItems(Arrays.asList(new Item[] {item3}));
		
		
		SubCategory subCategory1=new SubCategory();
		subCategory1.setSubCategoryId("SubCategory001");
		subCategory1.setSubCategoryName("SubCategory 1 Name");
		subCategory1.setProducts(Arrays.asList(new Product[] {product1}));
		
		SubCategory subCategory2=new SubCategory();
		subCategory2.setSubCategoryId("SubCategory002");
		subCategory2.setSubCategoryName("SubCategory 2 Name");
		subCategory2.setProducts(Arrays.asList(new Product[] {product2}));
		
		Category category1=new Category();
		category1.setCategoryId("Category001");
		category1.setCategoryName("Category 1 Name");
		category1.setSubCategories(Arrays.asList(new SubCategory[] {subCategory1}));
		
		Category category2=new Category();
		category2.setCategoryId("Category002");
		category2.setCategoryName("Category 2 Name");
		category2.setSubCategories(Arrays.asList(new SubCategory[] {subCategory2}));
		
		
		ObjectMapper mapper=new ObjectMapper();
		//serialization Category Json
				OutputStream os=new FileOutputStream("D:\\assignments\\File\\employees.json");
				try {
					mapper.writeValue(os, category1);
				} catch (IOException e) {
					e.printStackTrace();
				}
		//De-serialization Category Json	
				try {
				InputStream is=new FileInputStream("D:\\assignments\\File\\employees.json");
				Category category=mapper.readValue(is, Category.class);
				System.out.println(category);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				
				
	}
}
