package com.company;

public class Main {
    public static void main (String[] args) {
        MovablePoint movablePoint = new MovablePoint(0,0,2,2);
        MovablePoint prototype1 = new MovablePoint(0,0,0,0);
        prototype1 = movablePoint.prototype();
        System.out.println(movablePoint.toString());
        movablePoint.moveRight();
        System.out.println(movablePoint.toString());
        movablePoint.moveUp();
        System.out.println(movablePoint.toString());
        movablePoint.moveRight();
        System.out.println(movablePoint.toString());
        System.out.println(prototype1.toString());
	System.out.println("Hello")

        System.out.println("Movable circle: ");
        MovableCircle movableCircle = new MovableCircle(0,0,3,1,4, movablePoint);
        MovableCircle prototype2 = new MovableCircle(0,0,0,0,0,movablePoint);
        prototype2 = movableCircle;
        movableCircle.moveLeft();
        System.out.println(movableCircle.toString());
        movableCircle.moveLeft();
        System.out.println(movableCircle.toString());
        System.out.println(prototype2.toString());
    }
}
