package array;

import java.util.ArrayList;

import java.util.List;

public class leetcode118 {
    public static void main(String[] args) {
        int n=5;

        List<List<Integer>> tringle=new ArrayList<>();
        for (int i=1;i<=n;i++) {
            ArrayList<Integer> newarrlist=new ArrayList<>();
            newarrlist.add(1);
            int num=1;
                for (int j=1;j<i;j++){
                        num = num * (i - j) / j;
                        newarrlist.add(num);
            }
            tringle.add(newarrlist);
        }
            System.out.println(tringle);
    }
}
