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


    /////////////////////////////////////CONSTRUCTOR////////////////////////////////////////
    public SnakeTimer() {
        boardRedrawTimer = new Timer(DELAY1, this);
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
     *@Override Creates an action listener that is supposed to be activated every Delay1 milliseconds
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
//        Snake.move();      //Will uncomment when Becca fixes her part (hers is commented so mine doesn't work)
    };

    /**
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