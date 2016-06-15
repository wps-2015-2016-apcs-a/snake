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
<<<<<<< HEAD

   
    
    ///////////////////FIELDS/////////////////////
    
    public boolean testWall() {
        if (Game.getSnake().findMoveCoordinate().getRow() == 0 || Game.getSnake().findMoveCoordinate().getRow() == 1 || 
            Game.getSnake().findMoveCoordinate().getRow() == 98 || Game.getSnake().findMoveCoordinate().getRow() == 99)
                return true;
        if (Game.getSnake().findMoveCoordinate().getCol() == 0 || Game.getSnake().findMoveCoordinate().getCol() == 1 ||
            Game.getSnake().findMoveCoordinate().getCol() == 73 || Game.getSnake().findMoveCoordinate().getCol() == 74)
                return true;
=======
   
    
    ///////////////////FIELDS/////////////////////
    public static final int HEIGHT = 900;
    public static final int WIDTH = 1200;
    public static final int SIZE = 8;
    
   
    public boolean testWall{
        if (findMoveCoordinate().getRow() == 0 || findMoveCoordinate().getRow() == 1 || 
            findMoveCoordinate().getRow() == 98 || findMoveCoordinate().getRow() == 99)
            return true;
        if (findMoveCoordinate().getCol() == 0 || findMoveCoordinate().getCol() == 1 ||
            findMoveCoordinate().getCol() == 73 || findMoveCoordinate().getCol() == 74)
            return true;
>>>>>>> db390c258915cc726f7cee3ad9c5c528636dc513
        return false;
    }
    
    public void addFood() {
        int rowFood = 2 +(int)(Math.random() * 96);
        int colFood = 2 +(int)(Math.random() * 72);
        Coordinate food = new Coordinate (rowFood, colFood);
        //if(Game.getSnake().contains(food))
          //  addFood();
        //Planning on making a loop to go through the snake
    }
}