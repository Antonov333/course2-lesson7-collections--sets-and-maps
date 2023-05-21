package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2, Lesson 7 \"COLLECTIONS: SETS AND MAPS\"");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        printNonEvenNumbers(nums);

        sortAndPrintEvenNumbers(nums);

        List<String> strings = new ArrayList<>(List.of("This", "was", "our", "first", "attempt", "at",
                "wild", "camping", "to", "test", "our", "gear", "tent", "did", "not", "arrive", "in", "time",
                "which", "meant", "he", "was", "using", "a", "temporary", "one", "bought", "from", "amazon", "The",
                "rain", "and", "wind", "came", "and", "we", "had", "to", "evacuate", "off", "the", "mountain", "as",
                "we", "couldn't", "risk", "a", "full", "failure", "of", "the", "tent", "Sam", "was", "using", "We",
                "didn't", "manage", "to", "film", "our", "evac", "as", "it", "was", "dark", "wet", "and", "the", "fog",
                "came", "in", "but", "we", "made", "it", "back", "to", "the", "safety", "of", "the", "van", "in", "the",
                "early", "hours", "The", "route", "we", "took", "was", "from", "Seathwaite", "via", "the", "corridor",
                "route", "The", "intention", "was", "to", "have", "a", "camp", "and", "then", "continue", "to", "the",
                "summit", "of", "Scafell", "Pike", "in", "the", "morning", "but", "clearly", "this", "did", "not",
                "happen", "as", "it", "was", "always", "safety", "first"));


        List<String> strings1 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printUnicWords(strings1);
        countDups(strings1);

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

    public static void sortAndPrintEvenNumbers(List<Integer> list) {

        System.out.println("\nProblem #2\n" +
                "----------");

        Set<Integer> set = new HashSet<>(list);

        List<Integer> listNoDups = new ArrayList<>(set);

        Collections.sort(listNoDups);

        for (Integer i : listNoDups) {
            if (i.intValue() % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static void printUnicWords(List<String> list) {
        System.out.println("\nProblem #3\n" +
                "----------");
        Set<String> set = new HashSet<>(list);

        int i = 0;
        int line = 150;

        for (String element : set) {
            i += element.length() + 1;
            if (i > line) {
                System.out.println("");
                i = 0;
            }
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void countDups(List<String> list) {
        System.out.println("\nProblem #4\n" +
                "----------");
        Set<String> unicStrings = new HashSet<>(list);
        for (String element : unicStrings) {
            System.out.println(element + ": " + Collections.frequency(list, element) + " time(s)");
        }
    }
}
