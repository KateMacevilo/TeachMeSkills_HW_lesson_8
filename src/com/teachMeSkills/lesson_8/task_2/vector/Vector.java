package com.teachMeSkills.lesson_8.task_2.vector;

import java.util.Arrays;

public class Vector {
    private int[] coordinate;

    public Vector(int[] coordinate) {
        this.coordinate = coordinate;
    }

    public Vector() {
    }

    public int[] getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int[] coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Vector " +
                "coordinate=" + Arrays.toString(coordinate) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(coordinate, vector.coordinate);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coordinate);
    }

    public double lengthVector() {
        double length = 0;
        for (int i = 0; i < this.coordinate.length; i++) {
            length += Math.pow(this.coordinate[i], 2);
        }
        length = Math.sqrt(length);
        return length;
    }
}
