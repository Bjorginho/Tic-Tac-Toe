package Player;

import GUI.Game;
import Game.Brick;

public class Player implements IPlayer{

    public final String name;
    public final Brick brick;

    public Player(String name, Brick brick ){
        this.name = name;
        this.brick = brick;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeMove(Game game) {

    }

    @Override
    public Brick getBrick() {
        return brick;
    }
}
