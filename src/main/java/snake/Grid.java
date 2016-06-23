/*
 * Grid.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ryan Delaney
 * @author Jacob Lowen
 */
package snake;

import java.awt.*;

public class Grid {

    //////////////////////////////// FIELDS ////////////////////////////////

    private Coordinate food;
    
    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    public Grid() {
        addFood();
    }

    //////////////////////////////// METHODS ///////////////////////////////

    public int getGridWidth() {
        return Game.getWindow().getGridSize().width;
    }
    public int getGridHeight() {
        return Game.getWindow().getGridSize().height;
    }
    public Coordinate getFood() {
        return food;
    }

    public void addFood() {
        assert Game.getSnake() != null : "snake == null";
        int rowFood = (int) (Math.random() * (getGridHeight()));
        int colFood = (int) (Math.random() * (getGridWidth()));
        Coordinate food = new Coordinate (rowFood, colFood);
        if (Game.getSnake().contains(food) || testWall())
            addFood();
        else 
            this.food = food;
                
    }
    public boolean isFood(Coordinate coord) {
        return coord.equals(food);
    }

    public boolean testWall() {
        Coordinate nextMove = Game.getSnake().findMoveCoordinate();
        return nextMove.getRow() < 0 || nextMove.getRow() >= getGridHeight()
            || nextMove.getCol() < 0 || nextMove.getCol() >= getGridWidth();
    }
}
