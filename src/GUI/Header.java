package GUI;

import Player.IPlayer;

import javax.swing.*;
import java.awt.*;

public class Header extends JPanel{

    Game game;
    IPlayer turn;
    JPanel container;
    JLabel playerTurnText;

    public Header(Game game, Dimension dim){
        this.game = game;
        turn = null;
        this.setPreferredSize(dim);
        build();
    }

    private void build(){

        container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        JLabel playersText = new JLabel(game.PLAYER1.getName() + "(" + game.PLAYER1.getBrick() + ") vs " + game.PLAYER2.getName() + "(" + game.PLAYER2.getBrick() + ")");
        playersText.setFont(new Font("Consolas", Font.BOLD, 22));

        JPanel footer = new JPanel();
        JLabel turnText = new JLabel("Turn: ");
        playerTurnText = new JLabel();
        playerTurnText.setFont(new Font("Verdana", Font.BOLD, 12));
        footer.add(turnText);
        footer.add(playerTurnText);

        container.add(playersText);
        container.add(footer);

        this.add(container);
    }

    public void updateTurn(IPlayer player){
        System.out.println(player.getName() + " your turn!");
        turn = player;
        playerTurnText.setText(turn.getName());
    }
}