package Bai3_MangPthuc.BAITAP;

public class Bai4_maxMag2Chieu {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,11,6,15},
                {7,8,9,99}
        };
        int max = arr[0][0];
        int a =0;
        int b =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("GTLN : "+ max + " tai vi tri "+ a+";"+b);
    }
}
