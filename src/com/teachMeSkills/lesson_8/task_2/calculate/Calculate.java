package com.teachMeSkills.lesson_8.task_2.calculate;

import com.teachMeSkills.lesson_8.task_2.vector.Vector;

public class Calculate {

    public static double scalar(Vector vector1, Vector vector2) {

        if (vector1.getCoordinate().length == vector2.getCoordinate().length) {
            double scalar = 0;
            for (int i = 0; i < vector1.getCoordinate().length; i++) {
                scalar += vector1.getCoordinate()[i] * vector2.getCoordinate()[i];
            }
            return scalar;
        }
        return 0;
    }


    public static Vector combineVector(Vector vector1, Vector vector2) {

        if (vector1.getCoordinate().length == vector2.getCoordinate().length) {
            int lengthVector = vector1.getCoordinate().length;
            int[] newVectorCoord = new int[lengthVector];

            for (int i = 0; i < vector1.getCoordinate().length; i++){
                newVectorCoord[i] = vector1.getCoordinate()[i] + vector2.getCoordinate()[i];
            }

            Vector newVector = new Vector(newVectorCoord);
            return newVector;
        }
        return null;

    }

    public static Vector differenceVector(Vector vector1, Vector vector2) {

        if (vector1.getCoordinate().length == vector2.getCoordinate().length) {
            int lengthVector = vector1.getCoordinate().length;
            int[] newVectorCoord = new int[lengthVector];

            for (int i = 0; i < vector1.getCoordinate().length; i++){
                newVectorCoord[i] = vector1.getCoordinate()[i] - vector2.getCoordinate()[i];
            }

            Vector newVector = new Vector(newVectorCoord);
            return newVector;
        }
        return null;

    }



}
