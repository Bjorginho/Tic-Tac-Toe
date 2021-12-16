package Game;

import GUI.Game;
import Player.IPlayer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TicTacToe extends JPanel {
    final static int ROWS = 3;
    final static int COLUMNS = 3;
    Game game;
    IPlayer p1;
    IPlayer p2;
    ArrayList<Field> board;
    IPlayer turn;
    int round;
    Boolean finished;

    public TicTacToe(Game game, IPlayer player1, IPlayer player2){
        this.game = game;
        p1 = player1;
        p2 = player2;
        board = new ArrayList<Field>(ROWS * COLUMNS);

        this.setLayout(new GridLayout(ROWS, COLUMNS));
        newBoard();
        newGame();
    }

    public IPlayer getTurn() {
        return turn;
    }

    public void nextRound(){
        round++;
        if (turn == p1)
            turn = p2;
        else turn = p1;
        game.getHeaderGUI().updateTurn(turn);   // update GUI
        System.out.println("Round " + round);
        System.out.println(turn.getName() + " your turn!");
    }

    public void newGame(){
        round = 0;
        finished = false;
        turn = p1;
        for(Field cell : board){
            cell.setBrick(null);
        }
    }

    public void newBoard(){
        int id = 0;
        for(int row = 0; row < ROWS; row++){
            for(int column = 0; column < COLUMNS; column++){
                Field cell = new Field(id, column, row, null, this);
                this.add(cell);     // add to gui
                board.add(cell);    // add to board
                id++;
            }
        }
    }
}