package Game;


import Player.IPlayer;

import java.util.ArrayList;

public class Board {

    private ArrayList<Field> board;
    private IPlayer player1;
    private IPlayer player2;

    public Board(ArrayList<Field> board, IPlayer player1, IPlayer player2){
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;

        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                Field cell = new Field(row, column);
                board.add(cell);
            }
        }
    }

    public ArrayList<Field> getBoard() {
        return board;
    }

    public IPlayer getPlayer1() {
        return player1;
    }

    public IPlayer getPlayer2() {
        return player2;
    }

}
