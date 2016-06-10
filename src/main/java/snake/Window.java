/*
 * Window.java
 *
 * @author 2015-2016 APCS A-Block
 */
package snake;

import java.awt.*;
import javax.swing.*;

public class Window extends JPanel {
    /** The main {@link Jframe}. */
    private JFrame f;
    /** The main {@link JPanel}. */
    private JPanel p;
    
    public Window() {
        create();
    }
    
     public void paintComponent(Graphics g) {
        // createGrid();
        // RED_FLAG: where do these numbers come from?
        super.paintComponent(g);
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 75; j++) {
                if (i == 0 || i == 99 || j == 0 || j == 74) {
                    //g.setColor(Color.GRAY);
                    g.drawRect(i * 8, j * 8, 8, 8);
                }
                else {
                    //g.setColor(Color.BLACK);
                    g.drawRect(i * 8, j * 8, 8, 8);
                }
            }
        }
    }

    public void create() {
        f = new JFrame("test");
        f.setVisible(true);
        f.setSize(800, 600);
        
        p = new JPanel();
        p.setBackground (Color.WHITE);

        f.add(p);
    }
    
    public static void main(String[] args) {
        new Window();
    }
}