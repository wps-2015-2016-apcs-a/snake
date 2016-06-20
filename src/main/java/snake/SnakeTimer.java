/*
 * SnakeTimer.java
 * 
 * @author 2015-2016 APCS A Block
 * @author Misha Pilipchuk
 * @author Nathan Li
 */
package snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

public class SnakeTimer implements ActionListener {

    //////////////////////////////// FIELDS ////////////////////////////////

    /**
     * {@link Window} redraw delay (in ms).
     */
    public static final int DELAY1 = 70;

    /**
     * Holds {@link Window} redraw {@link Timer}.
     */
    private Timer boardRedrawTimer;

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    public SnakeTimer() {
        boardRedrawTimer = new Timer(DELAY1, this);
        boardRedrawTimer.start();
        Game.getWindow().scoreUpdate();
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
            Game.getWindow().scoreUpdate(); // update score
        }
    }
}