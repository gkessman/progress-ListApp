package com.github.progress.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class ListCategory{
		
	private String catName;
	private AtomicLong catId;
	private List<ListItem> items = new ArrayList<ListItem>();
	
	public ListCategory(long catIdStart) {
		 catId = new AtomicLong(catIdStart);
	}
	
	public ListCategory() {
	    	
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public AtomicLong getCatId() {
		return catId;
	}

	public void setCatId(AtomicLong catId) {
		this.catId = catId;
	}

	public List<ListItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<ListItem> items) {
		this.items = items;
	}
	
	@Override
	public String toString(){
		return catId+":"+catName+":"+items.toString();
	}
	
	
}