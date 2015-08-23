package com.github.progress.pojo;

import java.util.LinkedList;
import java.util.List;

public class Lyst {
    private  List<ListItemList> list = new LinkedList<ListItemList>();
	
	public Lyst() {
		// TODO Auto-generated constructor stub
	}
	
	public List<ListItemList> getList() {
		return list;
	}
	
	public void setList(List<ListItemList> list) {
		this.list = list;
	}
}
