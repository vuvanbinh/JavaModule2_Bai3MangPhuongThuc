package Bai3_MangPthuc.BAITAP;

import java.util.Scanner;

public class Bai2_ThemPtu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri can them :");
        int index =sc.nextInt();
        System.out.println("Nhap ptu muon them :");
        int x = sc.nextInt();
        ThemPT(arr,index,x);

    }
    public static int[] ThemPT(int arr[],int index,int x) {
        if(index<0)return arr;
        if(index>arr.length) return arr;

        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index]=x;
        for (int i = index+1; i < arr.length+1 ; i++) {
            newArray[i]=arr[i-1];
        }
        for (int i:newArray
             ) {
            System.out.print(i+"\t");
        }
        return newArray;
    }

}

