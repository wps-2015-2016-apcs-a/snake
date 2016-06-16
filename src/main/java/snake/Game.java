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

    /** Snake game {@link Window}. */
    private static Window window;
    /** Snake game {@link Grid}. */
    private static Grid grid;
    /** Snake game {@link Snake}. */
    private static Snake snake;
    /** Snake game {@link SnakeTimer}. */
    protected static SnakeTimer timer;

    /**
     * Holds whether or not the game is actively paused
     * True- it is
     * False- it isn't
     */
    public static boolean isPaused;

    /**
     * Returns {@link Window} object for this Snake game.
     *
     * @return Window object for this Snake game
     */
    public static Window getWindow() { return window; }
    /**
     * Returns {@link Grid} object for this Snake game.
     *
     * @return Grid object for this Snake game
     */
    public static Grid getGrid() { return grid; }
    /**
     * Returns {@link Snake} object for this Snake game.
     *
     * @return Snake object for this Snake game
     */
    public static Snake getSnake() { return snake; }
    /**
     * Returns {@link SnakeTimer} object for this Snake game.
     *
     * @return SnakeTimer object for this Snake game
     */
    public static SnakeTimer getSnakeTimer() { return timer; }

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

        // Initialize static objects window, grid, and snake.
        window = new Window();
        Dimension gridSize = window.getGridSize();
        grid = new Grid((int) gridSize.getWidth(), (int) gridSize.getHeight());
        snake = new Snake();
        timer = new SnakeTimer();

        window.addKeyListener(new Keyboard());
        window.setFocusable(true);
        c.add(window);        
        frame.pack();
        frame.setVisible(true);
    }
}
