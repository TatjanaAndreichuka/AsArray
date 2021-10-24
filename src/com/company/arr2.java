package com.company;

public class arr2 {
    public static void main(String[] args) {
        int[] newArray = {10, -4, -4, 7, 0, 9, 1, 3, 7, -5};
        negative(newArray);
        odd(newArray);
        everySecond(newArray);
        average(newArray);
        multipleEl(newArray);
    }

    static void negative(int[] newArray) {
        int i = 0;
        while (i < newArray.length) {
            if (newArray[i] < 0)
                System.out.println("The negative number is:" + newArray[i]);
            i++;
        }
    }

    static void odd(int[] newArray) {
        int countOdd = 0;
        for (int odd : newArray) {
            if (odd % 2 != 0)
                countOdd++;
        }
        System.out.println("There are " + countOdd + " odd numbers:");
        for (int i = 1; i < newArray.length; i++)
            if (newArray[i] % 2 != 0)
                System.out.println(newArray[i]);
    }

    static void everySecond(int[] newArray) {
        System.out.println("The every second number: ");
        for (int i = 1; i <= newArray.length; i = i + 2)
            System.out.println(newArray[i]);
    }

    static void average(int[] newArray) {
        double sum = 0;
        for (int j : newArray) {
            sum = sum + j;
        }
        double average = sum / newArray.length;
        System.out.println("The average is: " + average);
        int countlessAv = 0;
        for (int lessAv : newArray) {
            if (lessAv < average)
                countlessAv++;
        }
        System.out.println("There are  " + countlessAv + "  numbers witch are smaller than average. ");
    }

    static void multipleEl(int[] newArray) {
        for (int i = 0; i < newArray.length; i++)
            for (int j = i + 1; i < newArray.length; i++) {
                if (newArray[i] == newArray[j]) {
                    System.out.println("There are equals for: " + newArray[i]);
                } else {
                    System.out.println("There are no equals for: " + newArray[i]);
                }
              //  newArray[i]++;
            }
    }
}




