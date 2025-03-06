package String;

import java.util.Arrays;
import java.util.Locale;

public class stringFunctions {
    public static void main(String[] args) {
        String name= new String("apple orange mango banana");
        String name1="Apple";
        String[]str={"apple","orange","mango"};
//        System.out.println(name.isBlank());
//        System.out.println(name1.replace('p','t'));
//        System.out.println("lenght = "+name1.length());
//        System.out.println("find index = "+name.charAt(5));
//        System.out.println("concat = "+name.concat(name1));
//        System.out.println("is empty = "+name.isEmpty());
//        System.out.println("equal ignore ther are ignore upper lower = "+name.equalsIgnoreCase(name1));
//        System.out.println("upper case = "+name.toUpperCase());
//        System.out.println("lower case = "+name.toLowerCase());
//        System.out.println("extra space delete = "+name1.trim());
//        System.out.println("cheak all same or not"+name.equals(name1));
//        System.out.println("Some start to end index iutput which you enter = "+name.substring(3,9));
//        System.out.println("give index for start substring = "+name.indexOf("Padariya"));
//        System.out.println("your speling misteck make right = "+name.replaceAll("Sahil","SAHIL"));
//        System.out.println("check in word substring have or no = "+name.contains("S"));
//        System.out.println("check this word start yes or no = "+name.startsWith("Padariya"));
//        System.out.println(name1.replace('p','t'));
//        for (int i=0;i<str.length;i++){
//           str[i]=str[i].replaceAll("mango","banana");
//        }
//        System.out.println(Arrays.toString(str));

//        System.out.println(name1.substring(0));
//        System.out.println(name1.substring(0,2));
//        System.out.println(name=Arrays.toString(name.split(" ",2)));
//        System.out.println(Arrays.toString(name.split("n")));
//        System.out.println(name1.compareTo("apple"));
//        System.out.println(name1.compareToIgnoreCase("apple"));
        int i=0,j=str.length-1;
        while (i<j){
            if (str[i].compareTo(str[j])>0){
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
            else {
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(str));

    }

}
