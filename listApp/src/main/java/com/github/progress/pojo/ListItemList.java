package com.github.progress.pojo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ListItemList {

	private String listName;	
	private String listId;
	private List<ListCategory> listCat = new LinkedList<ListCategory>();	
	private Map<String, Object> probablywontneedthis = new HashMap<String, Object>();
		
	public ListItemList() {
     	
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
		return listCat;
	}

	public void setCategory(LinkedList listCatIn) {
		this.listCat = listCatIn;
	}

}
