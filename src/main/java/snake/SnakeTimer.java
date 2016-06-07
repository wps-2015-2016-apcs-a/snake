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
  ActionListener task = new ActionListener();
  
  /////////////////////////////////////CONSTRUCTOR////////////////////////////////////////
  public SnakeTimer()
  {
    
    boardRedrawTimer = new Timer(1000, task);
    paused = false;
  }
  
  ////////////////////////////////////METHODS//////////////////////////////////////////////
  
  public void actionPerformed(ActionEvent e)
  {
    //repaintBoard();               //Will be uncomented after people actually get stuff working (Jacob and Ryan's fault)
    //repaintSnake();               //Will be uncomented after people actually get stuff working (Becca and Ella's fault)
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

  public void strat()
  {

  }
}