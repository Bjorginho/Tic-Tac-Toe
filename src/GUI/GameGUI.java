package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameGUI extends JFrame{
    private final int FRAME_HEIGHT;
    private final int FRAME_WIDTH;
    private final ImageIcon logo = new ImageIcon(".\\img\\logo.png");
    private final ImageIcon cross = new ImageIcon(".\\img\\cross.png");
    private final ImageIcon circle = new ImageIcon(".\\img\\circle.png");

    public GameGUI(int width, int height) {
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

        JPanel header = new JPanel();
        header.setBackground(Color.BLUE);
        header.setSize(FRAME_WIDTH / 2, FRAME_HEIGHT / 8);

        JPanel board = new JPanel();
        board.setBackground(Color.CYAN);
        board.setSize((int) (0.65 * FRAME_WIDTH), (int) (0.65 * FRAME_WIDTH));
        board.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hei");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Hover");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Bye");
            }
        });

        JPanel footer = new JPanel();
        footer.setBackground(Color.RED);

        this.add(header);
        this.add(board);
        this.add(footer);
    }

    public void draw() {

        this.setVisible(true);                                  // show frame
    }

    private void printInfo(){
        System.out.println("FrameSize:\nHeight: " + FRAME_HEIGHT + "\nWidth: " + FRAME_WIDTH);
    }
}
