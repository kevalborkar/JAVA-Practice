package com.practice.others;

class Database {
	
	static Database db = null;
	private Database() {
		System.out.println("Object Created");
		
	}
	public static Database getDbObject() {
		if(db==null) {
			db = new Database();
		}
		return db;
	}
}
public class FactroryMethods {

	public static void main(String[] args) {
		Database db1 = Database.getDbObject();
		System.out.println(db1);
	}

}
