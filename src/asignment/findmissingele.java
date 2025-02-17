package asignment;

public class findmissingele {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,5};
        int n=5;
        int sum1=n*(n+1)/2,sum2=0;
        for (int i = 0 ; i< a.length;i++){
            sum2=sum2+a[i];
        }
        System.out.println(sum2-sum1);
    }
}
