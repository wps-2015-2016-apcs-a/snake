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
    public Grid(int width, int height) { this.width = width; this.height = height; addFood();}
    
    ///////////////////FIELDS/////////////////////
    private Coordinate food;
    
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
        if (Game.getSnake().findMoveCoordinate().getRow() == 0 || Game.getSnake().findMoveCoordinate().getRow() == 1 || 
            Game.getSnake().findMoveCoordinate().getRow() == getGridHeight() - 2 || Game.getSnake().findMoveCoordinate().getRow() == getGridHeight() -  1)
            return true;
        // RED_FLAG: where did these numbers come from?!
        if (Game.getSnake().findMoveCoordinate().getCol() == 0 || Game.getSnake().findMoveCoordinate().getCol() == 1 ||
            Game.getSnake().findMoveCoordinate().getCol() == getGridWidth() - 2 || Game.getSnake().findMoveCoordinate().getCol() == getGridWidth() -1)
            return true;
        return false;
    }

    public void addFood() {
        int rowFood = 2 +(int)(Math.random() * getGridHeight() - 4);
        int colFood = 2 +(int)(Math.random() * getGridWidth() - 4);
        Coordinate food = new Coordinate (rowFood, colFood);
        if (Game.getSnake().contains(food))
            addFood();
        else 
            this.food = food;
                
    }
    public boolean isFood(Coordinate coord) {
        if (coord == food)
            return true;
        else
            return false;
    }
}
