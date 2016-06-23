/*
 * Grid.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ryan Delaney <rcdelaney0@gmail.com>
 */
package snake;

public class Grid {
       
///////////////////CONSTRUCTOR////////////////    
    public Grid(int width, int height) { this.width = width; this.height = height; addFood();}

///////////////////FIELDS/////////////////////
    
    private int width, height;
    /* RED_FLAG: this is just a STUB to get things to compile. */
    public static final int BORDER = 2;
    private Coordinate food;
    
    
    ///////////////////METHODS////////////////////
    public int getGridHeight(){
        return (Game.getWindow().getHeight() - 20) / Game.getWindow().SIDE;  //This thing may or may not work
    }
    public int getGridWidth(){
        return Game.getWindow().getWidth() / Game.getWindow().SIDE;
    }
    
    public Coordinate getFood(){
        return food;
    }
    
    public boolean testWall() {
        // RED_FLAG: where did these numbers come from?!
        if (Game.getSnake().findMoveCoordinate().getRow() < BORDER || Game.getSnake().findMoveCoordinate().getRow() >= getGridHeight() - BORDER)
            return true;
        // RED_FLAG: where did these numbers come from?!
        if (Game.getSnake().findMoveCoordinate().getCol() < BORDER || Game.getSnake().findMoveCoordinate().getCol() >= getGridWidth() - BORDER)
            return true;
        return false;
    }

    public void addFood() {
        int rowFood = BORDER + (int)(Math.random() * (getGridHeight() - BORDER * 2));
        int colFood = BORDER + (int)(Math.random() * (getGridWidth() - BORDER * 2));
        Coordinate food = new Coordinate (rowFood, colFood);
        if (Game.getSnake().contains(food) || testWall())
            addFood();
        else 
            this.food = food;
                
    }
    public boolean isFood(Coordinate coord) {
        if (coord.equals(food))
            return true;
        else
            return false;
    }
}
