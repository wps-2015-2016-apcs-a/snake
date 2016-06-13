/*
 * Grid.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ryan Delaney <rcdelaney0@gmail.com>
 */
package snake;

public class Grid {
    private Grid[][] grid = new Grid[100][75]; // RED_FLAG: where do these numbers come from?
    Grid space = null;
    Grid wall;
    Grid body;
    Grid head;
    Grid food;
    
    ///////////////////FIELDS/////////////////////
    public static final int HEIGHT = 600;
    public static final int WIDTH = 800;
    public static final int SIZE = 8;
    public static final int SQRHEIGHT = (HEIGHT / SIZE);
    public static final int SQRWIDTH = (WIDTH / SIZE);
    
    public void createGrid() {
        for (int i = 0; i < SQRWIDTH; i++) {
            for (int j = 0; j < SQRHEIGHT; j++) {
                if (i == 0 || i == (SQRWIDTH - 1) || j == 0 || j == (SQRHEIGHT - 1)) {
                    grid[i][j] = wall;
                }
                else {
                    grid[i][j] = space;
                }
            }
        }
    }
    public void addFood() {
        int rowFood = (int)(Math.random() + 100);
        int colFood = (int)(Math.random() + 100);
        if(grid[rowFood][colFood] == body || grid[rowFood][colFood] == head)
            addFood();
    }
}
