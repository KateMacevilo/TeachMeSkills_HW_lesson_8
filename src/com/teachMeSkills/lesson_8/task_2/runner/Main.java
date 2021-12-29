package com.teachMeSkills.lesson_8.task_2.runner;

import com.teachMeSkills.lesson_8.task_2.calculate.Calculate;
import com.teachMeSkills.lesson_8.task_2.generateArray.NewArray;
import com.teachMeSkills.lesson_8.task_2.vector.Vector;

import java.util.Scanner;

/**
 * Дополнительное задание:
 * 	Предыдущее задание обобщить и написать один класс Vector для произвольной размерности.
 * 	Для этого в классе вектор для хранения координат следует использовать массив.
 */

public class Main {

    public static void main(String[] args) {

        Vector vector1 = new Vector(new int[]{3, -4});
        Vector vector2 = new Vector(new int[]{2, 4, 4});
        Vector vector3 = new Vector(new int[]{3, -4});
        Vector vector4 = new Vector(new int[]{1, 2, -5});

        System.out.println("Vector1 length is " + vector1.lengthVector());
        System.out.println("Vector2 length is " + vector2.lengthVector());
        System.out.println("scalar 2D is " + Calculate.scalar(vector1, vector3));
        System.out.println("scalar 3D is " + Calculate.scalar(vector2, vector4));
        System.out.println("combine 2D is " + Calculate.combineVector(vector1, vector3));
        System.out.println("combine 3D is " + Calculate.combineVector(vector2, vector4));
        System.out.println("difference 2D is " + Calculate.differenceVector(vector1, vector3));
        System.out.println("difference 3D is " + Calculate.differenceVector(vector2, vector4));

        if (vector1.equals(vector3)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they aren't equal");
        }

        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(NewArray.GenerateArray(scanner.nextInt()));
    }

}
