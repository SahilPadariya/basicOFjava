package sort;

public class appearsvalue {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int n = a.length;
        int cur=0;
        for (int i = 0; i < a.length; i++) {
//            int cur=0;
            for (int j = 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    cur++;
                }
            }
                if (cur<2 && cur !=0){
                    System.out.println("true");
                }


        }
    }
}
