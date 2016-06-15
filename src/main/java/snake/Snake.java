/*
 * Snake.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ella Jenke
 * @author Becca Mestechkin
 */
package snake;

import java.util.*;

public class Snake {

    /** Direction is an enum for the four directions. */
    public static enum Direction { UP, RIGHT, DOWN, LEFT, };

    private Coordinate head, tail;
    private List<Coordinate> snake;
    private int size;
    private Direction direction;

    public Snake() {
        head = tail = new Coordinate(1, 1);
        snake = new LinkedList<Coordinate>();
        snake.add(head);
        size++;
        direction = Direction.RIGHT;
    }

    public int getScore() { return size; }
    public List<Coordinate> getSnake() { return snake; }

    private void setDirection(Direction direction) { this.direction = direction; }
    // For these turn methods: the user pressing any key will prompt these methods
    public void turnUp() { setDirection(Direction.UP); }
    public void turnRight() { setDirection(Direction.RIGHT); }
    public void turnDown() { setDirection(Direction.DOWN); }
    public void turnLeft() { setDirection(Direction.LEFT); }

    /**
     * Returns the {@link Coordinate} that the snake should move to next.
     *
     * @return Coordinate that the snake should move to next
     */
    public Coordinate findMoveCoordinate() {
        Coordinate moveCoordinate = head;
        switch (direction) {
            case UP:
                moveCoordinate = new Coordinate(head.getRow() - 1, head.getCol());
                break;
            case RIGHT:
                moveCoordinate = new Coordinate(head.getRow(), head.getCol() + 1);
                break;
            case DOWN:
                moveCoordinate = new Coordinate(head.getRow() + 1, head.getCol());
                break;
            case LEFT:
                moveCoordinate = new Coordinate(head.getRow(), head.getCol() - 1);
                break;
            default:
                break;
        }
        return moveCoordinate;
    }

    public void move() {
        Coordinate next = findMoveCoordinate(); // how to test if its part of the snake
        if (snake.contains(next));
        // Game.gameOver(); // need method to test if something is a snake segment or not
        // else if (next.equals(Grid.getFood())) // not sure where the food variable is at this point
        //     grow();
        // else if (Grid.testWall())
        // Game.gameOver();
        else {
            snake.remove(tail);
            snake.add(0, next);
            head = next;
            tail = snake.get(size - 1); //resets tail to the new last segment
        }
    }

    public void grow() {
        Coordinate newSegment = findMoveCoordinate();
        snake.add(0, newSegment);
        // Grid.addFood();
        size++;
        head = newSegment;
    }
}
