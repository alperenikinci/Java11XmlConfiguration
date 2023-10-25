package com.bilgeadam.Java11XmlConfiguration.firstexample;

import lombok.ToString;

@ToString
public class Pacman implements IGameConsole  {

    public void up(){
        System.out.println("Yukari Git");
    }
    public void down(){
        System.out.println("Asagi Git");
    }
    public void left(){
        System.out.println("Sola Git");
    }
    public void right(){
        System.out.println("Saga Git");
    }
}
