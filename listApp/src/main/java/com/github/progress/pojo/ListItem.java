package com.github.progress.pojo;

import org.mongodb.morphia.annotations.Embedded;
@Embedded	
public class ListItem{

	private String itemName;
	private long itemId;
	private boolean status;
	
	public ListItem(){
	
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString(){
		return itemId+":"+itemName+":"+status;
	}
}