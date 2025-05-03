package Recursion;

public class Question11 {
    public static void main(String[] args) {
        System.out.println(nthforfibbo(50));
    }
    public static int nthforfibbo(int k){
     if (k<=1){
         return k;
     }
     return nthforfibbo(k-1)+nthforfibbo(k-2);
    }
}
