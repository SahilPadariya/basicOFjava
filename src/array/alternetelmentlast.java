package array;

public class alternetelmentlast {
    public static void main(String[] args) {
        int []array={10,20,30,40,50};
        int n=array.length;
        for (int i=n-1;i>=0;i=i-2){
            System.out.println(array[i]);
        }
    }
}
