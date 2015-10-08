package com.github.progress.pojo;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class ListCategory{
		
	private String catName;
	private long catId;
	private List<ListItem> items = new ArrayList<ListItem>();
	
	public ListCategory() {
	    	
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public long getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public List<ListItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<ListItem> items) {
		this.items = items;
	}
}