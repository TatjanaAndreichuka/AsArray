package com.company;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrGrades = new int[10];
        for (int next = 0; next < arrGrades.length; next++) {
            System.out.println("Enter student " + (next + 1) + " test result from 0-10: ");
            arrGrades[next] = Integer.parseInt(input.next());
        }
        input.close();
        countFailed(arrGrades);
        countA(arrGrades);
        histogram(arrGrades);
    }

    static void countFailed(int[] arrGrades) {
        int countfailed = 0;
        for (int failed : arrGrades) {
            if (failed < 4)
                countfailed++;
        }
        System.out.println(countfailed + " Students failed ");
    }

    static void countA(int[] arrGrades) {
        int countA = 0;
        for (int A : arrGrades) {
            if (A == 10) {
                countA++;
            }
        }
        System.out.println(countA + " Students got an A");
    }

    static void histogram(int[] arrGrades) {
      /*  int i=0;
        int countGrade = i;
        for (int Grade : arrGrades){
            if (Grade > 0 && Grade <arrGrades.length)
               countGrade++;
        System.out.println(countGrade + " students with the grade " + arrGrades[i]);
            i++;

    }*/
        int hist = 0;
        while (hist <= 10) {
            int student = 0;
            for (int stud : arrGrades) {
                if (stud == hist) {
                    student++;
                }
            }
            System.out.println(student + " students with the grade " + hist);
            hist++;
        }
    }
}

