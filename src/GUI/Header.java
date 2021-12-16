package GUI;

import Player.IPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Header extends JPanel implements MouseListener {

    IPlayer player1;
    IPlayer player2;
    IPlayer turn;
    Dimension dimension;
    JPanel container;
    JLabel playersText;
    JLabel turnText;
    JLabel playerTurnText;

    public Header(Dimension dim, IPlayer p1, IPlayer p2){
        dimension = dim;
        player1 = p1;
        player2 = p2;
        turn = p1;
        build();
    }

    private void build(){
        this.setPreferredSize(dimension);

        container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.addMouseListener(this);

        playersText = new JLabel(player1.getName() + "(" + player1.getBrick() + ") vs " + player2.getName() + "(" + player2.getBrick() + ")");
        playersText.setFont(new Font("Consolas", Font.BOLD, 22));

        JPanel footer = new JPanel();
        turnText = new JLabel("Turn: ");
        playerTurnText = new JLabel(turn.getName());
        playerTurnText.setFont(new Font("Verdana", Font.BOLD, 12));
        footer.add(turnText);
        footer.add(playerTurnText);

        container.add(playersText);
        container.add(footer);

        this.add(container);
    }

    public void updateTurn(IPlayer player){
        turn = player;
        playerTurnText.setText(turn.getName());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==container){
            System.out.println("Clicker Header");
            updateTurn(player2);
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
