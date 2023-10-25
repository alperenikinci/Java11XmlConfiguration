package com.bilgeadam.Java11XmlConfiguration.firstexample;

public class SuperContra implements IGameConsole{
    @Override
    public void up() {
        System.out.println("SC Zipla");
    }

    @Override
    public void down() {
        System.out.println("SC Egil");
    }

    @Override
    public void left() {
        System.out.println("SC Geri git");
    }

    @Override
    public void right() {
        System.out.println("SC Ileri git");
    }
}
