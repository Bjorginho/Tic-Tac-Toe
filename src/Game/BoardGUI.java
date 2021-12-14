package Game;

import GUI.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoardGUI extends JPanel {
    public final int NUM_ROWS = 2;
    public final int NUM_COLUMNS = 2;
    public GridLayout grid;

    public BoardGUI(){
        grid = new GridLayout(NUM_ROWS, NUM_COLUMNS);
        this.setLayout(grid);
        this.setBackground(Color.RED);

        for(int i = 0; i < NUM_ROWS * NUM_COLUMNS; i++){
            Field f = new Field(i);
            Color c = i % 2 == 0 ? Color.RED : Color.ORANGE;
            f.setBackground(c);
            this.add(f);
        }
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    }

}
