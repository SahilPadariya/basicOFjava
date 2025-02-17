package array;

public class twoarrayprintthirdarray {
    public static void main(String[] args) {
        int []a1={1,2,3,4,5};
        int []a2={6,7,8,9,10};
        int []a3=new int[a1.length+a2.length];
        for (int i=0;i<a1.length;i++){
            a3[i]=a1[i];
            a3[i+a1.length]=a2[i];
        }
        for (int j=0;j<a3.length;j++){
            System.out.print( a3[j] + " ");
        }
    }
}
