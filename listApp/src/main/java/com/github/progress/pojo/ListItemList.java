package com.github.progress.pojo;

import java.util.LinkedList;
import java.util.List;

public class ListItemList {

	private String listName;	
	private String listId;
	private List<ListCategory> listCat = new LinkedList<ListCategory>();	
	
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

	public LinkedList<ListCategory> getCategory() {
		return (LinkedList<ListCategory>)listCat;
	}

	public void setCategory(LinkedList<ListCategory> listCatIn) {
		this.listCat = listCatIn;
	}
}