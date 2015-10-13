package com.github.progress.pojo;

import java.util.concurrent.atomic.AtomicLong;

import org.mongodb.morphia.annotations.Embedded;
@Embedded	
public class ListItem{

	private String itemName;
	private AtomicLong itemId;
	private boolean status;
	
	public ListItem(long itemIdStart){
		itemId = new AtomicLong(itemIdStart);
	}
	
	public ListItem(){
	
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public AtomicLong getItemId() {
		return itemId;
	}

	public void setItemId(AtomicLong itemId) {
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