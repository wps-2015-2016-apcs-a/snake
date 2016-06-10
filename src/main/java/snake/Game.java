/*
 * Game.java
 *
 * @author 2015-2016 APCS A-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package snake;

import java.awt.*;
import javax.swing.*;

/**
 * Game class initializes Snake game.
 */
public class Game {

    /** Sample private field. */
    private static int privateTest;

    /**
     * Snake Game main method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("# Snake");
        JFrame window = new JFrame("Snake");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(Window.PREFERRED_WIDTH, Window.PREFERRED_HEIGHT);
        Window panel = new Window();
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
