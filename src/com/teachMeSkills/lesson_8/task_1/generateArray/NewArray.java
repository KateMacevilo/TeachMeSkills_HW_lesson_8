package com.teachMeSkills.lesson_8.task_1.generateArray;

import com.teachMeSkills.lesson_8.task_1.vector.AbstractVector;
import com.teachMeSkills.lesson_8.task_1.vector.IVector;

import java.util.Arrays;

public class NewArray {

    public static String GenerateArray(int n) {

        IVector[] arrayVector = new IVector[n];

        for (int i = 0; i < arrayVector.length; i++) {
            arrayVector[i] = AbstractVector.rand();
            System.out.println(arrayVector[i]);
        }

        return Arrays.toString(arrayVector);
    }

}
