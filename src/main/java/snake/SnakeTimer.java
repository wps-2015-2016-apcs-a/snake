/*
 * SnakeTimer.java
 * 
 * @author 2015-2016 APCS A Block
 * @author Misha Pilipchuk
 * @author Nathan Li
 */
package snake;

import java.awt.event.*;
import javax.swing.*;

public class SnakeTimer implements ActionListener {

    //////////////////////////////// FIELDS ////////////////////////////////

    /**
     * Holds the delay in the thing.
     */
    public static final int DELAY1 = 80;

    /**
     * Holds {@link Window} redraw {@link Timer}.
     */
    private Timer boardRedrawTimer;

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    public SnakeTimer() {
        boardRedrawTimer = new Timer(DELAY1, this);
        boardRedrawTimer.start();
    }

    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Invoked when a ({@link Timer}) action occurs.
     * 
     * @param e the {@link ActionEvent}
     */
    public void actionPerformed(ActionEvent e) {
        if (Game.isRunning()) {
            Game.getSnake().move();     // move the snake
            Game.getWindow().repaint(); // repaint the window
        }
    }
}