package GUI;

import Player.IPlayer;

import javax.swing.*;
import java.awt.*;
import Game.*;

public class Game extends JFrame{
    final int FRAME_HEIGHT = 600;
    final int FRAME_WIDTH = 600;
    final ImageIcon logo = new ImageIcon(".\\img\\logo.png");
    IPlayer p1;
    IPlayer p2;

    Header headerGUI;
    TicTacToe ticTacToeGUI;
    Footer footerGUI;

    public Game(IPlayer player1, IPlayer player2) {
        p1 = player1;
        p2 = player2;
        build();
    }

    private void build(){
        this.setTitle("Tic-Tac-Toe!");
        this.setIconImage(logo.getImage());
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new BorderLayout(0,5));

        // -------------------------- HEADER --------------------------
        headerGUI = new Header(
                new Dimension(FRAME_WIDTH, 60), p1, p2);

        // -------------------------- BOARD ---------------------------
        ticTacToeGUI = new TicTacToe(p1, p2);

        // -------------------------- FOOTER --------------------------
        footerGUI = new Footer(new Dimension(FRAME_WIDTH, 40));

        this.add(headerGUI, BorderLayout.NORTH);
        this.add(ticTacToeGUI, BorderLayout.CENTER);
        this.add(footerGUI, BorderLayout.SOUTH);

        this.setVisible(true);
    }
}