package array.DSA;

import java.util.Arrays;

public class functionsofarray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] aar2 = new int[10];
        int p = 0, p2 = 0;
        p = insert(arr, 10, p);
        p = insert(arr, 20, p);
        p = insert(arr, 30, p);
        p = insert(arr, 40, p);
        p = insert(arr, 50, p);
        p = insert(arr, 60, p);
        System.out.println(Arrays.toString(arr));
        update(arr, 20, 50, p);
        System.out.println("after update");
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr, 80, p));
        System.out.println("is empty " + isempty(p2));
        System.out.println("size :"+size(p));
        print(arr,p);
    }

    private static int insert(int arr[], int value, int p) {
        if (p == arr.length) {
            System.out.println("arr is full");
            return p;
        }
        arr[p] = value;
        p++;
        return p;
    }

    private static void update(int arr[], int oldV, int newV, int p) {
        for (int i = 0; i < p; i++) {
            if (arr[i] == oldV) {
                arr[i] = newV;
            }
        }
    }

    private static boolean search(int arr[], int value, int p) {
        for (int i = 0; i < p; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    private static boolean isempty(int p) {
        if (p == 0) {
            return true;
        }
        return false;
    }

    private static int size(int p) {
        return p;
    }

    private static void print(int[] arr, int p) {
        if (p == 0) {
            System.out.println(isempty(p));
        }
        System.out.println("print : ");
        for (int i = 0; i < p; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
