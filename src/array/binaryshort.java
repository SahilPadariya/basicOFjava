package array;
public class binaryshort {
    public static void main(String[] args) {
        int a[]={1,4,7,22,26,33,37,45,49,50,100,125,290};
        int k=290;
        int left=0,right=a.length-1;
        while (left<=right){
            int mid=(left+right)/2;
//            System.out.println("hiii");
            if (k==a[mid]){
                System.out.println("present");
                return;
            } else if (k>a[mid]) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        System.out.println("not present");
    }
}
