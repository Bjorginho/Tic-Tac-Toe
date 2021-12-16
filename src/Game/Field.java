package Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Field extends JButton implements ActionListener {

    public int ID, X, Y;
    private Brick currentBrick;
    private ImageIcon icon;
    final ImageIcon cross = new ImageIcon(".\\img\\cross.png");
    final ImageIcon circle = new ImageIcon(".\\img\\circle.png");

    public Field(int id, int x, int y, Brick brick){
        ID = id;
        X = x;
        Y = y;
        currentBrick = brick;
        this.addActionListener(this);
    }

    public void setBrick(Brick brick){
        currentBrick = brick;
    }

    public void reset(){
        currentBrick = null;
        this.setIcon(null);
    }

    public Brick getBrick(){
        return currentBrick;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cell (column=" + X + ", row=" + Y + ")");

        if(currentBrick == Brick.CROSS){
            icon = cross;
        }
        else if(currentBrick == Brick.CIRCLE){
            icon = circle;
        }
        else
            return;

        this.setIcon(new ImageIcon(icon.getImage().getScaledInstance( this.getWidth(), this.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
    }
}