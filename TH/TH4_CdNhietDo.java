package Bai3_MangPthuc.TH;

import java.util.Scanner;

public class TH4_CdNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Menu : ");
        System.out.println(" 1. Chuyen Do C sag do F : ");
        System.out.println("2 . Chuyen Do F sang do C");
        System.out.println(" 0 . Exit ");
        System.out.println(" Nhap lua chon ");
        int chon = sc.nextInt();
        switch (chon){
            case 1 :
                System.out.println(" Nhap do C can chuyen :");
                double c = sc.nextDouble();
                System.out.println(" Do C da nhap duoc chuyen sang F la : "+ CToF(c));
                break;

            case 2 :
                System.out.println(" Nhap do C can chuyen :");
                double f = sc.nextDouble();
                System.out.println(" Do F da nhap duoc chuyen sang C la : "+ FToC(f));
                break;
        }



    }
    public static double CToF(double c){
       double f = (9.0/5)*c+32;
       return f;
    }
    public static double FToC(double f){
       double c = (5.0/9)*(f-32);
       return c;
    }
}

