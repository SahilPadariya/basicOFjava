package HashSet;

import java.util.HashSet;

public class PairPresentOrNot {
    public static void main(String[] args) {
        int arr[]={3,10,5};
        int sum=9;
        HashSet<Integer>hashSet=new HashSet<>();
        for (int num:arr){
            if (hashSet.contains(sum-num)){
                System.out.println("Present");
                return;
            }
            else {
                hashSet.add(num);
            }
        }
        System.out.println("Not Present");
    }
}
