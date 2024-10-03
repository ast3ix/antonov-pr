package ru.mirea.antonov;

public class Test {
    public static void main(String[] args) {
        MovableRectangle prymougolnik = new MovableRectangle(new MovablePoint(2, 2, 3, 10), new MovablePoint(6, 2, 3, 10));
        if (prymougolnik.hasSameSpeed()){
            System.out.println(prymougolnik);
            prymougolnik.moveUp();
            prymougolnik.moveRight();
            prymougolnik.moveUp();
            System.out.println(prymougolnik);
        };
    }

}