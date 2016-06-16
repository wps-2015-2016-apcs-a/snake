/*
 * Keyboard.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Felicia Fung
 * @author Guru Ramanathan
 */
package snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Keyboard implements KeyListener {
    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
        int id = e.getKeyCode();
        switch(id) {
            case KeyEvent.VK_UP:
                Game.getSnake().turnUp();
                break;
            case KeyEvent.VK_DOWN:
                Game.getSnake().turnDown();
                break;
            case KeyEvent.VK_LEFT:
                Game.getSnake().turnLeft();
                break;
            case KeyEvent.VK_RIGHT:
                Game.getSnake().turnRight();
                break;
            default:
                break;
        }
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
    }
    /** Handle the key typed event from the text field. */
    public void keyTyped(KeyEvent e) {
      int id = e.getKeyCode();
   
      switch(id) {
           case KeyEvent.VK_SPACE:
                Game.togglePause();
                break;
           case KeyEvent.VK_R:
              Game.newGame();
              break;
            default:
                break;
   
    }
}
}