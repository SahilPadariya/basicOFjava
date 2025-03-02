package array;

public class leetcode414 {
    public static void main(String[] args) {
        int nums[]={1,2,2,5,3,5};
        Integer maximum1 = null;
        Integer maximum2 = null;
        Integer maximum3 = null;
                for (Integer num : nums){
                    if (num.equals(maximum1) || nums .equals(maximum2) || nums.equals(maximum3))
                    {
                        continue;
                    }
                    if (maximum1==null ||maximum1<num){
                        maximum3=maximum2;
                        maximum2=maximum1;
                        maximum1=num;
                    }
                    else if (maximum2==null ||maximum2<num && num!=maximum1){
                        maximum3=maximum2;
                        maximum2=num;
                    }
                    else if (maximum3==null ||maximum3<num && num!=maximum2){
                        maximum3=num;
                    }
                }
        System.out.println(maximum3==null ? maximum1:maximum3);
    }
}

