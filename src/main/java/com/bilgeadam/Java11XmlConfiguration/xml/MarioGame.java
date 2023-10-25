package com.bilgeadam.Java11XmlConfiguration.xml;

import lombok.ToString;

@ToString
public class MarioGame implements IGameConsole {

    public void up(){
        System.out.println("Zipla");
    }
    public void down(){
        System.out.println("Egil");
    }
    public void left(){
        System.out.println("Geri Git");
    }
    public void right(){
        System.out.println("Ileri Git");
    }


}
