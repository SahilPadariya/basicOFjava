package array;

public class uniquesearchbybinary {
    public static void main(String[] args) {
        int a[]={2,8,5,2,6,8,5,2,7,7,7,9};
        for (int i=0;i<a.length;i++){
            if (a[i]==-1){
                continue;
            }
            int count=0;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            if (count==0){
                System.out.println(a[i]+" ");
            }
        }
    }
}
