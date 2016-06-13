/*
 * Window.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Jacob Lowen
 * @author Ryan Delaney <rcdelaney0@gmail.com>
 * @author Misha Pilipchuk
 */
package snake;

import java.awt.*;
import javax.swing.*;

/**
 * The main {@link JPanel} for the Snake game.
 */
public class Window extends JPanel {

    public static final int PREFERRED_WIDTH = 800;
    public static final int PREFERRED_HEIGHT = 600;
    public static final int SIDE = 8;

    public Window() {
        setSize(getPreferredSize());
        setBackground(Color.PINK); // why not?!
        setVisible(true);
    }

    /**
     * Returns the preferred size of this container as a {@link Dimension}.
     *
     * @return the preferred size of this container
     */
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(PREFERRED_WIDTH, PREFERRED_HEIGHT);
    }

    /**
     * Paint the component using a {@link Graphics} rendering object.
     *
     * @param g the Graphics rendering object
     */
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);// paint background
        final int rows = getHeight() / SIDE, cols = getWidth() / SIDE;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row % 10 == 0 || col % 10 == 0) {
                    g.setColor(Color.GRAY);
                }
                else {
                    g.setColor(Color.BLACK);
                }
                g.drawRect(col * SIDE, row * SIDE, SIDE, SIDE);
            }
        }
    }
}