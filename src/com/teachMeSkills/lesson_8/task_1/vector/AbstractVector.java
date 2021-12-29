package com.teachMeSkills.lesson_8.task_1.vector;

import java.util.Random;

public abstract class AbstractVector implements IVector {

    protected double x;
    protected double y;

    public AbstractVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public AbstractVector() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    static public AbstractVector rand() {
        Random rand = new Random();
        AbstractVector vector;
        if (rand.nextBoolean())
            vector = new XYVector(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
        else {
            vector = new XYZVector(rand.nextInt(10) + 1, rand.nextInt(10) + 1, rand.nextInt(10 + 1));
        }
        return vector;
    }


}
