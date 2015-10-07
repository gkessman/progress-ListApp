package com.github.progress.pojo;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class ListCategory{
		
	private String catName;
	private long catId;
	private List<ListItem> items = new LinkedList<ListItem>();
	
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

	public void setItems(LinkedList<ListItem> items) {
		this.items = items;
	}
}