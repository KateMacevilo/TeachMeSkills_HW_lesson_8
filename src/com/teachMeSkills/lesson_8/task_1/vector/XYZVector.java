package com.teachMeSkills.lesson_8.task_1.vector;

public class XYZVector extends AbstractVector {

    private double z;

    public XYZVector(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public XYZVector() {
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double lengthVector() {
        double length = 0;
        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return length;
    }

    @Override
    public String toString() {
        return "XYZVector " +
                " x=" + x +
                ", y=" + y +
                ", z=" + z ;
    }


}
