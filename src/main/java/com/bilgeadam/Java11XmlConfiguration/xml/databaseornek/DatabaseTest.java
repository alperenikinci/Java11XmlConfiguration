package com.bilgeadam.Java11XmlConfiguration.xml.databaseornek;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1- Postgre ve MySQL siniflarimiz olsun.
    2- DatabaseService sinifimiz olsun.
    3- Postgre ve MySQL'de loglama metodu olsun ->>> (Postgreye loglandi , MySQL'e loglandi)
    4- DatabaseService'de logToDatabase metodumuz olsun. Bu metot da hangi DB'i kullaniyorsak onun log metoduna erissin.
    5- Bunun icin bir databaseContext.xml yazalim ve DB'test sinifinda testimizi gerceklestirelim.
 */
public class DatabaseTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("databaseContext.xml");
        DatabaseService service = context.getBean("service", DatabaseService.class);
        service.logToDatabase();
    }

}
