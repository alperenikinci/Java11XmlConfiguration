package com.bilgeadam.Java11XmlConfiguration.xml.databaseornek;

public class DatabaseService {
    ILog database;

    public DatabaseService(ILog database){
        this.database = database;
    }

    public void logToDatabase(){
        database.logToDatabase();
    }
}
