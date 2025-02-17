//print array
package array;

public class allhw {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        reverse();
    }

//print array in reverse order
    public static void reverse(){
        int sum=0;
        int []a1={10,20,30,40,50,60,70,80,90,100};
        for (int i=0;i<a1.length;i++){
            sum=sum+a1[i];
            System.out.println(sum);
        }
    }
}