package GUI;

import Game.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoardGUI extends JPanel {
    public final int NUM_ROWS = 3;
    public final int NUM_COLUMNS = 3;
    public GridLayout grid;

    public BoardGUI(){
        grid = new GridLayout(NUM_ROWS, NUM_COLUMNS);
        this.setBackground(Color.BLUE);
        this.setLayout(grid);

        /*for(int i = 0; i < NUM_ROWS * NUM_COLUMNS; i++){
            Field f = new Field(i);
            Color c = i % 2 == 0 ? Color.RED : Color.ORANGE;
            f.setBackground(c);
            this.add(f);
        }*/
    }

}
