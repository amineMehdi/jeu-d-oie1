package goosegame;

import java.util.List;

public class Game {
    private List<Player> thePlayers;
    private Board board;

    public Game(Board board){
        this.board = board;
    }
    public void addPlayer(Player p){
        this.thePlayers.add(p);
    }
    public void playOneround(){
        //completer
    }
    public void play(){
        //completer 
    }
}