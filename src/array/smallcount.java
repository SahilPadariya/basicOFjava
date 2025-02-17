package array;
public class smallcount {
    public static void main(String[] args) {
        int array[]={0,10,11,5,9,12};
        for (int i=0;i<array.length;i++)
        {
            int count=0;

            for (int j = 0; j < array.length; j++) {
                if (array[i]>array[j]) {
                    count++;

                }
            }
            System.out.println(count);
        }
    }
}