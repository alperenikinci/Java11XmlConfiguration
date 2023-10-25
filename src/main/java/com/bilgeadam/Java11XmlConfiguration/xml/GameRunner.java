package com.bilgeadam.Java11XmlConfiguration.xml;

//Strictly coupled
//Loosely coupled
public class GameRunner {

    IGameConsole game;

    public GameRunner(IGameConsole game){
        this.game = game;
    }
    public void run(){
        System.out.println("Oyun calisiyor : " +game.getClass().getSimpleName());
        System.out.println("Hash : "+ game.hashCode());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
