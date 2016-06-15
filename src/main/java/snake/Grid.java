/*
 * Grid.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ryan Delaney <rcdelaney0@gmail.com>
 */
package snake;

public class Grid {
    private int width, height;
    /* RED_FLAG: this is just a STUB to get things to compile. */
    public Grid(int width, int height) { this.width = width; this.height = height; }
   
    
    ///////////////////FIELDS/////////////////////
    public static final int HEIGHT = 900;
    public static final int WIDTH = 1200;
    public static final int SIZE = 8;
    
   
    if (findMoveCoordinate().getRow() == 0 || findMoveCoordinate().getRow() == 1 || 
            findMoveCoordinate().getRow() == 98 || findMoveCoordinate().getRow() == 99)
            return true;
        if (findMoveCoordinate().getCol() == 0 || findMoveCoordinate().getCol() == 1 ||
            findMoveCoordinate().getCol() == 73 || findMoveCoordinate().getCol() == 74)
            return true;
        return false;
    }
    
    public void addFood() {
        int rowFood = (int)(Math.random() + 100);
        int colFood = (int)(Math.random() + 100);
        if(grid[rowFood][colFood] == body || grid[rowFood][colFood] == head)
            addFood();
    }
}
