/*
 * SnakeTimer.java
 * 
 * @author 2015-2016 APCS A Block
 * @author Misha Pilipchuk
 * @author Nathan Li
 */
package snake;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class SnakeTimer implements ActionListener {

    //////////////////////////////////////FIELDS/////////////////////////////////////////////
    /**
     * Holds the delay in the thing
     */
    public static final int DELAY1 = 80;

    /**
     * Acts as the timer. Completely unnecessary given the name, but I was told to write comments
     */
    private Timer boardRedrawTimer;




    /////////////////////////////////////CONSTRUCTOR////////////////////////////////////////
    public SnakeTimer() {
        boardRedrawTimer = new Timer(DELAY1, this);
        boardRedrawTimer.start();
    }

    ////////////////////////////////////METHODS////////////////////////////////////////////////
    /**
     * Invoked when a ({@link Timer}) action occurs.
     * 
     * @param e the {@link ActionEvent}
     */
    public void actionPerformed(ActionEvent e) {
        if(Game.isRunning()) {
            Game.getSnake().move();      // move the snake
            Game.getWindow().repaint();  // repaint the window
        }
    }

}