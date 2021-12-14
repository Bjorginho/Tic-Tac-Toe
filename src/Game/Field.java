package Game;

import Game.Brick;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Field extends JLabel {

    public final int ID;
    private Brick currentBrick;

    public Field(int id){
        this.ID = id;
        this.currentBrick = null;
    }

    public void place(Brick brick){
        this.currentBrick = brick;
    }

    public void reset(){
        this.currentBrick = null;
    }
}
