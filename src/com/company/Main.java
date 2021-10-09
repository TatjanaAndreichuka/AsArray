package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {5, 3, 7, 6, 2, 8};
        forLoop(myArray);
        forEachLoop(myArray);
        whileLoop(myArray);
        doWhile(myArray);
    }

    static void forLoop(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i);
        }
    }

    static void forEachLoop(int[] myArray) {
        for (int i : myArray)
            System.out.println(i);
    }

    static void whileLoop(int[] myArray) {
        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }
    }

    static void doWhile(int[] myArray) {
        int i = 0;
        do {
            System.out.println(myArray[i]);
            i++;
        }
        while (i < myArray.length);
    }
}
