package array;

public class firstoddseceven {
    public static void main(String[] args) {
        int []array={11,12,13,14,15,16,17,18,19,20};
        int n=array.length;
        for(int i = 0 ; i<n ;i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        for(int i = 0 ; i<n ;i++){
             if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
    }

}
