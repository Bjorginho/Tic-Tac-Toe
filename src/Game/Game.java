package Game;

import GUI.GameGUI;
import Player.IPlayer;

import java.util.ArrayList;

public class Game {
    public final int ROWS = 3;
    public final int COLUMNS = 3;
    private IPlayer player1;
    private IPlayer player2;
    private GameGUI window;
    private boolean finished;
    private Board board;

    public Game(IPlayer player1, IPlayer player2){
        this.player1 = player1;
        this.player2 = player2;
        this.finished = false;
        this.board = new Board(new ArrayList<>(ROWS * COLUMNS), player1, player2);
    }

    private void gameLoop(){
        IPlayer turn = player1;
        window = new GameGUI(board,500, 500);
        window.draw();
    }

    public void run(){
        gameLoop();
    }
}