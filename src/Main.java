import Game.Game;
import Player.IPlayer;
import Player.Player;
import Player.Robot;

public class Main {
    public static void main(String[] args) {
        IPlayer player1 = new Player("PlayerOne");
        IPlayer player2 = new Robot("AI");
        Game game = new Game(player1, player2);
        game.run();
    }
}
