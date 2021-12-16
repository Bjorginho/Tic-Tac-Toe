package Game;

import Player.IPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Field extends JButton implements ActionListener {

    public int ID, X, Y;
    private Brick currentBrick;
    final ImageIcon cross = new ImageIcon(".\\img\\cross.png");
    final ImageIcon circle = new ImageIcon(".\\img\\circle.png");
    TicTacToe game;

    public Field(int id, int x, int y, Brick brick, TicTacToe game){
        ID = id;
        X = x;
        Y = y;
        this.game = game;
        currentBrick = brick;

        this.addActionListener(this);
    }

    public void setBrick(Brick brick){
        if(brick == null){
            this.setIcon(null);
        }
        currentBrick = brick;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //System.out.println("(column=" + X + ", row=" + Y + ", brick=" + currentBrick +") clicked!");

        IPlayer turn = game.getTurn();

        if(currentBrick == Brick.CROSS || currentBrick == Brick.CIRCLE){
            System.out.println("Not a valid pick");
        } else {
            ImageIcon icon;
            if(turn.getBrick() == Brick.CROSS){
                icon = cross;
            } else {
                icon = circle;
            }
            this.setBrick(turn.getBrick());
            this.setIcon(new ImageIcon(icon.getImage().getScaledInstance( this.getWidth(), this.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            game.nextRound();
        }

    }
}