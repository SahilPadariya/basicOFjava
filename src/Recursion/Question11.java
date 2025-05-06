package Recursion;

import java.util.HashMap;

public class Question11 {
    static HashMap<Integer,Long>map=new HashMap<>();
    public static void main(String[] args) {
        System.out.println(nthforfibbo(5));
    }
    public static Long nthforfibbo(int k){
     if (k==1){
         return 0L;
     }
     if (k==2){
         return 1L;
     }
     if (map.containsKey(k)){
         return map.get(k);
     }
     long result = nthforfibbo(k-1)+nthforfibbo(k-2);
     System.out.println(k+"="+result);
     map.put(k,result);
     return result;
    }
}
