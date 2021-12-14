package Player;

import GUI.BoardGUI;

public class Player implements IPlayer{

    public final String name;

    public Player(String name){
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
