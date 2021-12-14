package Player;

import Game.BoardGUI;

public class Robot implements IPlayer{

    public String name;

    public Robot(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeMove(BoardGUI boardGUI) {

    }

}
