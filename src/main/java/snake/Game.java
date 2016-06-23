/*
 * Game.java
 *
 * @author 2015-2016 APCS A-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Game class initializes Snake game.
 */
public class Game {
    
    /**
     * The three states of {@link Game}: PAUSED, RUNNING, OVER.
     */
    private enum State { PAUSED, RUNNING, OVER, };

    //////////////////////////////// FIELDS ////////////////////////////////

    /** Snake game State. */
    private static State state;
    /** Snake game {@link Window}. */
    private static Window window;
    /** Snake game {@link Grid}. */
    private static Grid grid;
    /** Snake game {@link Snake}. */
    private static Snake snake;
    /** Snake game {@link SnakeTimer}. */
    protected static SnakeTimer timer;

    //////////////////////////////// METHODS ///////////////////////////////

    public static void newGame() {
        state = State.PAUSED;
        snake = new Snake();
        grid = new Grid();
        window.repaint();
    }
    public static boolean isRunning() { return state == State.RUNNING; }
    public static void gameOver() { System.out.print("GO "); state = State.OVER; }
    public static boolean isGameOver() { return state == State.OVER; }
    public static void togglePause() {
        if (state != State.OVER)
            if (state == State.PAUSED)
                state = State.RUNNING;
            else
                state = State.PAUSED;
        System.out.print(state + " ");
    }
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
        final JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();

        // Initialize static objects window, grid, and snake.
        window = new Window();
        window.addKeyListener(new Keyboard());
        window.setFocusable(true);
        c.add(window);        
        frame.pack();
        frame.setVisible(true);

        // Start new game
        newGame();
        timer = new SnakeTimer();

        // Add ComponentAdapter to manage resizing window.
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension frameSize = frame.getSize();
                Dimension windowSize = window.getSize();
                // Find difference between frame and window.
                int diffWidth = frameSize.width - windowSize.width;    //
                int diffHeight = frameSize.height - windowSize.height; //
                Dimension preferredSize = window.getPreferredSize();
                if (windowSize.width < preferredSize.width
                    || windowSize.height < preferredSize.height) {
                    frame.setSize(
                        Math.max(frameSize.width, preferredSize.width + diffWidth),
                        Math.max(frameSize.height, preferredSize.height + diffHeight));
                }
            }
        });
    }
}
