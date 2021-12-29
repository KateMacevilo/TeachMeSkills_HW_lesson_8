package com.teachMeSkills.lesson_8.task_1.calculate;

import com.teachMeSkills.lesson_8.task_1.vector.IVector;
import com.teachMeSkills.lesson_8.task_1.vector.XYVector;
import com.teachMeSkills.lesson_8.task_1.vector.XYZVector;

public class Calculate {

    public static double scalar(IVector vector1, IVector vector2) {
        if (vector1 instanceof XYVector && vector2 instanceof XYVector) {
            return (vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY());
        } else if (vector1 instanceof XYZVector && vector2 instanceof XYZVector) {
            return (vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() +
                    ((XYZVector) vector1).getZ() * ((XYZVector) vector2).getZ());
        } else {
            return 0;
        }
    }


    public static IVector combineVector (IVector vector1, IVector vector2){
        if (vector1 instanceof XYVector && vector2 instanceof XYVector) {
            double coord1 = vector1.getX() + vector2.getX();
            double coord2 = vector1.getY() + vector2.getY();
            IVector vectorNew = new XYVector(coord1, coord2);
            return vectorNew;
        } else if (vector1 instanceof XYZVector && vector2 instanceof XYZVector){
            double coord1 = vector1.getX() + vector2.getX();
            double coord2 = vector1.getY() + vector2.getY();
            double coord3 = ((XYZVector) vector1).getZ() + ((XYZVector) vector2).getZ();
            IVector vectorNew = new XYZVector(coord1, coord2, coord3);
            return vectorNew;
        } else {
            return null;
        }
    }

    public static IVector differenceVector (IVector vector1, IVector vector2){
        if (vector1 instanceof XYVector && vector2 instanceof XYVector) {
            double coord1 = vector1.getX() - vector2.getX();
            double coord2 = vector1.getY() - vector2.getY();
            IVector vectorNew = new XYVector(coord1, coord2);
            return vectorNew;
        } else if (vector1 instanceof XYZVector && vector2 instanceof XYZVector){
            double coord1 = vector1.getX() - vector2.getX();
            double coord2 = vector1.getY() - vector2.getY();
            double coord3 = ((XYZVector) vector1).getZ() - ((XYZVector) vector2).getZ();
            IVector vectorNew = new XYZVector(coord1, coord2, coord3);
            return vectorNew;
        } else {
            return null;
        }
    }


}
