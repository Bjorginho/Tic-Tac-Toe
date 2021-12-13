package Game;

import GUI.GameGUI;
import Player.IPlayer;

public class Game {

    private IPlayer player1;
    private IPlayer player2;
    private GameGUI window;
    private boolean finished = false;
    private IPlayer turn;

    public Game(IPlayer player1, IPlayer player2){
        this.player1 = player1;
        this.player2 = player2;

        this.turn = player1;

    }

    public void start(){
        window = new GameGUI(700, 700);
        window.draw();
    }

}
