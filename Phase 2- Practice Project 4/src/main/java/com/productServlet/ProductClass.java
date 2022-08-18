package com.productServlet;

import java.util.ArrayList;

public class ProductClass{
	private int id;
	private String name;
	private int price;
	
	public ProductClass(int id, String name, int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public float getPrice() {
		return price;
	}
	
	public ArrayList<ProductClass> getProductDetails()
	{
		ArrayList<ProductClass> productList = new ArrayList<ProductClass>();
		 
		productList.add(new ProductClass(id, name,  price));  
		 
		 for (ProductClass s : productList) 
			{
				System.out.print("ID, Name, and Price of the product are : ");
				System.out.println(s.id + " " + s.name + " " + s.price);
			}
		return productList;
	}
}