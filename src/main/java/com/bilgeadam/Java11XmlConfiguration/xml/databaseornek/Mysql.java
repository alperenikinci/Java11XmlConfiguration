package com.bilgeadam.Java11XmlConfiguration.xml.databaseornek;

public class Mysql implements ILog{
    String url;
    String username;
    @Override
    public void logToDatabase() {
        System.out.println(url + " MySQL'e loglandi");
        System.out.println("username ->>> " + username);
    }
}
