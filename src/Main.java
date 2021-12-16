import GUI.Game;
import Player.IPlayer;
import Player.Player;
import Player.Robot;
import Game.Brick;

public class Main {
    public static void main(String[] args) {
        IPlayer player1 = new Player("PlayerOne", Brick.CROSS);
        IPlayer player2 = new Robot("PlayerAI", Brick.CIRCLE);
        new Game(player1, player2);
    }
}
