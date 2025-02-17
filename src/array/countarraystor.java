package array;
public class countarraystor {
    public static void main(String[] args) {
        int array[]={10,11,5,9,12};
        int array2[]=new int[array.length];
        for (int i=0;i<array.length;i++)
        {
            int count=0;
            for (int j = 0; j < array.length; j++) {
                if (array[i]>array[j]) {
                    count++;
                }
            }
            array2[i]=count;
        }

        for (int j=0;j<array2.length;j++){
           System.out.println(array2[j]);
        }
    }
}
