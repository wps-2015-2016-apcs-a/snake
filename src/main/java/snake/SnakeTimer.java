/*
 * SnakeTimer.java
 * 
 * @author 2015 - 2016 APCS A Block
 * @author Misha Pilipchuk and Nathan Li
 */

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SnakeTimer implements ActionListener
{
  //////////////////////////////////////FIELDS/////////////////////////////////////////////
  Timer boardRedrawTimer;
  boolean paused;
//  ActionListener task = new ActionListener();
  static final int DELAY1 = 8;
  
  /////////////////////////////////////CONSTRUCTOR////////////////////////////////////////
  public SnakeTimer()
  {
    boardRedrawTimer = new Timer(1000, this);
    paused = false;
  }
  
  ////////////////////////////////////METHODS//////////////////////////////////////////////
  
  public void actionPerformed(ActionEvent e)
  {
    //repaintBoard();               //Will be uncommented after people actually get stuff working (Jacob and Ryan's fault)
    //repaintSnake();               //Will be uncommented after people actually get stuff working (Becca and Ella's fault)
  }
  
  
  private void theSpaceBarWasPressed()   //Controls the pause and unpause of timer
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

  public int getDelay1()
  {
    return DELAY1;
  }

  public void strat()// Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me
  {
    boardRedrawTimer.start();
  }

  public void strop()// Yes, I do know that I misspelled it. It was very intentional. I had my reasons. Stop doubting me
  {
    boardRedrawTimer.stop();
  }


}