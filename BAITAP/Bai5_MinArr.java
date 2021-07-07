package Bai3_MangPthuc.BAITAP;

import java.util.Scanner;

public class Bai5_MinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Size");
        int size = sc.nextInt();
        int[]arr= new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu "+i+" :");
            arr[i]  = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Gia tri nho nhat la = "+min);
    }
}
