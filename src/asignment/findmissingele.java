package asignment;

public class findmissingele {
    public static void main(String[] args) {
        int a[]={0,1};
        int n=a.length;
        int sum1=n*(n+1)/2,sum2=0;
        for (int i = 0 ; i< a.length;i++){
            sum2=sum2+a[i];
        }
        System.out.println(sum1-sum2);
    }
}
