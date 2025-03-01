package array;

import java.util.Arrays;

public class leetcode66 {
    public static void main(String[] args) {
        int digit[]={0,0,0};
        int last=digit.length-1;
        while (last>=0){
            digit[last]++;
            if (digit[last]==10){
                digit[last]=0;
                last--;
            }
            else {
                break;
            }
            if (digit[0]==0){
                int arr[]=new int[digit.length+1];
                arr[0]=1;
                System.out.println( Arrays.toString(arr));
                }
            }
        System.out.println(Arrays.toString(digit));
        }
    }

