/*
 * Grid.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ryan Delaney
 * @author Jacob Lowen
 */
package snake;

public class Grid {
       
///////////////////CONSTRUCTOR////////////////    
    public Grid(int width, int height) { this.width = width; this.height = height; addFood();}

///////////////////FIELDS/////////////////////
    
    private int width, height;
    /* RED_FLAG: this is just a STUB to get things to compile. */
    //public static final int BORDER = 2;
    private Coordinate food;
    
    
    ///////////////////METHODS////////////////////
    public int getRow(){
        return Game.getWindow().getHeight() - Game.getWindow().BORDER;
    }
    
    public int getCol(){
        return Game.getWindow().getWidth() - Game.getWindow().BORDER;
    }
    
    public int getGridHeight(){
        return Game.getWindow().getHeight() / Game.getWindow().SIDE;
    }
    public int getGridWidth(){
        return Game.getWindow().getWidth() / Game.getWindow().SIDE;
    }
    
    public Coordinate getFood(){
        return food;
    }
    
    public boolean testWall() {
        // RED_FLAG: where did these numbers come from?!
        if (Game.getSnake().findMoveCoordinate().getRow() < 0 || Game.getSnake().findMoveCoordinate().getRow() >= getGridHeight())
            return true;
        // RED_FLAG: where did these numbers come from?!
        if (Game.getSnake().findMoveCoordinate().getCol() < 0 || Game.getSnake().findMoveCoordinate().getCol() >= getGridWidth())
            return true;
        return false;
    }

    public void addFood() {
        int rowFood = (int) (Math.random() * (getGridHeight()));
        int colFood = (int) (Math.random() * (getGridWidth()));
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
