package array;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode350 {
    public static void main(String[] args) {
        int num[]={1,2,2,1},num1[]={2,2};
        ArrayList<Integer> result=new ArrayList<>();
        int j=0;
        for (int i=0;i<num.length;i++){
            for (j=0;j<num1.length;j++){
                if (num[i]==num1[j]){
                    result.add(num[i]);
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
