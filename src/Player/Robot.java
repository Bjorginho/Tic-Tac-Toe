package Player;

import Game.Brick;

public class Robot implements IPlayer{

    public String name;
    public final Brick brick;

    public Robot(String name, Brick brick){
        this.name = name;
        this.brick = brick;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeMove() {

    }

    @Override
    public Brick getBrick() {
        return brick;
    }
}
