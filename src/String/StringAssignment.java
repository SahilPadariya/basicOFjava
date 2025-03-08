package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAssignment {
    public static void main(String[] args) {
        String fruit = "apple";
        String name = "sallu";
        String name2 = "apple";
        String name1 = "Apple Bnana Mango Orange";
        char[] arr = name.toCharArray();
        int i = 0, j = arr.length - 1;
        int[] countfreq = new int[128];

        // 1. Print a string in reverse order
//
//        while (i < j) {
//            char temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//            i++;
//            j--;
//        }
//        name = new String(arr);
//        System.out.println(name);
//
//       //3. check if a String is Palindrome
//
//        while (i < j) {
//            if (arr[i] != arr[j]) {
//                System.out.println("false");
//                return;
//            }
//            i++;
//            j--;
//        }
//        System.out.println("true");
//
//       //4. count number of words in a String (with / without split function)
//
//        int count = 1;
//        for (i = 0; i < name1.length(); i++) {
//            if (name1.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//      //5. Program to check if two strings are same or not (without using inbuilt function .equals())
//
//        if (name != name2) {
//            System.out.println("false");
//            return;
//        }
//        if (name.length() == name2.length()) {
//            for (i = 0; i < name.length(); i++) {
//                if (name.charAt(i) != name2.charAt(i)) {
//                    System.out.println("false");
//                    return;
//                }
//            }
//            System.out.println("true");
//        }
//        6. Update a character in a string (without using .replace() function)

//        for (int k = 0; k < arr.length; k++) {
//            if (arr[k] == 'k') {
//                arr[k] = 'l';
//            }
//            else {
//                System.out.println("No avalible char");
//            }
//        }
//        name = new String(arr);
//        System.out.println(name);
//
////        7. Sort a string of lowercase
//
//        int index = 0;
//        for (i = 0; i < arr.length; i++) {
//            for (index = 0; index < arr.length - 1; index++) {
//                if (arr[index] > arr[index + 1]) {
//                    char temp = arr[index + 1];
//                    arr[index + 1] = arr[index];
//                    arr[index] = temp;
//                }
//            }
//        }
//        name = new String(arr);
//        System.out.println(name);

//        8.Print frequency of all the characters in string (expercted TC O(n), Aux SC O(1))

        for (i = 0; i < fruit.length(); i++) {
            int asci = fruit.charAt(i);
            countfreq[asci]+=1;
        }
        for (i = 0; i < fruit.length(); i++) {
            int asci= fruit.charAt(i);
            System.out.println(fruit.charAt(i)+" -> "+countfreq[asci]);
        }
    }
}
