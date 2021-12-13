package Game;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public final int NUM_ROWS = 3;
    public final int NUM_COLUMNS = 3;

    public Board(){
        this.setBackground(Color.BLUE);

        for(int i = 0; i < NUM_ROWS * NUM_COLUMNS; i++){
            //TODO: Add buttons
        }
    }

}
