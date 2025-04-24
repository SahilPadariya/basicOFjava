package HashMap;

import java.util.HashMap;

public class MostFreqEle {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        int arr[]={3,2,4,5,1};
        int maxfreq=1,mostfreqele=arr[0];
        for (int i=0;i< arr.length;i++){
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }
            else{
                int freq=hashMap.get(arr[i]);
                freq++;
                hashMap.put(arr[i],freq);
                if (freq>maxfreq){
                    maxfreq=freq;
                    mostfreqele=arr[i];
                }
            }
        }
        System.out.println(mostfreqele+"="+maxfreq);
    }
}
