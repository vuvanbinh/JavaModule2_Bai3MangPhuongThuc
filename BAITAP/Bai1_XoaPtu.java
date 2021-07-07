package Bai3_MangPthuc.BAITAP;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Bai1_XoaPtu {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        for (int i: XoaPhanTu(arr,n)
             ) {
            System.out.println(i);
        }
    }
    public static int[] XoaPhanTu(int arr[], int number){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]){
                index = i;
            }
        }
        int[]neArray = new int [arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            neArray[i]=arr[i];
        }
        if(number != arr[index]) {
            System.out.println("So can xoa khong xuat hien trong mang");
        }else {
            for (int i = index; i <arr.length-1 ; i++) {
                neArray[i]=arr[i+1];
            }
        }
        return neArray;
    }
}
