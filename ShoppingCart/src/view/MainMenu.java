package view;

import com.yash.controller.ShoppingCartController;
import com.yash.entity.Category;
import com.yash.entity.Items;
import com.yash.entity.Product;
import com.yash.entity.SubCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
    ShoppingCartController scc=new ShoppingCartController();
    List<Category> categories=scc.getCategory();
    public void mainMenu()
    {
        Map<Integer,Category> mapCategory=new HashMap<>();
        System.out.println("********************WEL-COME********************");
        System.out.println("*****************CATEGORIRES********************");
        int number1=0;
        List<Integer> numberInt=new ArrayList<>();
        for(Category category:categories)
        {
            number1++;
            mapCategory.put(number1, category);
            System.out.println(number1+". "+category.getCategoryName());
        }
       number1++;
        int cart=number1;
        System.out.println(number1+". See Cart"); 
        number1++;
        int exit1=number1;
        System.out.println(number1+". Exit");
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("=>Please choose category :");
            int selectCategory=sc.nextInt();
            if(selectCategory==cart)
            {
                viewCart();   
            }
            if(selectCategory==exit1)
            {
                System.out.println("Thank You!");
                System.exit(0);
            }
            getSubCategory(mapCategory.get(selectCategory));
        }
        catch(Exception e)
        {
            System.out.println("Input MissMatch");
        }
    }
    
    public void getSubCategory(Category category)
    {
        Map<Integer,SubCategory> mapSubCategory=new HashMap<>();
        List<SubCategory> subCategories= category.getSubCategories();
        System.out.println("*****************SUB-CATEGORIRES*******************");
        int number2=0;
       for(SubCategory subCategory:subCategories)
       {
           number2++;
           mapSubCategory.put(number2, subCategory); 
           System.out.println(number2+". "+subCategory.getSubCategoryName());
       }
       number2++;
       int cart=number2;
        System.out.println(number2+". See Cart"); 
       number2++;
       int mainMenu=number2;
        System.out.println(number2+". Main Menu/All Category");
       try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("=>Please choose Sub category :");
            int selectSubCategory=sc.nextInt();
            if(selectSubCategory==cart)
            {
                System.out.println("Thank You!");
                System.exit(0);
            }
            if(selectSubCategory==mainMenu)
            {
                mainMenu();
            }
            SubCategory subCategory=mapSubCategory.get(selectSubCategory);
            getProduct(subCategory);
        }
        catch(Exception e)
        {
            System.out.println("Input MissMatch");
        }
    }
    public void getProduct(SubCategory subCategory)
    {
        Map<Integer,Product> mapProduct=new HashMap<>();
        List<Product> products= subCategory.getProducts();
        System.out.println("*****************PRODUCTS*******************");
        int number=0;
       for(Product product:products)
       { 
           number++;
           mapProduct.put(number,product); 
           System.out.println("**********"+number+". Product **********");
           System.out.println("==>Product ID : "+product.getProductId());
           System.out.println("==>Product Name : "+product.getProductName());
           System.out.println("==>Product Descreption : "+product.getProductDescription());
           System.out.println("==>Product Price : "+product.getProductPrice());
           System.out.println();
       }
       number++;
       int addCart=number;
        System.out.println(number+". Added to cart");
       number++;
       int mainMenu=number;
        System.out.println(number+". Main Menu/All Category");
       number++;
       int exit=number;
        System.out.println(number+". Exit");        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter your Choice : ");
            int selectProduct=sc.nextInt();
            if(selectProduct==mainMenu)
            {
                mainMenu();
            }
            if(selectProduct==exit)
            {
                System.out.println("Thank You ! ");
                System.exit(0);
            }
            if(selectProduct==addCart)
            {
                System.out.println("=>Enter Product number which you want to add to Cart : ");
                int addProductNo=sc.nextInt();
                Product addProduct=mapProduct.get(addProductNo);
                System.out.println("=>Enter Quantity : ");
                int quantity=sc.nextInt();
                if(quantity<1)
                {
                    throw new RuntimeException("Enter Wrong Quantity ! ");
                    
                }
                scc.addCart(addProduct,quantity);
                System.out.println("Product Added to Cart.....");
                System.out.println("=>1. More Products to Add");
                System.out.println("=>2. Total ");
                System.out.println("Enter Your Choice : ");
                int option=sc.nextInt();
                if(option==1)
                {
                    mainMenu();
                }
                else if(option==2)
                {
                    viewCart();
                }
                else
                {
                    System.out.println("Wrong Input ! ");
                    mainMenu();
                }
                
            }
        }
    }
    public void viewCart()
    {
        Map<Integer,Items> mapProduct=new HashMap<>();
        List<Items> items=scc.getCart();
        double totalPrice=0;
        int itemNo=0;
        if(items.isEmpty())
        {
            System.out.println("No items in Cart");
            mainMenu();
        }
        for(Items item:items)
        {
            
            ++itemNo;
            System.out.println(itemNo+" Product");
            System.out.println("==>Product Id : "+item.getProducts().getProductId()); 
            System.out.println("==>Product Name : "+item.getProducts().getProductName()); 
            System.out.println("==>Product Quantity : "+item.getProductQuantity());
           System.out.println("==>Product Price : "+item.getTotalPrice());
            totalPrice=totalPrice+item.getTotalPrice();
            mapProduct.put(itemNo, item);
        }
        System.out.println("==>Total Items in Cart : "+itemNo);
        System.out.println("==>Total Price:"+totalPrice);
        System.out.println("=>1. Add more items in cart ");
        System.out.println("=>2. Delete item from cart ");
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("=>Enter ");
            int option=sc.nextInt();
            if(option==1)
            {
                mainMenu();
            }
            else if(option==2)
            {
                System.out.println("=>Enter Product");
                int product=sc.nextInt();
                Items cartItem=mapProduct.get(product);
                if(scc.deleteCart(cartItem))
                {
                    System.out.println("Item Deleted from cart");
                    viewCart();
                }
                else
                {
                    System.out.println("Item is not deleted from cart ! Error");
                    mainMenu();
                }
            }
            else
            {
                
            }
            
        }catch(InputMismatchException e)
        {
            System.out.println("Error ...");
        }
        }
        
   }
    
  
