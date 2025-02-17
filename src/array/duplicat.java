package array;

public class duplicat {
    public static void main(String[] args) {
        int[]a={1,2,3,2,5,4,4,5,5,5,5,8,8,8,6,4,7,8,9};
        int b=9,count=0;
        for (int i=0;i<a.length;i++){
            if(b==a[i]){
                count++;
                if (count>1){
                    System.out.println("duplicat");
                    return;
                }
            }
        }
        System.out.println("not duplicat");
    }
}
