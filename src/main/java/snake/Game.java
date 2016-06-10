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
        JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        Window window = new Window();
        c.add(window);
        frame.pack();
        frame.setVisible(true);
    }
}
