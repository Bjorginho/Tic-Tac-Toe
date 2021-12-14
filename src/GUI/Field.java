package GUI;

import Game.Brick;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Field extends JLabel implements MouseListener {

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


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(ID);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
