package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2, Lesson 7 \"COLLECTIONS: SETS AND MAPS\"");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        printNonEvenNumbers(nums);

    }

    public static void printNonEvenNumbers(List<Integer> list) {
        System.out.println("\nProblem #1\n" +
                "----------");
        for (Integer i : list) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

    }

}