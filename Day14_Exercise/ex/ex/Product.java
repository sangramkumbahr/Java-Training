package com.java.ex;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Product {
	int id;  
    String name;  
    double price;
	public Product() {
		


}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
public static void main(String[] args) {
	//Comparator c= new BasicName ();
	Comparator c= new BasicPrice ();
	SortedSet<Product> products= new TreeSet<Product>(c);

	products.add(new Product(1,"Ball",1000));
	products.add(new Product(2,"Bat",3000));
	products.add(new Product(3,"Wicket",2000));
	products.add(new Product(4,"Pad",2000));
	products.add(new Product(5,"Gloves",4000));
	products.add(new Product(6,"Shoes",10000));
	products.add(new Product(7,"Socks",2000));
	products.add(new Product(8,"Gaurd",1000));
	products.add(new Product(9,"Sunglasses",5000));
	products.add(new Product(10,"Gap",1000));
	System.out.println("product list");
	for (Object object : products) {
		System.out.println(object);
		
	}
	System.out.println("the products price greater than 3000");
	for (Product product : products) {
		if(product.getPrice()>3000) {
			System.out.println(product);
		}
	}
}
}
