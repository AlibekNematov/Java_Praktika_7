package com.company;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius, MovablePoint center){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString(){return "radius = " + radius + ", " + "center = " + center;}

    @Override
    public void moveUp(){
        super.moveUp();
    }

    @Override
    public void moveDown(){
        super.moveDown();
    }

    @Override
    public void moveLeft(){
        super.moveRight();
    }

    @Override
    public void moveRight(){
        super.moveRight();
    }

    @Override
    public MovablePoint prototype() {
        return new MovableCircle(x, y, xSpeed, ySpeed, radius, center);
    }
}
