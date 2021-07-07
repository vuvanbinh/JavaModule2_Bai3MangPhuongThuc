package Bai3_MangPthuc.BAITAP;

public class Bai3_GopMang {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2 = {8,7,6,5};
        for (int i: GopMang(arr1,arr2)
             ) {
            System.out.print(i +"\t");
        }
    }
    public static int[] GopMang(int[] arr1,int[] arr2 ){
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }else arr3[i]=arr2[arr3.length-i-1];
        }
        return arr3;
    }
}
