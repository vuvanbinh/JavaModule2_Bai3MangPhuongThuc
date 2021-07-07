package Bai3_MangPthuc.TH;


import java.util.Scanner;

public class Th3_TimGiaTriTrongMang {
    public static void main(String[] args) {
       String listName [] = {"Binh","Hoang","Son","Thanh","Toan"};
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim trong mang :");
        String nhapTen = sc.nextLine();
        int dem = 0;
        boolean check =false;
        for (int i = 0; i < listName.length; i++) {
            if(listName[i].equals(nhapTen)){
                check=true;
                dem=i;
                break;
            }
        }
        if(check)
            System.out.println("Tim thay "+ nhapTen+ " o vi tri "+ (dem+1));
        else
            System.out.println("khong tim thay");
    }

}
