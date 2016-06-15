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
    public static final int DELAY1 = 70;

    /**
     * Acts as the timer. Completely unnecessary given the name, but I was told to write comments
     */
    private Timer boardRedrawTimer;

    /**
     * Holds whether or not the game is actively paused
     * True- it is
     * False- it isn't
     */
    private boolean paused;


    /////////////////////////////////////CONSTRUCTOR////////////////////////////////////////
    public SnakeTimer() {
        boardRedrawTimer = new Timer(DELAY1, this);
        boardRedrawTimer.start();
        paused = false;
    }

    ////////////////////////////////////METHODS////////////////////////////////////////////////
    /**
     *  Controls the pause and unpause of time
     *
     */
    private void theSpaceBarWasPressed()
    {
        if(paused == false)
        {
            paused = true;
            boardRedrawTimer.stop();
        }
        else
        {
            paused = false;
            boardRedrawTimer.start();
        }
    }

    /**
     * Invoked when a ({@link Timer}) action occurs.
     * 
     * @param e the {@link ActionEvent}
     */
    public void actionPerformed(ActionEvent e) {
        Game.getSnake().move();      // move the snake
        Game.getWindow().repaint();  // repaint the window
    };

    /**
     * RED_FLAG: why is this accessor needed? DELAY1 is a static final
     * @return Delay between the refreshes
     */
    public static int getDelay1() {return DELAY1;}

    /**
     * This is the start method
     *
     * Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me. I have reasons.
     */
    public void strart()   {boardRedrawTimer.start();}

    /**
     * This is the stop method
     *
     * Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me. I have reasons.
     */
    public void strop()   {boardRedrawTimer.stop();}


}