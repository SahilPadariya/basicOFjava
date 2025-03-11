package String;

import java.util.Arrays;

public class Question19 {
//    public static void main(String[] args) {
//        String s1="PROGRAM";
//        for (int i=0;i<s1.length();i++){
//            for (int j=0;j<=i;j++){
//                System.out.print(s1.charAt(j));
//            }
//            System.out.println();
//        }
//    }

    public static void main(String args[]) {
        char arr[]={'5','2','3'},arr2[]={'1','6','2'};
        int sum=0;
        if (arr.length!=arr2.length){
            System.out.println("not sem");
            return;
        }
        for (int i=0;i<arr.length;i++){
            sum=sum*10+(arr[i]-'0')+(arr2[i]-'0');
        }
        System.out.println(sum);
    }
}
