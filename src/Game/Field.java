package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Field extends JLabel implements MouseListener{

    public final int x;
    public final int y;
    private Brick currentBrick;

    public Field(int x, int y){
        this.x = x;
        this.y = y;
        this.currentBrick = null;
        this.addMouseListener(this);
    }

    public void place(Brick brick){
        this.currentBrick = brick;
    }

    public void reset(){
        this.currentBrick = null;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Cell (column=" + y + ", row=" + x + ") clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println(this.ID + " hover!");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
