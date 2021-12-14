package GUI;

import Game.Board;

import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame{
    private final Board initialBoard;
    private Board gameBoard;
    private final int FRAME_HEIGHT;
    private final int FRAME_WIDTH;
    private final ImageIcon logo = new ImageIcon(".\\img\\logo.png");
    private final ImageIcon cross = new ImageIcon(".\\img\\cross.png");
    private final ImageIcon circle = new ImageIcon(".\\img\\circle.png");

    private HeaderGUI headerGUI;
    private BoardGUI boardGUI;
    private FooterGUI footerGUI;

    public GameGUI(Board board, int width, int height) {
        gameBoard = board;
        initialBoard = gameBoard;
        this.FRAME_HEIGHT = height;
        this.FRAME_WIDTH = width;
        build();
    }

    private void build(){
        this.setTitle("Tic-Tac-Toe!");
        this.setIconImage(logo.getImage());
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new BorderLayout(0,5));

        // ------------- HEADER -------------
        headerGUI = new HeaderGUI(
                new Dimension(FRAME_WIDTH, 50),
                gameBoard.getPlayer1(), gameBoard.getPlayer2());

        // ------------- BOARD --------------
        boardGUI = new BoardGUI(gameBoard);

        // ------------- FOOTER -------------
        footerGUI = new FooterGUI(new Dimension(FRAME_WIDTH, 50));

        this.add(headerGUI, BorderLayout.NORTH);
        this.add(boardGUI, BorderLayout.CENTER);
        this.add(footerGUI, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void setBoard(Board board){
        gameBoard = board;
    }

}
