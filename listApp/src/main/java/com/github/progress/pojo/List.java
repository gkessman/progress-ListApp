package com.github.progress.pojo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class List {

	private String listName;	
	private String listId;
	private LinkedList category;	
	private Map<String, Object> probablywontneedthis = new HashMap<String, Object>();
		
	public List() {
     	
	}
	
	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public LinkedList getCategory() {
		return category;
	}

	public void setCategory(LinkedList category) {
		this.category = category;
	}

}
