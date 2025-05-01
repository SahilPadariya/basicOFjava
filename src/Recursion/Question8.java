package Recursion;

public class Question8 {
    public static void main(String[] args) {
        System.out.println(twonummulti(4,5));
    }
    public static int twonummulti(int a,int b){
        int ans=a;
        if(b==0){
            return 0;
        }
        return ans+twonummulti(a,b-1);
    }
}
