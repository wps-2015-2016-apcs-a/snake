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

    public boolean testWall() {
        // RED_FLAG: where did these numbers come from?!
        if (Game.getSnake().findMoveCoordinate().getRow() == 0 || Game.getSnake().findMoveCoordinate().getRow() == 1 || 
            Game.getSnake().findMoveCoordinate().getRow() == 98 || Game.getSnake().findMoveCoordinate().getRow() == 99)
            return true;
        // RED_FLAG: where did these numbers come from?!
        if (Game.getSnake().findMoveCoordinate().getCol() == 0 || Game.getSnake().findMoveCoordinate().getCol() == 1 ||
            Game.getSnake().findMoveCoordinate().getCol() == 73 || Game.getSnake().findMoveCoordinate().getCol() == 74)
            return true;
        return false;
    }

    public void addFood() {
        int rowFood = 2 +(int)(Math.random() * 96);
        int colFood = 2 +(int)(Math.random() * 72);
        Coordinate food = new Coordinate (rowFood, colFood);
        for (int i = 0; i < Game.getSnake().getScore(); i++){
            if (food
        }

        //if(Game.getSnake().contains(food))
          //  addFood();
        //Planning on making a loop to go through the snake
    }
}