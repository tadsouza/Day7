package com.capgemini.core.assignment;

class Product
{
	private int id;
	private String name;
	private float price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, float price) {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public boolean equals(Object obj) 
	{
		Product product3 = (Product)obj;
		
//		char[] name1 = name.toCharArray();
//		char[] name2 = product.getName().toCharArray();
//		
//		if(name1.length != name2.length)
//			return false;
//		
//		for (int index = 0; index < name2.length; index++) 
//		{
//			if(name1[index] != name2[index])
//				return false;
//		}
//		
//		return true;
		
//		return id == product.getId();
		return name.equals(product3.getName());
	}
	
	@Override
	public int hashCode() 
	{
		return id;
	}
	
//	@Override
//	public String toString() 
//	{
//		return "Author: Amit Mahadik";
//	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ "]";
	}
	
	static int counter = 0;
	
	@Override
	protected void finalize() throws Throwable 
	{	
		counter++;
		//System.out.println("Finalize is called");
	}
}

public class ObjectClassMethods 
{
	public static void main(String[] args) 
	{
		Product product1 = new Product(101, "LG TV", 34000);
		Product product2 = new Product(102, "Onida IRON", 900);
		Product product3 = new Product(101, "LG TV", 34000);
		
		//to check object unique identity
//		System.out.println("product1 hashCode = " + product1.hashCode());
//		System.out.println("product2 hashCode = " + product2.hashCode());
//		System.out.println("product3 hashCode = " + product3.hashCode());
		
//		String str1 = "Hello World";
//		String str2 = "Hello World";
//		
		//comparing objects to detech meaningfully equal objects
//		System.out.println(		str1.equals(str2)		);
		
//		System.out.println(		product1.equals(product3)		);
		
		
		//printing the object itself (Getting string representation of the object)
//		System.out.println(product1);
		
		//attempting to call finalize method by deleting object
		product2 = null;
		
		for (int count = 0; count < 10000000; count++) 
		{
			new Product(101, "sdkfhs", 347384738);
		}
		
		System.out.println("Object deletion count " + Product.counter);
	
	}
}
