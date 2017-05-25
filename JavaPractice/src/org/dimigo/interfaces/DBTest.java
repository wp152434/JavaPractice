package org.dimigo.interfaces;

public class DBTest {

	public static void main(String[] args){
		IDBManager database = IDBManager.getDBObject("ORACLE");
		crud(database);
		database = IDBManager.getDBObject("SYBASE");
		crud(database);
	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
