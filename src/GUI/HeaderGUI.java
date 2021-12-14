package GUI;

import Player.IPlayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HeaderGUI extends JPanel implements MouseListener {

    public String player1;
    public String player2;
    private JPanel container;

    public HeaderGUI(Dimension dim, IPlayer p1, IPlayer p2){
        player1 = p1.getName();
        player2 = p2.getName();
        this.setPreferredSize(dim);

        container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.addMouseListener(this);

        JLabel players = new JLabel(player1 + " vs " + player2);
        players.setFont(new Font("Consolas", Font.BOLD, 36));
        container.add(players);

        this.add(container);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==container){
            System.out.println("Clicker Header");
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
