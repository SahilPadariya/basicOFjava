package asignment;

public class nextgretest {
    public static void main(String[] args) {
        int a[] = {50,2,5,7,3,6};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j] && a[i] != a[j]) {
                    System.out.print(a[j] + " ");
                    break;
                }
                if (j == a.length - 1)
                    System.out.print(-1+" ");
            }

            if (i == a.length - 1)
                System.out.print(-1+" ");
        }
    }
}
