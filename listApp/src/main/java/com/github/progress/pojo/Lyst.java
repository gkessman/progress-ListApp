package com.github.progress.pojo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("List")

public class Lyst {
    @Id
	private AtomicLong listId;
	private String listName;	
	private List<ListCategory> category = new ArrayList<ListCategory>();	
	
	public Lyst(long listIdStart) {
		 listId = new AtomicLong(listIdStart);
	}
	public Lyst() {
	
	}
	
	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public AtomicLong getListId() {
		return listId;
	}

	public void setListId(AtomicLong listId) {
		this.listId = listId;
	}

	public List<ListCategory> getCategory() {
		return category;
	}

	public void setCategory(ArrayList<ListCategory> listCatIn) {
		this.category = listCatIn;
	}
	
	
	
	@Override
	public String toString(){
		return listId+":"+listName+":"+category.toString();
	}
	
}
