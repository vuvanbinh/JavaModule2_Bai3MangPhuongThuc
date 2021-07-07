package Bai3_MangPthuc.BAITAP;

import java.util.Scanner;

public class Bai6_NhapSv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
       do {
           System.out.println(" Nhap size : ");
            size = sc.nextInt();
           if(size>30) System.out.println(" Vuot qua size cho phep");
       }while (size>30);
       int[] arr;
       arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap diem cua sinh vien "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        int dem = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i]>=5 &&arr[i]<10){
                dem+=1;
            }
        }
        System.out.println(" Co "+dem+" dat diem do");
    }
}
