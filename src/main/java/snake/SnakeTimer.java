/*
 * SnakeTimer.java
 * 
 * @author 2015 - 2016 APCS A Block
 * @author Misha Pilipchuk <misha@pilipchuk.org>
 * @author Nathan Li <nathanli6065@gmail.com>
 */
package snake;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SnakeTimer implements ActionListener
{
    /////////////////////////////// FIELDS ///////////////////////////////
    private Timer boardRedrawTimer;
    private boolean paused;
    // ActionListener task = new ActionListener();
    public static final int DELAY1 = 8;
    
    //////////////////////////// CONSTRUCTORS ////////////////////////////
    public SnakeTimer() {
        boardRedrawTimer = new Timer(1000, this);
        paused = false;
    }
    
    /////////////////////////////// METHODS //////////////////////////////
    public void actionPerformed(ActionEvent e) {
        //repaintBoard();                   // RED_FLAG: add when people get stuff working (Jacob and Ryan)
        //repaintSnake();                   // RED_FLAG: add when people get stuff working (Becca and Ella')
    }

    /**
     * Controls timer pause and unpause.
     */
    private void theSpaceBarWasPressed() {  // 
        if (!paused) {
            paused = true;
            boardRedrawTimer.stop();
        } 
        else {
            paused = false;
            boardRedrawTimer.start();
        }
    }
    
    public int getDelay1() {
        return DELAY1;
    }
    
    public void strat() { // Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me
        boardRedrawTimer.start();
    }
    
    public void strop() { // Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me
        boardRedrawTimer.stop();
    }
}