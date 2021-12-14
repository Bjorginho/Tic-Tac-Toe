package GUI;

import Game.Board;

import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame{
    private Board gameBoard;
    private final int FRAME_HEIGHT;
    private final int FRAME_WIDTH;
    private final ImageIcon logo = new ImageIcon(".\\img\\logo.png");
    private final ImageIcon cross = new ImageIcon(".\\img\\cross.png");
    private final ImageIcon circle = new ImageIcon(".\\img\\circle.png");

    public GameGUI(Board board, int width, int height) {
        this.gameBoard = board;
        this.FRAME_HEIGHT = height;
        this.FRAME_WIDTH = width;
        printInfo();
        build();
    }

    private void build(){
        this.setTitle("Welcome to Tic-Tac-Toe!");               // set title
        this.setIconImage(logo.getImage());                     // set icon of frame
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);                // set size of window / frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit on close
        this.setResizable(false);                               // not resizable
        this.setLayout(new BorderLayout(0,5));

        // header
        JPanel headerContainer = new JPanel();
        headerContainer.setBackground(Color.GRAY);
        headerContainer.setPreferredSize(new Dimension(FRAME_WIDTH, 50));
        // header: Content
        JLabel header = new JLabel("Tic-Tac-Toe!");
        JLabel playerNames = new JLabel(gameBoard.getPlayer1().getName() + " vs " + gameBoard.getPlayer2().getName());
        //headerContainer.setLayout(new BoxLayout(headerContainer, BoxLayout.PAGE_AXIS));
        headerContainer.add(header);
        headerContainer.add(playerNames);
        //headerContainer.setAlignmentY(Component.CENTER_ALIGNMENT);
        //headerContainer.setAlignmentX(Component.CENTER_ALIGNMENT);

        // tic tac to board
        JPanel board = new JPanel();
        board.setBackground(Color.RED);
        board.setPreferredSize(new Dimension(FRAME_WIDTH, 50));

        // Panel with buttons
        JPanel footer = new JPanel();
        footer.setBackground(Color.GRAY);
        footer.setPreferredSize(new Dimension(FRAME_WIDTH, 50));

        this.add(headerContainer, BorderLayout.NORTH);
        this.add(board, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);
    }

    public void updateBoard(){

    }

    public void draw() {

        this.setVisible(true);                                  // show frame
    }

    private void printInfo(){
        System.out.println(gameBoard.getPlayer1().getName() + " vs " + gameBoard.getPlayer2().getName());
        System.out.println("FrameSize:\nHeight: " + FRAME_HEIGHT + "\nWidth: " + FRAME_WIDTH);
    }
}
