package com.github.progress.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;
import org.bson.json.JsonReader;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.github.progress.pojo.ListCategory;
import com.github.progress.pojo.ListItem;
import com.github.progress.pojo.Lyst;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoDatabase;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class ListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    final Morphia morphia = new Morphia();
    private String password = "pr0gr3ss";
    
    MongoClient mc = new MongoClient("www.namsek.info",27999);
    private Datastore datastore;  
    private Gson gson = new Gson();
    private JsonObject jsonObject;
    private long listId;
    @Override
    public void init(ServletConfig config){
    	
    	datastore = morphia.createDatastore(mc, "listDB" ,"admin",pwd ); 
    	morphia.mapPackage("com.github.progress.pojo");
    //will need to query mongo for current max list id and set atomic long to this value
    listId = 0;
    }
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String listId = req.getParameter("getList");
		// quey based on list id 
		//write 
		pw.println("The reasonable man adapts himself to the world: the unreasonable one persists in trying to adapt the world to himself. Therefore all progress depends on the unreasonable man.");
        pw.println("- George Bernard Shaw, Man and Superman ");
        pw.println("---------------------------------------------");
        pw.println("-Current Collections for listDB ");
        DB mbd = datastore.getDB();
        pw.println(mbd.getCollectionNames());
        
        final Query<Lyst> query = datastore.createQuery(Lyst.class);
        final List<Lyst> result = query.asList();
        pw.println("---------------------------------------------");
        pw.println("-Current List Contents ");
        pw.println(result.toString());
        
	}
	 

	private String getBody(HttpServletRequest req) throws IOException{
		StringBuilder buffer = new StringBuilder();
        BufferedReader reader = req.getReader();
        String line;       
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        
        String data = buffer.toString();
        return data;
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		String data = getBody(req);
	    jsonObject = new JsonParser().parse(data).getAsJsonObject();
	    JsonElement jse =  (JsonElement)jsonObject;
	    Enumeration<String> params = req.getParameterNames();     
	    Lyst list = new Lyst(listId);
	    ListCategory listCat = new ListCategory(0);
	    ListItem listItem = new ListItem(0);
	    while(params.hasMoreElements()){
         
        	switch(params.nextElement()){
        	 case "addList":
//        		 Type collectionType = new TypeToken<Collection<ListCategory>>(){}.getType();
        		 list = gson.fromJson(jse, Lyst.class);     
	         break;
              
	         case "addCategory":
	        	 listCat = gson.fromJson(jse, ListCategory.class);  
	         break;
	         case "updateCatagory":
	        	 //pass in list id , cat-id, updated text 
	        	 //	        	 
	        	 listCat = gson.fromJson(jse, ListCategory.class);  
	         break;
        	 case "addItem":
	        	 listItem = gson.fromJson(jse, ListItem.class);   
	         break;
	         
	         case "deleteList":
	         
	         break;
	         
	         case "deleteCatagory":
	        	 
	         break;
	         
	         case "deleteItem":
	       
	         break;
       
        	}        
       
        }
	
		PrintWriter pw = resp.getWriter();
		pw.println(list.toString());
		datastore.save(list);
		

	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		super.doPut(req, resp);
	}

}


