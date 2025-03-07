package String;

public class Question11 {
    public static void main(String[] args) {
        String s1 = "how are you brother what are you doing";
        String s2 = "";
        String[] arr = s1.split(" ");
        char[] charArray = s1.toCharArray();
//        for (int i=0;i<arr.length;i++){
//            char arr1[]=arr[i].toCharArray();
//            int k=0,j=arr1.length-1;
//            while (k<j){
//                char temp=arr1[j];
//                arr1[j]=arr1[k];
//                arr1[k]=temp;
//                k++;
//                j--;
//            }
//            s2=s2+" "+new String(arr1);
//        }
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = temp;
            left++;
            right--;
        }
        s2 = new String(charArray);
        String[] a3 = s2.split(" ");
        int start = 0, end = a3.length - 1;
        while (start < end) {
            String temp = a3[end];
            a3[end] = a3[start];
            a3[start] = temp;
            start++;
            end--;
        }
        s2 = String.join(" ", a3);
        System.out.println(s2);
    }
}