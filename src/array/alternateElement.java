package array;

public class alternateElement {
    public static void main(String[] args) {
        int []arry = {10,20,30,40,50,60,70,80,90,100,110,120,130};
        int n=arry.length;
        for (int i=1;i<n;i=i+2){
            System.out.println(arry[i]);
        }

    }
}


