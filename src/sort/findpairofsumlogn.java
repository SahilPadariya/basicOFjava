package sort;

public class findpairofsumlogn {
    public static void main(String[] args) {
        int a[]={1,4,3,5,14,12,19,20};
        int find=15;
        for (int i = 0 ; i<a.length -1; i++){
            int temp=find-a[i];
            int left=i+1;
            int right=a.length-1;
        while (left<=right) {
            int mid = (left + right) / 2;
            if (temp == a[mid]) {
                System.out.println("present");
                return;
            } else if (a[mid] < temp) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        }
        System.out.println("not");
    }
}
