package com.teachMeSkills.lesson_8.task_1.vector;

import java.util.Objects;

public class XYVector extends AbstractVector {

    public XYVector(double x, double y) {
        super(x, y);
    }

    public XYVector() {
    }

    @Override
    public double lengthVector() {
        double length = 0;
        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return length;
    }

    @Override
    public String toString() {
        return "XYVector " +
                " x=" + x +
                ", y=" + y ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XYVector vector = (XYVector) o;
        return Double.compare(vector.x, x) == 0 &&
                Double.compare(vector.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
