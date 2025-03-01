package array;

import java.util.ArrayList;

public class leetcode119 {
    public static void main(String[] args) {
        ArrayList<Integer> single=new ArrayList<>();
        long j=1;
        int n=30;
        single.add((int)j);
        for (int i=1;i<=n;i++){
            j=j*(n-i+1)/i;
            single.add((int) j);
        }
        System.out.println(single);
    }
}
