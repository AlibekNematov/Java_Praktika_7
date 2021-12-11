package com.company;

public class MovablePoint implements  Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.y = ySpeed;
    }

    @Override
    public String toString(){ return "x = " + x + ", " + "y = " + y + ", " + "xSpeed = " + xSpeed + ", " + "ySpeed = " + ySpeed; }

    @Override
    public MovablePoint prototype() {
        return new MovablePoint(x,y,ySpeed,xSpeed);
    }

    @Override
    public void moveUp(){
        y += ySpeed;
    }

    @Override
    public void moveDown(){
        y -= ySpeed;
    }

    @Override
    public void moveLeft(){
        x -= xSpeed;
    }

    @Override
    public void moveRight(){
        x += xSpeed;
    }
}