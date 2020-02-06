package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Item {

	@Id
	private String itemId;
	private String  itemName;
	private double  itemPrice;
	private Product product;
	
	public Item(String itemId, String itemName, double itemPrice, Product product) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.product = product;
	}
	
	
}
