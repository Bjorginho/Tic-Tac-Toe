package Game;

import Player.IPlayer;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JPanel {
    final static int ROWS = 3;
    final static int COLUMNS = 3;
    Brick nextBrick;

    public TicTacToe(IPlayer p1, IPlayer p2){

        this.setLayout(new GridLayout(ROWS, COLUMNS));
        int id = 0;
        for(int row = 0; row < ROWS; row++){
            for(int column = 0; column < COLUMNS; column++){
                Field cell = new Field(id, column, row, null);
                this.add(cell);
                id++;
            }
        }
    }

    public Field getField(int id){
        return null; //board.getField(id);
    }

    public void registerAction(Field field, IPlayer player){

    }

    public void nextBrick(Brick brick){
        nextBrick = brick;
    }

    }