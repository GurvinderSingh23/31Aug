package com.yash.SecondAssignmentItem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


public class SerializeDeserializeItem {
	public static void main(String[] args) {
		//Put data into file items.dat(Serializable)	
		try(
				OutputStream os=new FileOutputStream("D:\\File\\items.dat");
				ObjectOutputStream oos=new ObjectOutputStream(os);
			   ){
				
	           	Item i1=new Item(101,"Iphone",12,22000.50,20);
	           	oos.writeObject(i1);
	           	Item i2=new Item(102,"BlackBerry",5,11500.50,20);
	           	oos.writeObject(i2);
				System.out.println("Item Data put .....");
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		//Read Data from items.dat(Deserializable)
		List<Item> itemList=new ArrayList<>();
		try(
				InputStream is=new FileInputStream("D:\\File\\items.dat");
				ObjectInputStream ois=new ObjectInputStream(is)
				)
		{
			while(is.available()!=0)
			{
				Item ss=(Item)ois.readObject();
				itemList.add(ss);
			}
			
			for(Item item:itemList)
			{
				System.out.println("Item Id: "+item.getItemId());
				System.out.println("Item Description : "+item.getItemDescription());
				System.out.println("Item Quantity Available : "+item.getItemQuantityAvailable());
				System.out.println("Item Unit Price : "+item.getItemUnitPrice());
				System.out.println("Item Discount : "+item.getItemDiscountPercentage());
			}
		
			
		}
		catch(IOException | ClassNotFoundException  e)
		{
			e.printStackTrace();
		}
		
		}

}
