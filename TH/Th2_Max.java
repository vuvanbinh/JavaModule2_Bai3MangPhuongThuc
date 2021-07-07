package Bai3_MangPthuc.TH;

import java.util.Scanner;

public class Th2_Max {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" Enter a size : ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println(" Size should not exceed 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Property list : ");
        for (int k : arr) {
            System.out.print(k + "\t");
        }
        System.out.println();
        int max = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property" +
                " value in the list is " +max+ " , at position " + index);
    }
}
