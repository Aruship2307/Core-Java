package com.java8features;
import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamFilForech {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        // This is more compact approach for filtering data  and iterating the same data 
        System.out.println("by forEach filtering data & iterating the same");
        productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name));
        
        
        // .reduce()  takes a sequence of input elements and combines them into a single summary result by repeated operation.
         //For example, finding the sum of numbers, or accumulating elements into a list.  
        
        // This is more compact approach for filtering data  
        System.out.println("Sum calculated by reduce method");
        Float totalPrice = productsList.stream()
        		.map(product->product.price)
        		.reduce(0.0f,(sum,price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);
        
     // More precise code (used method reference)
        System.out.println("Sum calculated by reduce method with method reference");
        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
        
          
        //We can also use collectors to compute sum of numeric values.
        // Using Collectors's method to sum the prices.  
        System.out.println("Sum calculated by using Collectors method");
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
        
        // Following example finds min and max product price by using stream
        
        // max() method to get max Product price 
        
        Product productMax = productsList.stream().max((product1 , product2)
        		->product1.price>product2.price?1:-1).get();
        
        System.out.println("Max price of product: "+productMax.price);
        
        // min() method to get Min product price
        
        Product productMin = productsList.stream().min((product1 , product2)
        		->product1.price>product2.price?1:-1).get();
        
        System.out.println("Max price of product: "+productMin.price);
        
        
        // count() number of products based on the filter via Stream
        
        long count1 = productsList.stream().filter(product->product.price<30000).count();
        
        System.out.println("Count laptop price less than 30000: "+count1);
        
        long count2 = productsList.stream().count();
        
        System.out.println("Total no of laptop: "+count2);
        
     // Converting product List into Set  
        System.out.println("Converting product List into Set: ");
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
        
        // Converting Product List into a Map  
        System.out.println("Converting product List into Map: ");
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productPriceMap);  

	}

}
