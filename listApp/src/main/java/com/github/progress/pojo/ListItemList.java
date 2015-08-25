package com.github.progress.pojo;

import java.util.LinkedList;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("List")

public class ListItemList {

	@Id
	private long listId;
	
	private String listName;	
	private List<ListCategory> listCat = new LinkedList<ListCategory>();	
	
	public ListItemList() {
     	
	}
	
	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public long getListId() {
		return listId;
	}

	public void setListId(long listId) {
		this.listId = listId;
	}

	public List<ListCategory> getCategory() {
		return listCat;
	}

	public void setCategory(LinkedList<ListCategory> listCatIn) {
		this.listCat = listCatIn;
	}
}