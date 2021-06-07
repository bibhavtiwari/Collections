package com.capgemini.collectionexamples;

public class ShoppingList {
	private int itemId;
	private String itemName;
	
	public ShoppingList() {
		super();
	}

	public ShoppingList(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
