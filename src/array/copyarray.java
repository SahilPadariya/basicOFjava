package array;

public class copyarray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        int[] copyarray = new int[array.length];
        int n=array.length;
        int a=0;
        for (int i=0;i<n;i++) {
            if (array[i] % 2 == 1){
                copyarray[a]=array[i];
                a++;
            }
        }
        for (int i=0;i<n;i++) {
            if (array[i] % 2 == 0) {
                copyarray[a] = array[i];
                a++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(copyarray[i ]);
        }
    }
}
