package com.teachMeSkills.lesson_8.task_1.runner;

import java.util.Scanner;

/**
 * Создайте класс, который описывает вектор в двумерной системе координат.
 * Создайте класс, который описывает вектор в трехмерной системе координат.
 * У каждого класса должны быть:
 * конструктор с параметрами в виде списка координат (например, x, y, z);
 * метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
 * метод, вычисляющий скалярное произведение;
 * метод сложения векторов;
 * метод разности векторов;
 * статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 * Предусмотреть сравнение векторов через метод equals.
 * Вывести информацию о векторе используя метод toString.
 */

import com.teachMeSkills.lesson_8.task_1.calculate.Calculate;
import com.teachMeSkills.lesson_8.task_1.generateArray.NewArray;
import com.teachMeSkills.lesson_8.task_1.vector.IVector;
import com.teachMeSkills.lesson_8.task_1.vector.XYVector;
import com.teachMeSkills.lesson_8.task_1.vector.XYZVector;

public class Main {

    public static void main(String[] args) {

        IVector vector1 = new XYVector(3,-4);
        IVector vector11 = new XYVector(3, -4);
        IVector vector2 = new XYZVector(2,4,4);
        IVector vector22 = new XYZVector(1,2,-5);
        IVector vector23 = new XYZVector(4,8,1);

        System.out.println("Vector1 length is " + vector1.lengthVector());
        System.out.println("Vector2 length is " + vector2.lengthVector());
        System.out.println("scalar 2D is " + Calculate.scalar(vector1, vector11));
        System.out.println("scalar 3D is " + Calculate.scalar(vector22, vector23));
        System.out.println("combine 2D is " + Calculate.combineVector(vector1, vector11));
        System.out.println("combine 3D is " + Calculate.combineVector(vector2, vector22));
        System.out.println("difference 2D is " + Calculate.differenceVector(vector1, vector11));
        System.out.println("difference 3D is " + Calculate.differenceVector(vector2, vector22));

        if (vector1.equals(vector11)){
            System.out.println("they are equal");
        } else {
            System.out.println("they aren't equal");
        }

        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(NewArray.GenerateArray(scanner.nextInt()));
    }

}

