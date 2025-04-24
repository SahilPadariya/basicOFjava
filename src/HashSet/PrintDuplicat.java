package HashSet;

import java.util.HashSet;

public class PrintDuplicat {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,10,10};
        HashSet<Integer> hashSet=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for (int num:arr){
            if (hashSet.contains(num)){
                ans.add(num);
            }else {
                hashSet.add(num);
            }
        }
        System.out.println(ans);
    }
}
