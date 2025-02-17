package array;

public class presentelement {
    public static void main(String[] args) {
        int []arry={10,20,30,40,50};
        int n=arry.length;
        int a=30;
        for (int i=0;i<n;i++){
            if (a == arry[i]){
                System.out.println("present");
                return;
            }

        }
        System.out.println("not present");
    }
}
