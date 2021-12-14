package GUI;

import Game.Board;
import Game.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class BoardGUI extends JPanel implements MouseListener {
    public final int ROWS = 3;
    public final int COLUMNS = 3;
    public GridLayout grid;

    public BoardGUI(Board board){
        grid = new GridLayout(ROWS, COLUMNS);
        this.setLayout(grid);
        this.setBackground(Color.GRAY);
        this.addMouseListener(this);
        for(Field f : board.getBoard()){
            this.add(f);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this){
            System.out.println("Board");
        }
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