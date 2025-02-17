package asignment;
import java.util.Arrays;
public class programprc {
    public static void main(String[] args) {
        int a[]={50,30,10,20,15,1};
        int left = 0;
        int right = a.length-1;
        int temp=0;
//        for (int i=0;i<a.length-1;i++){
//            for (int j=i+1;j<a.length;j++){
//                if (a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
        for (int i=0;i<a.length-1;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[min]) {
                    temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
