package asignment;

import java.util.Arrays;

public class binarynumserchusesorting {
    public static void main(String[] args) {
            int a1[]={0,0,1,0,1,0,1,0,0,0,0,1,1,0,1,1};
//            int a2[]=new int[a1.length];
            for (int i=0 ; i<a1.length-1;i++){
                for (int j=i+1; j<a1.length;j++){
                    if (a1[i]>a1[j]){
                        int temp=a1[i];
                        a1[i]=a1[j];
                        a1[j]=temp;
                    }
                }
            }
        System.out.println(Arrays.toString(a1));
        }
    }
