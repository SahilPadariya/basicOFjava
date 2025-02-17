package asignment;

public class majority {
    public static void main(String[] args) {
        int a[]={1,3,3,7,4,3,2,3,3,2,7,7};
        int mojele=0;
        for (int i=0 ; i<a.length-1 ; i++){
            int count=0;

            for (int j=i+1 ; j<a.length ; j++){
                if (a[i]==a[j]){
                    count++;
                }
            }
            if (a[count]>a[mojele]){
                mojele=a[count];
            }

        }

        System.out.println(mojele);
    }
}
