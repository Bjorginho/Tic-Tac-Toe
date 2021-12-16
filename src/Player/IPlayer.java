package Player;

import GUI.Game;
import Game.Brick;

public interface IPlayer {

    public String getName();

    public void makeMove(Game game);

    public Brick getBrick();

}
