package com.teachMeSkills.lesson_8.task_2.generateArray;

import com.teachMeSkills.lesson_8.task_2.vector.Vector;

import java.util.Arrays;
import java.util.Random;

public class NewArray {



    public static String GenerateArray(int n) {

        Random rand = new Random();
        Vector[] arrayVector = new Vector[n];

        for (int i = 0; i < arrayVector.length; i++) {
            int l = rand.nextInt(10) + 1;               //длина случайного массива
            Vector vectorNew =  new Vector(new int[l]);
            arrayVector[i] = fillArray(vectorNew);
            System.out.println(arrayVector[i]);
        }

        return Arrays.toString(arrayVector);

    }

    private static Vector fillArray(Vector vector){

        Random rand = new Random();
        for (int i = 0; i < vector.getCoordinate().length; i++){
            vector.getCoordinate()[i] = rand.nextInt(10) + 1;
        }
        return vector;

    }
}
