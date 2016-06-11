/*
 * SnakeTimer.java
 * 
 * @author 2015 - 2016 APCS A Block
 * @author Misha Pilipchuk <misha@pilipchuk.org>
 * @author Nathan Li <nathanli6065@gmail.com>
 */


package snake;



import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SnakeTimer implements ActionListener {

    //////////////////////////////////////FIELDS/////////////////////////////////////////////
    /**
     * Holds the delay in the thing
     */
    static final int DELAY1 = 70;

    /**
     * Acts as the timer. Completely unnecessary given the name, but I was told to write comments
     */
    Timer boardRedrawTimer;

    /**
     * Holds whether or not the game is actively paused
     * True- it is
     * False- it isn't
     */
    boolean paused;

    /**
     *
     */
    ActionListener task = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //repaintBoard();               //Will be uncommented after people actually get stuff working (Jacob and Ryan's fault)
            //repaintSnake();               //Will be uncommented after people actually get stuff working (Becca and Ella's fault)
        }
    };

    /////////////////////////////////////CONSTRUCTOR////////////////////////////////////////
    public SnakeTimer() {
        boardRedrawTimer = new Timer(DELAY1, task);
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

    public void actionPerformed(ActionEvent e) {};

    /**
     * @return Delay between the refreshes
     */
    public static int getDelay1() {return DELAY1;}

    /**
     * This is the start method
     *
     * Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me. I have reasons.
     */
    public void starta()   {boardRedrawTimer.start();}

    /**
     * This is the stop method
     *
     * Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me. I have reasons.
     */
    public void stopa()   {boardRedrawTimer.stop();}


}