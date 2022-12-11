package exercise_2;

import exercise_1.Movable;
import exercise_1.MovablePoint;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint downRight;

    public MovableRectangle(MovablePoint pointTop, MovablePoint pointBottom) {
        topLeft = pointTop;
        downRight = pointBottom;
        if (!isMovable(pointTop, pointBottom)) {
            topLeft.setxSpeed(0);
            topLeft.setySpeed(0);
            downRight.setxSpeed(0);
            downRight.setySpeed(0);
        }
    }

    @Override
    public String toString() {
        return "Rectangle("
                + " topLeft = " + topLeft
                + " downRight = " + downRight;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        downRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        downRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        downRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        downRight.moveRight();
    }

    boolean isMovable(MovablePoint point1, MovablePoint point2) {
        return point1.getxSpeed() == point2.getxSpeed()
                && point1.getySpeed() == point1.getySpeed();
    }
}
