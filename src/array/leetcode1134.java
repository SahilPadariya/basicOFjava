package array;

public class leetcode1134 {
    public static void main(String[] args) {
        int n=9474;
        System.out.println(checkArmstrong(n));
        System.out.println(30%15);
    }
    public static boolean checkArmstrong(int n){
        int d=String.valueOf(n).length();
        int sum=0,ncopy=n,k=3;
        while (n!=0){
            int digit=n%10;
            sum+=Math.pow(digit,d);
            n=n/10;
        }
        return sum==ncopy;
    }
}
