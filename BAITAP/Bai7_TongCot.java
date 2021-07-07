package Bai3_MangPthuc.BAITAP;

import java.util.Scanner;

public class Bai7_TongCot {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cot  muon tinh tong :");
         int cot = sc.nextInt()-1;
        int sum = 0;
         if(cot>arr.length||cot<0){
             System.out.println(" Khong co cot nay ");
         }
        else
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][cot];
        }
        System.out.println(sum);
    }

    }

