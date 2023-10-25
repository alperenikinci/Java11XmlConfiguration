package com.bilgeadam.Java11XmlConfiguration.xml.databaseornek;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Postgre implements ILog{

    String url;
    String username;
    @Override
    public void logToDatabase() {
        System.out.println(url + " PostgreSQL'e loglandi");
        System.out.println("username ->>> " + username);
    }
}
