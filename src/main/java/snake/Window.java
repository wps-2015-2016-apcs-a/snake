/*
 * Window.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Jacob Lowen
 * @author Misha Pilipchuk
 */
package snake;

import java.awt.*;
import javax.swing.*;

/**
 * The main {@link JPanel} for the Snake game.
 */
public class Window extends JPanel {

    //////////////////////////////// FIELDS ////////////////////////////////

    public static final int PREFERRED_WIDTH = 960;  // 80 grid squares
    public static final int PREFERRED_HEIGHT = 720; // 60 grid squares
    public static final int SIDE = 12;  // number of pixels in a grid square
    public static final int BORDER = 2; // number of grid squares
    private static JLabel scoreBox;
    private static JLabel instructionBox;
    private static String scoreKeep;
    private static int scoreKeeper;

    ///////////////////////////// CONSTRUCTORS ////////////////////////////

    public Window() {
        setSize(getPreferredSize());
        setBackground(Color.PINK); // why not?!
        setVisible(true);
        instructionBox = new JLabel();
        instructionBox.setSize(getWidth(), 10);
        instructionBox.setLocation(0,730);
        instructionBox.setForeground(Color.WHITE);
        instructionBox.setText("Press 'space bar' to start and pause, 'r' to restart, arrows to move");
        scoreBox = new JLabel();
        scoreBox.setSize(getWidth(),10);
        scoreBox.setLocation(0,0);
        scoreBox.setForeground(Color.WHITE);
        this.add(instructionBox);
        this.add(scoreBox);
    }

    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Updates the score.
     */
    public void scoreUpdate() {
        scoreKeeper = Game.getSnake().getScore();
        scoreKeep = "Score: " + scoreKeeper;
        scoreBox.setText(scoreKeep);
    }

    /**
     * Returns the preferred size of this container as a {@link Dimension}.
     *
     * @return the preferred size of this container
     */
    @Override
    public Dimension getPreferredSize() {
        if (Game.getSnake() == null || Game.getGrid() == null) {
            return new Dimension(PREFERRED_WIDTH, PREFERRED_HEIGHT);
        }
        else {
            // Find maximum width & height values.
            int maxX = Game.getGrid().getFood().getCol();
            int maxY = Game.getGrid().getFood().getRow();
            for (Coordinate coordinate : Game.getSnake().getSnake()) {
                maxX = Math.max(maxX, coordinate.getCol());
                maxY = Math.max(maxY, coordinate.getRow());
            }
            int maxWidth = (maxX + 1 + BORDER * 2) * SIDE;
            int maxHeight = (maxY + 1 + BORDER * 2) * SIDE;
            return new Dimension(maxWidth, maxHeight);
        }
    }

    /**
     * Returns the minimum size of this container as a {@link Dimension}.
     *
     * @return the minimum size of this container
     */
    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    /**
     * Returns the {@link Grid} size as a {@link Dimension}.
     *
     * @return the Grid size
     */
    public Dimension getGridSize() {
        return new Dimension(getSize().width / SIDE - 2 * BORDER, getSize().height / SIDE - 2 * BORDER);
    }

    private void drawSegment(Graphics g, Coordinate segment, Color color) {
        assert segment != null : "segment == null";
        int row = segment.getRow(), col = segment.getCol();
        g.setColor(color);
        g.fillRect((col + BORDER) * SIDE, (row + BORDER) * SIDE, SIDE, SIDE);
        g.setColor(Color.WHITE);
        g.drawRect((col + BORDER) * SIDE, (row + BORDER) * SIDE, SIDE, SIDE);
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
        // System.out.printf("%s, %s; ", getWidth(), getHeight());
        // Draw the grid.
        final int rows = getHeight() / SIDE, cols = getWidth() / SIDE;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row < BORDER || row >= rows - BORDER || col < BORDER || col >= cols - BORDER ) {
                    g.setColor(Color.LIGHT_GRAY);
                    g.fillRect(col * SIDE, row * SIDE, SIDE, SIDE);
                }
                else {
                    g.setColor(Color.BLACK);
                    g.drawRect(col * SIDE, row * SIDE, SIDE, SIDE);
                }
            }
        }
        assert Game.getSnake() != null : "snake == null";
        // Draw snake.
        for (Coordinate segment : Game.getSnake().getSnake()) {
            int row = segment.getRow(), col = segment.getCol();
            g.setColor(Color.BLACK);
            g.fillRect((col + BORDER) * SIDE, (row + BORDER) * SIDE, SIDE, SIDE);
            g.setColor(Color.WHITE);
            g.drawRect((col + BORDER) * SIDE, (row + BORDER) * SIDE, SIDE, SIDE); 
        }
        // Change head to red if dead. 
        if (Game.isGameOver()) {
            drawSegment(g, Game.getSnake().getHead(), Color.RED);
        }
        // Draw food.
        drawSegment(g, Game.getGrid().getFood(), Color.GREEN);
    }
}
