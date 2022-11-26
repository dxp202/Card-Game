import panel.GameBoard;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private int height,width;
    private GameBoard game;

    /**
     * 主方法
     * @param height
     * @param width
     */
    Main(int height, int width) {
        this.height = height;
        this.width = width;

        setTitle("Card Game");
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screensize.width;
        int screenHeight = screensize.height;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setBounds(screenWidth / 2 - width / 2, screenHeight / 2 - height / 2, width, height);
        setLayout(null);
        setVisible(true);
        game=new GameBoard(width,height);
        game.Init();

        getContentPane().add(game);


    }

    public static void main(String[] args) {
        new Main(1000, 1500);
    }
}
