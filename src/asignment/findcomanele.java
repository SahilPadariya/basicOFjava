package asignment;

import java.util.Arrays;

public class findcomanele {
    public static void main(String[] args) {
        int q[]={1,3,5,6,7};
        int b[]={1,7,7,7,7,7,7,8,8,9,10,11};
        for(int i = 0 ; i<q.length; i++) {
            if (q[i]==-1){
                break;
            }
            for (int j = 0; j < b.length; j++) {
                if (q[i] == b[j]) {
                    System.out.print(b[j]);
                    q[i] = -1;
                    b[j] = -1;
                }
            }
        }
//        System.out.println(Arrays.toString(b));
    }
}
