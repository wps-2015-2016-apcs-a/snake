/*
 * Grid.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ryan Delaney <rcdelaney0@gmail.com>
 */
package snake;

public class Grid extends Snake{
    
    private static final int HEIGHT = 900;
    private static final int WIDTH = 1200;
   
    public int getX(){
        return WIDTH;
    }
    public int getY(){
        return HEIGHT;
    }
    
    public boolean testWall(){
        
        if (findMoveCoordinate().getRow() == 0 || findMoveCoordinate().getRow() == 1 || 
            findMoveCoordinate().getRow() == 98 || findMoveCoordinate().getRow() == 99)
            return true;
        if (findMoveCoordinate().getCol() == 0 || findMoveCoordinate().getCol() == 1 ||
            findMoveCoordinate().getCol() == 73 || findMoveCoordinate().getCol() == 74)
            return true;
        return false;
    }
    
    
    //public void addFood() {
        //int rowFood = (int)(Math.random() + 100);
        //int colFood = (int)(Math.random() + 100);
    //}    
    
}

    