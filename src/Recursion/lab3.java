package Recursion;

public class lab3 {
    public static void main(String[] args) {
        System.out.println(sum(12345,0));
    }
    public static int sum(int n,int ans){
       if (n==0){
           return ans;
       }
       return sum(n/10,ans+n%10);
    }
}
