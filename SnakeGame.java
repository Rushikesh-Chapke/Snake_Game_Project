package Snake_Game;
import javax.swing.*;
public class SnakeGame extends JFrame{
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();


        setResizable(false);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
