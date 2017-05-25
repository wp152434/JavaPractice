package org.dimigo.interfaces;

public interface IDBManager {
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABAE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database){
		if(database == ORACLE_DATABASE)
			return new OracleDB();
		else if(database == SYBASE_DATABAE)
			return new SybaseDB();
		return null;
	}
}
	