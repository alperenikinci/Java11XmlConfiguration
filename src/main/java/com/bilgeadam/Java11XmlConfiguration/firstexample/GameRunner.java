package com.bilgeadam.Java11XmlConfiguration.firstexample;
//Strictly coupled
//Loosely coupled
public class GameRunner {

    IGameConsole game;

    public GameRunner(IGameConsole game){
        this.game = game;
    }
    public void run(){
        System.out.println("Oyun calisiyor : " +game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
