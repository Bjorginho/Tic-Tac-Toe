package Game;

public class TicTacToe {
    public TicTacToe() {

    }

    public void start(){
        TicTacToeGUI gui = new TicTacToeGUI(500, 500);
        gui.draw();
    }
}