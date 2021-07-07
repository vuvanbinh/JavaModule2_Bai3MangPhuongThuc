package Bai3_MangPthuc.TH;

public class Th5_min {
    public static void main(String[] args) {
        int arr[]= {11,22,23,34,5,13,62,47};
        System.out.println(" gia tri nho nhat la : "+minValue(arr));
    }
    public static int minValue(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
