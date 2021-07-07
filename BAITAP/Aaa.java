package Bai3_MangPthuc.BAITAP;

public class Aaa {
    public static void main(String[] args) {
        m(1,2,3);
    }
    static int m(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        System.out.println(b);
        return b;
    }
}
