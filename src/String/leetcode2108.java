package String;

public class leetcode2108 {
    public static void main(String[] args) {
        String word[]={"abc","car","adda","nitin"};
        String s1="";
        for (int i=0;i<word.length;i++){
            boolean flag=true;
            char arr[]=word[i].toCharArray();
            int j=0,k=arr.length-1;
            while (j<k){
                if (arr[j]!=arr[k]){
                    flag=false;
                }
                j++;
                k--;
            }
            if (flag){
                s1=word[i];
                break;
            }
        }
        System.out.println(s1);
    }
}
