package com.github.progress.Utils;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MorphiaMapper {
	final Morphia morphia = new Morphia();
	
	public MorphiaMapper() {
	
	}
	
	public void morphiaMapClass(String packageName){
		morphia.mapPackage(packageName);
	}

	public Datastore  morphiaSetDataStore (String databaseName){
        Datastore datastore = morphia.createDatastore(new MongoClient(), databaseName);	
        return datastore;
	}




}
