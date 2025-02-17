package array;

public class multiplicationwithouthusesintex {
    public static void main(String[] args) {
        int left=11,right=20,c=0;
        for (int i=left;i<=right;i++){
            boolean isPrime=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
