package com.bilgeadam.Java11XmlConfiguration.xml;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        GameRunner gameRunner = new GameRunner(context.getBean("mygame",IGameConsole.class));
        GameRunner gameRunner = context.getBean("gamerunner", GameRunner.class);
        gameRunner.run();

    }
}
