package GUI;

import Player.IPlayer;

import javax.swing.*;
import java.awt.*;
import Game.*;

public class Game extends JFrame{
    final int FRAME_HEIGHT = 600;
    final int FRAME_WIDTH = 600;
    final ImageIcon logo = new ImageIcon(".\\img\\logo.png");
    final IPlayer PLAYER1;
    final IPlayer PLAYER2;

    Header headerGUI;
    TicTacToe ticTacToeGUI;
    Footer footerGUI;

    public Game(IPlayer player1, IPlayer player2) {
        PLAYER1 = player1;
        PLAYER2 = player2;
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
        headerGUI = new Header(this,
                new Dimension(FRAME_WIDTH, 60));

        // -------------------------- BOARD ---------------------------
        ticTacToeGUI = new TicTacToe(this, PLAYER1, PLAYER2);

        // -------------------------- FOOTER --------------------------
        footerGUI = new Footer(this, new Dimension(FRAME_WIDTH, 40));

        this.add(headerGUI, BorderLayout.NORTH);
        this.add(ticTacToeGUI, BorderLayout.CENTER);
        this.add(footerGUI, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public Header getHeaderGUI() {
        return headerGUI;
    }

    public TicTacToe getTicTacToeGUI(){
        return ticTacToeGUI;
    }
}