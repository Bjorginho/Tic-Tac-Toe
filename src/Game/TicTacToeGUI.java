package Game;

import javax.swing.*;

public class TicTacToeGUI extends JFrame{
    private final int height;
    private final int width;
    private final ImageIcon logo;

    public TicTacToeGUI(int width, int height) {
        this.height = height;
        this.width = width;
        this.logo = new ImageIcon(".\\img\\logo.png");
        this.setTitle("Welcome to Tic-Tac-Toe!");               // set title
        this.setSize(width, height);                            // set size of window / frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit on close
        this.setResizable(false);                               // not resizable
        this.setIconImage(logo.getImage());                     // set icon of frame
    }

    public void draw(){
        this.setVisible(true);                                  // show frame
    }

    

}
