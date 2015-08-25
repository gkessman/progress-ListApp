package com.github.progress.pojo;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListCategory{
		
	private String catName;
	private int catId;
	private List<ListItem> items = new LinkedList<ListItem>();
	
	public ListCategory() {
	    	
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public LinkedList<ListItem> getItems() {
		return (LinkedList<ListItem>)items;
	}

	public void setItems(LinkedList<ListItem> items) {
		this.items = items;
	}


}