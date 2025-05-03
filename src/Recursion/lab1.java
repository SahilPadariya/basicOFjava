package Recursion;

public class lab1 {
    public static void main(String[] args) {
        String str="sahil";
        System.out.println(cheack(str,0,str.length()-1));
    }
    public static boolean cheack(String str,int i,int j){
        if (i==j){
            return true;
        }
        char ch=str.charAt(i);
        char ch1=str.charAt(j);
        if (ch != ch1){
            return false;
        }
        return cheack(str,i+1,j-1);
    }
}
