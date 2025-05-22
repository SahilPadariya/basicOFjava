package MultiThreading;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
//        int arr[]={5,87};
//        if(arr.length==2) {
//            Arrays.sort(arr);
//            int temp = arr[1];
//            arr[1] = arr[0];
//            arr[0] = temp;
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
//        int i;
//        int left=0,right=arr.length-1;
//        Arrays.sort(arr);
//        for (i=0;i< arr.length;i++){
//            if (arr[i]>9){
//                right=i-1;
//                break;
//            }
//        }
//        while (left<right){
//            int temp=arr[right];
//            arr[right]=arr[left];
//            arr[left]=temp;
//            left++;
//            right--;
//        }
//        left=i;
//        right=arr.length-1;
//        while (left<right){
//            int temp=arr[right];
//            arr[right]=arr[left];
//            arr[left]=temp;
//            left++;
//            right--;
//        }
//        StringBuilder ans=new StringBuilder();
//        for(int num : arr){
//            ans.append(num);
//        }
//        System.out.println(ans);
        int arr[] = {20, 85, 21, 65, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                String s1 = String.valueOf(arr[j])+String.valueOf(arr[j+1]);
                String s2 = String.valueOf(arr[j+1])+String.valueOf(arr[j]);
                if (Integer.parseInt(s2) > Integer.parseInt(s1)) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(87);
        Collections.sort(list, new NumberComparator());
        System.out.println(list);
    }
}
class NumberComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);
        return s2.compareTo(s1);
    }
}