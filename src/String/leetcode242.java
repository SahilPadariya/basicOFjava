package String;

import java.util.Arrays;

public class leetcode242 {
    public static void main(String[] args) {
        String s="rat",k="cat";
        char arr[]=s.toCharArray();
        char arr1[]=k.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=arr1[i]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}