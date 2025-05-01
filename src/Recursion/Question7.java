    package Recursion;

    public class Question7 {
        public static void main(String[] args) {
            System.out.println(reverse(123,0));
        }
        public static int reverse(int n , int ans){
            if (n==0){
                return ans;
            }
            return reverse(n/10,ans*10+n%10);
        }
    }
