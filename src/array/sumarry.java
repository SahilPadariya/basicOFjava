package array;

public class sumarry {
    public static void main(String[] args) {
        int[]arry=new int[5];
        int[]arry2=new int[]{10,20,30,40,50};
        int n=arry2.length;
        int sum = 0;
        for (int i=0;i<n;i++){
            sum=sum+arry2[i]/5;

        }
        System.out.println(sum);
    }
}
